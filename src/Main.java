import java.awt.print.Book;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static ArrayList<Books> books = new ArrayList<>();
    private static ArrayList<Users> users = new ArrayList<>();
    private static ArrayList<Library> library = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

    private static int i;

    public static void main(String[] args) {


        books.add(new Books("Grouplease","GL","Company"));
        books.add(new Books("Thanaban","TELs","Company"));
        books.add(new Books("SekLoveBee","love","Love"));
        books.add(new Books("KornLoveLumai","Lie","Love"));
        books.add(new Books("Harry","John","<agic"));
        books.add(new Books("Naruto","-","Cartoon"));
        books.add(new Books("Math","Seksan","Study"));
        books.add(new Books("Black Butler","Yana toboso","Cartoon"));
        books.add(new Books("One Piece","Oda","Cartoon"));
        books.add(new Books("Conan","-","Cartoon"));
        books.add(new Books("English","Bee","Travel"));
        books.add(new Books("Spain","Antonio","Travel"));
        books.add(new Books("Brazil","Ronaldo","Travel"));


        for(int i = 0; i < books.size(); i++){
            library.add(new Library(books.get(i).getBookName(), books.get(i).getBookCategory()));
        }

        users.add(new Users("Bank","admin"));
        users.add(new Users("Fiv","user"));
        users.add(new Users("Ice","user"));

        showMenuHome();

    }

    private static void showMenuHome(){
        System.out.println("========== Menu home =============");
        System.out.println("1. Borrow/Return book.");
        System.out.println("2. Show all Books.");
        System.out.println("3. Show all Users.");
//        System.out.println("4. Show all Librarian."); //
//        System.out.println("5. ADD/DEL books.");
//        System.out.println("6. ADD/DEL users."); //
        System.out.println("4. View book by id."); //
        System.out.println("5. Exit program.");
        System.out.println("===================================");

        System.out.print("Entry menu : ");
        int key = scan.nextInt();

        if(key == 2){
            setShowAllBooks();
            showMenuHome();
        }

        switch (key){
            case 1:
                System.out.print("Please entry your id: ");
                int pess = scan.nextInt();
                if(users.get(pess-1).getPosition().equals("admin")){
                    System.out.println("!!!! You is Administrator cannot borrow book. !!!!");
                    showMenuHome();
                }else{
                    showMenuUser();
                }

                break;
            case 2:
                setShowAllBooks();
                showMenuHome();
                break;
            case 3:
                setShowAllUser();
                showMenuHome();
                break;
            case 4:
                System.out.print("Please entry BookID: ");
                int i = scan.nextInt();
                getSelectBook(i);
                showMenuHome();
                break;
            case 5:

                break;
            default:
                System.out.println("!!!! You select menu wrong !!!!!");
        }



    }


    private static void setShowAllUser() {
        System.out.println("UserID\tUserName\t Postion\t");
        for(int i = 0; i < users.size(); i++){
            System.out.println((i+1) + "\t" + users.get(i).getUserName() + "\t" +users.get(i).getPosition() + "\t");
        }
    }


    public static void setShowAllBooks(){
        System.out.println("BookID\tBookName\t BookAuthur\t");
        for(int i = 0; i < books.size(); i++){
            System.out.println((i+1) + "\t" + books.get(i).getBookName() + "\t" +books.get(i).getBookAuthur() + "\t");
        }
    }

    public static void getSelectBook(int id){
        System.out.println("You select book name >>>> " + books.get(id-1).getBookName() + " <<<<");
    }

    public static void showMenuUser(){
        System.out.println("========== Menu User =============");
        System.out.println("1. Borrow book.");
        System.out.println("2. Return book.");
        System.out.println("3. Show all book in Library.");
        System.out.println("4. Back to home."); //
        System.out.println("5. Exit program.");
        System.out.println("===================================");

        System.out.print("Entry menu : ");
        int i = scan.nextInt();

        switch (i){
            case 1:
                System.out.print("Entry BookID : ");
                i = scan.nextInt();
                setBorrowBook(i);
                showMenuUser();
                break;
            case 2:
                System.out.println("Entry BookID : ");
                i = scan.nextInt();
                setReturnBook(i);
                showMenuUser();
            case 3:
                showAllLibrary();
                showMenuUser();
                break;
            case 4:
                showMenuHome();
                break;
            case 5:
                break;
            default:
                System.out.println("!!!! You choose menu wrong. !!!!");
        }
    }

    public static void showAllLibrary(){
        System.out.println("ID\t BookName\t Status\t BorrowDate\t ReturnDate\t");
        for (int i = 0; i < library.size(); i++){
            System.out.println(i+1+"\t "+
                    library.get(i).getLibBookName()+"\t "+
                    library.get(i).getLibBorrowStutus()+"\t "+
                    library.get(i).getLibDateBorrow()+"\t "+
                    library.get(i).getLibDateReturn()+"\t ");
        }
    }

    public static void setBorrowBook(int bookid){
        if (library.get(bookid - 1).getLibBorrowStutus().equals("N")) {
            library.get(bookid - 1).setLibBorrowStutus("Y");
            library.get(bookid - 1).setLibDateBorrow(dateFormat.format(new Date())); // 2562-06-20
            System.out.println("You borrow book ID >> " + (bookid) + " << successfully.");
        } else if (library.get(bookid - 1).getLibBorrowStutus().equals("Y")) {
            System.out.println("!!!! This book cannot borrow. !!!!");
        }
    }

    public static void setReturnBook(int bookid){
        if(library.get(bookid-1).getLibBorrowStutus().equals("Y")) {
            library.get(bookid - 1).setLibBorrowStutus("N");
            library.get(bookid - 1).setLibDateReturn(dateFormat.format(new Date())); // 2562-06-20
            System.out.println("You borrow book ID >> " + (bookid) + " << successfully.");
        }else if(library.get(bookid-1).getLibBorrowStutus().equals("N")){
            System.out.println("!!!! This book not borrowed. !!!!");
        }
    }

}
