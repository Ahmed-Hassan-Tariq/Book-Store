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

    public static void printBooks(Book[] bookList) { //print book list function

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null) //print books till null encountered
                bookList[i].printBook();
        }
    }

    public static void searchBook(Book[] bookList, Store newStore, boolean sell) { //search book function

        boolean bookFound = false;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter BookName: %n->");
        String userInput = input.nextLine();

        for (int i = 0; i < bookList.length; i++) {
            //encounter is not null and encounter title equals userInput(string) condition
            if (bookList[i] != null && userInput.equalsIgnoreCase(bookList[i].getTitle())) {
                bookFound = true;

                bookList[i].printBook(); //prints book's attributes



                    if (bookList[i].getQuantity() > 0 && sell) {//found book has > 0 quantity and sell is True condition

                    sellBook(bookList[i], newStore);    //call sellBook function
                } else if (bookList[i].getQuantity() == 0) {
                    System.out.printf("%nQuantity is 0, cannot sell");
                }
            }
        }

        if (!bookFound) {
            System.out.println("Book not found");
        }
    }

    public static void sellBook(Book book, Store newStore) { //sellBook function


        book.setQuantity(book.getQuantity() - 1);   //reduce book's quantity

        newStore.setBalance(newStore.getBalance() + book.getPrice()); //add book price to balance
        newStore.setRevenue(newStore.getRevenue() + book.getPrice()); //add book price to revenue
        System.out.println("Book Sold.");
        book.printBook();
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
            if (bookList[i] == null) { //stores book in empty index
                bookList[i] = new Book(ISBN, title, author, price, quantity);
                break;
            }


        }
    }

}

