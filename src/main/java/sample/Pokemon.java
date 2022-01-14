package sample;

import javafx.scene.image.Image;

import java.io.File;

public class Pokemon {

    private final int MAX_HEALTH_POINTS;

    private String name;
    private int level;
    private int health_points;
    private Image gender;
    private final Image image;
    private final Image fighting_image;

    public Pokemon(String name, int level, int max_health_points, Image gender, Image image, Image fighting_image) {

        MAX_HEALTH_POINTS = max_health_points;

        this.name = name;
        this.level = level;
        this.health_points = MAX_HEALTH_POINTS;
        this.gender = gender;
        this.image = image;
        this.fighting_image = fighting_image;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMAX_HEALTH_POINTS() {
        return MAX_HEALTH_POINTS;
    }

    public int getHealth_points() {
        return health_points;
    }

    public void setHealth_points(int health_points) {
        this.health_points = health_points;
    }

    public Image getGender() {
        return gender;
    }

    public void setGender(Image gender) {
        this.gender = gender;
    }

    public Image getImage() { return image; }

    public Image getFightingImage() { return fighting_image; }

}
