import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Person storeOwner = new Person("Ahmed", 20, "20 July, 2020", null);
        Store newStore = new Store(storeOwner, 100);

        newStore.initializeBooks();

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.printf("%nEnter Options:" +
                    "%n1-Search book" +
                    "%n2-Print books " +
                    "%n3-Print Balance" +
                    "%n4-Exit" +
                    "%n->");
            int userInput = input.nextInt();
            switch (userInput) {
                case 1: // searches a book
                    searchBook(newStore.getBookList(), newStore);
                    break;
                case 2: // prints a book
                    printBooks(newStore.getBookList());
                    break;
                case 3: // print revenue
                    System.out.println("Balance: $" + newStore.getBalance());
                    System.out.println("Revenue: $" + newStore.getRevenue());
                    break;
                case 4:
                    System.exit(0);
                default: // default
                    break;
            }
        }

    }

    public static boolean searchBook(Book[] bookList, Store newStore) {

        boolean bookFound = false;

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter BookName: %n->");
        String userInput = input.nextLine();

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null && userInput.equalsIgnoreCase(bookList[i].getTitle())) {
                bookFound = true;
                System.out.println("Book found");
                if (bookList[i].getQuantity()>0) {
                    sellBook(bookList[i], newStore);
                } else {
                    System.out.print("Quantity is 0");
                }
            }
        }

        if (!bookFound) {
            System.out.println("Book not found");
        }
        return bookFound;
    }

    public static void printBooks(Book[] bookList) {

        for (int i = 0; i < bookList.length; i++) {
            if (bookList[i] != null)
                System.out.println(bookList[i].toString());
        }
    }

    public static void sellBook(Book book, Store newStore) {

            Scanner input = new Scanner(System.in);
            System.out.printf("Do you want to sell book?:%n1-Press 1 for Yes %n2-Press 2 for No%n->");
            int userInput = input.nextInt();
            switch (userInput) {
                case 1: // sell
                        System.out.println(book);
                        book.setQuantity(book.getQuantity() - 1);
                        System.out.println("Updated Books Quantity: " + book.getQuantity());
                        newStore.setBalance(newStore.getBalance() + book.getPrice());
                        newStore.setRevenue(newStore.getRevenue() + book.getPrice());
                        System.out.println("Updated Balance: " + newStore.getBalance());
                    break;
                case 2: // do not sell
                    break;
                default: // default
                    break;
            }

        }

    }



