package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Borrow_Book {
    private int book_id;
    private int member_id;
    private String status; //Borrowed - Returned - Lost
    private String borrow_date;
    private String Return_date;
    
    Book book = new Book();
    
    //Add a new borrowing
    public void addBorrow(int _book_id, int _member_id, String _status, String _borrow_date, String _return_date, String _note){
        String insertQuery = "INSERT INTO `borrow_book`(`book_id`, `member_id`, `status`, `borrow_date`, `return_date`, `note`) VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _status);
            ps.setString(4, _borrow_date);
            ps.setString(5, _return_date);
            ps.setString(6, _note);
          
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Borrow Success","add Borrow", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Borrow Not Added","add Borrow", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow_Book.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }
    
    //Check if the book is available by using the quantity from table books
    public boolean checkBookAvailability(int _book_id){
        boolean availability = false;
        try {
            //get the book quantity
            Book selectedBook = book.getBookById(_book_id);
            int quantity = selectedBook.getQuantity();

            //get the number of book borrowed
            int borrowed_book_count = countData(_book_id);
            if(quantity > borrowed_book_count){
                availability = true;
            }
            else{
                availability = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Borrow_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return availability;
    }
    
    //create a function to count the number of borrowed book
    public int countData(int _book_id){
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;
        
        try {
            ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `borrow_book` WHERE book_id = ? and `status` = 'borrowed'");
            ps.setInt(1, _book_id);
            rs = ps.executeQuery();
            
            
            
                if (rs.next())
                { 
                total = rs.getInt("total");
                }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
}
