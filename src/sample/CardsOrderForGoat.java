package sample;

public enum CardsOrderForGoat {
    THIRTYTWO(Suit.CLUB, Value.SEVEN, 32, 0),
    THIRTYONE(Suit.CLUB, Value.QUEEN, 31, 3),
    THIRTY(Suit.SPADE, Value.QUEEN, 30, 3),
    TWENTYNINE(Suit.HEART, Value.QUEEN, 29, 3),
    TWENTYEIGHT(Suit.DIAMOND, Value.QUEEN, 28, 3),
    TWENTYSEVEN(Suit.CLUB, Value.JACK, 27, 2),
    TWENTYSIX(Suit.SPADE, Value.JACK, 26, 2),
    TWENTYFIVE(Suit.HEART, Value.JACK, 25, 2),
    TWENTYFOUR(Suit.DIAMOND, Value.JACK, 24, 2),
    TWENTYTHREE(Suit.CLUB, Value.ACE, 23, 11),
    TWENTYTWO(Suit.SPADE, Value.ACE, 22, 11),
    TWENTYONE(Suit.HEART, Value.ACE, 21, 11),
    TWENTY(Suit.DIAMOND, Value.ACE, 20, 11),
    NINETEEN(Suit.CLUB, Value.TEN, 19, 10),
    EIGHTTEEN(Suit.SPADE, Value.TEN, 18, 10),
    SEVENTEEN(Suit.HEART, Value.TEN, 17, 10),
    SIXTEEN(Suit.DIAMOND, Value.TEN, 16, 10),
    FIVETEEN(Suit.CLUB, Value.KING, 15, 4),
    FOURTEEN(Suit.SPADE, Value.KING, 14, 4),
    THIRTEEN(Suit.HEART, Value.KING, 13, 4),
    TWELVE(Suit.DIAMOND, Value.KING, 12, 4),
    ELLEVEN(Suit.CLUB, Value.NINE, 11, 0),
    TEN(Suit.SPADE, Value.NINE, 10, 0),
    NINE(Suit.HEART, Value.NINE, 9, 0),
    EIGHT(Suit.DIAMOND, Value.NINE, 8, 0),
    SEVEN(Suit.CLUB, Value.EIGHT, 7, 0),
    SIX(Suit.SPADE, Value.EIGHT, 6, 0),
    FIVE(Suit.HEART, Value.EIGHT, 5, 0),
    FOUR(Suit.DIAMOND, Value.EIGHT, 4, 0),
    THREE(Suit.SPADE, Value.SEVEN, 3, 0),
    TWO(Suit.HEART, Value.SEVEN, 2, 0),
    ONE(Suit.DIAMOND, Value.SEVEN, 1, 0);

    CardForGoat card;

    CardsOrderForGoat(Suit suit, Value value, int power, int cost) {
        this.card = new CardForGoat(value, suit, power, cost);
    }
}