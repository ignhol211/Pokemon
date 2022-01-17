package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ventana2Controller {

    private Pokemon pokemonFighting = null;
    private Pokemon opponent = null;

    @FXML
    private ImageView opponent_image;
    @FXML
    private Text opponent_name;
    @FXML
    private Text oponent_level;
    @FXML
    private ProgressBar opponent_health;
    @FXML
    private ImageView opponent_gender;

    ArrayList<Pokemon> opponentsArrayList = new ArrayList<>();

    //Pokemon
    @FXML
    private ImageView pokemonFighting_image;
    @FXML
    private Text pokemonFighting_name;
    @FXML
    private Text pokemonFighting_level;
    @FXML
    private ProgressBar pokemonFighting_health;
    @FXML
    private ImageView pokemonFighting_gender;

    //Opponent pane
    @FXML
    Pane opponent_pane;

    //Pokemon pane
    @FXML
    Pane pokemon_pane;

    //Menu pane
    @FXML
    Button attackButton;
    @FXML
    Button cureButton;
    @FXML
    Button cancelButton;
    @FXML
    Button tackleButton;
    @FXML
    Button bodySlamButton;
    @FXML
    Button scratchButton;

    public void loadBattlefield (Pokemon pokemonToFight){

        this.pokemonFighting = pokemonToFight;

        Pokemon possible_opponent1;
        Pokemon possible_opponent2;
        Pokemon possible_opponent3;
        Pokemon possible_opponent4;
        Pokemon possible_opponent5;
        Pokemon possible_opponent6;

        {
            try {
                //Opponents
                final int OPPONENT_MAX_HEATLH = 100;
                possible_opponent1 = new Pokemon ("Pidgeotto", (int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\pidgeotto.png")),null);
                opponentsArrayList.add(possible_opponent1);
                possible_opponent2 = new Pokemon ("Rattata",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\rattata.png")),null);
                opponentsArrayList.add(possible_opponent2);
                possible_opponent3 = new Pokemon ("Butterfree",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\butterfree.png")),null);
                opponentsArrayList.add(possible_opponent3);
                possible_opponent4 = new Pokemon ("Sentret",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\sentret.png")),null);
                opponentsArrayList.add(possible_opponent4);
                possible_opponent5 = new Pokemon ("Chinchou",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\chinchou.png")),null);
                opponentsArrayList.add(possible_opponent5);
                possible_opponent6 = new Pokemon ("Abra",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\abra.png")),null);
                opponentsArrayList.add(possible_opponent6);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        opponent = opponentsArrayList.get((int) (Math.random()*(6-1)));

        loadOpponent(opponent);
        loadFightingPokemon(pokemonToFight);
    }


    private void loadFightingPokemon(Pokemon pokemonToFigth) {
        pokemonFighting_image.setImage(pokemonToFigth.getFightingImage());
        pokemonFighting_name.setText(pokemonToFigth.getName());
        pokemonFighting_level.setText(Ventana1Controller.LEVEL+pokemonToFigth.getLevel());
        pokemonFighting_health.setProgress(pokemonToFigth.getHealth_points());
        pokemonFighting_gender.setImage(pokemonToFigth.getGender());
    }

    private void loadOpponent(Pokemon oponent){

        opponent_image.setImage(oponent.getImage());
        opponent_name.setText(oponent.getName());
        oponent_level.setText(Ventana1Controller.LEVEL+oponent.getLevel());
        opponent_health.setProgress(oponent.getHealth_points());
        opponent_gender.setImage(oponent.getGender());

    }

    public void opponentIncreaseOpacity() {
        opponent_pane.setOpacity(1.0);
    }
    public void opponentDecreaseOpacity() {
        opponent_pane.setOpacity(0.5);
    }

    public void pokemonIncreaseOpacity() {
        pokemon_pane.setOpacity(1.0);
    }
    public void pokemonDecreaseOpacity() {
        pokemon_pane.setOpacity(0.5);
    }

    public void cureClicked(){

        int healthRecovered = (int) (Math.random()*(75-25));

        pokemonFighting.setHealth_points(pokemonFighting.getHealth_points()+healthRecovered);

        if(pokemonFighting.getHealth_points() > pokemonFighting.getMAX_HEALTH_POINTS()){
            pokemonFighting.setHealth_points(pokemonFighting.getMAX_HEALTH_POINTS());
        }

        System.out.println(pokemonFighting.getName() + " has recovered " + healthRecovered +" health points");

        pokemonFighting_health.setProgress((double)pokemonFighting.getHealth_points()/pokemonFighting.getMAX_HEALTH_POINTS());

        healthRecovered = (int) (Math.random()*(75-25));

        opponent.setHealth_points(opponent.getHealth_points()+healthRecovered);
        if(opponent.getHealth_points() > opponent.getMAX_HEALTH_POINTS()){
            opponent.setHealth_points(opponent.getMAX_HEALTH_POINTS());
        }
        System.out.println(opponent.getName() + " has recovered " + healthRecovered +" health points");

        opponent_health.setProgress((double)opponent.getHealth_points()/opponent.getMAX_HEALTH_POINTS());

    }

    public void attackClicked() {
        attackButton.setVisible(false);
        cureButton.setVisible(false);
        tackleButton.setVisible(true);
        bodySlamButton.setVisible(true);
        scratchButton.setVisible(true);
        cancelButton.setVisible(true);
    }

    public void tackleClicked(){

        int attack = 20;

        opponent.setHealth_points(opponent.getHealth_points() - attack);

        opponent_health.setProgress((double)opponent.getHealth_points()/opponent.getMAX_HEALTH_POINTS());

        System.out.println(pokemonFighting.getName() + " attacks and " +opponent.getName() + " lose " + attack + " health points");

        if(opponent.getHealth_points() > 0){

            pokemonFighting.setHealth_points(pokemonFighting.getHealth_points() - attack);

            pokemonFighting_health.setProgress((double)pokemonFighting.getHealth_points()/pokemonFighting.getMAX_HEALTH_POINTS());

            System.out.println(opponent.getName() + " attacks and " +pokemonFighting.getName() + " loose " + attack + " health points");

        }else{
            System.out.println(opponent.getName() + " is weakened and can not fight back");
        }
        cancelClicked();

    }

    public void bodySlamClicked(){

        int attack = (int) (Math.random()*(50));

        opponent.setHealth_points(opponent.getHealth_points() - attack);

        opponent_health.setProgress((double)opponent.getHealth_points()/opponent.getMAX_HEALTH_POINTS());

        System.out.println(pokemonFighting.getName() + " attacks and " +opponent.getName() + " lose " + attack + " health points");

        if(opponent.getHealth_points() > 0){

            attack = (int) (Math.random()*(50));

            pokemonFighting.setHealth_points(pokemonFighting.getHealth_points() - attack);

            pokemonFighting_health.setProgress((double)pokemonFighting.getHealth_points()/pokemonFighting.getMAX_HEALTH_POINTS());

            System.out.println(opponent.getName() + " attacks and " +pokemonFighting.getName() + " loose " + attack + " health points");

        }else{
            System.out.println(opponent.getName() + " is weakened and can not fight back");
        }
        cancelClicked();

    }

    public void scratchClicked(){

        byte attack = (byte) (Math.random()*(25-10));

        opponent.setHealth_points(opponent.getHealth_points() - attack);

        opponent_health.setProgress((double)opponent.getHealth_points()/opponent.getMAX_HEALTH_POINTS());

        System.out.println(pokemonFighting.getName() + " attacks and " +opponent.getName() + " lose " + attack + " health points");

        if(opponent.getHealth_points() > 0){

            attack = (byte) (Math.random()*(25-10));

            pokemonFighting.setHealth_points(pokemonFighting.getHealth_points() - attack);

            pokemonFighting_health.setProgress((double)pokemonFighting.getHealth_points()/pokemonFighting.getMAX_HEALTH_POINTS());

            System.out.println(opponent.getName() + " attacks and " +pokemonFighting.getName() + " loose " + attack + " health points");

        }else{
            System.out.println(opponent.getName() + " is weakened and can not fight back");
        }

        cancelClicked();

    }

    public void cancelClicked() {
        attackButton.setVisible(true);
        cureButton.setVisible(true);
        tackleButton.setVisible(false);
        bodySlamButton.setVisible(false);
        scratchButton.setVisible(false);
        cancelButton.setVisible(false);
    }
}
