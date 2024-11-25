import java.util.Scanner;


public class GameShowLogic {
    private Scanner myScanner;
    private int totalNumRounds;

    public GameShowLogic() {
        myScanner = new Scanner(System.in);
        totalNumRounds = 5;
    }

    public void start() {
        introduction();
    }

    private void introduction() {
        System.out.println("Welcome to our gameshow!");
        System.out.println("We're going to have two players face off against each other.");
        System.out.print("Our first player is ");
        String firstPlayerName = myScanner.nextLine();
        Player player1 = new Player(firstPlayerName);
        System.out.print("Our second player is ");
        String secondPlayerName = myScanner.nextLine();
        Player player2 = new Player(secondPlayerName);
        System.out.println("We have our two players! Let me explain the rules.");
        System.out.println("Each player has three lives and we'll have multiple rounds with multiple" + "\n" + "questions.");
        System.out.println("Each round has a max amount of points, 200 points, that can be earned." + "\n" + "Once somebody hits 1000 points, the game will end.");
        System.out.println("Now that the game is explain and we're all ready, let's start!");
        System.out.println("Let's flip a coin to see who goes first.");
        int result = (int)(Math.random() * 2) + 1;
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⢀⡀⠀⠀⠀⠠⠤⠤⠤⠶⠶⠤⣤⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠠⢊⣡⣶⣿⡷⠀⠀⠀⣀⣠⣤⣤⣤⣄⢹⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⢿⠿⠟⠋⠀⠀⠀⣾⠉⠀⠀⠀⣀⣤⠞⢴⣆⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠛⠒⠚⠛⠉⠁⠀⠀⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣾⣷⣶⣶⡄⠀⢸⣿⣦⡀⠀⠀⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣉⠉⠉⠀⠀⠀⠻⣿⣿⣷⡄⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⠛⠿⠿⢿⠆⢶⣦⣄⣿⣿⣿⣿⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⣿⣶⣶⣦⠀⢸⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣬⣉⣉⣛⠀⢸⣿⣿⣿⣿⣿⣿⣄⠀⠀⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⠿⠟⠁⢸⣿⣿⣿⣿⣿⣿⣿⣷⡄⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠉⠛⠶⠾⠿⠿⢿⣿⣿⣿⣿⣿⣿⡇⠀\n" +
                "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⠉⠉⠉⠉⠉⠉⠁⠀"); //https://emojicombos.com/coinflip-ascii-art
        // thinking about adding a pause
        System.out.println("     ______________\n" +
                "    __,.,---'''''              '''''---..._\n" +
                " ,-'             .....:::''::.:            '`-.\n" +
                "'           ...:::.....       '\n" +
                "            ''':::'''''       .               ,\n" +
                "|'-.._           ''''':::..::':          __,,-\n" +
                " '-.._''`---.....______________.....---''__,,-\n" +
                "      ''`---.....______________.....---''"); //https://www.asciiart.eu/miscellaneous/money
        System.out.println("...");
        if (result == 1) {
            player1.changePriority();
            String player1Name = player1.getName();
            System.out.println("It seems like " + player1Name + " will be going first.");
        } else {
            player2.changePriority();
            String player2Name = player2.getName();
            System.out.println("It seems like " + player2Name + " will be going first.");
        }

    }

    private void round() {
        System.out.println("FIRST ROUND");

    }

    private void endOfRound() {

    }
}
