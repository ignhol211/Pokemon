package sample;

import javafx.scene.image.Image;

public class Pokemon {

    private final int MAX_HEALTH_POINTS;
    private final int INDEX;

    private final String name;
    private final int level;
    private int health_points;
    private final Image gender;
    private final Image image;
    private final Image fighting_image;
    private final String description;
    private final Image firstEvolution;
    private final Image secondEvolution;
    private boolean favorite;


    public Pokemon(int index, String name, int level, int max_health_points, Image gender, Image image, Image fighting_image,String description,Image firstEvolution,Image secondEvolution,Boolean favorite) {

        this.INDEX = index;
        MAX_HEALTH_POINTS = max_health_points;

        this.name = name;
        this.level = level;
        this.health_points = MAX_HEALTH_POINTS;
        this.gender = gender;
        this.image = image;
        this.fighting_image = fighting_image;
        this.description = description;
        this.firstEvolution = firstEvolution;
        this.secondEvolution = secondEvolution;
        this.favorite = favorite;

    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
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

    public Image getImage() { return image; }

    public Image getFightingImage() { return fighting_image; }

    public int getIndex(){return INDEX;}

    public String getDescription(){return description;}

    public Image getFirstEvolution(){return firstEvolution;}

    public Image getSecondEvolution(){return secondEvolution;}

    public Boolean getFavorite(){return favorite;}

    public void setFavorite(Boolean favorite){this.favorite = favorite;}

}
