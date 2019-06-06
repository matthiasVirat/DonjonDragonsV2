package DonjonDragon;

import java.util.ArrayList;
import java.util.Random;

public class Box {
    // Attributs
    private String event;
    final int nbrCase = 30;

    // Constructors
    public Box(){}

    public Box(String event) {
        this.event = event;
    }

    // Getters and Setters
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void initMap(ArrayList<Box> map){
        int i =0;
        Random rand = new Random();
        while (i < nbrCase){
            Box box;
            int x = rand.nextInt(3);
            switch (x){
                case 0:
                    box = new Box("vide");
                    map.add(box);
                    break;
                case 1:
                    box = new Box("potion");
                    map.add(box);
                    break;
                case 2:
                    box = new Box("ennemi");
                    map.add(box);
                    break;
            }
            i ++;
        }
    }

    public void initMapSucces(){
        System.out.println("Plateau créé avec succès !");
    }
}
