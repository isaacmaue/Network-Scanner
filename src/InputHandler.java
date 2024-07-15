import java.util.Scanner;


public class InputHandler {
    private Scanner inputScanner;


    public InputHandler() {
        this.inputScanner = new Scanner(System.in);
    }


    //Maybe go back and add more edge cases for input handling - think about it
    public String getUserInput() {
        String input = null;
        try {
            while (true) {
                input = inputScanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("You didn't enter anything. Try again");
                    continue;
                }
                break;
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return input;
    }

    //Method to format the user's input to use for the actual linux command.
    //This depends on the ProcessBuilder class I think
    //Wait wait wait, why did I even make this class? I wanted to use pre-defined linux commands; nmap and ip Route
    //I'll keep it incase I decide to add more commands I guess
}

