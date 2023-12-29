package Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Borrow_Book {
    private int book_id;
    private int member_id;
    private String status; //Borrowed - Returned - Lost
    private String borrow_date;
    private String Return_date;
    private String note;
    public int getBook_id() {
        return book_id;
    }

    public int getMember_id() {
        return member_id;
    }

    public String getStatus() {
        return status;
    }

    public String getBorrow_date() {
        return borrow_date;
    }

    public String getReturn_date() {
        return Return_date;
    }

    public String getNote() {
        return note;
    }

    public Book getBook() {
        return book;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public void setMember_id(int member_id) {
        this.member_id = member_id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setBorrow_date(String borrow_date) {
        this.borrow_date = borrow_date;
    }

    public void setReturn_date(String Return_date) {
        this.Return_date = Return_date;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setBook(Book book) {
        this.book = book;
    }
    
    public Borrow_Book(){
        
    }

    public Borrow_Book(int _book_id, int _member_id, String _status, String _borrow_date, String _Return_date, String _note) {
        this.book_id = _book_id;
        this.member_id = _member_id;
        this.status = _status;
        this.borrow_date = _borrow_date;
        this.Return_date = _Return_date;
        this.note = _note;
    }
    
    Book book = new Book();
    Func_Class func = new Func_Class();
    
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
    
    //Update a new borrowing
    public void updateBorrow(int _book_id, int _member_id, String _status,String _borrow_date, String _return_date, String _note){
        String updateQuery = "UPDATE `borrow_book` SET `status`= ?,`return_date`=?,`note`=? WHERE `book_id` =? AND `member_id`=? AND `borrow_date`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);
            
            
            ps.setString(1, _status);
            ps.setString(2, _return_date);
            ps.setString(3, _note);
            ps.setInt(4, _book_id);
            ps.setInt(5, _member_id);
            ps.setString(6, _borrow_date);
            
          
            
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Status Updated","Book Borrow", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Status Not Updated","Book Borrow", 2);          
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
    
    // function to populate an arrayList with borrowed/returned/lost books
    public ArrayList<Borrow_Book> borrowedBooksList(String _status)
    {
        // create a list
        ArrayList<Borrow_Book> borrowedBookList = new ArrayList<>();
        String query;  
        
        if(_status.equals(""))
        {
            query = "SELECT * FROM `borrow_book`";
        }
        else
        {
            query = "SELECT * FROM `borrow_book` WHERE `status` = '" + _status + "'";
        }
               
        try {
            ResultSet rs = func.getData(query);                   
            Borrow_Book borrowBook;
            
            while(rs.next())
            {
                borrowBook = new Borrow_Book(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6));
                borrowedBookList.add(borrowBook);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow_Book.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return borrowedBookList;
    }
    
    // remove borrowed book using the book_id - member_id and borrowed date
    // you can add a column id (make it as the key) to the table and delete using it
    public void removeFromBorrowedTable(int _book_id, int _member_id, String _borrowed_date)
    {
        String removeQuery = "DELETE FROM `borrow_book` WHERE `book_id` =? AND `member_id`=? AND `borrow_date`=?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _book_id);
            ps.setInt(2, _member_id);
            ps.setString(3, _borrowed_date);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Deleted Succesfully","remove", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Not Deleted","remove", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Borrow_Book.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
}
