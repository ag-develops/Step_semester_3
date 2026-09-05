package string.class_problems;

import java.util.*;

public class RPS {
    static String playRound(String player, String computer) {
        if (player.equals(computer)) return "Draw";
        if ((player.equals("Rock") && computer.equals("Scissors")) ||
            (player.equals("Paper") && computer.equals("Rock")) ||
            (player.equals("Scissors") && computer.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] moves = {"Rock", "Paper", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        for (int round = 1; round <= 5; round++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            String player = scanner.next();
            String computer = moves[random.nextInt(3)];
            String result = playRound(player, computer);

            System.out.println("Round " + round + ": " + result);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        System.out.println("Draws: " + draws);
        System.out.println("Win %: " + (wins * 100.0 / 5) + "%");

        scanner.close();
    }
}
