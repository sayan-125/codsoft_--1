# codsoft_task-1
TASK 1
NUMBER GAME
1.	Generate a random number within a specified range, such as 1 to 100. 
2.	Prompt the user to enter their guess for the generated number. 
3.	Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low. 
4.	Repeat steps 2 and 3 until the user guesses the correct number. You can incorporate additional details as follows: 
5.	Limit the number of attempts the user has to guess the number. 
6.	Add the option for multiple rounds, allowing the user to play again. 
7.	Display the user's score, which can be based on the number of attempts taken or rounds won.

# code:

	import java.util.*;
	class NumberGame
	{
    public static void main(String args[])
    {
        Scanner myobj = new Scanner(System.in);
        Random random = new Random();
        int attempts = 0;
        int score = 0;
        boolean playagain = true;
        while (playagain)
        {
            int originalnumberguess = random.nextInt(100) + 1;
            int userguess;
            boolean correctguess = false;
            while (!correctguess)
            {
                System.out.println("Guess a number between 1 and 100:");
                userguess = myobj.nextInt();
                attempts++;
                if (userguess == originalnumberguess)
                {
                    System.out.println("Congratulations! You guess right number.");
                    correctguess = true;
                    score++;
                }
                else if (userguess > originalnumberguess)
                {
                    System.out.println("Your guess is too high.");
                }
                else
                {
                    System.out.println("Your guess is too low.");
                }
                if (attempts >= 6)
                {
                    System.out.println("You have reached maximum number of attempts.");
                    System.out.println("Correct number = "+ originalnumberguess);
                    break;
                }
            }
            System.out.println("Your score = "+ score);
            System.out.println("Do you want to play again? (yes/no)");
            String answer = myobj.next();
            playagain = answer.equalsIgnoreCase("yes");
        }
    }
	}

# Instraction:

	1. Copy Full code.
	2. Save: NumberGame.java
	3. Compile: javac NumberGame.java
	4. Run: java NumberGame
