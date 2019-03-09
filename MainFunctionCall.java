import java.util.Scanner;

public class MainFunctionCall {

    private boolean playerISBlack;

    public Gomoku gomoku;

    // Use to process text input from the user.
    private Scanner scanner = new Scanner(System.in);

    public MainFunctionCall(){
        /**
         * the 'next' method of the Scanner and 'matches' of the String
         * are used to process user input
         */
        System.out.println("Do you want a black or white stone?(Y/N)");
        String IsBlack = (scanner.next());

        System.out.println("Two player mode?(Y/N)");
        String two_player = (scanner.next());

        if(two_player == "Y")
        {
            if(IsBlack == "Y")
            {
                Gomoku(true,true);
            }
            else
            {
                Gomoku(false,true);
            }
        }
    }
}
