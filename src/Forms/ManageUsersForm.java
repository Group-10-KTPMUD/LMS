package Forms;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;


public class ManageUsersForm extends javax.swing.JFrame {

    //Creates Manage User form
     
    Classes.Users user = new Classes.Users();
    
    public ManageUsersForm() {
        initComponents();
        
        // center the form
        this.setLocationRelativeTo(null);
        
        // add border to the panel
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(242,217,132));
        jPanel1.setBorder(panelHeaderBorder);
        
        // display image in the top
        Classes.Func_Class func = new Classes.Func_Class();
        func.displayImage(75, 60,null, "/Images/user.png", jLabel_FormTitle);
        
        // customize the jtable
        func.customTable(jTable_Users_);
        
        // customize the jtable header row
        func.customTableHeader(jTable_Users_, new Color(34, 167, 240), 16);
        
        // hide the jlabel "empty name massage"
        // you can make the lables color white
        // so they will not push the other element down
        jLabel_EmptyFirstName_.setForeground(Color.white);
        jLabel_EmptyLastName_.setForeground(Color.white);
        jLabel_EmptyUserName_.setForeground(Color.white);
        jLabel_EmptyPassword_.setForeground(Color.white);
        
        // populate Jtable With Users
        populateJtableWithUsers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jTextField_About = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_FirstName = new javax.swing.JTextField();
        jButton_Add_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Users_ = new javax.swing.JTable();
        jLabel_EmptyFirstName_ = new javax.swing.JLabel();
        jLabel_EmptyLastName_ = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_LastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField_1 = new javax.swing.JPasswordField();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jLabel_EmptyUserName_ = new javax.swing.JLabel();
        jLabel_EmptyPassword_ = new javax.swing.JLabel();
        jCheckBox_SetAdmin = new javax.swing.JCheckBox();

        jButton2.setBackground(new java.awt.Color(240, 240, 240));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Add");

        jTextField_About.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jTextField_About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AboutActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jLabel_FormTitle.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Manage Users");
        jLabel_FormTitle.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel_CloseForm_.setBackground(new java.awt.Color(242, 217, 132));
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("First Name:");

        jTextField_ID.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTextField_ID.setEnabled(false);

