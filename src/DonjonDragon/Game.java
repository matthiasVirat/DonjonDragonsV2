package DonjonDragon;

public class Game {
    // Attributs

    // Constructors

    public Game() {
    }

    public void initGame(){
        Menu m = new Menu();
        int mainChoice = m.displayMainMenu();

        switch (mainChoice){
            case 1:
                int charChoice = m.displayCharacterMenu();
                break;
            case 9:
                break;
            default:
                System.out.println("mauvais choix de menu");
        }

    }
}
