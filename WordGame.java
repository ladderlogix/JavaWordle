import java.util.*;
public class WordGame {
    private ArrayList<String> wordBroken;
    private int NumberOfGuesses;

    public WordGame(String word){
        NumberOfGuesses = 0;
        wordBroken = new ArrayList<>();
        for(int i = 0; i < word.length(); i++){
            wordBroken.add(word.substring(i,i+1));
        }
    }

    public String getHint(String guess){
        if(NumberOfGuesses > 6){
            return "Too many guesses";
        }

        ArrayList<String> guessbroken = new ArrayList<>();
        for(int i = 0; i < guess.length(); i++){
            guessbroken.add(guess.substring(i,i+1));
        }
        for(int i = 0; i < 5; i++){
            if(wordBroken.get(i).equals(guessbroken.get(i))){}
            else if(wordBroken.contains(guessbroken.get(i))){
                guessbroken.set(i,"+");
            }
            else if(!guessbroken.get(i).equals(wordBroken.get(i))){
                guessbroken.set(i,"*");
            }
        }

        String returnthing = "";
        for(int i = 0; i < guess.length(); i++){
            returnthing += guessbroken.get(i);
        }

        NumberOfGuesses++;
        return returnthing;
    }

    public int getLength(){
        return wordBroken.size();
    }

    public int getGuess(){
        return NumberOfGuesses;
    }
}
