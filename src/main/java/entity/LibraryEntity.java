package entity;


public class LibraryEntity {
    int bookid;
    String title;
    String author;
    String page;
    String year;

    public LibraryEntity(String author, String title) {
        this.author = author;
        this.title = title;
        this.page = "";
        this.year = "";
    }


    public LibraryEntity(String author, String title, String page, String year) {
        this.bookid = -1;
        this.author = author;
        this.title = title;
        this.page = page;
        this.year = year;
    }

    public LibraryEntity(int bookid, String author, String title, String page, String year) {
        this.bookid = bookid;
        this.author = author;
        this.title = title;
        this.page = page;
        this.year = year;
    }

    @Override
    public String toString() {
        return "LibraryEntity{" +
                "bookid=" + bookid +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", page='" + page + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
