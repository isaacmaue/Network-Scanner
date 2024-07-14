import java.util.Scanner;


public class InputHandler {
    private Scanner inputScanner = new Scanner(System.in);
    private String input;

    public void getUserInput(){
        try {
            while (true) {
                this.input = inputScanner.nextLine();
                if (input.isEmpty()) {
                    System.out.println("You didn't enter anything. Try again");
                    continue;
                }
                break;
            }
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

    public String getInput() {
        return input;
    }

}
