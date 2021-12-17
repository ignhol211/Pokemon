package sample;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.util.ArrayList;

public class Ventana1Controller {

    @FXML
    ImageView pokemon_00_image;


    ArrayList<Pokemon> pokemonArrayList = new ArrayList<Pokemon>();

    @FXML
    public void initialize(){
        Pokemon pokemon1 = new Pokemon ("Charmander",5,35,"male",6,10,1);
        pokemonArrayList.add(pokemon1);
        Pokemon pokemon2 = new Pokemon ("Squirtle",5,30,"male",5,8,3);
        pokemonArrayList.add(pokemon2);
        Pokemon pokemon3 = new Pokemon ("Bulbasaur",5,25,"male",7,9,2);
        pokemonArrayList.add(pokemon3);
        Pokemon pokemon4 = new Pokemon ("Cyndaquil",5,30,"male",5,9,1);
        pokemonArrayList.add(pokemon4);
        Pokemon pokemon5 = new Pokemon ("Totodile",5,20,"male",8,10,3);
        pokemonArrayList.add(pokemon5);
        Pokemon pokemon6 = new Pokemon ("Chikorita",5,35,"female",5,7,3);
        pokemonArrayList.add(pokemon6);
    }

    @FXML
    private void onPokemonSelected(){
        pokemon_00_image.setImage();
        pokemon_00_image.setStyle("-fx-effect: blend;");
    }

    public void onPokemonEntered(MouseEvent mouseEvent) {
        pokemon_00_image.setStyle("-fx-effect: lighting;");
    }
}