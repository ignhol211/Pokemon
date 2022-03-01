package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ventana1Controller {

    public static final String LEVEL = "Lv ";
    private Pokemon pokemonToFigth = null;

    ArrayList <Pokemon> pokemonArrayList = new ArrayList<>();

    Pokemon pokemon1;
    Pokemon pokemon2;
    Pokemon pokemon3;
    Pokemon pokemon4;
    Pokemon pokemon5;
    Pokemon pokemon6;

    {
        try {
            pokemon1 = new Pokemon (0,"Charmander",5,135,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\charmander.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\charmanderFighting.gif")),"Obviously prefers hot places. When it rains, steam is said to spout from the tip of its tail.",new Image(new FileInputStream(".\\src\\main\\resources\\charmeleon.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\charizard.gif")),false);
            pokemon2 = new Pokemon (1,"Squirtle",5,130,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\squirtle.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\squirtleFighting.gif")),"After birth, its back swells and hardens into a shell. Powerfully sprays foam from its mouth.",new Image(new FileInputStream(".\\src\\main\\resources\\wartortle.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\blastoise.gif")),false);
            pokemon3 = new Pokemon (2,"Bulbasaur",5,125,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")),new Image(new FileInputStream(".\\src\\main\\resources\\bulbasaur.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\bulbasaurFighting.gif")),"A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokemon.",new Image(new FileInputStream(".\\src\\main\\resources\\ivysaur.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\venusaur.gif")),false);
            pokemon4 = new Pokemon (3,"Cyndaquil",5,130,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")),new Image(new FileInputStream(".\\src\\main\\resources\\cyndaquil.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\cyndaquilFighting.gif")),"It is timid, and always curls itself up in a ball. If attacked, it flares up its back for protection.",new Image(new FileInputStream(".\\src\\main\\resources\\quilava.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\typhlosion.gif")),false);
            pokemon5 = new Pokemon (4,"Totodile",5,120,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\totodile.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\totodileFighting.gif")),"Its well-developed jaws are powerful and capable of crushing anything. Even its trainer must be careful. ",new Image(new FileInputStream(".\\src\\main\\resources\\croconaw.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\feraligatr.gif")),false);
            pokemon6 = new Pokemon (5,"Chikorita",5,135,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\chikorita.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\chikoritaFighting.gif")),"A sweet aroma gently wafts from the leaf on its head. It is docile and loves to soak up the sun's rays. ",new Image(new FileInputStream(".\\src\\main\\resources\\bayleef.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\meganium.gif")),false);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    Button button_continue;
    @FXML
    Button button_pokedex;

    //Pokemon´s names
    ArrayList <Text> pokemon_names = new ArrayList<>();
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
    ArrayList <Text> pokemon_levels = new ArrayList<>();
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
    ArrayList <ImageView> pokemon_images = new ArrayList<>();
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
    ArrayList <ProgressBar> pokemon_health = new ArrayList<>();
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

    //Pokemon´s gender
    ArrayList <ImageView> pokemon_gender = new ArrayList<>();
    @FXML
    ImageView pokemon_00gender;
    @FXML
    ImageView pokemon_10gender;
    @FXML
    ImageView pokemon_20gender;
    @FXML
    ImageView pokemon_01gender;
    @FXML
    ImageView pokemon_11gender;
    @FXML
    ImageView pokemon_21gender;

    //Pokemon´s favorite
    ArrayList <ImageView> pokemon_favorite = new ArrayList<>();
    @FXML
    ImageView pokemon_00favorite;
    @FXML
    ImageView pokemon_10favorite;
    @FXML
    ImageView pokemon_20favorite;
    @FXML
    ImageView pokemon_01favorite;
    @FXML
    ImageView pokemon_11favorite;
    @FXML
    ImageView pokemon_21favorite;

    //Pokemon´s selection
     ArrayList <Pane> pokemon_panes = new ArrayList<>();
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

        pokemon_names.add(pokemon_00name);
        pokemon_names.add(pokemon_10name);
        pokemon_names.add(pokemon_20name);
        pokemon_names.add(pokemon_01name);
        pokemon_names.add(pokemon_11name);
        pokemon_names.add(pokemon_21name);

        pokemon_levels.add(pokemon_00level);
        pokemon_levels.add(pokemon_10level);
        pokemon_levels.add(pokemon_20level);
        pokemon_levels.add(pokemon_01level);
        pokemon_levels.add(pokemon_11level);
        pokemon_levels.add(pokemon_21level);

        pokemon_health.add(pokemon_00health);
        pokemon_health.add(pokemon_10health);
        pokemon_health.add(pokemon_20health);
        pokemon_health.add(pokemon_01health);
        pokemon_health.add(pokemon_11health);
        pokemon_health.add(pokemon_21health);

        pokemon_images.add(pokemon_00image);
        pokemon_images.add(pokemon_10image);
        pokemon_images.add(pokemon_20image);
        pokemon_images.add(pokemon_01image);
        pokemon_images.add(pokemon_11image);
        pokemon_images.add(pokemon_21image);

        pokemon_gender.add(pokemon_00gender);
        pokemon_gender.add(pokemon_10gender);
        pokemon_gender.add(pokemon_20gender);
        pokemon_gender.add(pokemon_01gender);
        pokemon_gender.add(pokemon_11gender);
        pokemon_gender.add(pokemon_21gender);

        pokemon_favorite.add(pokemon_00favorite);
        pokemon_favorite.add(pokemon_10favorite);
        pokemon_favorite.add(pokemon_20favorite);
        pokemon_favorite.add(pokemon_01favorite);
        pokemon_favorite.add(pokemon_11favorite);
        pokemon_favorite.add(pokemon_21favorite);

        pokemon_panes.add(pokemon_00);
        pokemon_panes.add(pokemon_10);
        pokemon_panes.add(pokemon_20);
        pokemon_panes.add(pokemon_01);
        pokemon_panes.add(pokemon_11);
        pokemon_panes.add(pokemon_21);

        //todo Create PokemonInterface class

        //Pokemon´s name
        int i = 0;
        for (Text name : pokemon_names) {
            name.setText(pokemonArrayList.get(i).getName());
            i++;
        }


        //Pokemon´s level
        i = 0;
        for (Text level : pokemon_levels
        ){
            level.setText(LEVEL + pokemonArrayList.get(i).getLevel());
            i++;
        }

        //Pokemon´s image
        i = 0;
        for (ImageView image : pokemon_images
        ){
            image.setImage(pokemonArrayList.get(i).getImage());
            i++;
        }

        //Pokemon´s health
        i = 0;
        for (ProgressBar health : pokemon_health){
            health.setProgress(calculate_health(pokemonArrayList.get(i)));
            i++;
        }

        //Pokemon´s gender
        i = 0;
        for (ImageView gender : pokemon_gender){
            gender.setImage(pokemonArrayList.get(i).getGender());
            i++;
        }

        //Pokemon´s favorite
        i = 0;
        for (ImageView favorite : pokemon_favorite){
            favorite.setOpacity(calculateOpacity(pokemonArrayList.get(i)));
            i++;
        }

    }

    private double calculateOpacity(Pokemon pokemon) {
        if(pokemon.getFavorite()){
            return 1;
        }else{
            return 0.5;
        }
    }

    private double calculate_health(Pokemon pokemon){
        return (double) pokemon.getHealthPoints()/ pokemon.getMAX_HEALTH_POINTS();
    }

    @FXML
    public void pokemon00Selected() {
        showButtonContinuePokedex();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_00);
        pokemonToFigth = pokemonArrayList.get(0);

    }

    @FXML
    public void pokemon10Selected() {
        showButtonContinuePokedex();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_10);
        pokemonToFigth = pokemonArrayList.get(1);

    }

    @FXML
    public void pokemon20Selected() {
        showButtonContinuePokedex();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_20);
        pokemonToFigth = pokemonArrayList.get(2);

    }

    @FXML
    public void pokemon01Selected() {
        showButtonContinuePokedex();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_01);
        pokemonToFigth = pokemonArrayList.get(3);

    }

    @FXML
    public void pokemon11Selected() {
        showButtonContinuePokedex();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_11);
        pokemonToFigth = pokemonArrayList.get(4);

    }

    @FXML
    public void pokemon21Selected() {
        showButtonContinuePokedex();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_21);
        pokemonToFigth = pokemonArrayList.get(5);

    }

    @FXML
    private void reset(){
        pokemonToFigth = null;
        hideButtonsContinuePokedex();
        for (Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
    }

    public void showButtonContinuePokedex(){
        button_continue.setVisible(true);
        button_pokedex.setVisible(true);
    }
    public void hideButtonsContinuePokedex(){
        button_continue.setVisible(false);
        button_pokedex.setVisible(false);
    }

    private void noSelectedPokemon(Pane background){background.setStyle("-fx-background-color:  #bbf7f3;");}
    private void selectedPokemon(Pane background){background.setStyle("-fx-background-color:   #13abf4");}

    //Battlefield elements
    private Ventana2Controller ventana2Controller;
    protected Stage stageBattlefield;

    @FXML
    protected void openBattlefield(){
        if(pokemonToFigth.getHealthPoints() > 0) {
            try {
                if (stageBattlefield == null || !stageBattlefield.isShowing()) {
                    stageBattlefield = new Stage();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/ventana2.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root, 730, 426);
                    stageBattlefield.setScene(scene);
                    stageBattlefield.show();
                    stageBattlefield.setResizable(false);
                    ventana2Controller = loader.getController();
                }
                ventana2Controller.loadBattlefield(pokemonToFigth);
                ventana2Controller.sendController(this);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            reset();
            alert("It is not allowed to choose a fainted Pokemon");
        }
    }

    public void uploadPokemon(Pokemon pokemon){
        pokemonToFigth = null;
        pokemonArrayList.set(pokemon.getIndex(),pokemon);
        pokemonToFigth = null;
        initialize();
    }

    private void alert(String text){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Warning");
        alert.setContentText(text);
        alert.showAndWait();
    }

    //Pokedex elements
    private PokedexController pokedexController;
    protected Stage stagePokedex;

    @FXML
    public void openPokedex() {
        if(pokemonToFigth!= null){
            if(pokemonToFigth.getHealthPoints() > 0) {
                try {
                    if (stagePokedex == null || !stagePokedex.isShowing()) {
                        stagePokedex = new Stage();
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/pokedex.fxml"));
                        Pane root = loader.load();
                        Scene scene = new Scene(root, 350, 500);
                        stagePokedex.setScene(scene);
                        stagePokedex.show();
                        stagePokedex.setResizable(false);
                        pokedexController = loader.getController();
                    }
                    pokedexController.sendController(this);
                    pokedexController.loadPokedex(pokemonToFigth);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                reset();
                alert("No Pokemon is selected to show in Pokedex");
            }
        }
    }
}