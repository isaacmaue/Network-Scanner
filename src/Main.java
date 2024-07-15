import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter some input");
        InputHandler scanner = new InputHandler();
        System.out.println(scanner.getUserInput());
    }
}