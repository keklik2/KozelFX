package sample;

import javafx.scene.image.Image;

public enum CardImages {
    THIRTYTWO(Suit.CLUB, Value.SEVEN, "/7 Треф.png"),
    THIRTYONE(Suit.CLUB, Value.QUEEN, "/Дама Треф.png"),
    THIRTY(Suit.SPADE, Value.QUEEN, "/Дама Пик.png"),
    TWENTYNINE(Suit.HEART, Value.QUEEN, "/Дама Черв.png"),
    TWENTYEIGHT(Suit.DIAMOND, Value.QUEEN, "/Дама Буби.png"),
    TWENTYSEVEN(Suit.CLUB, Value.JACK, "/Валет Треф.png"),
    TWENTYSIX(Suit.SPADE, Value.JACK, "/Валет Пик.png"),
    TWENTYFIVE(Suit.HEART, Value.JACK, "/Валет Черв.png"),
    TWENTYFOUR(Suit.DIAMOND, Value.JACK, "/Валет Буби.png"),
    TWENTYTHREE(Suit.CLUB, Value.ACE, "/Туз Треф.png"),
    TWENTYTWO(Suit.SPADE, Value.ACE, "/Туз Пик.png"),
    TWENTYONE(Suit.HEART, Value.ACE, "/Туз Черв.png"),
    TWENTY(Suit.DIAMOND, Value.ACE, "/Туз Буби.png"),
    NINETEEN(Suit.CLUB, Value.TEN, "/10 Треф.png"),
    EIGHTTEEN(Suit.SPADE, Value.TEN, "/10 Пик.png"),
    SEVENTEEN(Suit.HEART, Value.TEN, "/10 Черв.png"),
    SIXTEEN(Suit.DIAMOND, Value.TEN, "/10 Буби.png"),
    FIVETEEN(Suit.CLUB, Value.KING, "/Король Треф.png"),
    FOURTEEN(Suit.SPADE, Value.KING, "/Король Пик.png"),
    THIRTEEN(Suit.HEART, Value.KING, "/Король Черв.png"),
    TWELVE(Suit.DIAMOND, Value.KING, "/Король Буби.png"),
    ELLEVEN(Suit.CLUB, Value.NINE, "/9 Треф.png"),
    TEN(Suit.SPADE, Value.NINE, "/9 Пик.png"),
    NINE(Suit.HEART, Value.NINE, "/9 Черв.png"),
    EIGHT(Suit.DIAMOND, Value.NINE, "/9 Буби.png"),
    SEVEN(Suit.CLUB, Value.EIGHT, "/8 Треф.png"),
    SIX(Suit.SPADE, Value.EIGHT, "/8 Пик.png"),
    FIVE(Suit.HEART, Value.EIGHT, "/8 Черв.png"),
    FOUR(Suit.DIAMOND, Value.EIGHT, "/8 Буби.png"),
    THREE(Suit.SPADE, Value.SEVEN, "/7 Пик.png"),
    TWO(Suit.HEART, Value.SEVEN, "/7 Черв.png"),
    ONE(Suit.DIAMOND, Value.SEVEN, "/7 Буби.png");

    private Card card;
    private Image img;

    CardImages(Suit suit, Value value, String way) {
        this.card = new Card(value, suit);
        this.img = new Image(way);
    }

    public Card getCard() {
        return card;
    }

    public Image getImg() {
        return img;
    }
}
