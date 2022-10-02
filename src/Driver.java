import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Person storeOwner = new Person("Ahmed", 20, null); // create Store Owner.
        Person Morgan = new Person("Morgan", 44, null); //create Book Author.

        Store newStore = new Store(storeOwner, 100, 500); //create Store.

        newStore.initializeBook("12345", "Physics", Morgan, 25, 3); //create Book.
        newStore.initializeBook("12346", "English", Morgan, 12, 1);
        newStore.initializeBook("12346", "Maths", Morgan, 12, 2);

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.printf(
                    "%nEnter Options:" +
                            "%nPress 1 to Search Book" +
                            "%nPress 2 to Sell Book" +
                            "%nPress 3 to Book List " +
                            "%nPress 4 to Print Balance" +
                            "%nPress 5 to Exit" +
                            "%n->");
            int userInput = input.nextInt();
            switch (userInput) {
                case 1: // search for a book; Not Selling.
                    Store.searchBook(newStore.getBookList(), newStore, false);
                    break;
                case 2: // search for a book; Selling.
                    Store.searchBook(newStore.getBookList(), newStore, true);
                    break;
                case 3: // prints books in list.
                    Store.printBooks(newStore.getBookList());
                    break;
                case 4: // print balance and revenue.
                    System.out.println("Balance: $" + newStore.getBalance());
                    System.out.println("Revenue: $" + newStore.getRevenue());
                    break;
                case 5: //Exits program.
                    System.exit(0);
                default: // default.
                    System.out.println("Invalid input.");
                    break;
            }
        }

    }

}





