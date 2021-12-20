package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ventana1Controller {

    ArrayList <Pokemon> pokemonArrayList = new ArrayList <Pokemon>();

    File imagen_00 = new File ("src\\main\\resources\\charmander.png");
    File imagen_10 = new File ("src\\main\\resources\\squirtle.png");
    File imagen_20 = new File ("src\\main\\resources\\bulbasaur.png");
    File imagen_01 = new File ("src\\main\\resources\\cyndaquil.png");
    File imagen_11 = new File ("src\\main\\resources\\totodile.png");
    File imagen_21 = new File ("src\\main\\resources\\chikorita.png");

    Pokemon pokemon1 = new Pokemon ("Charmander",5,35,"male",6,10,1,new Image(imagen_00.toURI().toString()));
    Pokemon pokemon2 = new Pokemon ("Squirtle",5,30,"male",5,8,3,new Image(imagen_10.toURI().toString()));
    Pokemon pokemon3 = new Pokemon ("Bulbasaur",5,25,"male",7,9,2,new Image(imagen_20.toURI().toString()));
    Pokemon pokemon4 = new Pokemon ("Cyndaquil",5,30,"male",5,9,1,new Image(imagen_01.toURI().toString()));
    Pokemon pokemon5 = new Pokemon ("Totodile",5,20,"male",8,10,3,new Image(imagen_11.toURI().toString()));
    Pokemon pokemon6 = new Pokemon ("Chikorita",5,35,"female",5,7,3,new Image(imagen_21.toURI().toString()));

    @FXML
    ImageView pokemon_00_image;

    @FXML
    public void initialize(){
        pokemonArrayList.add(pokemon1);

        pokemon_00_image.setImage(pokemon1.getFoto());
    }

    @FXML
    private void onPokemonSelected(){
        pokemon_00_image.setStyle("-fx-effect: blend;");
    }

    public void onPokemonEntered(){
        pokemon_00_image.setStyle("-fx-effect: lighting;");
    }
}