import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();

        System.out.println("Mrs/Mr."+name+", "+age+" years old. "+"Height "+height);

        keyboard.close();
    }
}
