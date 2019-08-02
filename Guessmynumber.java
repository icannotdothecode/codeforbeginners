public class Guessmynumber {

    public static void main(String[] args) {

        // Generate a number and answer questions
        // while the user tries to guess the value.
        int secret = 1 + (int) (Math.random() * 1000000);

        System.out.println("I'm thinking of a number ");
        System.out.println("between 1 and 1,000,000");
        int guess = 0; 
        while (guess != secret) {

            // Solicit one guess and provide one answer
            StdOut.print("What's your guess? ");
            guess = StdIn.readInt();
            if      (guess < secret) StdOut.println("Too low");
            else if (guess > secret) StdOut.println("Too high");
            else                     StdOut.println("You win!");
        }
    }
} 