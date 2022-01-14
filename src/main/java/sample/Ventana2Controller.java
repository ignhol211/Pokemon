package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ventana2Controller {

    //Opponent
    private final int OPPONENT_MAX_HEATLH = 100;

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
    private ImageView pokemonToFigth_image;
    @FXML
    private Text pokemonToFigth_name;
    @FXML
    private Text pokemonToFigth_level;
    @FXML
    private ProgressBar pokemonToFigth_health;
    @FXML
    private ImageView pokemonToFigth_gender;

    //Opponent pane
    @FXML
    Pane opponent_pane;

    //Pokemon pane
    @FXML
    Pane pokemon_pane;

    public void loadBattlefield (Pokemon pokemonToFight){

        Pokemon opponent1;
        Pokemon opponent2;
        Pokemon opponent3;
        Pokemon opponent4;
        Pokemon opponent5;
        Pokemon opponent6;

        {
            try {
                opponent1 = new Pokemon ("Pidgeotto", (int) ((Math.random()*4))+1,OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\pidgeotto.png")),null);
                opponentsArrayList.add(opponent1);
                opponent2 = new Pokemon ("Rattata",(int) ((Math.random()*4))+1,OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\rattata.png")),null);
                opponentsArrayList.add(opponent2);
                opponent3 = new Pokemon ("Butterfree",(int) ((Math.random()*4))+1,OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\butterfree.png")),null);
                opponentsArrayList.add(opponent3);
                opponent4 = new Pokemon ("Sentret",(int) ((Math.random()*4))+1,OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\sentret.png")),null);
                opponentsArrayList.add(opponent4);
                opponent5 = new Pokemon ("Chinchou",(int) ((Math.random()*4))+1,OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\chinchou.png")),null);
                opponentsArrayList.add(opponent5);
                opponent6 = new Pokemon ("Abra",(int) ((Math.random()*4))+1,OPPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\abra.png")),null);
                opponentsArrayList.add(opponent6);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        loadOpponent(opponentsArrayList.get((int) (Math.random()*(6-1))));
        loadPokemonToFigth(pokemonToFight);

    }

    private void loadPokemonToFigth(Pokemon pokemonToFigth) {
        pokemonToFigth_image.setImage(pokemonToFigth.getFightingImage());
        pokemonToFigth_name.setText(pokemonToFigth.getName());
        pokemonToFigth_level.setText(Ventana1Controller.LEVEL+pokemonToFigth.getLevel());
        pokemonToFigth_health.setProgress(pokemonToFigth.getHealth_points());
        pokemonToFigth_gender.setImage(pokemonToFigth.getGender());
    }

    private void loadOpponent(Pokemon oponent){

        opponent_image.setImage(oponent.getImage());
        opponent_name.setText(oponent.getName());
        oponent_level.setText(Ventana1Controller.LEVEL+oponent.getLevel());
        opponent_health.setProgress(oponent.getHealth_points());
        opponent_gender.setImage(oponent.getGender());

    }

    public void opponentChangeOpacity() {
        opponent_pane.setOpacity(1.0);
    }

    public void pokemonChangeOpacity() {
        pokemon_pane.setOpacity(1.0);
    }
}
