public class Books {

    private String bookName;
    private String bookAuthur;
    private String bookCategory;

    public Books(String bookName, String bookAuthur, String bookCategory) {
        setBookName(bookName);
        setBookAuthur(bookAuthur);
        setBookCategory(bookCategory);
    }

    public String getBookName() {

        return bookName;
    }

    public String getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthur() {
        return bookAuthur;
    }

    public void setBookAuthur(String bookAuthur) {
        this.bookAuthur = bookAuthur;
    }
}
