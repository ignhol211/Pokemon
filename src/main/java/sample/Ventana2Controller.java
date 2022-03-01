package sample;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;

public class Ventana2Controller {

    private Pokemon pokemonFighting = null;
    private Pokemon opponent = null;

    private Ventana1Controller controller1;
    ArrayList<Pokemon> opponentsArrayList = new ArrayList<>();

    @FXML
    private ImageView opponent_image;
    @FXML
    private Text opponent_name;
    @FXML
    private Text opponent_level;
    @FXML
    private ProgressBar opponent_health;
    @FXML
    private ImageView opponent_gender;

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

    //PS text
    @FXML
    TextField pokemonFighting_ps;
    @FXML
    TextField opponent_ps;



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
                possible_opponent1 = new Pokemon (7,"Pidgey", (int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\pidgey.gif")),null,null,null,null,false);
                opponentsArrayList.add(possible_opponent1);
                possible_opponent2 = new Pokemon (8,"Rattata",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\rattata.gif")),null,null,null,null,false);
                opponentsArrayList.add(possible_opponent2);
                possible_opponent3 = new Pokemon (9,"Caterpie",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\caterpie.gif")),null,null,null,null,false);
                opponentsArrayList.add(possible_opponent3);
                possible_opponent4 = new Pokemon (10,"Sentret",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\sentret.gif")),null,null,null,null,false);
                opponentsArrayList.add(possible_opponent4);
                possible_opponent5 = new Pokemon (11,"Chinchou",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\chinchou.gif")),null,null,null,null,false);
                opponentsArrayList.add(possible_opponent5);
                possible_opponent6 = new Pokemon (12,"Abra",(int) ((Math.random()*4))+1, OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\abra.gif")),null,null,null,null,false);
                opponentsArrayList.add(possible_opponent6);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        opponent = opponentsArrayList.get((int) (Math.random()*(opponentsArrayList.size()-1)));

        loadOpponent(opponent);
        loadFightingPokemon(pokemonToFight);
    }


    private void loadFightingPokemon(Pokemon pokemonToFigth) {
        pokemonFighting_image.setImage(pokemonToFigth.getFightingImage());
        pokemonFighting_name.setText(pokemonToFigth.getName());
        pokemonFighting_level.setText(Ventana1Controller.LEVEL+pokemonToFigth.getLevel());
        pokemonFighting_health.setProgress((double)pokemonToFigth.getHealthPoints()/pokemonToFigth.getMAX_HEALTH_POINTS());
        pokemonFighting_gender.setImage(pokemonToFigth.getGender());
    }

    private void loadOpponent(Pokemon oponent){

        opponent_image.setImage(oponent.getImage());
        opponent_name.setText(oponent.getName());
        opponent_level.setText(Ventana1Controller.LEVEL+oponent.getLevel());
        opponent_health.setProgress(oponent.getHealthPoints());
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

    //todo use methods in cureClicked, tackleClicked, bodySlamClicked and scratchClicked in order to reduce code

    public void cureClicked(){

        int healthRecovered = (int) (Math.random()*(75-25));

        pokemonFighting.setHealthPoints(pokemonFighting.getHealthPoints()+healthRecovered);

        if(pokemonFighting.getHealthPoints() > pokemonFighting.getMAX_HEALTH_POINTS()){
            pokemonFighting.setHealthPoints(pokemonFighting.getMAX_HEALTH_POINTS());
        }

        pokemonFighting_health.setProgress((double)pokemonFighting.getHealthPoints()/pokemonFighting.getMAX_HEALTH_POINTS());

        healthRecovered = (int) (Math.random()*(75-25));

        opponent.setHealthPoints(opponent.getHealthPoints()+healthRecovered);
        if(opponent.getHealthPoints() > opponent.getMAX_HEALTH_POINTS()){
            opponent.setHealthPoints(opponent.getMAX_HEALTH_POINTS());
        }

        opponent_health.setProgress((double)opponent.getHealthPoints()/opponent.getMAX_HEALTH_POINTS());

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

        opponent.setHealthPoints(opponent.getHealthPoints() - attack);

        opponent_health.setProgress((double)opponent.getHealthPoints()/opponent.getMAX_HEALTH_POINTS());

        if(opponent.getHealthPoints() >= 0){

            pokemonFighting.setHealthPoints(pokemonFighting.getHealthPoints() - attack);

            pokemonFighting_health.setProgress((double)pokemonFighting.getHealthPoints()/pokemonFighting.getMAX_HEALTH_POINTS());

            controller1.uploadPokemon(pokemonFighting);

            if(pokemonFighting.getHealthPoints() <= 0){
                showAlert(alert(pokemonFighting));
            }

        }else{
            showAlert(alert(opponent));
        }
        cancelClicked();

    }

    public void bodySlamClicked(){

        int attack = (int) (Math.random()*(50));

        opponent.setHealthPoints(opponent.getHealthPoints() - attack);

        opponent_health.setProgress((double)opponent.getHealthPoints()/opponent.getMAX_HEALTH_POINTS());

        if(opponent.getHealthPoints() >= 0){

            attack = (int) (Math.random()*(50));

            pokemonFighting.setHealthPoints(pokemonFighting.getHealthPoints() - attack);

            pokemonFighting_health.setProgress((double)pokemonFighting.getHealthPoints()/pokemonFighting.getMAX_HEALTH_POINTS());

            controller1.uploadPokemon(pokemonFighting);

            if(pokemonFighting.getHealthPoints() <= 0){
                showAlert(alert(pokemonFighting));
            }

        }else{
            showAlert(alert(opponent));
        }
        cancelClicked();

    }

    public void scratchClicked(){

        byte attack = (byte) (Math.random()*(25-10));

        opponent.setHealthPoints(opponent.getHealthPoints() - attack);

        opponent_health.setProgress((double)opponent.getHealthPoints()/opponent.getMAX_HEALTH_POINTS());

        if(opponent.getHealthPoints() >= 0){

            attack = (byte) (Math.random()*(25-10));

            pokemonFighting.setHealthPoints(pokemonFighting.getHealthPoints() - attack);

            pokemonFighting_health.setProgress((double)pokemonFighting.getHealthPoints()/pokemonFighting.getMAX_HEALTH_POINTS());

            controller1.uploadPokemon(pokemonFighting);

            if(pokemonFighting.getHealthPoints() <= 0){
                showAlert(alert(pokemonFighting));
            }

        }else{
            showAlert(alert(opponent));
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

    public void pokemonFighting_ps_entered() {
        pokemonFighting_ps.setText(""+pokemonFighting.getHealthPoints());
    }

    public void pokemonFighting_ps_exited() {
        pokemonFighting_ps.setText("PS");
    }

    public void opponent_ps_entered() {
        opponent_ps.setText(""+opponent.getHealthPoints());
    }

    public void opponent_ps_exited() {
        opponent_ps.setText("PS");
    }

    private void showAlert(Alert alert){
        Optional<ButtonType> decission = alert.showAndWait();
        if(decission.isPresent()) {
            if (decission.get() == ButtonType.NO) {
                System.exit(0);
            } else {
                controller1.stageBattlefield.close();
                controller1.uploadPokemon(pokemonFighting);
            }
        }
    }

    public Alert alert(Pokemon pokemon){
        Alert alert = new Alert(Alert.AlertType.NONE);
        alert.setHeaderText(null);
        alert.setContentText(pokemon.getName() + " is fainted. Do you want to fight again or close application");
        alert.setTitle("Choose an option");
        alert.setGraphic(new ImageView(pokemon.getImage()));
        alert.getDialogPane().getButtonTypes().addAll(ButtonType.YES,ButtonType.NO);
        return alert;
    }

    public void sendController(Ventana1Controller controller){
        this.controller1 = controller;
    }

}
