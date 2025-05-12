package dao;

import model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDAO {
    private Connection conn;

    public BookDAO(Connection connection) {
        this.conn = conn;
    }

//    Insert Book
//    Get all books
//    Get Book by id
//    Update Book
//    Delete book by id

    public void addBook(Book book){
        String query= "INSERT INTO BOOKS(id,  book_name, description, author, total_copies,  available_copies) VALUES(?,?,?,?,?,?);";
        try(PreparedStatement stmt= conn.prepareStatement(query)){
            stmt.setInt(1, book.getId());
            stmt.setString(2, book.getName());
            stmt.setString(3, book.getDescription());
            stmt.setString(4, book.getAuthor());
            stmt.setString(5, book.getAuthor());
            stmt.setInt(6,book.getTotalCopies());
            stmt.setInt(7,book.getAvailable());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }


}
