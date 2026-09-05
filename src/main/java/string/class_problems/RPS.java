import java.util.*;

class RPS {
    static String playRound(String p, String c) {
        if (p.equals(c)) return "Draw";
        if ((p.equals("Rock") && c.equals("Scissors")) ||
            (p.equals("Paper") && c.equals("Rock")) ||
            (p.equals("Scissors") && c.equals("Paper")))
            return "Player Wins";
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        String[] moves = {"Rock", "Paper", "Scissors"};
        String[] player = new String[5];
        String[] computer = new String[5];
        String[] result = new String[5];

        int w = 0, l = 0, d = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Rock/Paper/Scissors: ");
            player[i] = sc.next();
            computer[i] = moves[r.nextInt(3)];
            result[i] = playRound(player[i], computer[i]);

            if (result[i].equals("Player Wins")) w++;
            else if (result[i].equals("Computer Wins")) l++;
            else d++;
        }

        System.out.println("\nRound\tPlayer\tComputer\tResult");
        for (int i = 0; i < 5; i++)
            System.out.println((i+1) + "\t" + player[i] + "\t" + computer[i] + "\t\t" + result[i]);

        System.out.println("Wins: " + w + " | Losses: " + l +
                           " | Draws: " + d +
                           " | Win % = " + (w * 100.0 / 5) + "%");
    }
}
