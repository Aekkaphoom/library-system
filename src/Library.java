public class Library {

    private String libBookName;
    private String libBookCate;
    private String libBookType;
    private String libBorrowStutus; // N -- Borrow , Y -- Denied
    private String libDateBorrow;
    private String libDateReturn;

    private String libCode;
    private String libStatusApporve; // Y --Accept , N --Cancel, W --Wait command
    private String libUserBorrow;
    private String libAdmin;

    public Library(int row,String bookName, String bookCate) {
        row = row + 1;

        setLibBookName(bookName);
        setLibBookCate(bookCate);

        if(bookCate.equals("Company")){
            setLibCode(row, "C");
        }

        setLibBorrowStutus("N");
        setLibDateBorrow("-");
        setLibDateReturn("-");
        setLibStatusApporve("-");
        setLibUserBorrow("-");
        setLibAdmin("-");
    }

    public String getLibCode() {
        return libCode;
    }

    public void setLibCode(int row, String libCode) {
        String code = null;
        if(row < 10) {
            code = "00";
        }else if(row > 10 && row < 100){
            code = "0";
        }else{

        }

        this.libCode = libCode+code+row;
    }

    public String getLibStatusApporve() {
        return libStatusApporve;
    }

    public void setLibStatusApporve(String libStatusApporve) {
        this.libStatusApporve = libStatusApporve;
    }

    public String getLibUserBorrow() {
        return libUserBorrow;
    }

    public void setLibUserBorrow(String libUserBorrow) {
        this.libUserBorrow = libUserBorrow;
    }

    public String getLibAdmin() {
        return libAdmin;
    }

    public void setLibAdmin(String libAdmin) {
        this.libAdmin = libAdmin;
    }

    public String getLibBookName() {
        return libBookName;
    }

    public void setLibBookName(String libBookName) {
        this.libBookName = libBookName;
    }

    public String getLibBookCate() {
        return libBookCate;
    }

    public void setLibBookCate(String libBookCate) {
        this.libBookCate = libBookCate;
    }

    public String getLibBookType() {
        return libBookType;
    }

    public void setLibBookType(String libBookType) {
        this.libBookType = libBookType;
    }

    public String getLibBorrowStutus() {
        return libBorrowStutus;
    }

    public void setLibBorrowStutus(String libBorrowStutus) {
        this.libBorrowStutus = libBorrowStutus;
    }

    public String getLibDateBorrow() {
        return libDateBorrow;
    }

    public void setLibDateBorrow(String libDateBorrow) {
        this.libDateBorrow = libDateBorrow;
    }

    public String getLibDateReturn() {
        return libDateReturn;
    }

    public void setLibDateReturn(String libDateReturn) {
        this.libDateReturn = libDateReturn;
    }
}
