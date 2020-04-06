package sample;

public class CardForGoat extends Card {
    private int power;
    private int cost;

    public CardForGoat(Value value, Suit suit, int power, int cost) {
        super(value, suit);
        this.power = power;
        this.cost = cost;
    }

    public int getPower() {
        return this.power;
    }

    public int getCost() {
        return this.cost;
    }
}