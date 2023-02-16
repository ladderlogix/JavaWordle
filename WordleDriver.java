import java.util.*;

public class WordDriver {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        WordGame puzzle = new WordGame("HOUSE");
        System.out.println("Welcome to my Wordle game");
        System.out.println("Word length: " + puzzle.getLength());
        while(puzzle.getGuess() < 6){
            System.out.println("Guess: ");
            System.out.println(puzzle.getHint(scan.nextLine()));
        }
    }
}
