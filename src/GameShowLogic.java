import java.util.Scanner;
import java.lang.Thread; //https://www.geeksforgeeks.org/thread-sleep-method-in-java-with-examples/

public class GameShowLogic {
    private Scanner myScanner;
    private Player currentPlayer;
    private Player player1;
    private Player player2;
    private Question currentQuestion;
    private Player winner;
    private Player winner2;

    public GameShowLogic() {
        myScanner = new Scanner(System.in);
    }

    public void start() {
        introduction();
        round();
    }

    private void introduction() {
        System.out.println("Welcome to our gameshow!");
        System.out.println("We're going to have two players face off against each other.");
        System.out.print("Our first player is ");
        String firstPlayerName = myScanner.nextLine();
        player1 = new Player(firstPlayerName);
        System.out.print("Our second player is ");
        String secondPlayerName = myScanner.nextLine();
        player2 = new Player(secondPlayerName);
        System.out.println("We have our two players! Let me explain the rules.");
        System.out.println("Each player will have to answer a set of questions.");
        try {
            Thread.sleep(1000);
        } catch(InterruptedException e) {} // https://stackoverflow.com/questions/43507587/how-to-pause-my-java-program-for-2-seconds (used multiple times)
        System.out.println("Each question is worth 100 points." + "\n" + "Once all the questions, the game will end." + "\n" +  "Whoever has the highest score wins.");
        try {
            Thread.sleep(2000);
        } catch(InterruptedException e) {}
        System.out.println("Now that the game is explained and we're all ready, let's start!");
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
            String player1Name = player1.getName();
            System.out.println("It seems like " + player1Name + " will be going first.");
            currentPlayer = player1;
        } else {
            String player2Name = player2.getName();
            System.out.println("It seems like " + player2Name + " will be going first.");
            currentPlayer = player2;
        }
    }

    private void round() {
        System.out.println("ROUND START");
        Question[] questions = makeQuestions();
        int item = 0;

        while (item < 20) {
            String nameOfQuestion = questions[item].getPrompt();
            System.out.println(currentPlayer.getName() + ", " + nameOfQuestion.substring(0, 1).toLowerCase() + nameOfQuestion.substring(1));
            String answer = myScanner.nextLine();
            if (answer.equalsIgnoreCase(questions[item].getAnswer())) {
                System.out.println("Yes! The correct answer is " + questions[item].getAnswer());
                currentPlayer.updateScore(100);
                currentPlayer.changeStreak(true);
                currentPlayer.countStreak();
                if (currentPlayer.getStreak()) {
                    if (currentPlayer.getNumQuestions() == 1) {
                        System.out.println(currentPlayer.getName() + " has activated a new streak!");
                    } else {
                        System.out.println(currentPlayer.getName() + " has " + currentPlayer.getNumQuestions() + " questions correct in a row!");
                    }
                }
            } else {
                System.out.println("Sorry. The correct answer is " + questions[item].getAnswer());
                currentPlayer.changeStreak(false);
                currentPlayer.countStreak();
            }

            if (item % 2 == 1) {
                System.out.println();
                System.out.println("Scoreboard:");
                System.out.println(player1.getName() + "'s score: " + player1.getScore() + " points");
                System.out.println(player2.getName() + "'s score: " + player2.getScore() + " points");
                System.out.println();
            }
            item++;
            checkAPlayer();
        }

        display();
    }

    private void display() {
        checkScore();
        int longestLength = 0;
        // helps decide how long the frame should be depending on who won
        if (winner2 != null) {
            if (winner.getName().length() > winner2.getName().length()) {
                longestLength = winner.getName().length();
            } else {
                longestLength = winner2.getName().length();
            }
        } else {
            if (winner != null) {
                longestLength = winner.getName().length();
            } else {
                longestLength = 6;
            }
        }

        // frame
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < longestLength + 9; j++) {
                if (j == longestLength + 8) {
                    System.out.print("-" + "\n");
                } else {
                    System.out.print("-");
                }
            }
        }

        // describes winner
        if (winner == null && winner2 == null) {
            System.out.println("* Nobody won! *");
        }
        if (winner != null) {
            System.out.println("* " + winner.getName() + " won! *");
        }
        if (winner2 != null) {
            System.out.println("* " + winner2.getName() + " won! *");
        }


        // frame
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < longestLength + 9; j++) {
                if (j == longestLength + 8) {
                    System.out.print("-" + "\n");
                } else {
                    System.out.print("-");
                }
            }
        }
    }

    private void checkAPlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    private Question[] makeQuestions() {
        Question[] questions = new Question[20];
        int item = 0;

        Question q1 = new Question("How many days does it take for the Earth to orbit the Sun?", "365");
        questions[item] = q1;
        item++;

        Question q2 = new Question("What do you call a group of crows?", "murder");
        questions[item] = q2;
        item++;

        Question q3 = new Question("What is the most popular music streaming service?", "spotify");
        questions[item] = q3;
        item++;

        Question q4 = new Question("What is the name of the puzzle that is a 3x3, three-dimensional cube?", "rubik's cube");
        questions[item] = q4;
        item++;

        Question q5 = new Question("What is the best selling book of all time?", "bible");
        questions[item] = q5;
        item++;

        Question q6 = new Question("What invention made by Eli Whitney that changed the South?", "cotton gin");
        questions[item] = q6;
        item++;

        Question q7 = new Question("Which president died after a month in office from pneumonia?", "william henry harrison");
        questions[item] = q7;
        item++;

        Question q8 = new Question("Who is the leading scorer in NBA history?", "lebron james");
        questions[item] = q8;
        item++;

        Question q9 = new Question("What is the smallest country in the world?", "vatican city");
        questions[item] = q9;
        item++;

        // rest of questions come from https://www.today.com/life/inspiration/trivia-questions-rcna39101
        Question q10 = new Question("What beloved cast of characters was created by Jim Henson?", "muppets");
        questions[item] = q10;
        item++;

        Question q11 = new Question("What is the name of Elvis Presley's Memphis home?", "graceland");
        questions[item] = q11;
        item++;

        Question q12 = new Question("Who starred alongside Chris Tucker in the 1998 movie \"Rush Hour\"?", "jackie chan");
        questions[item] = q12;
        item++;

        Question q13 = new Question("Which Italian town is the setting for Romeo and Juliet?", "verona");
        questions[item] = q13;
        item++;

        Question q14 = new Question("The unicorn is the national animal of which country?", "scotland");
        questions[item] = q14;
        item++;

        Question q15 = new Question("What condiment was once sold as a medicinal cure for diarrhea?", "ketchup");
        questions[item] = q15;
        item++;

        Question q16 = new Question("What species of fish is Nemo?", "clownfish");
        questions[item] = q16;
        item++;

        Question q17 = new Question("What blood type is a universal donor?", "o negative");
        questions[item] = q17;
        item++;

        Question q18 = new Question("Who plays Ken in the 2023 movie \"Barbie\"?", "ryan gosling");
        questions[item] = q18;
        item++;

        Question q19 = new Question("What popular candy used to be known as M&M's Fruit Chews?", "starburst");
        questions[item] = q19;
        item++;

        Question q20 = new Question("What is the only food that can never go bad?", "honey");
        questions[item] = q20;
        item = 0;

        return questions;
    }

    private void checkScore() {
        if (player1.getScore() > player2.getScore()) {
            winner = player1;
        } else if (player2.getScore() > player1.getScore()) {
            winner = player2;
        } else if ((player1.getScore() == player2.getScore()) && player1.getScore() != 0) {
            winner = player1;
            winner2 = player2;
        } else {
            winner = null;
            winner2 = null;
        }
    }




}
