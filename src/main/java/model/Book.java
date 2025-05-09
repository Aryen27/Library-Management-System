package model;

public class Book {
    public enum Category {
        FICTION,  ROMANCE, HISTORY, DRAMA, BIOGRAPHY,  SCI_FI, THRILLER, SELF_HELP,
    }
    int id, total_copies, available_copies;
    String book_name, description, author;
}
