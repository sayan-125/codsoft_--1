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