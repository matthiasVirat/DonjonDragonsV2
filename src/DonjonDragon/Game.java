package DonjonDragon;

public class Game {
    // Attributs
    private Character[] tabCharacter = new Character[5];

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
            switch (mainChoice){
                case 1:
                    charChoice = menu.displayCharacterMenu();
                    break;
                case 9:
                    mainLoop = false;
                    charLoop = false;
                    break;
                default:
                    System.out.println("mauvais choix de menu");
            }
            ManageCharacter mc = new ManageCharacter();

            while (charLoop){
                if (charChoice != 0){
                    switch (charChoice) {
                        case 1:
                            charLoop = false;
                            mc.createCharacter(tabCharacter);
                            break;
                        case 2:
                            boolean empty = mc.isNotNull(tabCharacter);
                            if (empty) {
                                charLoop = false;
                                System.out.println("Commencez par créer un personnage");
                                menu.displayMainMenu();
                                break;
                            } else {
                                charLoop = false;
                                mc.updateCharacter(tabCharacter);
                                break;
                            }
                        case 3:
                            empty = mc.isNotNull(tabCharacter);
                            if (empty) {
                                charLoop = false;
                                System.out.println("Commencez par créer un personnage");
                                menu.displayMainMenu();
                                break;
                            } else {
                                charLoop = false;
                                mc.deleteCharacter(tabCharacter);
                                break;
                            }
                        case 9:
                            charLoop = false;
                            menu.displayMainMenu();
                    }
                }
            }
        }
    }
}
