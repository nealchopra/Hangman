public class HangmanGame
{
    private String answer;
    private int guessesLeft;
    private String lettersUsed;

    public HangmanGame()
    {
        answer = RandomWordGenerator.getRandomWord();
        guessesLeft = 7;
        lettersUsed = "";
    }

    public String getPuzzle()
    {
        String result = "";
        for (int i=0; i<answer.length(); i++)
        {
            String letter = answer.substring(i,i+1);
            if (lettersUsed.indexOf(letter) == -1)
            {
                result = result + "_ ";
            }
            else
            {
                result = result + letter;
            }
        }
        return result;
    }

    public int getGuessesLeft()
    {
        return guessesLeft;
    }

    public String getAllLettersGuessed()
    {
        return lettersUsed;
    }

    public boolean makeGuess(String letter)
    {
        letter = letter.substring(0,1);
        letter = letter.toUpperCase();
        lettersUsed = lettersUsed + letter;
        if (answer.indexOf(letter) == -1)
        {
            guessesLeft = guessesLeft - 1;
            return false;
        }
        else
        {
            return true;
        }
    }

    public String getActualAnswer()
    {
        return answer;
    }
}
