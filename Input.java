package Home;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // "Scanner" is a input class and "scanner" is  a name of a clas.
        System.out.println("What is your name?");
        String name = scanner.nextLine();  // Here name is a variable in which input data is store. & nextLine() is a next line method.

        System.out.println("Hello " + name);
    }
}
