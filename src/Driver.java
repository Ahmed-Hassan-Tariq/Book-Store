import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

    Book bookList[] = new Book[3];
    Store newStore = new Store();


    bookList[0] = new Book(null, null,null, 0, 0 );
    bookList[1] = new Book("43215678", "Maths","Morgan", 20, 3 );
    bookList[2] = new Book("43215678", "English","Morgan", 25, 6 );

//    for(int i=0; i < bookList.length;i++){
//        bookList[i] = new Book("43215678", "Maths","Morgan", 20, 6 );
//    }

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter Options:%n1-Search book%n2-PrintBookList%n3-PrintRevenue%n4-Exit%n->");
        int userInput = input.nextInt();
        switch (userInput){
            case 2:
                printBooks(bookList);
                System.exit(0);

            case 3:
                System.out.println("Revenue: $"+newStore.getRevenue());
                System.exit(0);
            case 1:
                searchBook(bookList, newStore);
                System.exit(0);
            default:
                System.exit(0);


        }

//    printBooks(bookList);//Assigns books







    }

    public static int searchBook(Book bookList[], Store newStore){
        int bookValue=0;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter BookName:%n->");
        String userInput = input.nextLine();
        bookList[0].setTitle(userInput);

        for (int i = 1; i < bookList.length; i++) {
                if(bookList[0].equals(bookList[i])){
                    bookValue = 1;
                    sellBook(bookList[i],newStore);
                }

        }
        if(bookValue==0)
            System.out.println("Book not found");
        return bookValue;
    }

    public static void printBooks(Book bookList[]) {

        for (int i = 1; i < bookList.length; i++) {
            if (bookList[i] != null)
                System.out.println(bookList[i]);
        }
    }

    public static void sellBook(Book book,Store newStore){

        Scanner input = new Scanner(System.in);
        System.out.printf("Do you want to sell book?:%n1-Yes%n2-No%n->");
        int userInput = input.nextInt();
        switch (userInput){
            case 1:
                if(book.getQuantity()>0) {
                    System.out.println(book.toString());
                    book.setQuantity(book.getQuantity() - 1);
                    System.out.println("Now Books Quantity: "+book.getQuantity());
                    newStore.setRevenue(book.getPrice());

                }
                System.out.println("Revenue generated: $"+newStore.getRevenue());



            case 4:
                System.exit(0);


        }


    }


}