        jTextField_FirstName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jButton_Add_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Add_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Add_.setText("Add");
        jButton_Add_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Add_MouseClicked(evt);
            }
        });
        jButton_Add_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Edit_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Edit_.setText("Edit");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jTable_Users_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Users_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Users_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Users_MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Users_);

        jLabel_EmptyFirstName_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyFirstName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyFirstName_.setText("* enter the first name");
        jLabel_EmptyFirstName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyFirstName_MouseClicked(evt);
            }
        });

        jLabel_EmptyLastName_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyLastName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyLastName_.setText("* enter the last name");
        jLabel_EmptyLastName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyLastName_MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Last Name:");

        jTextField_LastName.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Username:");

        jTextField_Username.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel6.setText("Retype Password:");

        jPasswordField_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_1ActionPerformed(evt);
            }
        });

        jPasswordField_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_EmptyUserName_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyUserName_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyUserName_.setText("* enter the username");
        jLabel_EmptyUserName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyUserName_MouseClicked(evt);
            }
        });

        jLabel_EmptyPassword_.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_EmptyPassword_.setForeground(new java.awt.Color(253, 0, 0));
        jLabel_EmptyPassword_.setText("* enter the password");
        jLabel_EmptyPassword_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyPassword_MouseClicked(evt);
            }
        });

        jCheckBox_SetAdmin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_SetAdmin.setText("Make This User an Admin");
        jCheckBox_SetAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_SetAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField_1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPasswordField_2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel_EmptyPassword_, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)))
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_EmptyUserName_)
                            .addComponent(jLabel_EmptyLastName_)
                            .addComponent(jLabel_EmptyFirstName_)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jCheckBox_SetAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyFirstName_)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyLastName_)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyUserName_)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_EmptyPassword_)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox_SetAdmin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Add_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_Add_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_ActionPerformed
        // add a new user
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";
        
        if(jCheckBox_SetAdmin.isSelected()) 
        {
            userType = "admin";
        }
        
        // check if the text fields are empty
        if(fname.trim().isEmpty()) // check the first name
        {
            jLabel_EmptyFirstName_.setForeground(Color.red);
        }
        else if(lname.trim().isEmpty()) // check the last name
        {
            jLabel_EmptyLastName_.setForeground(Color.red);
        }
        else if(username.trim().isEmpty()) // check the username
        {
            //jLabel_EmptyUserName_.setVisible(true);
            jLabel_EmptyUserName_.setForeground(Color.red);
        }
        else if(password_1.trim().isEmpty()) // check the password
        {
            //jLabel_EmptyPassword_.setVisible(true);
            jLabel_EmptyPassword_.setForeground(Color.red);
        }
        else if(!password_1.equals(password_2)) // check the password_1 doesn't equal the password_2
        {
            JOptionPane.showMessageDialog(null, "Retype The Correct Password","password error", 0);          
        }
        
        // we need to check if this username already exists
        else if(user.checkUsernameExists(0, username))
        {
            JOptionPane.showMessageDialog(null, "This Username Already Exists Try Another One","Username Error", 0);
        }
        
        else
        {
            user.addUser(fname, lname, username, password_1, userType);
            // refresh the Jtable Users
            populateJtableWithUsers();
            
            // clear text form the teaxtfields
            jTextField_ID.setText("");
            jTextField_FirstName.setText("");
            jTextField_LastName.setText("");
            jTextField_Username.setText("");
            jPasswordField_1.setText("");
            jPasswordField_2.setText("");
            jCheckBox_SetAdmin.setSelected(false);
        }
    }//GEN-LAST:event_jButton_Add_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed
        // edit user info
        
        String fname = jTextField_FirstName.getText();
        String lname = jTextField_LastName.getText();
        String username = jTextField_Username.getText();
        String password_1 = String.valueOf(jPasswordField_1.getPassword());
        String password_2 = String.valueOf(jPasswordField_2.getPassword());
        String userType = "user";
        
        if(jCheckBox_SetAdmin.isSelected()) 
        {
            userType = "admin";
        }
        
        // check if the text fields are empty
        if(fname.trim().isEmpty()) // check the first name
        {
            jLabel_EmptyFirstName_.setForeground(Color.red);
        }
        else if(lname.trim().isEmpty()) // check the last name
        {
            jLabel_EmptyLastName_.setForeground(Color.red);
        }
        else if(username.trim().isEmpty()) // check the username
        {
            //jLabel_EmptyUserName_.setVisible(true);
            jLabel_EmptyUserName_.setForeground(Color.red);
        }
        else if(password_1.trim().isEmpty()) // check the password
        {
            //jLabel_EmptyPassword_.setVisible(true);
            jLabel_EmptyPassword_.setForeground(Color.red);
        }
        else if(!password_1.equals(password_2)) // check the password_1 doesn't equal the password_2
        {
            JOptionPane.showMessageDialog(null, "Retype The Correct Password","password error", 0);          
        }
        
        else
        {
            try
            {
                // we need to check if this username already exists
                // check if it's not also the current user (the user selected from jtable)
                
                int id = Integer.parseInt(jTextField_ID.getText());
                
                if(user.checkUsernameExists(id, username))
                {
                    JOptionPane.showMessageDialog(null, "This Username Already Exists Try Another One","Username Error", 0);
                }
                else 
                {
                    user.editUser(id, fname, lname, username, password_1, userType);
            
                    // refresh the Jtable Users
                    populateJtableWithUsers();
                    
                    // clear text form the teaxtfields
                    jTextField_ID.setText("");
                    jTextField_FirstName.setText("");
                    jTextField_LastName.setText("");
                    jTextField_Username.setText("");
                    jPasswordField_1.setText("");
                    jPasswordField_2.setText("");
                    jCheckBox_SetAdmin.setSelected(false);
                }  
            }
            catch(NumberFormatException ex)
            {
            JOptionPane.showMessageDialog(null, "Select The User You Want To Edit From The Table","No ID selected", 0);
            }

        }
        
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // delete the selected user
        try
            {
                int id = Integer.parseInt(jTextField_ID.getText());
                
                // show confirmation message before removing the user
                int confirmation = JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Delete This User?","Confirmation Box",JOptionPane.YES_NO_OPTION);
                if (confirmation==JOptionPane.YES_OPTION){
                user.removeUser(id);
                }
                
                // refresh the Jtable Users
                populateJtableWithUsers();
                
                // clear text form the teaxtfields
                jTextField_ID.setText("");
                jTextField_FirstName.setText("");
                jTextField_LastName.setText("");
                jTextField_Username.setText("");
                jPasswordField_1.setText("");
                jPasswordField_2.setText("");
                jCheckBox_SetAdmin.setSelected(false);
                
            }
            catch(NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null, "Invalid User ID - " + ex.getMessage(),"error", 0);
            }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTable_Users_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Users_MouseClicked
        // display the selected author
        
        // get the selected row index
        int index = jTable_Users_.getSelectedRow();
        
        // get values
        String id = jTable_Users_.getValueAt(index, 0).toString();
        String firstName = jTable_Users_.getValueAt(index, 1).toString();
        String lastName = jTable_Users_.getValueAt(index, 2).toString();
        String username = jTable_Users_.getValueAt(index, 3).toString();
        String password = jTable_Users_.getValueAt(index, 4).toString();
        String userType = jTable_Users_.getValueAt(index, 5).toString();
        
        //show data in textfields
        jTextField_ID.setText(id);
        jTextField_FirstName.setText(firstName);
        jTextField_LastName.setText(lastName);
        jTextField_Username.setText(username);
        jPasswordField_1.setText(password);
        jPasswordField_2.setText(password);
        
        if(userType.equals("admin"))
        {
            jCheckBox_SetAdmin.setSelected(true);
        }
        else
        {
            jCheckBox_SetAdmin.setSelected(false);
        }
        
    }//GEN-LAST:event_jTable_Users_MouseClicked
    
    // create a function to populate the jtable with user
    public void populateJtableWithUsers()
    {

        ArrayList<Classes.Users> usersList = user.usersList();
        
        // jTable columns
        String[] colNames = {"ID", "F-Name", "L-Name", "U-Name", "Pass", "Type"};
        
        // row
        Object[][] rows = new Object[usersList.size()][colNames.length];
        
        for(int i = 0; i < usersList.size(); i++)
        {
            rows[i][0] = usersList.get(i).getId();
            rows[i][1] = usersList.get(i).getFirstname();
            rows[i][2] = usersList.get(i).getLastname();
            rows[i][3] = usersList.get(i).getUsername();
            rows[i][4] = usersList.get(i).getPassword();
            rows[i][5] = usersList.get(i).getUserType();
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Users_.setModel(model);
        
    }
    
    private void jLabel_EmptyFirstName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyFirstName_MouseClicked
        // hide this jlabel on click
        jLabel_EmptyFirstName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyFirstName_MouseClicked

    private void jLabel_EmptyLastName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyLastName_MouseClicked
        jLabel_EmptyLastName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyLastName_MouseClicked

    private void jTextField_AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AboutActionPerformed

    private void jButton_Add_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Add_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Add_MouseClicked

    private void jPasswordField_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_1ActionPerformed

    private void jLabel_EmptyUserName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyUserName_MouseClicked
        jLabel_EmptyUserName_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyUserName_MouseClicked

    private void jLabel_EmptyPassword_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyPassword_MouseClicked
        jLabel_EmptyPassword_.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_EmptyPassword_MouseClicked

    private void jCheckBox_SetAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_SetAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox_SetAdminActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageUsersForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageUsersForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_Add_;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JCheckBox jCheckBox_SetAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_EmptyFirstName_;
    private javax.swing.JLabel jLabel_EmptyLastName_;
    private javax.swing.JLabel jLabel_EmptyPassword_;
    private javax.swing.JLabel jLabel_EmptyUserName_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_1;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Users_;
    private javax.swing.JTextField jTextField_About;
    private javax.swing.JTextField jTextField_FirstName;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_LastName;
    private javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
