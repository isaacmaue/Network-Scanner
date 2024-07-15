import java.util.Scanner;


public class InputHandler {
    private Scanner inputScanner;


    public InputHandler() {
        this.inputScanner = new Scanner(System.in);
    }


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
}

