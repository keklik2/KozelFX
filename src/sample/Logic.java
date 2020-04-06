package sample;

import java.util.ArrayList;

public class Logic {

    static ArrayList<CardForGoat> cardsOnTable = new ArrayList<CardForGoat>();

    public static boolean isCurrMoreThanHighest(CardForGoat c1, CardForGoat c2) {
        return c1.getPower() <= c2.getPower();
    }

    public static void botsMakeSteps(Game game) {
        for (int i = 0; i < 3; i++) {
            cardsOnTable.add(game.getPlayers().get(i + 1).makeAStep(cardsOnTable));
        }
    }
}