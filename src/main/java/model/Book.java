package model;

public class Book {
    public enum Category {
        FICTION,  ROMANCE, HISTORY, DRAMA, BIOGRAPHY,  SCI_FI, THRILLER, SELF_HELP,
    }
    int id, total_copies, available_copies;
    String book_name, description, author;

    Book(int id, String book_name, String description, String author, int total_copies, int available_copies){
        this.id=id;
        this.book_name=book_name;
        this.description= description;
        this.author=author;
        this.total_copies=total_copies;
        this.available_copies=available_copies;
    }

    public String getName(){
        return this.book_name;
    }

    public String getDescription(){
        return this.description;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getAvailable(){
        return this.available_copies;
    }

    public int getTotalCopies(){
        return this.total_copies;
    }
}
