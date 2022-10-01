import java.util.ArrayList;
import java.util.Objects;

public class Store {

    private Person storeOwner = new Person("Ahmed", null, null, null);
    private float balance = 32;
    private float revenue;

    private Book[] bookList;

    public Store() {
    }

    public Store(Person owner, float balance) {
        this.storeOwner = owner;
        this.balance = balance;
    }

    public Person getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(Person storeOwner) {
        this.storeOwner = storeOwner;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public Book[] getBookList() {
        return bookList;
    }

    public void setBookList(Book[] bookList) {
        this.bookList = bookList;
    }

    public void initializeBooks(){

        Person author = new Person("Morgan", null, null, null);

        bookList = new Book[500];

        bookList[0] = new Book("13215671", "Physics", author, 30, 10);
        bookList[1] = new Book("23215672", "Maths", author, 20, 2);
        bookList[2] = new Book("33215673", "Urdu", author, 25, 5);
        bookList[3] = new Book("43215674", "OOP", author, 19, 3);
        bookList[4] = new Book("53215675", "Stats", author, 50, 2);
    }
}
