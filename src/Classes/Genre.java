package Classes;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashMap;

public class Genre {
    private int id;
    private String name;
    
    public Genre(){};
    
    public Genre(int _id, String _name)
    {
        this.id = _id;
        this.name = _name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    // functions
    Classes.Func_Class func = new Classes.Func_Class();
    // insert a new genre function
    public void addGenre(String _name)
    {
        String insertQuery = "INSERT INTO `book_genres`(`name`) VALUES (?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);
            ps.setString(1, _name);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Genre Added","add genre", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Genre Not Added","add genre", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    // edit genre by id function
    public void editGenre(int _id, String _name)
    {
        String editQuery = "UPDATE `book_genres` SET `name` = ? WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);            
            ps.setString(1, _name);
            ps.setInt(2, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Genre Edited","edit genre", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Genre Not Edited","edit genre", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    // remove genre by id function
    public void removeGenre(int _id)
    {
        String removeQuery = "DELETE FROM `book_genres` WHERE `id` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);
            ps.setInt(1, _id);
            
            if(ps.executeUpdate() != 0)
            {
                JOptionPane.showMessageDialog(null, "Genre Deleted","remove", 1);
            }
            else
            {             
                JOptionPane.showMessageDialog(null, "Genre Not Deleted","remove", 2);          
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }       
    }
    
    // function to populate an arrayList with genres
    public ArrayList<Genre> genreList()
    {
        ArrayList<Genre> gList = new ArrayList<>();
        
        
        try {
            ResultSet rs = func.getData("SELECT * FROM `book_genres`");          
            Genre genre;
            
            while(rs.next())
            {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                gList.add(genre);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return gList;
    }
    //create a function to return a hashmap
    //string is the key
    // integer is the value
    public HashMap<String, Integer> getGenresMap()
    {
        HashMap<String, Integer> map =new HashMap<>();
        try {
            ResultSet rs = func.getData("SELECT * FROM `book_genres`");          
            Genre genre;
            
            while(rs.next())
            {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
                map.put(genre.getName(), genre.getId());
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return map;  
    }
    
    // create a function to get genre by id
    public Genre getGenreById(Integer id)
    {
        ResultSet rs = func.getData("SELECT * FROM `book_genres` where id = "+id);                   
        
        Genre genre = null;
            
        try {
            if(rs.next())
            {
                genre = new Genre(rs.getInt("id"), rs.getString("name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Genre.class.getName()).log(Level.SEVERE, null, ex);
        }
        return genre;
    }
}
