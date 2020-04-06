package sample;

import java.util.ArrayList;
import java.util.Scanner;

public class Player extends Thread {
    private String name;
    private ArrayList<CardForGoat> cards = new ArrayList();
    private Scanner scanner;

    public Player(String name) {
        this.scanner = new Scanner(System.in);
        this.name = name;
    }

    public void addCard(CardForGoat card) {
        this.cards.add(card);
    }

    public CardForGoat makeAStep(ArrayList<CardForGoat> cardsOnTable) { return null; }

    public CardForGoat makeAStep(int i) {
        CardForGoat toReturn = cards.get(i);
        Logic.cardsOnTable.add(0, cards.get(i));
        cards.remove(i);
        return toReturn;
    }

    public ArrayList<CardForGoat> getCards() {
        return cards;
    }
}