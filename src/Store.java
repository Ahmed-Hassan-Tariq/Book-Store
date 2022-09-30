public class Store {
    private float revenue = 32;
    private Book book;

    public Store(){}

    public Store(float balance, float revenue, Book book) {
        this.revenue = revenue;
        this.book = book;
    }


    public float getRevenue() {
        return revenue;
    }

    public void setRevenue(float revenue) {
        this.revenue = revenue;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
