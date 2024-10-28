import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            play_game(scanner);
            System.out.print("Do you want to try again? (yes/no)\n");
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("no")) {
                System.out.println("Let's try again!");
            } else {
                System.out.println("Thanks for playing! Goodbye.");
                break; }

        }
        scanner.close();
    }

    public static String write(Scanner scanner) {
        System.out.println("Choose one: Rock, Paper, Scissors");

        String pp = scanner.nextLine();
        String choice = pp.trim().toLowerCase();
        return choice;
    }
    public static void play_game(Scanner scanner){
        List<String> p = new ArrayList<>(Arrays.asList("rock", "paper", "scissors"));

        String choice = write(scanner);
        while (!p.contains(choice)) {
            System.out.println("Rewrite your choice");
            choice = write(scanner);
        }

        String computerChoice = robot(p);

        Winner game = new Winner(choice, computerChoice, p);
        game.determination();
    }
    public static String robot(List<String> p) {
        Random rand = new Random();
        String y = p.get(rand.nextInt(p.size()));
        System.out.println("Robot choice was: " + y);
        return y;
    }

}
