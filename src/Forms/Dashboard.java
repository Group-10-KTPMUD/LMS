package Forms;

import Classes.Book;
import Classes.Func_Class;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Dashboard extends javax.swing.JFrame {
    public Dashboard() {
        initComponents();
        setSize(1258,715);
        //Center the form
        this.setLocationRelativeTo(null);
        displayImage();
        //Border for "Library" box
        Border panelHeaderBorder = BorderFactory.createMatteBorder(0,0,1,0,Color.white);
        jPanel_Header.setBorder(panelHeaderBorder);
        //Border for 5 boxes
        Border panelHeader_1_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(235,125,22));
        jPanel_1_header.setBorder(panelHeader_1_Border);
        Border panelHeader_2_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(26,138,32));
        jPanel_2_header.setBorder(panelHeader_2_Border);
        Border panelHeader_3_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(115,40,125));
        jPanel_3_header.setBorder(panelHeader_3_Border);
        Border panelHeader_4_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(244,82,110));
        jPanel_4_header.setBorder(panelHeader_4_Border);
        Border panelHeader_5_Border = BorderFactory.createMatteBorder(0,0,3,0,new Color(58,83,155));
        jPanel_5_header.setBorder(panelHeader_5_Border);
        
    }
    
    //Function to display a image
    public void displayImage(){
        //get the image
        ImageIcon imgIco = new ImageIcon(getClass().getResource("/Images/dashboard_logo.png"));
        
        //make the image fit the jlabel
        Image image = imgIco.getImage().getScaledInstance(jLabel_Dashboard_Logo.getWidth(),jLabel_Dashboard_Logo.getHeight(),Image.SCALE_SMOOTH);
        jLabel_Dashboard_Logo.setIcon(new ImageIcon(image));
        
        //Add borders to the buttons
        addBorders();
        
        //Hover Effect
        buttonHoverEffect();
        
        // display the count data
        displayCount();
        
        // display the lastest books cover in the bottom
        // 1 - add the jlabels to the label_tab
        labels_tab[0] = jLabel_Image_1;
        labels_tab[1] = jLabel_Image_2;
        labels_tab[2] = jLabel_Image_3;
        labels_tab[3] = jLabel_Image_4;
        labels_tab[4] = jLabel_Image_5;
        
        // 2 - display the images
        book.displayBooksCover(labels_tab);
    }
    
    //Function to add border to all the button in the jPanel Menu
    public void addBorders(){
        //Get all the component in the jPanel Menu
        Component[] comps = jPanel_Menu.getComponents();
        for(var comp : comps){
            //Check if the component is a button
            if(comp instanceof JButton button){
                button.setBorder(buttonBorder0);
            }             
        }
    }
    
    
    //The button border
    Border buttonBorder1 = BorderFactory.createMatteBorder(1,1,1,1,Color.white);
    Border buttonBorder0 = BorderFactory.createMatteBorder(1,1,1,1,new Color(36,37,42));
    
    Classes.Func_Class func = new Func_Class();
    Classes.Book book = new Book();
    
    // create the jLabels array to display the lastest 5 books images
    JLabel[] labels_tab = new JLabel[5];
    
    //Function to add a hover effect on the menu buttons
    public void buttonHoverEffect(){
        //Get all the component in the jPanel Menu
        Component[] comps = jPanel_Menu.getComponents();
        for(var comp : comps){
            //Check if the component is a button
            if(comp instanceof JButton button){
                button.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseEntered(MouseEvent evt){
                        button.setBorder(buttonBorder1);
                    }
                    @Override
                    public void mouseExited(MouseEvent evt){
                        button.setBorder(buttonBorder0);
                    }
                });   
            }
        }
    }
    
    public void displayCount()
    {
        jLabel_BooksCount.setText(String.valueOf(func.countData("books")));
        jLabel_AuthorsCount.setText(String.valueOf(func.countData("author")));
        jLabel_MembersCount.setText(String.valueOf(func.countData("members")));
        jLabel_GenresCount.setText(String.valueOf(func.countData("book_genres")));
    } 
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel_Menu = new javax.swing.JPanel();
        jPanel_Header = new javax.swing.JPanel();
        jLabel_Dashboard_Logo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton_Add_Member_ = new javax.swing.JButton();
        jButton_Edit_Member_ = new javax.swing.JButton();
        jButton_Delete_Member_ = new javax.swing.JButton();
        jButton_List_Member_ = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jButton_Manage_Genres_ = new javax.swing.JButton();
        jButton_Manage_Authors_ = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton_Add_Book = new javax.swing.JButton();
        jButton_Edit_Book = new javax.swing.JButton();
        jButton_Delete_Book = new javax.swing.JButton();
        jButton_List_Book = new javax.swing.JButton();
        jLabel1_Circulation = new javax.swing.JLabel();
        jButton_BorrowBook_ = new javax.swing.JButton();
        jButton_ReturnBook_ = new javax.swing.JButton();
        jButton_Gach = new javax.swing.JButton();
        jButton_Manage_users = new javax.swing.JButton();
        jPanel_2 = new javax.swing.JPanel();
        jPanel_2_header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_MembersCount = new javax.swing.JLabel();
        jPanel_3 = new javax.swing.JPanel();
        jPanel_3_header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_AuthorsCount = new javax.swing.JLabel();
        jPanel_4 = new javax.swing.JPanel();
        jPanel_4_header = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_GenresCount = new javax.swing.JLabel();
        jPanel_1 = new javax.swing.JPanel();
        jPanel_1_header = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_BooksCount = new javax.swing.JLabel();
        jPanel_5 = new javax.swing.JPanel();
        jLabel_Image_1 = new javax.swing.JLabel();
        jLabel_Image_2 = new javax.swing.JLabel();
        jLabel_Image_3 = new javax.swing.JLabel();
        jLabel_Image_4 = new javax.swing.JLabel();
        jLabel_Image_5 = new javax.swing.JLabel();
        jPanel_5_header = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_Welcome_Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");

        jPanel_Menu.setBackground(new java.awt.Color(36, 37, 42));

        jPanel_Header.setBackground(new java.awt.Color(1, 50, 67));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Library");

        javax.swing.GroupLayout jPanel_HeaderLayout = new javax.swing.GroupLayout(jPanel_Header);
        jPanel_Header.setLayout(jPanel_HeaderLayout);
        jPanel_HeaderLayout.setHorizontalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_HeaderLayout.setVerticalGroup(
            jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_HeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel_HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Dashboard_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Members");

        jButton_Add_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Member_.setText("Add Member");
        jButton_Add_Member_.setContentAreaFilled(false);
        jButton_Add_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_Member_ActionPerformed(evt);
            }
        });

        jButton_Edit_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Member_.setText("Edit Member");
        jButton_Edit_Member_.setContentAreaFilled(false);
        jButton_Edit_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_Member_ActionPerformed(evt);
            }
        });

        jButton_Delete_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete_Member_.setText("Delete Member");
        jButton_Delete_Member_.setContentAreaFilled(false);
        jButton_Delete_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_Member_ActionPerformed(evt);
            }
        });

        jButton_List_Member_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_List_Member_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_List_Member_.setText("List Member");
        jButton_List_Member_.setContentAreaFilled(false);
        jButton_List_Member_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_List_Member_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_List_Member_ActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Genres");

        jButton_Manage_Genres_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Manage_Genres_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Genres_.setText("Manage Genres");
        jButton_Manage_Genres_.setContentAreaFilled(false);
        jButton_Manage_Genres_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Genres_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Genres_ActionPerformed(evt);
            }
        });

        jButton_Manage_Authors_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Manage_Authors_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_Authors_.setText("Manage Authors");
        jButton_Manage_Authors_.setContentAreaFilled(false);
        jButton_Manage_Authors_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_Authors_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_Authors_ActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Authors");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Books");

        jButton_Add_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Add_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Add_Book.setText("Add Book");
        jButton_Add_Book.setContentAreaFilled(false);
        jButton_Add_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Add_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_BookActionPerformed(evt);
            }
        });

        jButton_Edit_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Edit_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Edit_Book.setText("Edit Book");
        jButton_Edit_Book.setContentAreaFilled(false);
        jButton_Edit_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Edit_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_BookActionPerformed(evt);
            }
        });

        jButton_Delete_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Delete_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Delete_Book.setText("Delete Book");
        jButton_Delete_Book.setContentAreaFilled(false);
        jButton_Delete_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Delete_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_BookActionPerformed(evt);
            }
        });

        jButton_List_Book.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_List_Book.setForeground(new java.awt.Color(255, 255, 255));
        jButton_List_Book.setText("List Book");
        jButton_List_Book.setContentAreaFilled(false);
        jButton_List_Book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_List_Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_List_BookActionPerformed(evt);
            }
        });

        jLabel1_Circulation.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1_Circulation.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1_Circulation.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1_Circulation.setText("Circulation");

        jButton_BorrowBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_BorrowBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_BorrowBook_.setText("Borrow Book");
        jButton_BorrowBook_.setContentAreaFilled(false);
        jButton_BorrowBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_BorrowBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BorrowBook_ActionPerformed(evt);
            }
        });

        jButton_ReturnBook_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_ReturnBook_.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ReturnBook_.setText("Return Book");
        jButton_ReturnBook_.setContentAreaFilled(false);
        jButton_ReturnBook_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ReturnBook_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ReturnBook_ActionPerformed(evt);
            }
        });

        jButton_Gach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton_Gach.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Gach.setText("|");
        jButton_Gach.setContentAreaFilled(false);
        jButton_Gach.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Gach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GachActionPerformed(evt);
            }
        });

        jButton_Manage_users.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Manage_users.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Manage_users.setText("Manage Users");
        jButton_Manage_users.setContentAreaFilled(false);
        jButton_Manage_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Manage_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Manage_usersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_MenuLayout = new javax.swing.GroupLayout(jPanel_Menu);
        jPanel_Menu.setLayout(jPanel_MenuLayout);
        jPanel_MenuLayout.setHorizontalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jButton_BorrowBook_)
                .addGap(155, 155, 155))
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton_Manage_Authors_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jButton_Manage_Genres_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                                .addGap(32, 32, 32)
                                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton_Edit_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton_Add_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton_Delete_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jButton_List_Book, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel10))
                                        .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                            .addGap(32, 32, 32)
                                            .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jButton_Edit_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton_Add_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton_Delete_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton_List_Member_, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                                        .addComponent(jLabel1_Circulation)
                                        .addGap(20, 20, 20))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_MenuLayout.createSequentialGroup()
                                        .addComponent(jButton_Gach)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addComponent(jButton_ReturnBook_))))
                    .addGroup(jPanel_MenuLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton_Manage_users)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel_MenuLayout.setVerticalGroup(
            jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_MenuLayout.createSequentialGroup()
                .addComponent(jPanel_Header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Manage_Genres_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Manage_Authors_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Add_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Edit_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_List_Member_)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Add_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Edit_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Delete_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_List_Book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1_Circulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_BorrowBook_)
                    .addComponent(jButton_ReturnBook_)
                    .addComponent(jButton_Gach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_Manage_users)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel_2.setBackground(new java.awt.Color(75, 192, 18));
        jPanel_2.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_2_header.setBackground(new java.awt.Color(65, 160, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Members");

        javax.swing.GroupLayout jPanel_2_headerLayout = new javax.swing.GroupLayout(jPanel_2_header);
        jPanel_2_header.setLayout(jPanel_2_headerLayout);
        jPanel_2_headerLayout.setHorizontalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2_headerLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel3)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel_2_headerLayout.setVerticalGroup(
            jPanel_2_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_2_headerLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(21, 21, 21))
        );

        jLabel_MembersCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_MembersCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_MembersCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_MembersCount.setText("10000");

        javax.swing.GroupLayout jPanel_2Layout = new javax.swing.GroupLayout(jPanel_2);
        jPanel_2.setLayout(jPanel_2Layout);
        jPanel_2Layout.setHorizontalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_2_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_MembersCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_2Layout.setVerticalGroup(
            jPanel_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_2Layout.createSequentialGroup()
                .addComponent(jPanel_2_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_MembersCount)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_3.setBackground(new java.awt.Color(155, 89, 182));
        jPanel_3.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_3_header.setBackground(new java.awt.Color(125, 60, 155));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Authors");

        javax.swing.GroupLayout jPanel_3_headerLayout = new javax.swing.GroupLayout(jPanel_3_header);
        jPanel_3_header.setLayout(jPanel_3_headerLayout);
        jPanel_3_headerLayout.setHorizontalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_3_headerLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(75, 75, 75))
        );
        jPanel_3_headerLayout.setVerticalGroup(
            jPanel_3_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3_headerLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jLabel_AuthorsCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_AuthorsCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_AuthorsCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_AuthorsCount.setText("10000");

        javax.swing.GroupLayout jPanel_3Layout = new javax.swing.GroupLayout(jPanel_3);
        jPanel_3.setLayout(jPanel_3Layout);
        jPanel_3Layout.setHorizontalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_3_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_AuthorsCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_3Layout.setVerticalGroup(
            jPanel_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_3Layout.createSequentialGroup()
                .addComponent(jPanel_3_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_AuthorsCount)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_4.setBackground(new java.awt.Color(255, 153, 153));
        jPanel_4.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_4_header.setBackground(new java.awt.Color(255, 102, 102));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Genres");

        javax.swing.GroupLayout jPanel_4_headerLayout = new javax.swing.GroupLayout(jPanel_4_header);
        jPanel_4_header.setLayout(jPanel_4_headerLayout);
        jPanel_4_headerLayout.setHorizontalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_4_headerLayout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(80, 80, 80))
        );
        jPanel_4_headerLayout.setVerticalGroup(
            jPanel_4_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4_headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel_GenresCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_GenresCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_GenresCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_GenresCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_GenresCount.setText("10000");

        javax.swing.GroupLayout jPanel_4Layout = new javax.swing.GroupLayout(jPanel_4);
        jPanel_4.setLayout(jPanel_4Layout);
        jPanel_4Layout.setHorizontalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_4_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_GenresCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_4Layout.setVerticalGroup(
            jPanel_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_4Layout.createSequentialGroup()
                .addComponent(jPanel_4_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_GenresCount)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_1.setBackground(new java.awt.Color(255, 178, 41));
        jPanel_1.setPreferredSize(new java.awt.Dimension(345, 220));

        jPanel_1_header.setBackground(new java.awt.Color(246, 145, 16));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Books");

        javax.swing.GroupLayout jPanel_1_headerLayout = new javax.swing.GroupLayout(jPanel_1_header);
        jPanel_1_header.setLayout(jPanel_1_headerLayout);
        jPanel_1_headerLayout.setHorizontalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel8)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel_1_headerLayout.setVerticalGroup(
            jPanel_1_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1_headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel_BooksCount.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel_BooksCount.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_BooksCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BooksCount.setText("10000");

        javax.swing.GroupLayout jPanel_1Layout = new javax.swing.GroupLayout(jPanel_1);
        jPanel_1.setLayout(jPanel_1Layout);
        jPanel_1Layout.setHorizontalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_1_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel_BooksCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_1Layout.setVerticalGroup(
            jPanel_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_1Layout.createSequentialGroup()
                .addComponent(jPanel_1_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_BooksCount)
                .addGap(0, 62, Short.MAX_VALUE))
        );

        jPanel_5.setBackground(new java.awt.Color(44, 130, 201));
        jPanel_5.setPreferredSize(new java.awt.Dimension(345, 220));

        jLabel_Image_1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_1.setOpaque(true);
        jLabel_Image_1.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_2.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_2.setOpaque(true);
        jLabel_Image_2.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_3.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_3.setOpaque(true);
        jLabel_Image_3.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_4.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_4.setOpaque(true);
        jLabel_Image_4.setPreferredSize(new java.awt.Dimension(34, 14));

        jLabel_Image_5.setBackground(new java.awt.Color(153, 204, 255));
        jLabel_Image_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel_Image_5.setOpaque(true);
        jLabel_Image_5.setPreferredSize(new java.awt.Dimension(34, 14));

        jPanel_5_header.setBackground(new java.awt.Color(68, 108, 179));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Lastest Books Added");

        javax.swing.GroupLayout jPanel_5_headerLayout = new javax.swing.GroupLayout(jPanel_5_header);
        jPanel_5_header.setLayout(jPanel_5_headerLayout);
        jPanel_5_headerLayout.setHorizontalGroup(
            jPanel_5_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5_headerLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_5_headerLayout.setVerticalGroup(
            jPanel_5_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5_headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_5Layout = new javax.swing.GroupLayout(jPanel_5);
        jPanel_5.setLayout(jPanel_5Layout);
        jPanel_5Layout.setHorizontalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel_5_header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_5Layout.setVerticalGroup(
            jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel_5_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel_5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Image_1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_4, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Image_5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jLabel_Welcome_Back.setFont(new java.awt.Font("SansSerif", 3, 14)); // NOI18N
        jLabel_Welcome_Back.setText("Welcome Back Username");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel_5, javax.swing.GroupLayout.DEFAULT_SIZE, 955, Short.MAX_VALUE))
                    .addComponent(jLabel_Welcome_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Welcome_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addComponent(jPanel_5, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Manage_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_usersActionPerformed
        // TODO add your handling code here:
        // show manage users form (show only for user type: admin)
        ManageUsersForm mngUsersf = new ManageUsersForm();
        mngUsersf.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_usersActionPerformed

    private void jButton_ReturnBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ReturnBook_ActionPerformed
        // show the books list form
        ReturnBookForm rtnBookf = new ReturnBookForm();
        rtnBookf.setVisible(true);
    }//GEN-LAST:event_jButton_ReturnBook_ActionPerformed

    private void jButton_BorrowBook_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BorrowBook_ActionPerformed
        // show the books list form
        BorrowBookForm brwBookf = new BorrowBookForm();
        brwBookf.setVisible(true);
    }//GEN-LAST:event_jButton_BorrowBook_ActionPerformed

    private void jButton_List_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_List_BookActionPerformed
        // show the books list form
        BookListForm bookListf = new BookListForm();
        bookListf.setVisible(true);
    }//GEN-LAST:event_jButton_List_BookActionPerformed

    private void jButton_Delete_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_BookActionPerformed
        // show the delete book form
        DeleteBookForm deleteBookf = new DeleteBookForm();
        deleteBookf.setVisible(true);
    }//GEN-LAST:event_jButton_Delete_BookActionPerformed

    private void jButton_Edit_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_BookActionPerformed
        // show the edit book form
        EditBookForm editBookf = new EditBookForm();
        editBookf.setVisible(true);
    }//GEN-LAST:event_jButton_Edit_BookActionPerformed

    private void jButton_Add_BookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_BookActionPerformed
        // show the add book form
        AddBookForm addBookf = new AddBookForm();
        addBookf.setVisible(true);
    }//GEN-LAST:event_jButton_Add_BookActionPerformed

    private void jButton_Manage_Authors_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Authors_ActionPerformed
        // show the Manage_Authors form
        ManageAuthorsForm mngAuthorForm =new ManageAuthorsForm();
        mngAuthorForm.setVisible(true);
    }//GEN-LAST:event_jButton_Manage_Authors_ActionPerformed

    private void jButton_Manage_Genres_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Manage_Genres_ActionPerformed
        // show the Manage_Genres form
        ManageGenresForm mngGenreForm =new ManageGenresForm();
        mngGenreForm.setVisible(true);

    }//GEN-LAST:event_jButton_Manage_Genres_ActionPerformed

    private void jButton_List_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_List_Member_ActionPerformed
        // show the Member_List form
        MemberListForm memberListForm =new MemberListForm();
        memberListForm.setVisible(true);
    }//GEN-LAST:event_jButton_List_Member_ActionPerformed

    private void jButton_Delete_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_Member_ActionPerformed
        // show the Delete_Member form
        DeleteMemberForm deleteMemberForm =new DeleteMemberForm();
        deleteMemberForm.setVisible(true);
    }//GEN-LAST:event_jButton_Delete_Member_ActionPerformed

    private void jButton_Edit_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_Member_ActionPerformed
        // show the Edit_Member form
        EditMemberForm editMemberForm =new EditMemberForm();
        editMemberForm.setVisible(true);
    }//GEN-LAST:event_jButton_Edit_Member_ActionPerformed

    private void jButton_Add_Member_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_Member_ActionPerformed
        // show the Add_Member form
        AddMemberForm addMemberForm =new AddMemberForm();
        addMemberForm.setVisible(true);
    }//GEN-LAST:event_jButton_Add_Member_ActionPerformed

    private void jButton_GachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GachActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_GachActionPerformed
 
    /*public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new Dashboard().setVisible(true);
        });
    }*/
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_Book;
    private javax.swing.JButton jButton_Add_Member_;
    public javax.swing.JButton jButton_BorrowBook_;
    private javax.swing.JButton jButton_Delete_Book;
    private javax.swing.JButton jButton_Delete_Member_;
    private javax.swing.JButton jButton_Edit_Book;
    private javax.swing.JButton jButton_Edit_Member_;
    public javax.swing.JButton jButton_Gach;
    private javax.swing.JButton jButton_List_Book;
    private javax.swing.JButton jButton_List_Member_;
    private javax.swing.JButton jButton_Manage_Authors_;
    private javax.swing.JButton jButton_Manage_Genres_;
    public javax.swing.JButton jButton_Manage_users;
    public javax.swing.JButton jButton_ReturnBook_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel1_Circulation;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_AuthorsCount;
    private javax.swing.JLabel jLabel_BooksCount;
    private javax.swing.JLabel jLabel_Dashboard_Logo;
    private javax.swing.JLabel jLabel_GenresCount;
    private javax.swing.JLabel jLabel_Image_1;
    private javax.swing.JLabel jLabel_Image_2;
    private javax.swing.JLabel jLabel_Image_3;
    private javax.swing.JLabel jLabel_Image_4;
    private javax.swing.JLabel jLabel_Image_5;
    private javax.swing.JLabel jLabel_MembersCount;
    public javax.swing.JLabel jLabel_Welcome_Back;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_1;
    private javax.swing.JPanel jPanel_1_header;
    private javax.swing.JPanel jPanel_2;
    private javax.swing.JPanel jPanel_2_header;
    private javax.swing.JPanel jPanel_3;
    private javax.swing.JPanel jPanel_3_header;
    private javax.swing.JPanel jPanel_4;
    private javax.swing.JPanel jPanel_4_header;
    private javax.swing.JPanel jPanel_5;
    private javax.swing.JPanel jPanel_5_header;
    private javax.swing.JPanel jPanel_Header;
    private javax.swing.JPanel jPanel_Menu;
    // End of variables declaration//GEN-END:variables
}
