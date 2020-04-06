package sample;

import java.util.Collections;
import java.util.Stack;

public class DeckForGoat {
    private Stack<CardForGoat> cards = new Stack();

    public DeckForGoat() {
        CardsOrderForGoat[] var1 = CardsOrderForGoat.values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            CardsOrderForGoat val = var1[var3];
            cards.push(val.card);
        }
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cards);
    }

    public CardForGoat getCard() {
        return cards.pop();
    }
}