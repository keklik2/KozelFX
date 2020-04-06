package sample;

public enum Suit {
    CLUB("Трефы"),
    SPADE("Пики"),
    HEART("Червы"),
    DIAMOND("Бубны");

    private String title;

    Suit(String title) {
        this.title = title;
    }
}