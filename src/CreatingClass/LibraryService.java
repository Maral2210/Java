package CreatingClass;

public class LibraryService {


    private String bookTitle;
    private String bookAuthor;
    private String iISBN; //we assumed some ISBN numbers thats starts with "0"
    public int numberOfPages;
    public boolean aVialibility;
    private String barrowDate;
    private String returnDate;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    private LibraryService(String bookTitle, String bookAuthor, String iISBN, int numberOfPages, boolean aVialibility, String barrowDate, String returnDate){
        this.bookTitle=bookTitle;
        this.bookAuthor=bookAuthor;
        this.iISBN=iISBN;
        this.numberOfPages=numberOfPages;
        this.aVialibility=aVialibility;
        this.barrowDate=barrowDate;
        this.returnDate=returnDate;
        //do all returning lines

    }
    public void returnBook(){
        this.aVialibility=true;
        String dateArra[]= barrowDate.split("/");
        int month = Integer.parseInt(dateArra[0]);
        int day = Integer.parseInt(dateArra[1]);
        if ((month>0&&month<13)&&(day>0&&day<32));

    }

    public LibraryService() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

