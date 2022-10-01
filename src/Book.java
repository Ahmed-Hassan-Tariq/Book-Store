public class Book {
    private String ISBN;
    private String Title;
    private Person Author;
    private float Price;
    private int Quantity;

    public Book() {
    }


    public Book(String ISBN, String title, Person author, float price, int quantity) {
        this.ISBN = ISBN;
        this.Title = title;
        this.Author = author;
        this.Price = price;
        this.Quantity = quantity;
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

    public Person getAuthor() {
        return Author;
    }

    public void setAuthor(Person author) {
        this.Author = author;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        if (price > 0.0) {
            Price = price;
        }
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            Quantity = quantity;
        }
    }

    public String toString() {
        return ("ISBN:" + this.ISBN +
                " Title:" + this.Title +
                " Author:" + this.Author.getName() +
                " Price:" + this.Price +
                " Qnt:" + this.Quantity);
    }

}
