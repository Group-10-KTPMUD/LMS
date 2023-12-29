package Forms;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
     
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
        
        // customize the jtable
        func.customTable(jTable_BorrowedBooks_);
        
        // customize the jtable header row
        func.customTableHeader(jTable_BorrowedBooks_, new Color(34, 167, 240), 15);
        
        populateJtableWithBorrowedBooks("");
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
        jButton_Return_ = new javax.swing.JButton();
        jButton_Lost_ = new javax.swing.JButton();
        jDateChooser_BorrowDate = new com.toedter.calendar.JDateChooser();
        jLabel_BookName_ = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_MemberFullName_ = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jDateChooser_ReturnDate = new com.toedter.calendar.JDateChooser();
        jSpinner_BookID = new javax.swing.JSpinner();
        jSpinner_MemberID = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Note = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jComboBox_Status_ = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_BorrowedBooks_ = new javax.swing.JTable();
        jButton_Delete_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_FormTitle.setBackground(new java.awt.Color(108, 122, 137));
        jLabel_FormTitle.setDisplayedMnemonic('0');
        jLabel_FormTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_FormTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_FormTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FormTitle.setText("Return Book");
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
        jLabel9.setText("Book ID:");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setText("Borrow Date :");

        jButton_Return_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Return_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Return_.setText("Return");
        jButton_Return_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Return_MouseClicked(evt);
            }
        });
        jButton_Return_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Return_ActionPerformed(evt);
            }
        });

        jButton_Lost_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Lost_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Lost_.setText("Lost");
        jButton_Lost_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Lost_MouseClicked(evt);
            }
        });
        jButton_Lost_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Lost_ActionPerformed(evt);
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
        jLabel14.setText("Member ID:");

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

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setText("Return Date:");

        jSpinner_BookID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jSpinner_MemberID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setText("Note: ");

        jTextArea_Note.setColumns(20);
        jTextArea_Note.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Note);

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Select Book Status: ");

        jComboBox_Status_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox_Status_.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All", "Borrowed", "Returned", "Lost" }));
        jComboBox_Status_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_Status_ActionPerformed(evt);
            }
        });

        jTable_BorrowedBooks_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable_BorrowedBooks_.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_BorrowedBooks_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_BorrowedBooks_MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_BorrowedBooks_);

        jButton_Delete_.setBackground(new java.awt.Color(204, 204, 204));
        jButton_Delete_.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_Delete_.setText("Delete");
        jButton_Delete_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_Delete_MouseClicked(evt);
            }
        });
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinner_BookID, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_BorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_BookName_)
                                    .addComponent(jLabel_MemberFullName_))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Delete_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton_Return_, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addComponent(jButton_Lost_, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Status_, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_CloseForm_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jSpinner_BookID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBox_Status_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_BookName_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jSpinner_MemberID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_MemberFullName_)
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jDateChooser_BorrowDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jDateChooser_ReturnDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Lost_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Return_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseForm_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseForm_MouseClicked
        // close the form
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseForm_MouseClicked

    private void jButton_Return_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Return_MouseClicked
        
        
    }//GEN-LAST:event_jButton_Return_MouseClicked

    private void jButton_Return_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Return_ActionPerformed
        //Return a book
        int _book_id = (int) jSpinner_BookID.getValue();
        int _member_id = (int) jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();
        
        SimpleDateFormat dateFormat =new SimpleDateFormat("YYYY-MM-dd");
        try{
            
            String _return_date = dateFormat.format(jDateChooser_ReturnDate.getDate());
            Date returnDate = dateFormat.parse(_return_date);
            
            String _borrow_date = dateFormat.format(jDateChooser_BorrowDate.getDate());
            Date borrowDate = dateFormat.parse(_borrow_date);
            
            if(returnDate.before(borrowDate)){ //If the borrow date is after the return date
                JOptionPane.showMessageDialog(null,"The Return date must be after the Borrow date","Wrong Return Date", 2);
            }
            else{
                borrow.updateBorrow(_book_id, _member_id, "returned", _borrow_date, _return_date, _note);
                //reset field
                jSpinner_BookID.setValue(0);
                jSpinner_MemberID.setValue(0);
                jLabel_BookName_.setText("Book name");
                jLabel_MemberFullName_.setText("Member Full-Name");
                jDateChooser_BorrowDate.setDate(new Date());
                jDateChooser_ReturnDate.setDate(new Date());
                jTextArea_Note.setText("");
            }
            
        }
        catch (HeadlessException | NullPointerException| ParseException ex) {
            JOptionPane.showMessageDialog(null,"Select An Item From The Table","Select Item", 2);
        }
 
    }//GEN-LAST:event_jButton_Return_ActionPerformed

    private void jButton_Lost_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Lost_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Lost_MouseClicked

    private void jButton_Lost_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Lost_ActionPerformed
        // the book is lost
        // ew need to the book status to lost
        // and update the book quantity 
        // the new quantity = the quantity - 1
        // even if the book is lost we will not change the return date
        
        int _book_id = (int) jSpinner_BookID.getValue();
        int _member_id = (int) jSpinner_MemberID.getValue();
        String _note = jTextArea_Note.getText();
        
        SimpleDateFormat dateFormat =new SimpleDateFormat("YYYY-MM-dd");
        try{
            
            String _return_date = dateFormat.format(jDateChooser_ReturnDate.getDate());
                      
            String _borrow_date = dateFormat.format(jDateChooser_BorrowDate.getDate());
                    
            borrow.updateBorrow(_book_id, _member_id, "lost", _borrow_date, _return_date, _note);
            
            // now we need to update the book quantity (quantity-1)
            int quantity = new Classes.Book().getBookById(_book_id).getQuantity(); // get the book quantity
            book.setQuantity_Minus_One(_book_id, quantity-1); // update the book quantity
            
            //reset field
            jSpinner_BookID.setValue(0);
            jSpinner_MemberID.setValue(0);
            jLabel_BookName_.setText("Book name");
            jLabel_MemberFullName_.setText("Member Full-Name");
            jDateChooser_BorrowDate.setDate(new Date());
            jDateChooser_ReturnDate.setDate(new Date());
            jTextArea_Note.setText("");
                  
        }
        catch (HeadlessException | NullPointerException ex) {
            JOptionPane.showMessageDialog(null,"Select An Item From The Table","Select Item", 2);
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_Lost_ActionPerformed
    
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

    private void jTable_BorrowedBooks_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_BorrowedBooks_MouseClicked
        // display the selected row data

        // get the selected row index
        int index = jTable_BorrowedBooks_.getSelectedRow();

        // get values
        int book_id = Integer.parseInt(jTable_BorrowedBooks_.getValueAt(index, 0).toString());
        int member_id = Integer.parseInt(jTable_BorrowedBooks_.getValueAt(index, 1).toString());
        
        Classes.Book selectedBook;
        Classes.Member selectedMember;
        
        try {
            selectedBook = book.getBookById(book_id);
            //display this book title/name
            jSpinner_BookID.setValue(selectedBook.getId());
            jLabel_BookName_.setText(selectedBook.getName());
            
            selectedMember = member.getMemberById(member_id);
            //display this member full name
            jSpinner_MemberID.setValue(selectedMember.getId());
            jLabel_MemberFullName_.setText(selectedMember.getFirstName() + " " + selectedMember.getLastName());
            
            String borrow_date = jTable_BorrowedBooks_.getValueAt(index, 3).toString();
            String return_date = jTable_BorrowedBooks_.getValueAt(index, 4).toString();
            //String status = jTable_BorrowedBooks_.getValueAt(index, 4).toString();
            String note = jTable_BorrowedBooks_.getValueAt(index, 5).toString();
            
            // display the date
            Date borDate = new SimpleDateFormat("yyyy-MM-dd").parse(borrow_date);
            jDateChooser_BorrowDate.setDate(borDate);
            
            Date rtnDate = new SimpleDateFormat("yyyy-MM-dd").parse(return_date);
            jDateChooser_ReturnDate.setDate(rtnDate);
            
            jTextArea_Note.setText(note);
            
                
        } catch (SQLException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ReturnBookForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        

    }//GEN-LAST:event_jTable_BorrowedBooks_MouseClicked

    private void jComboBox_Status_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_Status_ActionPerformed
        // display data on the jtable depending on the jcombobox selected value
        String status = jComboBox_Status_.getSelectedItem().toString();
        if(status.equals("All"))
        {
            status = "";
        }
        populateJtableWithBorrowedBooks(status);
    }//GEN-LAST:event_jComboBox_Status_ActionPerformed

    private void jButton_Delete_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_Delete_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_Delete_MouseClicked

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        // delete the selected issue from the database        
        
        // get the selected row index
        int index = jTable_BorrowedBooks_.getSelectedRow();
        
        try
        {
            // get values
            int _book_id = Integer.parseInt(jTable_BorrowedBooks_.getValueAt(index, 0).toString());
            int _member_id = Integer.parseInt(jTable_BorrowedBooks_.getValueAt(index, 1).toString());
            String _issued_date = jTable_BorrowedBooks_.getValueAt(index, 3).toString();
        
            borrow.removeFromBorrowedTable(_book_id, _member_id, _issued_date);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Select The Element You Want To Delete From The Table" + ex.getMessage(),"Delete Error", 2);
        }

        
    }//GEN-LAST:event_jButton_Delete_ActionPerformed
    
    //Create a little function to set border
    public void setBorderToJLabel(JLabel label, Color color){
        Border border = BorderFactory.createMatteBorder(0,0,1,0,color);
        label.setBorder(border);
    }

    // create a function to verify the required fields
    public boolean verif(){
        return true;
    }
    
    // create a function to populate the jtable with borrowed books
    public void populateJtableWithBorrowedBooks(String _status)
    {

        ArrayList<Classes.Borrow_Book> borrowBooksList = borrow.borrowedBooksList(_status);
        
        // jTable columns
        String[] colNames = {"Book", "Member", "Status", "Bor-Date", "Rtn- Date", "Note"};
        
        // row
        Object[][] rows = new Object[borrowBooksList.size()][colNames.length];
        
        for(int i = 0; i < borrowBooksList.size(); i++)
        {
            rows[i][0] = borrowBooksList.get(i).getBook_id();
            rows[i][1] = borrowBooksList.get(i).getMember_id();
            rows[i][2] = borrowBooksList.get(i).getStatus();
            rows[i][3] = borrowBooksList.get(i).getBorrow_date();
            rows[i][4] = borrowBooksList.get(i).getReturn_date();
            rows[i][5] = borrowBooksList.get(i).getNote();
           
        }
        
        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_BorrowedBooks_.setModel(model);
        
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
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Lost_;
    private javax.swing.JButton jButton_Return_;
    private javax.swing.JComboBox<String> jComboBox_Status_;
    private com.toedter.calendar.JDateChooser jDateChooser_BorrowDate;
    private com.toedter.calendar.JDateChooser jDateChooser_ReturnDate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_BookName_;
    private javax.swing.JLabel jLabel_CloseForm_;
    private javax.swing.JLabel jLabel_FormTitle;
    private javax.swing.JLabel jLabel_MemberFullName_;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner_BookID;
    private javax.swing.JSpinner jSpinner_MemberID;
    private javax.swing.JTable jTable_BorrowedBooks_;
    private javax.swing.JTextArea jTextArea_Note;
    // End of variables declaration//GEN-END:variables
}
