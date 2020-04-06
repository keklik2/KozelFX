package sample;

import java.util.ArrayList;

public class Bot extends Player {
    public Bot(String name) {
        super(name);
    }

    @Override
    public CardForGoat makeAStep(ArrayList<CardForGoat> cardsOnTable) {
        if (cardsOnTable.size() == 0) return rndCard();
        else {
            if (canWinCycle(cardsOnTable)) return highestCard();
            else return lowestCard();
        }
    }

    private boolean canWinCycle(ArrayList<CardForGoat> cardsOnTable) {
        for (int i = 0; i < getCards().size(); i++) {
            for (int j = 0; j < cardsOnTable.size(); j++) {
                if (getCards().get(i).getPower() < cardsOnTable.get(j).getPower()) return false;
            }
        }
        return true;
    }

    private CardForGoat highestCard() {
        CardForGoat high = getCards().get(0);
        for (int i = 1; i < getCards().size(); i++) {
            if (high.getPower() < getCards().get(i).getPower()) high = getCards().get(i);
        }
        getCards().remove(high);
        return high;
    }

    private CardForGoat lowestCard() {
        CardForGoat low = getCards().get(0);
        for (int i = 1; i < getCards().size(); i++) {
            if (low.getPower() > getCards().get(i).getPower()) low = getCards().get(i);
        }
        getCards().remove(low);
        return low;
    }

    private CardForGoat rndCard() {
        int rnd = 0 + (int) (Math.random() * getCards().size());
        CardForGoat rndC = this.getCards().get(rnd);
        getCards().remove(rndC);
        return rndC;
    }
}
