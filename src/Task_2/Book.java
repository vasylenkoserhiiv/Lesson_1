package Task_2;
/*
Створити клас Book (Main). Створити класи Title, Author та Content, кожен з яких повинен містити одне рядкове поле
та метод void show(). Реалізуйте можливість додавання до книги назви книги, імені автора та змісту.
Виведіть на екран за допомогою методу show() назву книги, ім'я автора та Зміст.
 */
public class Book {
    private Title title;
    private Author author;
    private Content content;
    public Book(){
        this.title = new Title();
        this.author = new Author();
        this.content = new Content();
    }
    public void setTitle(String title) {
        this.title.setTitle(title);
    }
    public void setAuthor(String author){
        this.author.setAuthor(author);
    }
    public void setContent(String content) {
        this.content.setContent(content);
    }
    public void show(){
        title.show();
        author.show();
        content.show();
    }

    public static void main(String[] args) {
        Book myBook = new Book();
        //Додаємо до книги назву
        myBook.setTitle("Just Book");
        //Додаємо до книги автора
        myBook.setAuthor("Best Author)");
        //Додаємо до книги зміст
        myBook.setContent("The best content should be here");
        //Виводимо назву, автора та зміст книги
        myBook.show();
    }
}
