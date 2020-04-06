package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class Controller {

    @FXML
    private TextArea team1Score;
    @FXML
    private TextArea team2Score;
    @FXML
    private TextArea team1Lives;
    @FXML
    private TextArea team2Lives;

    @FXML
    private ImageView myCardArea1;
    @FXML
    private ImageView myCardArea2;
    @FXML
    private ImageView myCardArea3;
    @FXML
    private ImageView myCardArea4;
    @FXML
    private ImageView myCardArea5;
    @FXML
    private ImageView myCardArea6;
    @FXML
    private ImageView myCardArea7;
    @FXML
    private ImageView myCardArea8;

    @FXML
    private ImageView bot1Card1;
    @FXML
    private ImageView bot1Card2;
    @FXML
    private ImageView bot1Card3;
    @FXML
    private ImageView bot1Card4;
    @FXML
    private ImageView bot1Card5;
    @FXML
    private ImageView bot1Card6;
    @FXML
    private ImageView bot1Card7;
    @FXML
    private ImageView bot1Card8;

    @FXML
    private ImageView bot2Card1;
    @FXML
    private ImageView bot2Card2;
    @FXML
    private ImageView bot2Card3;
    @FXML
    private ImageView bot2Card4;
    @FXML
    private ImageView bot2Card5;
    @FXML
    private ImageView bot2Card6;
    @FXML
    private ImageView bot2Card7;
    @FXML
    private ImageView bot2Card8;

    @FXML
    private ImageView bot3Card1;
    @FXML
    private ImageView bot3Card2;
    @FXML
    private ImageView bot3Card3;
    @FXML
    private ImageView bot3Card4;
    @FXML
    private ImageView bot3Card5;
    @FXML
    private ImageView bot3Card6;
    @FXML
    private ImageView bot3Card7;
    @FXML
    private ImageView bot3Card8;

    @FXML
    private ImageView bot1CardOnTable;
    @FXML
    private ImageView bot2CardOnTable;
    @FXML
    private ImageView bot3CardOnTable;
    @FXML
    private ImageView myCardOnTable;

    @FXML
    private ImageView lastWinningCard;

    private ArrayList<ImageView> cardsOfBot1 = new ArrayList<ImageView>();
    private ArrayList<ImageView> cardsOfBot2 = new ArrayList<ImageView>();
    private ArrayList<ImageView> cardsOfBot3 = new ArrayList<ImageView>();
    private ArrayList<ImageView> cardsOfPlayer = new ArrayList<ImageView>();
    private ArrayList<ArrayList<ImageView>> bots = new ArrayList<ArrayList<ImageView>>();
    private ArrayList<ImageView> playedCards = new ArrayList<ImageView>();

    private Game game;

    private void createLists() {
        cardsOfBot1.add(bot1Card1);
        cardsOfBot1.add(bot1Card2);
        cardsOfBot1.add(bot1Card3);
        cardsOfBot1.add(bot1Card4);
        cardsOfBot1.add(bot1Card5);
        cardsOfBot1.add(bot1Card6);
        cardsOfBot1.add(bot1Card7);
        cardsOfBot1.add(bot1Card8);

        cardsOfBot2.add(bot2Card1);
        cardsOfBot2.add(bot2Card2);
        cardsOfBot2.add(bot2Card3);
        cardsOfBot2.add(bot2Card4);
        cardsOfBot2.add(bot2Card5);
        cardsOfBot2.add(bot2Card6);
        cardsOfBot2.add(bot2Card7);
        cardsOfBot2.add(bot2Card8);

        cardsOfBot3.add(bot3Card1);
        cardsOfBot3.add(bot3Card2);
        cardsOfBot3.add(bot3Card3);
        cardsOfBot3.add(bot3Card4);
        cardsOfBot3.add(bot3Card5);
        cardsOfBot3.add(bot3Card6);
        cardsOfBot3.add(bot3Card7);
        cardsOfBot3.add(bot3Card8);

        bots.add(cardsOfBot1);
        bots.add(cardsOfBot2);
        bots.add(cardsOfBot3);

        playedCards.add(myCardOnTable);
        playedCards.add(bot1CardOnTable);
        playedCards.add(bot2CardOnTable);
        playedCards.add(bot3CardOnTable);

        cardsOfPlayer.add(myCardArea1);
        cardsOfPlayer.add(myCardArea2);
        cardsOfPlayer.add(myCardArea3);
        cardsOfPlayer.add(myCardArea4);
        cardsOfPlayer.add(myCardArea5);
        cardsOfPlayer.add(myCardArea6);
        cardsOfPlayer.add(myCardArea7);
        cardsOfPlayer.add(myCardArea8);
    }

    public void start(){
        game = new Game(1);
        createLists();
        game.startGame();
        showPlayerCards();
        showBotsCards();
        showCardsOnTable();
        showLastWinningCard();
        showScores();
    }

    public void playPlayersCard1() {
        if (!isCardNull(0)) {
            game.getPlayers().get(0).makeAStep(0);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showLastWinningCard();
            showCardsOnTable();
        }
    }

    public void playPlayersCard2() {
        if (!isCardNull(1)) {
            game.getPlayers().get(0).makeAStep(1);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    public void playPlayersCard3() {
        if (!isCardNull(2)) {
            game.getPlayers().get(0).makeAStep(2);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    public void playPlayersCard4() {
        if (!isCardNull(3)) {
            game.getPlayers().get(0).makeAStep(3);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    public void playPlayersCard5() {
        if (!isCardNull(4)) {
            game.getPlayers().get(0).makeAStep(4);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    public void playPlayersCard6() {
        if (!isCardNull(5)) {
            game.getPlayers().get(0).makeAStep(5);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    public void playPlayersCard7() {
        if (!isCardNull(6)) {
            game.getPlayers().get(0).makeAStep(6);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    public void playPlayersCard8() {
        if (!isCardNull(7)) {
            game.getPlayers().get(0).makeAStep(7);
            game.makeOneCycle(Logic.cardsOnTable);
            showScores();
            showPlayerCards();
            showBotsCards();
            showCardsOnTable();
            showLastWinningCard();
        }
    }

    private boolean isCardNull(int i){
        if (cardsOfPlayer.get(i).getImage().equals(Images.NONE.getImg())) return true;
        return false;
    }

    private void showLastWinningCard() {
        int amountOfRounds = game.getRounds().size();
        lastWinningCard.setImage(Images.NONE.getImg());
        if (amountOfRounds != 0) {
            int amountOfCycles = game.getRounds().get(amountOfRounds - 1).getCyclesOfTheRound().size();
            if (!(amountOfCycles == 0 && amountOfRounds == 1)) {
                if (amountOfCycles == 0) {
                    amountOfRounds--;
                    amountOfCycles = game.getRounds().get(amountOfRounds - 1).getCyclesOfTheRound().size();
                }
                CardForGoat card = game.getRounds().get(amountOfRounds - 1).getCyclesOfTheRound().get(amountOfCycles - 1).getHighestCard();
                for (CardImages c : CardImages.values()) {
                    if (card.equals(c.getCard())) {
                        lastWinningCard.setImage(c.getImg());
                    }
                }
            }
        }
    }

    private void showCardsOnTable() {
        int min = 0;
        int max = 4;
        int length = Logic.cardsOnTable.size();
        if (length < 4) {
            max = length + 1;
            min = 1;
        }

        int j = 0;
        for (int i = min; i < max; i++) {
            for (CardImages c: CardImages.values()) {
                if (Logic.cardsOnTable.get(j).equals(c.getCard())) {
                    playedCards.get(i).setImage(c.getImg());
                }
            }
            j++;
        }
    }
    
    private void showPlayerCards() {
        int length = game.getPlayers().get(0).getCards().size();
        for (int i = 0; i < length; i++) {
            CardForGoat card = game.getPlayers().get(0).getCards().get(i);
            for (CardImages c: CardImages.values()) {
                if (card.equals(c.getCard())) {
                    cardsOfPlayer.get(i).setImage(c.getImg());
                }
            }
        }
        for (int i = length; i < 8; i++) {
            cardsOfPlayer.get(i).setImage(Images.NONE.getImg());
        }
    }

    private void showBotsCards() {
        for (int i = 1; i < 4; i++) {
            int length = game.getPlayers().get(i).getCards().size();
            for (int j = 0; j < length; j++) {
                if (i == 1) bots.get(i - 1).get(j).setImage(Images.COVERHORIZONTAL.getImg());
                else if (i == 2) bots.get(i - 1).get(j).setImage(Images.COVERVERTICAL.getImg());
                else bots.get(i - 1).get(j).setImage(Images.COVERHORIZONTAL1.getImg());
            }
            for (int j = length; j < 8; j++) {
                if (i == 1) bots.get(i - 1).get(j).setImage(Images.NONEBOTHORIZONTAL.getImg());
                else if (i == 2) bots.get(i - 1).get(j).setImage(Images.NONEBOTVERTICAL.getImg());
                else bots.get(i - 1).get(j).setImage(Images.NONEBOTHORIZONTAL1.getImg());
            }
        }
    }

    private void showScores() {
        team1Score.clear();
        team1Score.appendText("" + game.getTeam1FullScore());
        team2Score.clear();
        team2Score.appendText("" + game.getTeam2FullScore());
        team1Lives.clear();
        team1Lives.appendText("" + game.getTeam1Lives());
        team2Lives.clear();
        team2Lives.appendText("" + game.getTeam2Lives());
    }

    public void exit(){
        System.exit(0);
    }
}
