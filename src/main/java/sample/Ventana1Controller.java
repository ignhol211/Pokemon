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
            pokemon1 = new Pokemon (1,"Charmander",5,135,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\charmander.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\charmanderFighting.gif")));
            pokemon2 = new Pokemon (2,"Squirtle",5,130,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\squirtle.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\squirtleFighting.gif")));
            pokemon3 = new Pokemon (3,"Bulbasaur",5,125,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")),new Image(new FileInputStream(".\\src\\main\\resources\\bulbasaur.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\bulbasaurFighting.gif")));
            pokemon4 = new Pokemon (4,"Cyndaquil",5,130,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")),new Image(new FileInputStream(".\\src\\main\\resources\\cyndaquil.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\cyndaquilFighting.gif")));
            pokemon5 = new Pokemon (5,"Totodile",5,120,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\totodile.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\totodileFighting.gif")));
            pokemon6 = new Pokemon (6,"Chikorita",5,135,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\chikorita.gif")),new Image(new FileInputStream(".\\src\\main\\resources\\chikoritaFighting.gif")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    Button button_continue;

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

        pokemon_panes.add(pokemon_00);
        pokemon_panes.add(pokemon_10);
        pokemon_panes.add(pokemon_20);
        pokemon_panes.add(pokemon_01);
        pokemon_panes.add(pokemon_11);
        pokemon_panes.add(pokemon_21);

        //Pokemon´s name

        int i = 0;
        for (Text name : pokemon_names
        ){
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

    }

    private double calculate_health(Pokemon pokemon){
        return (double) pokemon.getHealth_points()/ pokemon.getMAX_HEALTH_POINTS();
    }

    @FXML
    public void pokemon00Selected() {
        showButtonContinue();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_00);
        pokemonToFigth = pokemonArrayList.get(0);

    }

    @FXML
    public void pokemon10Selected() {
        showButtonContinue();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_10);
        pokemonToFigth = pokemonArrayList.get(1);

    }

    @FXML
    public void pokemon20Selected() {
        showButtonContinue();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_20);
        pokemonToFigth = pokemonArrayList.get(2);

    }

    @FXML
    public void pokemon01Selected() {
        showButtonContinue();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_01);
        pokemonToFigth = pokemonArrayList.get(3);

    }

    @FXML
    public void pokemon11Selected() {
        showButtonContinue();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_11);
        pokemonToFigth = pokemonArrayList.get(4);

    }

    @FXML
    public void pokemon21Selected() {
        showButtonContinue();
        for(Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
        selectedPokemon(pokemon_21);
        pokemonToFigth = pokemonArrayList.get(5);

    }

    @FXML
    private void reset(){
        pokemonToFigth = null;
        hideButtonContinue();
        for (Pane pane: pokemon_panes){
            noSelectedPokemon(pane);
        }
    }

    public void showButtonContinue(){
        button_continue.setVisible(true);
    }
    public void hideButtonContinue(){
        button_continue.setVisible(false);
    }

    private void noSelectedPokemon(Pane background){background.setStyle("-fx-background-color:  #bbf7f3;");}
    private void selectedPokemon(Pane background){background.setStyle("-fx-background-color:   #13abf4");}

    //Battlefield elements
    private Ventana2Controller v2c;
    protected Stage stage;

    @FXML
    protected void openBattlefield(){
        if(pokemonToFigth.getHealth_points() > 0) {
            try {
                if (stage == null || !stage.isShowing()) {
                    stage = new Stage();
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/ventana2.fxml"));
                    BorderPane root = loader.load();
                    Scene scene = new Scene(root, 730, 426);
                    stage.setScene(scene);
                    stage.show();
                    stage.setResizable(false);
                    v2c = loader.getController();
                }
                v2c.loadBattlefield(pokemonToFigth);
                v2c.sendController(this);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            reset();
            alert();
        }
    }

    public void uploadPokemon(Pokemon pokemon){
        pokemonArrayList.set(pokemon.getIndex(),pokemon);
        initialize();
    }

    private void alert(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("Warning");
        alert.setContentText("It is not allowed to choose a fainted Pokemon");
        alert.showAndWait();
    }

}