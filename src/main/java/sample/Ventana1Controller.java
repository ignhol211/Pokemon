package sample;

import javafx.fxml.FXML;

import java.io.File;
import java.util.ArrayList;

public class Ventana1Controller {

    ArrayList <Pokemon> pokemonArrayList = new ArrayList <Pokemon>();

    Pokemon pokemon1 = new Pokemon ("Charmander",5,35,"male",6,10,1,new File("\"src\\\\main\\\\resources\\\\charmander.png\""));
    Pokemon pokemon2 = new Pokemon ("Squirtle",5,30,"male",5,8,3,new File("src\\main\\resources\\squirtle.png"));
    Pokemon pokemon3 = new Pokemon ("Bulbasaur",5,25,"male",7,9,2,new File("src\\main\\resources\\bulbasaur.png"));
    Pokemon pokemon4 = new Pokemon ("Cyndaquil",5,30,"male",5,9,1,new File("src\\main\\resources\\cyndaquil.png"));
    Pokemon pokemon5 = new Pokemon ("Totodile",5,20,"male",8,10,3,new File("src\\main\\resources\\totodile.png"));
    Pokemon pokemon6 = new Pokemon ("Chikorita",5,35,"female",5,7,3,new File("src\\main\\resources\\chikorita.png"));

    @FXML
    String name;


    @FXML
    public void initialize(){
        pokemonArrayList.add(pokemon1);
        pokemonArrayList.add(pokemon2);
        pokemonArrayList.add(pokemon3);
        pokemonArrayList.add(pokemon4);
        pokemonArrayList.add(pokemon5);
        pokemonArrayList.add(pokemon6);
        for (Pokemon pokemon: pokemonArrayList
             ) {
            load_pokemon(pokemon);
        }
    }

    private void load_pokemon(Pokemon pokemon){

        name = pokemon.getName();

    }
}