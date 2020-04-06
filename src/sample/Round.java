package sample;

import java.util.ArrayList;

public class Round {
    private ArrayList<CycleOfTheGame> cyclesOfTheRound = new ArrayList();

    public Round() {
    }

    public void addCycleOfTheRound(CycleOfTheGame cycle) {
        this.cyclesOfTheRound.add(cycle);
    }

    public int getAmountOfCycles() { return cyclesOfTheRound.size(); }

    public ArrayList<CycleOfTheGame> getCyclesOfTheRound() {
        return cyclesOfTheRound;
    }
}