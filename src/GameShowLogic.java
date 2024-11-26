import java.util.Scanner;
import java.lang.Thread; //https://www.geeksforgeeks.org/thread-sleep-method-in-java-with-examples/

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
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {} // https://stackoverflow.com/questions/43507587/how-to-pause-my-java-program-for-2-seconds (used multiple times)
        System.out.println("Each round has a max amount of points, 200 points, that can be earned." + "\n" + "Once somebody hits 1000 points, the game will end.");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        System.out.println("Now that the game is explain and we're all ready, let's start!");
        System.out.println("Let's flip a coin to see who goes first.");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {}
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
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {}
        System.out.println();
        System.out.println("                 ______________\n" +
                "    __,.,---'''''              '''''---..._\n" +
                " ,-'             .....:::''::.:            '`-.\n" +
                "'           ...:::.....       '\n" +
                "            ''':::'''''       .               ,\n" +
                "|'-.._           ''''':::..::':          __,,-\n" +
                " '-.._''`---.....______________.....---''__,,-\n" +
                "      ''`---.....______________.....---''"); //https://www.asciiart.eu/miscellaneous/money
        System.out.println("...");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
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
