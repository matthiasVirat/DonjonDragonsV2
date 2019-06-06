package DonjonDragon;

import java.util.ArrayList;
import java.util.Random;

public class Map {
    // Attributs
    final int nbrCase = 30;

    // Constructors
    public Map() {
    }

    // Getters and Setters

    // Methods
    public void initMap(ArrayList<Box> map){
        int i =0;
        Random rand = new Random();
        while (i < nbrCase){
            Box box;
            int x = rand.nextInt(3);
            switch (x){
                case 0:
                    box = new FreeBox();
                    map.add(box);
                    break;
                case 1:
                    box = new Potion();
                    map.add(box);
                    break;
                case 2:
                    box = new Enemy();
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
