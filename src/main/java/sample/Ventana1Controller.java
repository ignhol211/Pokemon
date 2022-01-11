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

public class Ventana1Controller {

    private final String LEVEL = "Lv ";

    ArrayList <Pokemon> pokemonArrayList = new ArrayList<>();

    Pokemon pokemon1;
    Pokemon pokemon2;
    Pokemon pokemon3;
    Pokemon pokemon4;
    Pokemon pokemon5;
    Pokemon pokemon6;

    {
        try {
            pokemon1 = new Pokemon ("Charmander",5,35,"male",6,10,1,new Image(new FileInputStream(".\\src\\main\\resources\\charmander.png")));
            pokemon2 = new Pokemon ("Squirtle",5,30,"male",5,8,3,new Image(new FileInputStream(".\\src\\main\\resources\\squirtle.png")));
            pokemon3 = new Pokemon ("Bulbasaur",5,25,"male",7,9,2,new Image(new FileInputStream(".\\src\\main\\resources\\bulbasaur.png")));
            pokemon4 = new Pokemon ("Cyndaquil",5,30,"male",5,9,1,new Image(new FileInputStream(".\\src\\main\\resources\\cyndaquil.png")));
            pokemon5 = new Pokemon ("Totodile",5,20,"male",8,10,3,new Image(new FileInputStream(".\\src\\main\\resources\\totodile.png")));
            pokemon6 = new Pokemon ("Chikorita",5,35,"female",5,7,3,new Image(new FileInputStream(".\\src\\main\\resources\\chikorita.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    Button button_continue;

    //Pokemon´s names
    @FXML
    Text pokemon_00name;
    @FXML
    Text pokemon_10name;
    @FXML
    Text pokemon_20name;
    @FXML
    Text pokemon_01name;
    @FXML
    Text pokemon_11name;
    @FXML
    Text pokemon_21name;

    //Pokemon´s levels
    @FXML
    Text pokemon_00level;
    @FXML
    Text pokemon_10level;
    @FXML
    Text pokemon_20level;
    @FXML
    Text pokemon_01level;
    @FXML
    Text pokemon_11level;
    @FXML
    Text pokemon_21level;

    //Pokemon´s image
    @FXML
    ImageView pokemon_00image;
    @FXML
    ImageView pokemon_10image;
    @FXML
    ImageView pokemon_20image;
    @FXML
    ImageView pokemon_01image;
    @FXML
    ImageView pokemon_11image;
    @FXML
    ImageView pokemon_21image;

    //Pokemon´s health
    @FXML
    ProgressBar pokemon_00health;
    @FXML
    ProgressBar pokemon_10health;
    @FXML
    ProgressBar pokemon_20health;
    @FXML
    ProgressBar pokemon_01health;
    @FXML
    ProgressBar pokemon_11health;
    @FXML
    ProgressBar pokemon_21health;

    //Pokemon´s image
    @FXML
    Pane pokemon_00;
    @FXML
    Pane pokemon_10;
    @FXML
    Pane pokemon_20;
    @FXML
    Pane pokemon_01;
    @FXML
    Pane pokemon_11;
    @FXML
    Pane pokemon_21;


    @FXML
    public void initialize(){
        pokemonArrayList.add(pokemon1);
        pokemonArrayList.add(pokemon2);
        pokemonArrayList.add(pokemon3);
        pokemonArrayList.add(pokemon4);
        pokemonArrayList.add(pokemon5);
        pokemonArrayList.add(pokemon6);

        //Pokemon´s name
        pokemon_00name.setText(pokemonArrayList.get(0).getName());
        pokemon_10name.setText(pokemonArrayList.get(1).getName());
        pokemon_20name.setText(pokemonArrayList.get(2).getName());
        pokemon_01name.setText(pokemonArrayList.get(3).getName());
        pokemon_11name.setText(pokemonArrayList.get(4).getName());
        pokemon_21name.setText(pokemonArrayList.get(5).getName());

        //Pokemon´s image
        pokemon_00image.setImage(pokemon1.getImage());
        pokemon_10image.setImage(pokemon2.getImage());
        pokemon_20image.setImage(pokemon3.getImage());
        pokemon_01image.setImage(pokemon4.getImage());
        pokemon_11image.setImage(pokemon5.getImage());
        pokemon_21image.setImage(pokemon6.getImage());

        //Pokemon´s level
        pokemon_00level.setText(LEVEL + pokemonArrayList.get(0).getLevel());
        pokemon_10level.setText(LEVEL + pokemonArrayList.get(1).getLevel());
        pokemon_20level.setText(LEVEL + pokemonArrayList.get(2).getLevel());
        pokemon_01level.setText(LEVEL + pokemonArrayList.get(3).getLevel());
        pokemon_11level.setText(LEVEL + pokemonArrayList.get(4).getLevel());
        pokemon_21level.setText(LEVEL + pokemonArrayList.get(5).getLevel());

        //Pokemon´s health
        pokemon_00health.setProgress(calculate_health(pokemonArrayList.get(0)));
        pokemon_10health.setProgress(calculate_health(pokemonArrayList.get(1)));
        pokemon_20health.setProgress(calculate_health(pokemonArrayList.get(2)));
        pokemon_01health.setProgress(calculate_health(pokemonArrayList.get(3)));
        pokemon_11health.setProgress(calculate_health(pokemonArrayList.get(4)));
        pokemon_21health.setProgress(calculate_health(pokemonArrayList.get(5)));

    }

    private double calculate_health(Pokemon pokemon){
        return pokemon.getHealth_points()/ pokemon.getMAX_HEALTH_POINTS();
    }

    @FXML
    public void pokemon00Selected() {
        showButtonContinue();
        pokemon_00.setStyle("-fx-background-color:  #13abf4;");
        pokemon_10.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_20.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_01.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_11.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_21.setStyle("-fx-background-color:  #bbf7f3;");

    }

    @FXML
    public void pokemon10Selected() {
        showButtonContinue();
        pokemon_00.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_10.setStyle("-fx-background-color:  #13abf4;");
        pokemon_20.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_01.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_11.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_21.setStyle("-fx-background-color:  #bbf7f3;");

    }

    @FXML
    public void pokemon20Selected() {
        showButtonContinue();
        pokemon_00.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_10.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_20.setStyle("-fx-background-color:  #13abf4;");
        pokemon_01.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_11.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_21.setStyle("-fx-background-color:  #bbf7f3;");

    }

    @FXML
    public void pokemon01Selected() {
        showButtonContinue();
        pokemon_00.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_10.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_20.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_01.setStyle("-fx-background-color:  #13abf4;");
        pokemon_11.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_21.setStyle("-fx-background-color:  #bbf7f3;");

    }

    @FXML
    public void pokemon11Selected() {
        showButtonContinue();
        pokemon_00.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_10.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_20.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_01.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_11.setStyle("-fx-background-color:  #13abf4;");
        pokemon_21.setStyle("-fx-background-color:  #bbf7f3;");

    }

    @FXML
    public void pokemon21Selected() {
        showButtonContinue();
        pokemon_00.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_10.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_20.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_01.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_11.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_21.setStyle("-fx-background-color:  #13abf4;");

    }

    @FXML
    private void reset(){
        button_continue.setVisible(false);
        pokemon_00.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_10.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_20.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_01.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_11.setStyle("-fx-background-color:  #bbf7f3;");
        pokemon_21.setStyle("-fx-background-color:  #bbf7f3;");
    }

    public void showButtonContinue(){
        button_continue.setVisible(true);
    }
}