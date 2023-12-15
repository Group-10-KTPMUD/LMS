package Classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Champion T
 */
public class Func_Class {
    // create a function to display the image in jlabel
    public void displayImage(int width, int height, byte[] imagebyte, String imagePath, JLabel label)
    {
        ImageIcon imgIco;
        // get the image
        if(imagebyte !=null)//get image using bytes
        {
            imgIco = new ImageIcon(imagebyte);
        }
        else    //get image using path
        {
            try {
                //get image from the project resource
                imgIco = new ImageIcon(getClass().getResource(imagePath));
  
            } catch (Exception e) 
            {
                //get icon from the desktop
                imgIco = new ImageIcon((imagePath));
            }
        }
        
        // make the image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        
        // set the image into the jlabel
        label.setIcon(new ImageIcon(image));
    }
    
    // create a function to customize the jtable
    public void customTable(JTable table)
    {
        table.setSelectionBackground(new Color(249, 105, 14));
        table.setSelectionForeground(Color.white);
        table.setRowHeight(35);
        table.setShowGrid(false);
        table.setBackground(new Color(248, 248, 248));
        table.setShowHorizontalLines(true);
        table.setGridColor(Color.gray);
    }
    
    // create a function to customize the jtable Header
    public void customTableHeader(JTable table, Color back_Color, Integer fontsize)
    {
        table.getTableHeader().setBackground(back_Color);
        table.getTableHeader().setForeground(Color.white);
        table.getTableHeader().setFont(new Font("Verdana", Font.BOLD, fontsize));
        table.getTableHeader().setOpaque(false);
    }
    
    //create a function to select image 
    //the function will return the image path
    public String selectImage(){
        // select picture from the computer
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Profile Picture");
        
        fileChooser.setCurrentDirectory(new File("F:\\Image"));
        
        FileNameExtensionFilter extensionFilter = new FileNameExtensionFilter("Image", ".png", ".jpg", ".jpeg");
        fileChooser.addChoosableFileFilter(extensionFilter);
        
        int fileState = fileChooser.showSaveDialog(null);
        String path="";
        if(fileState == JFileChooser.APPROVE_OPTION)
        {
            path = fileChooser.getSelectedFile().getAbsolutePath();
        }
        return path;
    }
    
    // create a function to return a resultSet
    // we will use this function to reduce the code when populating the arraylist
    public ResultSet getData(String query)
    {
        PreparedStatement ps;
        ResultSet rs = null;
        
        try {
            ps = DB.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(Func_Class.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
}
