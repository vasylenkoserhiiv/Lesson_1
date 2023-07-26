package Task_3;

public class Computers {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("Samsung", "R-780", 600);
        computers[1] = new Computer("Lenovo", "IdeaPad", 700);
        computers[2] = new Computer("HP", "Pavilion", 1200);
        computers[3] = new Computer("Asus", "ROG", 1500);
        computers[4] = new Computer("Acer", "Aspire 7", 900);


        for (int i = 0; i < 5; i++) {
            System.out.println("Комп'ютер " + (i + 1) + ":");
            System.out.println("Brand: " + computers[i].getBrand());
            System.out.println("Model: " + computers[i].getModel());
            System.out.println("Price: " + computers[i].getPrice() + "$\n");
        }
    }
}
