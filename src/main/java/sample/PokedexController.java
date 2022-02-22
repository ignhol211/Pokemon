package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

public class PokedexController {

    private Pokemon pokemonInPokedex = null;
    private Ventana1Controller controller1;

    @FXML
    ImageView pokedex_pokemon_image;

    @FXML
    Label pokedex_pokemon_name;

    @FXML
    Text pokedex_pokemon_description;

    @FXML
    ImageView pokedex_pokemon_basic;

    @FXML
    ImageView pokedex_pokemon_firstEvolution;

    @FXML
    ImageView pokedex_pokemon_secondEvolution;

    @FXML
    ImageView selectFavorite;

    public void loadPokedex(Pokemon pokemonToFigth) {

        this.pokemonInPokedex = pokemonToFigth;

        isPokemonFavorite();

        pokedex_pokemon_image.setImage(pokemonInPokedex.getImage());
        pokedex_pokemon_name.setText(pokemonInPokedex.getName());
        pokedex_pokemon_description.setText(pokemonInPokedex.getDescription());
        pokedex_pokemon_basic.setImage(pokemonInPokedex.getImage());
        pokedex_pokemon_firstEvolution.setImage(pokemonInPokedex.getFirstEvolution());
        pokedex_pokemon_secondEvolution.setImage(pokemonInPokedex.getSecondEvolution());

    }

    public void sendController(Ventana1Controller controller) {
        this.controller1 = controller;
    }

    @FXML
    protected void setFavorite() {
        pokemonInPokedex.setFavorite(!pokemonInPokedex.getFavorite());
        isPokemonFavorite();
        controller1.uploadPokemon(pokemonInPokedex);
    }

    private void isPokemonFavorite(){
        if(pokemonInPokedex.getFavorite()){
            selectFavorite.setOpacity(1);
        }else{
            selectFavorite.setOpacity(0.5);
        }
    }
}
