package sample;

import javafx.scene.image.Image;

import java.io.File;

public class Pokemon {

    private final int MAX_HEALTH_POINTS;

    private String name;
    private int level;
    private int health_points;
    private String gender;
    private final int min_attack;
    private final int max_attack;
    private final int defense;
    private final File image;

    public Pokemon(String name, int level, int max_health_points, String gender, int min_attack, int max_attack, int defense, File image) {

        MAX_HEALTH_POINTS = max_health_points;

        this.name = name;
        this.level = level;
        this.health_points = MAX_HEALTH_POINTS;
        this.gender = gender;
        this.min_attack = min_attack;
        this.max_attack = max_attack;
        this.defense = defense;
        this.image = image;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDefense(){
        return defense;
    }

    public File getImage() { return image; }

    public void attack(Pokemon pokemon){
        System.out.println(this.getName()+" attacks "+pokemon.getName());
        int health_lost = (int) ((Math.random() * (this.max_attack - this.min_attack)) - pokemon.getDefense());
        pokemon.setHealth_points(pokemon.getHealth_points()-health_lost);
    }

    public void one_level_up(Pokemon pokemon){
        System.out.println(this.getName()+" has risen one level");
        pokemon.setLevel(pokemon.getLevel()+1);
    }

}
