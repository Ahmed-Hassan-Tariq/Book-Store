public class Book {
    private String ISBN;
    private String Title;
    private String Author;
    private float Price;
    private int Quantity;


    public Book(String ISBN, String title, String author, float price, int quantity) {
        this.ISBN = ISBN;
        Title = title;
        Author = author;
        Price = price;
        Quantity = quantity;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        if(price > 0.0) {
            Price = price;
        }
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity >= 0) {
            Quantity = quantity;
        }
    }

    public String toString(){
        return ("ISBN:"+this.ISBN+" Title:"+ this.Title+" Author:"+this.Author+" Price:"+this.Price+" Qnt:"+this.Quantity);
    }

    public boolean equals(Book b){

        Book temp = (Book )b;

        return (Title.equalsIgnoreCase(temp.Title));

    }
}
