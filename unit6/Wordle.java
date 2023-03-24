package unit6;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Wordle {
    private ArrayList<String> words;
    private ArrayList<Result> results;
    private String currentWord;
    private int guessesLeft;

    public Wordle() {
        // Load words from file
        ArrayList<String> words = InputArrayList.createArrayList("words.txt");
        words = new ArrayList<>();
        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine().toUpperCase());
        }
        scanner.close();
        //Turns words in the array list to all uppercase
        // Choose initial word
        newWord();

        // Initialize results list
        results = new ArrayList<>();
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Guess the word: " + currentWord);
            System.out.print("Enter a guess (or 'end' to quit): ");
            String guess = scanner.nextLine().toUpperCase();

            if (guess.equals("END")) {
                break;
            }

            if (guess.length() != 1) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            if (currentWord.contains(guess)) {
                System.out.println("Correct!");
                resolveLetter(guess.charAt(0));
            } else {
                System.out.println("Incorrect!");
                guessesLeft--;
            }

            if (guessesLeft == 0) {
                System.out.println("Out of guesses! The word was " + currentWord);
                Result result = new Result(currentWord, false);
                results.add(result);
                System.out.println(result.summary());
                newWord();
            } else if (currentWord.equals(new String(new char[currentWord.length()]).replace('\0', '*'))) {
                System.out.println("You win! The word was " + currentWord);
                Result result = new Result(currentWord, true);
                results.add(result);
                System.out.println(result.summary());
                newWord();
            } else {
                System.out.println("Guesses left: " + guessesLeft);
            }
        }

        scanner.close();
    }

    private void newWord() {
        Random random = new Random();
        int index = random.nextInt(words.size());
        currentWord = words.get(index);
        words.remove(index);
        guessesLeft = 6;
    }

    private void resolveLetter(char letter) {
        StringBuilder sb = new StringBuilder(currentWord);
        for (int i = 0; i < currentWord.length(); i++) {
            if (currentWord.charAt(i) == letter) {
                sb.setCharAt(i, letter);
            }
        }
        currentWord = sb.toString();
    }

    public double averageGuesses() {
        int totalGuesses = 0;
        int numResults = results.size();
        for (Result result : results) {
            totalGuesses += result.getGuesses();
        }
        return (double) totalGuesses / numResults;
    }

    public int numFails() {
        int numFails = 0;
        for (Result result : results) {
            if (!result.isSuccess()) {
                numFails++;
            }
        }
        return numFails;
    }

    public int numSuccesses() {
        int numSuccesses = 0;
        for (Result result : results) {
            if (result.isSuccess()) {
                numSuccesses++;
            }
        }
        return numSuccesses;
    }
}