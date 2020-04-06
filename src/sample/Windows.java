package sample;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Windows implements Runnable {
    private String text;
    private int width;
    private int height;
    String name;

    public Windows(String text, int width, int height, String name) {
        this.text = text;
        this.width = width;
        this.height = height;
        this.name = name;
    }

    @Override
    public void run() {
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                Label secondLabel = new Label("" + text);

                StackPane secondaryLayout = new StackPane();
                secondaryLayout.getChildren().add(secondLabel);

                Scene secondScene = new Scene(secondaryLayout, width, height);
                Stage newWindow = new Stage();
                newWindow.setTitle(name);
                newWindow.setScene(secondScene);

                newWindow.show();
            }
        });
    }
}
