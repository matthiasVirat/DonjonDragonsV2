package DonjonDragon;

import java.util.ArrayList;

public class Game {
    // Attributs
    private ArrayList<Character> listCharacter = new ArrayList<Character>();
    private ArrayList<Box> map = new ArrayList<Box>();

    // Constructors

    public Game() {
    }

    public void initGame(){
        Menu menu = new Menu();
        boolean mainLoop = true;
        int mainChoice = menu.displayMainMenu();
        while (mainLoop){
            boolean charLoop = true;
            int charChoice = 0;
            int mapChoice = 0;
            switch (mainChoice){
                case 1:
                    charChoice = menu.displayCharacterMenu();
                    break;
                case 2:
                    Map mp = new Map();
                    mp.initMap(map);
                    mp.initMapSucces();
                    mainChoice = menu.displayMainMenu();
                    break;
                case 9:
                    mainLoop = false;
                    charLoop = false;
                    break;
                default:
                    menu.badMenuChoice();
            }
            ManageCharacter mc = new ManageCharacter();

            while (charLoop){
                if (charChoice != 0){
                    switch (charChoice) {
                        case 1:
                            charLoop = false;
                            mc.createCharacter(listCharacter);
                            break;
                        case 2:
                            boolean empty = mc.isNotNull(listCharacter);
                            if (empty) {
                                charLoop = false;
                                mc.charNotCreated();
                                menu.displayMainMenu();
                                break;
                            } else {
                                charLoop = false;
                                mc.updateCharacter(listCharacter);
                                break;
                            }
                        case 3:
                            empty = mc.isNotNull(listCharacter);
                            if (empty) {
                                charLoop = false;
                                mc.charNotCreated();
                                menu.displayMainMenu();
                                break;
                            } else {
                                charLoop = false;
                                mc.deleteCharacter(listCharacter);
                                break;
                            }
                        case 9:
                            charLoop = false;
                            mainChoice = menu.displayMainMenu();
                    }
                } else {
                    charLoop = false;
                }
            }
        }
    }
}
