
import acm.program.*;

public class HangmanConsoleProgram extends ConsoleProgram
{

    public void run()
    {
        println("Welcome to Hangman!"); 
        HangmanGame game = new HangmanGame();
        boolean keepGoing = true;
        while(keepGoing == true)
        {
            println(game.getPuzzle());
            println("You have " + game.getGuessesLeft() + " guesses remaining.");
            println("Letters guessed: " + game.getAllLettersGuessed());
            String letter = readLine("Guess a letter: ");
            if (game.makeGuess(letter) == true)
            {
                println("Good guess!");
            }
            else
            {
                println("Bad guess!");
            }
            if (game.getGuessesLeft() == 0)
            {
                println("You lose! The answer was " + game.getActualAnswer()); 
                keepGoing = false;
            }
            if (game.getPuzzle().equals(game.getActualAnswer()))
            {
                println("You win!");
                keepGoing = false;
            }
        }
    }
}
