package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Ventana2Controller {

    private final int OPONENT_MAX_HEATLH = 100;
    public ImageView oponent_image;
    public Text oponent_name;
    public Text oponent_level;
    public ProgressBar oponent_health;
    public ImageView oponent_gender;

    ArrayList<Pokemon> oponentsArrayList = new ArrayList<>();

    public void loadBattlefield (Pokemon pokemontoFight){

        Pokemon oponent1;
        Pokemon oponent2;
        Pokemon oponent3;
        Pokemon oponent4;
        Pokemon oponent5;
        Pokemon oponent6;

        {
            try {
                oponent1 = new Pokemon ("Pidgeotto", (int) (Math.random()*(5-2)),OPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\pidgeotto.png")));
                oponentsArrayList.add(oponent1);
                oponent2 = new Pokemon ("Rattata",(int) (Math.random()*(5-2)),OPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\rattata.png")));
                oponentsArrayList.add(oponent2);
                oponent3 = new Pokemon ("Butterfree",(int) (Math.random()*(5-2)),OPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\butterfree.png")));
                oponentsArrayList.add(oponent3);
                oponent4 = new Pokemon ("Sentret",(int) (Math.random()*(5-2)),OPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\sentret.png")));
                oponentsArrayList.add(oponent4);
                oponent5 = new Pokemon ("Chinchou",(int) (Math.random()*(5-2)),OPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\male.png")), new Image(new FileInputStream(".\\src\\main\\resources\\chinchou.png")));
                oponentsArrayList.add(oponent5);
                oponent6 = new Pokemon ("Abra",(int) (Math.random()*(5-2)),OPONENT_MAX_HEATLH,new Image(new FileInputStream(".\\src\\main\\resources\\female.png")), new Image(new FileInputStream(".\\src\\main\\resources\\abra.png")));
                oponentsArrayList.add(oponent6);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        loadOponent(oponentsArrayList.get((int) (Math.random()*(6-1))));

    }

    private void loadOponent (Pokemon oponent){

        oponent_image.setImage(oponent.getImage());
        oponent_name.setText(oponent.getName());
        oponent_level.setText(Ventana1Controller.LEVEL+oponent.getLevel());
        oponent_health.setProgress(oponent.getHealth_points());
        oponent_gender.setImage(oponent.getGender());

    }
}
