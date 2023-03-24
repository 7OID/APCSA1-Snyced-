package unit6;
public class Result {
    private String word;
    private int numGuesses;
    private boolean success;

    public Result(String word, int numGuesses) {
        this.word = word;
        this.numGuesses = numGuesses;
        this.success = numGuesses < 6;
    }

    public Result(String word, boolean success) {
        this.word = word;
        this.numGuesses = success ? 1 : 6;
        this.success = success;
    }

    public String getWord() {
        return word;
    }

    public int getNumGuesses() {
        return numGuesses;
    }

    public boolean isSuccess() {
        return success;
    }

    @Override
    public String toString() {
        return String.format("%s\t\t%d\t\t%s", word, numGuesses, success ? "Success" : "Failure");
    }
}