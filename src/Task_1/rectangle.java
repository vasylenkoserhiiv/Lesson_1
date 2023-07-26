package Task_1;

import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Введіть величину першої сторони: ");
        double side1 = userInput.nextDouble();
        System.out.print("Введіть величину другої сторони: ");
        double side2 = userInput.nextDouble();
        userInput.close();

        Rectangle rec = new Rectangle(side1, side2);
        double area = rec.areaCalculator();
        double perimeter = rec.perimeterCalculator();

        System.out.println("Площа: " + area);
        System.out.println("Периметр: " + perimeter);
    }
}
