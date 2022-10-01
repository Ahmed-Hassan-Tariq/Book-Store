import java.util.Scanner;

public class Store {

    private Person storeOwner = new Person("Ahmed", null, null);
    private float balance;
    private float revenue;

    private Book[] bookList;

    public Store() {
    }

    public Store(Person owner, float balance, int books) {
        this.storeOwner = owner;
        this.balance = balance;
        this.bookList = new Book[books];
    }

    public static void printBooks(Book[] bookList) {

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null)
                bookList[i].printBook();
        }
    }

    public static void searchBook(Book[] bookList, Store newStore, boolean sell) {

        boolean bookFound = false;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter BookName: %n->");
        String userInput = input.nextLine();

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null && userInput.equalsIgnoreCase(bookList[i].getTitle())) {
                bookFound = true;

                bookList[i].printBook();


                if (bookList[i].getQuantity() > 0 && sell) {
                    sellBook(bookList[i], newStore);
                } else if (bookList[i].getQuantity() == 0) {
                    System.out.printf("%nQuantity is 0, cannot sell");
                }
            }
        }


        if (!bookFound) {
            System.out.println("Book not found");
        }
    }

    public static void sellBook(Book book, Store newStore) {

        book.printBook();
        book.setQuantity(book.getQuantity() - 1);
        System.out.println("Book Sold");
        newStore.setBalance(newStore.getBalance() + book.getPrice());
        newStore.setRevenue(newStore.getRevenue() + book.getPrice());
        System.out.println("Updated Balance: " + newStore.getBalance());

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

    public void initializeBook(String ISBN, String title, Person author, float price, int quantity) {

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] == null) {
                bookList[i] = new Book(ISBN, title, author, price, quantity);
                break;
            }


        }
    }

}

