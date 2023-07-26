package Task_3;
/*
Створити клас Computer, створити масив об'єктів Computers розміром 5. Далі руками створити 5 екземплярів цього
класу та записати на комп'ютер (використовуючи loop).
 */
public class Computer {
    private String brand;
    private String model;
    private int price;

    public Computer(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
