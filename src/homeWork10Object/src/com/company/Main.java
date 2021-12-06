package homeWork10Object.src.com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first side length  ");
        int scnA = scanner.nextInt();
        System.out.println("Enter second side length ");
        int scnB = scanner.nextInt();
        rectangle.setA(scnA);
        rectangle.setB(scnB);
        System.out.println("Square of your rectangle is equal to "+rectangle.getSquare(rectangle.a, rectangle.b));
    }
}
