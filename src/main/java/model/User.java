package model;

import java.util.ArrayList;

public class User {
    int id;
    String user_name, password;
    ArrayList<Book> issued_books;

    User(int id, String name, String password){
        this.id=id;
        this.user_name=name;
        this.password=password;
    }

    public String getName(){
        return this.user_name;
    }

    public ArrayList<Book> getIssuedBooks(){
        return this.issued_books;
    }

    public void addIssuedBooks(Book new_book){
        this.issued_books.add(new_book);
    }
}
