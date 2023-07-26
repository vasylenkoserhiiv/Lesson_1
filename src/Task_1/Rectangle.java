package Task_1;
/*
Створити клас із ім'ям Rectangle. У тілі класу створити два поля, що описують довжини сторін double side1,
double side2. Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
і периметр прямокутника - double perimeterCalculator (double side1, double side2). Написати програму, яка приймає від
користувача довжини двох сторін прямокутника і виводить на екран периметр та площу.
 */
public class Rectangle {
    private double side1;
    private double side2;

    public Rectangle(double side1, double side2){
        this.side1 = side1;
        this.side2 = side2;
    }

    public double areaCalculator(){
        return side1 * side2;
    }
    public double perimeterCalculator(){
        return 2 * (side1 + side2);
    }
}
