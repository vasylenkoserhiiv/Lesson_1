package Task_4;

public class NewAddress {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex("01001");
        address.setCountry("Ukraine");
        address.setCity("Kiev");
        address.setStreet("MyStreet");
        address.setHouse("111");
        address.setApartment("11");

        System.out.println("Індекс: " + address.getIndex());
        System.out.println("Країна: " + address.getCountry());
        System.out.println("Місто: " + address.getCity());
        System.out.println("Вулиця: " + address.getStreet());
        System.out.println("Будинок: " + address.getHouse());
        System.out.println("Квартира: " + address.getApartment());
    }
}
