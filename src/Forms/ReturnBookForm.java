package Forms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
     
    public class ReturnBookForm extends javax.swing.JFrame {

    //Creates Borrow Book form
        
    Classes.Member member = new Classes.Member();
    Classes.Func_Class func = new Classes.Func_Class();
    Classes.Book book = new Classes.Book();
    Classes.Borrow_Book borrow = new Classes.Borrow_Book();
    
    //Variables to check if book and member exist
    boolean book_Exist = false;
    boolean member_Exist = false;
    
    public ReturnBookForm() {
        initComponents();
        // center the form
        this.setLocationRelativeTo(null);
        
        // add border to the panel [108,122,137]
        Border panelHeaderBorder = BorderFactory.createMatteBorder(3,3,3,3,new Color(108,122,137));
        jPanel1.setBorder(panelHeaderBorder);
        
        // display image in the top
        Classes.Func_Class func = new Classes.Func_Class();
        func.displayImage(80, 60,null, "/Images/organizer.png", jLabel_FormTitle);
        
        
        //add a white border in the bottom of the book name and member full name jLabel
        setBorderToJLabel(jLabel_BookName_, Color.white);
        setBorderToJLabel(jLabel_MemberFullName_, Color.white);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel_FormTitle = new javax.swing.JLabel();
        jLabel_CloseForm_ = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton_Borrow_ = new javax.swing.JButton();
        jButton_Cancel_ = new javax.swing.JButton();
        jDateChooser_BorrowDate = new com.toedter.calendar.JDateChooser();
        jLabel_BookName_ = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_MemberFullName_ = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel_Available = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser_ReturnDate = new com.toedter.calendar.JDateChooser();
        jSpinner_BookID = new javax.swing.JSpinner();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Authors_ = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_FormTitle.setDisplayedMnemonic('0');
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Borrow Book");
        jLabel_FormTitle.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel_FormTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel_CloseForm_.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_CloseForm_.setDisplayedMnemonic('0');
        jLabel_CloseForm_.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel_CloseForm_.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_CloseForm_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_CloseForm_.setText("X");
        jLabel_CloseForm_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_CloseForm_.setOpaque(true);
        jLabel_CloseForm_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseForm_MouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Enter Book ID:");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Borrow Date :");

        jButton_Borrow_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Borrow_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Borrow_.setText("Return");
        jButton_Borrow_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Borrow_MouseClicked(evt);
            }
        });
        jButton_Borrow_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Borrow_ActionPerformed(evt);
            }
        });

        jButton_Cancel_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Cancel_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Cancel_.setText("Lost");
        jButton_Cancel_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Cancel_MouseClicked(evt);
            }
        });
        jButton_Cancel_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Cancel_ActionPerformed(evt);
            }
        });

        jLabel_BookName_.setBackground(new java.awt.Color(240, 240, 240));
        jLabel_BookName_.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel_BookName_.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_BookName_.setText("Book Name");
        jLabel_BookName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_BookName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_BookName_MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setText("Enter Member ID:");

        jLabel_MemberFullName_.setBackground(new java.awt.Color(240, 240, 240));
        jLabel_MemberFullName_.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel_MemberFullName_.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_MemberFullName_.setText("Member Full-Name");
        jLabel_MemberFullName_.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_MemberFullName_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_MemberFullName_MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setText("Is This Book Available: ");

        jLabel_Available.setBackground(new java.awt.Color(240, 240, 240));
        jLabel_Available.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel_Available.setForeground(new java.awt.Color(51, 102, 255));
        jLabel_Available.setText("Yes-or-No");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setText("Return Date:");

        jSpinner_BookID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jSpinner_MemberID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setText("Note: ");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        jTable_Authors_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_Authors_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable_Authors_);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_Available))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MemberFullName_)
                            .addComponent(jLabel_BookName_)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSpinner_BookID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(jSpinner_MemberID))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Borrow_, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(7, 7, 7)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_BorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser_ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner_BookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel_BookName_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_MemberFullName_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(jLabel_Available))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateChooser_BorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jDateChooser_ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel20)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Borrow_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Cancel_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
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

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_Borrow_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Borrow_MouseClicked
        
        
    }//GEN-LAST:event_jButton_Borrow_MouseClicked

    private void jButton_Borrow_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Borrow_ActionPerformed
        //Borrow a book
        int _book_id = (int) jSpinner_BookID.getValue();
        int _member_id = (int) jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();
        
        SimpleDateFormat dateFormat =new SimpleDateFormat("YYYY-MM-dd");
        try{
            String _borrow_date=dateFormat.format(jDateChooser_BorrowDate.getDate());
            String _return_date=dateFormat.format(jDateChooser_ReturnDate.getDate());
            
            //before borrow a book, we need to check if the return date came the borrow date
            Date borrowDate = dateFormat.parse(_borrow_date);
            Date returnDate = dateFormat.parse(_return_date);
            
            //Check if the book and member exists
            if(!book_Exist){ //If the book doesn't exist
                JOptionPane.showMessageDialog(null,"You need to check if this Book exist first by clicking the Search Book button","Check if the Book exist", 2);
            }
            else if(!member_Exist){ //If the member doesn't exist
                JOptionPane.showMessageDialog(null,"You need to check if this Member exist first by clicking the Search Member button","Check if the Member exist", 2);
            }
            //Check if the book is available
            else if(!borrow.checkBookAvailability(_book_id)){
               JOptionPane.showMessageDialog(null,"This book is not available right now","Book is not available", 2);
            }
            
            
            else if(returnDate.before(borrowDate)){ //If the borrow date is after the return date
                JOptionPane.showMessageDialog(null,"The Return date must be after the Borrow date","Wrong Return Date", 2);
            }
            else{
                borrow.addBorrow(_book_id, _member_id, "borrowed", _borrow_date, _return_date, _note);
                //reset field
                jSpinner_BookID.setValue(0);
                jSpinner_MemberID.setValue(0);
                jLabel_BookName_.setText("Book name");
                jLabel_MemberFullName_.setText("Member Full-Name");
                jLabel_Available.setText("Yes-or-No");
                jLabel_Available.setForeground(new Color(51,102,255));
                jDateChooser_BorrowDate.setDate(new Date());
                jDateChooser_ReturnDate.setDate(new Date());
                book_Exist = false;
                member_Exist = false;
            }
            
        }
        catch (HeadlessException | NullPointerException| ParseException ex) {
            JOptionPane.showMessageDialog(null,"Select Borrow date & Return date","Select Date", 2);
        }
 
    }//GEN-LAST:event_jButton_Borrow_ActionPerformed

    private void jButton_Cancel_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Cancel_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Cancel_MouseClicked

    private void jButton_Cancel_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Cancel_ActionPerformed
        // close the window
        this.dispose();
    }//GEN-LAST:event_jButton_Cancel_ActionPerformed
    
    private void jLabel_BookName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookName_MouseClicked
        //Display the book into card
        int book_id = (int)jSpinner_BookID.getValue();
        BookInfoCardForm bookcardF = new BookInfoCardForm(book_id);
        bookcardF.setVisible(true);
        
    }//GEN-LAST:event_jLabel_BookName_MouseClicked

    private void jLabel_MemberFullName_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullName_MouseClicked
        // Display the member into card
        int member_id = (int)jSpinner_MemberID.getValue();
        MemberInfoCardForm membercardF = new MemberInfoCardForm(member_id);
        membercardF.setVisible(true);

    }//GEN-LAST:event_jLabel_MemberFullName_MouseClicked

    private void jLabel_BookName_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookName_MouseEntered
        //add a border in the bottom of the book name jLabel
        setBorderToJLabel(jLabel_BookName_, new Color(51,102,255));
    }//GEN-LAST:event_jLabel_BookName_MouseEntered

    private void jLabel_BookName_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_BookName_MouseExited
        //add a white border in the bottom of the book name jLabel
        setBorderToJLabel(jLabel_BookName_, Color.white);
    }//GEN-LAST:event_jLabel_BookName_MouseExited

    private void jLabel_MemberFullName_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullName_MouseEntered
        //add a border in the bottom of the member full name jLabel
        setBorderToJLabel(jLabel_MemberFullName_, new Color(51,102,255));
    }//GEN-LAST:event_jLabel_MemberFullName_MouseEntered

    private void jLabel_MemberFullName_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_MemberFullName_MouseExited
        //add a white border in the bottom of the member full name jLabel
        setBorderToJLabel(jLabel_MemberFullName_, Color.white);
    }//GEN-LAST:event_jLabel_MemberFullName_MouseExited
    
    //Create a little function to set border
    public void setBorderToJLabel(JLabel label, Color color){
        Border border = BorderFactory.createMatteBorder(0,0,1,0,color);
        label.setBorder(border);
    }

    // create a function to verify the required fields
    public boolean verif(){
        return true;
    }
    
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
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
            @Override
            public void run() {
                new ReturnBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Borrow_;
    private javax.swing.JButton jButton_Cancel_;
    private com.toedter.calendar.JDateChooser jDateChooser_BorrowDate;
    private com.toedter.calendar.JDateChooser jDateChooser_ReturnDate;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Available;
    private javax.swing.JLabel jLabel_BookName_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner_BookID;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTable jTable_Authors_;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
