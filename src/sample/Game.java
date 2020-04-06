package sample;

import java.util.ArrayList;

public class Game {
    private DeckForGoat deck = new DeckForGoat();
    private ArrayList<Round> rounds = new ArrayList();
    private ArrayList<Player> players = new ArrayList();
    private ArrayList<Integer> cardsOfSixTeam1 = new ArrayList();
    private ArrayList<Integer> cardsOfSixTeam2 = new ArrayList();
    private int team1FullScore = 0;
    private int team2FullScore = 0;
    private int team1Score = 0;
    private int team2Score = 0;

    public Game(int amount) {
        for(int i = 0; i < amount; ++i) {
            players.add(new Player(Integer.toString(i + 1)));
        }

        for(int i = amount; i < 4; ++i) {
            players.add(new Bot(Integer.toString(i + 1)));
        }

        for(int i = 0; i < 12; ++i) {
            cardsOfSixTeam1.add(1);
            cardsOfSixTeam2.add(1);
        }
    }

    public void startGame() {
        makeRound();
    }

    private void makeRound() {
        if (rounds.size() != 0) makeScoreForRound();

        if (!isGameEnded()) {
            giveCardsToPlayers();
            Round round = new Round();
            rounds.add(round);

            Logic.botsMakeSteps(this);
        } else {
            if (cardsOfSixTeam2.size() == 0) {
                Windows newWin = new Windows("Team 1 won with Total Score: " + team1FullScore, 230, 80, "winner");
                newWin.run();
            } else {
                Windows newWin = new Windows("Team 2 won with Total Score: " + team2FullScore, 230, 80, "winner");
                newWin.run();
            }
        }
    }

    private void giveCardsToPlayers() {
        deck = new DeckForGoat();
        for (int i = 0; i < players.size(); i++) {
            for (int j = 0; j < 8; j++) {
                players.get(i).addCard(deck.getCard());
            }
        }
    }

    private boolean isGameEnded() {
        if (cardsOfSixTeam1.size() == 0 || cardsOfSixTeam2.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    private void makeScoreForRound() {
        int j = 1;
        ArrayList<Integer> loosingTeam = null;
        int loosingTeamScore = 0;
        if (team1Score > team2Score) {
            team1FullScore += team1Score;

            loosingTeamScore = team2Score;
            loosingTeam = cardsOfSixTeam2;
        } else if (team2Score > team1Score) {
            team2FullScore += team2Score;

            loosingTeamScore = team1Score;
            loosingTeam = cardsOfSixTeam1;
        }

        if (loosingTeamScore < 10) j = 6;
        else if (loosingTeamScore < 30) j = 4;

        if (loosingTeam != null) {
            if (j <= loosingTeam.size()) {
                for (int i = 0; i < j; ++i) {
                    loosingTeam.remove(loosingTeam.size() - 1);
                }
            } else {
                loosingTeam.clear();
            }
        }

        this.team1Score = 0;
        this.team2Score = 0;
    }

    public void makeOneCycle(ArrayList<CardForGoat> cards) {
        CycleOfTheGame cycle = new CycleOfTheGame(players);
        CardForGoat highest = null;
        int highestCardsPlayerNumber = 1;
        int cycleScore = 0;

        for (int i = 0; i < 4; ++i) {
            CardForGoat current = cards.get(i);
            cycle.addCardOfCycle(current);
            cycleScore += current.getCost();
            if (i == 0) highest = current;
            else if (Logic.isCurrMoreThanHighest(highest, current)) {
                highest = current;
                highestCardsPlayerNumber = i;
            }
        }

        if ((highestCardsPlayerNumber + 1) % 2 == 0) this.team2Score += cycleScore;
        else this.team1Score += cycleScore;

        cycle.setHighestCard(highest);
        cycle.setHighestPlayer(this.players.get(highestCardsPlayerNumber));

        addCycleToTheRound(cycle);

        Logic.cardsOnTable.clear();
        if (isLastRoundEnded()) makeRound();
        else Logic.botsMakeSteps(this);
    }

    private boolean isLastRoundEnded() {
        if (rounds.get(rounds.size() - 1).getAmountOfCycles() == 8) return true;
        return false;
    }

    private void addCycleToTheRound(CycleOfTheGame cycle) {
        for (int i = 0; i < rounds.size(); i++) {
            if (rounds.get(i).getAmountOfCycles() < 8) rounds.get(i).addCycleOfTheRound(cycle);
        }
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public ArrayList<Round> getRounds() {
        return rounds;
    }

    public int getTeam1FullScore() {
        return team1FullScore;
    }

    public int getTeam2FullScore() {
        return team2FullScore;
    }

    public int getTeam1Lives() {
        return cardsOfSixTeam1.size();
    }

    public int getTeam2Lives() {
        return cardsOfSixTeam2.size();
    }
}