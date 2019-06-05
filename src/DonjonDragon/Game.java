package DonjonDragon;

public class Game {
    // Attributs
    private Character[] tabCharacter;

    // Constructors

    public Game() {
    }

    public void initGame(){
        Menu menu = new Menu();
        int mainChoice = menu.displayMainMenu();

        int charChoice = 0;
        switch (mainChoice){
            case 1:
                charChoice = menu.displayCharacterMenu();
                break;
            case 9:
                break;
            default:
                System.out.println("mauvais choix de menu");
        }
        ManageCharacter mc = new ManageCharacter();
        if (charChoice != 0){
            switch (charChoice) {
                case 1:
                    tabCharacter = mc.createCharacter();
                    break;
                case 2:
                    boolean empty = mc.isNotNull(tabCharacter);
                    if (empty) {
                        System.out.println("Commencez par créer un personnage");
                        menu.displayCharacterMenu();
                        break;
                    } else {
                        mc.updateCharacter(tabCharacter);
                        break;
                    }
                case 3:
                    empty = mc.isNotNull(tabCharacter);
                    if (empty) {
                        System.out.println("Commencez par créer un personnage");
                        menu.displayCharacterMenu();
                        break;
                    } else {
                        mc.deleteCharacter(tabCharacter);
                        break;
                    }
                case 9:
                    menu.displayMainMenu();
            }
        }

    }
}
