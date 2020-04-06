package sample;

import java.util.ArrayList;

public class CycleOfTheGame {
    private ArrayList<CardForGoat> cardsOfCycle = new ArrayList();
    private ArrayList<Player> playersOfCycle = new ArrayList();
    private Player highestPlayer;
    private CardForGoat highestCard;

    public CycleOfTheGame(ArrayList<Player> playersOfCycle) {
        this.playersOfCycle = playersOfCycle;
    }

    public void addCardOfCycle(CardForGoat card) {
        cardsOfCycle.add(card);
    }

    public void setHighestPlayer(Player highestPlayer) {
        this.highestPlayer = highestPlayer;
    }

    public void setHighestCard(CardForGoat highestCard) {
        this.highestCard = highestCard;
    }

    public CardForGoat getHighestCard() {
        return highestCard;
    }
}
