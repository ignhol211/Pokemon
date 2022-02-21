package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class PokedexController {

    private Pokemon pokemonInPokedex = null;

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

    public void loadPokedex(Pokemon pokemonToFigth) {
        this.pokemonInPokedex = pokemonToFigth;

        pokedex_pokemon_image.setImage(pokemonInPokedex.getImage());
        pokedex_pokemon_name.setText(pokemonInPokedex.getName());
        pokedex_pokemon_description.setText(pokemonInPokedex.getDescription());
        pokedex_pokemon_basic.setImage(pokemonInPokedex.getImage());
        pokedex_pokemon_firstEvolution.setImage(pokemonInPokedex.getFirstEvolution());
        pokedex_pokemon_secondEvolution.setImage(pokemonInPokedex.getSecondEvolution());
    }

    public void sendController(Ventana1Controller ventana1Controller) {

    }
}
