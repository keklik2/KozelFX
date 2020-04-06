package sample;

import javafx.scene.image.Image;

public enum Images {
    COVERVERTICAL("/Обложка Вертикальная.png"),
    COVERHORIZONTAL("/Обложка Горизонтальная.png"),
    COVERHORIZONTAL1("/Обложка Горизонтальная -1.png"),
    NONEBOTVERTICAL("/Нет Карты У Бота Вертикальная.png"),
    NONEBOTHORIZONTAL("/Нет Карты У Бота Горизонтальная.png"),
    NONEBOTHORIZONTAL1("/Нет Карты У Бота Горизонтальная -1.png"),
    NONE("/none.png");

    private Image img;

    Images(String way) {
        this.img = new Image(way);
    }

    public Image getImg() {
        return img;
    }
}
