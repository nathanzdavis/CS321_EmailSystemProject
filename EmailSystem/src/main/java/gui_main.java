
import javax.swing.DefaultListModel;


//Andrew
//Tony
//Nathan
//Daniel

public class gui_main extends javax.swing.JFrame {        
    /**
     * Creates new form gui
     */
    public gui_main() {
        initComponents();
        emailList.addListSelectionListener(e -> {emailListActionPerformed();});
    }
    
    
    //The user by default will be set to null for now until user selection is implemented
    public EmailSystem eSystem = new EmailSystem(null);  
    boolean viewingInbox = true;
    boolean viewingSent = false;
    boolean viewingTrash = false;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        siteComboBox = new javax.swing.JComboBox<>();
        userComboBox = new javax.swing.JComboBox<>();
        submitButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        currentUserLabel = new javax.swing.JLabel();
        removeSiteButton = new javax.swing.JButton();
        removeUserButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        inboxButton = new javax.swing.JButton();
        sentButton = new javax.swing.JButton();
        trashButton = new javax.swing.JButton();
        composeButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        emailList = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        messageField = new javax.swing.JTextArea();
        deleteButton = new javax.swing.JButton();
        fromLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        siteComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siteComboBoxActionPerformed(evt);
            }
        });

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        addUserButton.setText("Add User");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });

        currentUserLabel.setText("Current User: none");

        removeSiteButton.setText("Remove Site");
        removeSiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSiteButtonActionPerformed(evt);
            }
        });

        removeUserButton.setText("Remove User");
        removeUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeUserButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(siteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(removeSiteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeUserButton)))
                .addGap(36, 36, 36)
                .addComponent(submitButton)
                .addGap(18, 18, 18)
                .addComponent(addUserButton)
                .addGap(18, 18, 18)
                .addComponent(currentUserLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton)
                    .addComponent(addUserButton)
                    .addComponent(siteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(currentUserLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removeSiteButton)
                    .addComponent(removeUserButton)))
        );

        inboxButton.setText("Inbox");
        inboxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inboxButtonActionPerformed(evt);
            }
        });

        sentButton.setText("Sent");
        sentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sentButtonActionPerformed(evt);
            }
        });

        trashButton.setText("Trash");
        trashButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trashButtonActionPerformed(evt);
            }
        });

        composeButton.setText("Compose");
        composeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                composeButtonActionPerformed(evt);
            }
        });

        jScrollPane4.setViewportView(emailList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(composeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                        .addComponent(inboxButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(trashButton)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inboxButton)
                    .addComponent(sentButton)
                    .addComponent(trashButton)
                    .addComponent(composeButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jLabel2.setText("From");

        jLabel3.setText("Date");

        messageField.setEditable(false);
        messageField.setColumns(20);
        messageField.setRows(5);
        jScrollPane3.setViewportView(messageField);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        fromLabel.setText("___");

        dateLabel.setText("___");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fromLabel)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(dateLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deleteButton)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(fromLabel)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 179, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        if (siteComboBox.getSelectedIndex() >= 0 && userComboBox.getSelectedIndex() >= 0){
            Site s = eSystem.siteList.get(siteComboBox.getSelectedIndex());
            for (int i = 0; i < s.userList.size(); i++){
                if (s.userList.get(i).getUsername().equals(userComboBox.getSelectedItem())){
                    eSystem.setCurrentUser(s.userList.get(i));
                    viewingInbox = true;
                    viewingSent = false;
                    viewingTrash = false;
                    updateEmailBox();
                    currentUserLabel.setText("Current User: " + eSystem.currentUser.getUsername());
                }
            }
        }      
    }//GEN-LAST:event_submitButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        gui_add_user addUser = new gui_add_user(this);
        addUser.setVisible(true);
    }//GEN-LAST:event_addUserButtonActionPerformed

    private void siteComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siteComboBoxActionPerformed
        userComboBox.removeAllItems();
        if (siteComboBox.getSelectedIndex() >= 0){
            Site s = eSystem.siteList.get(siteComboBox.getSelectedIndex());
            for (int i = 0; i < s.userList.size(); i++){
                userComboBox.addItem(s.userList.get(i).getUsername());
            }  
        }     
    }//GEN-LAST:event_siteComboBoxActionPerformed

    private void composeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_composeButtonActionPerformed
        gui_compose comp = new gui_compose(this);
        comp.setVisible(true);
    }//GEN-LAST:event_composeButtonActionPerformed

    private void inboxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inboxButtonActionPerformed
        viewingInbox = true;
        viewingSent = false;
        viewingTrash = false;
        DefaultListModel listModel = new DefaultListModel();       
        emailList.removeAll();
        for (int i = 0; i < eSystem.getCurrentUser().Inbox.size(); i++){
            listModel.addElement(eSystem.getCurrentUser().Inbox.get(i).getSubject() + "--From--" + eSystem.getCurrentUser().Inbox.get(i).getSender() + "--On--" + eSystem.getCurrentUser().Inbox.get(i).getDate());
        }  
        emailList.setModel(listModel);
    }//GEN-LAST:event_inboxButtonActionPerformed

    private void sentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sentButtonActionPerformed
        viewingInbox = false;
        viewingSent = true;
        viewingTrash = false;
        DefaultListModel listModel = new DefaultListModel();       
        emailList.removeAll();
        for (int i = 0; i < eSystem.getCurrentUser().Sent.size(); i++){
            listModel.addElement(eSystem.getCurrentUser().Sent.get(i).getSubject() + "--From--" + eSystem.getCurrentUser().Sent.get(i).getSender() + "--On--" + eSystem.getCurrentUser().Sent.get(i).getDate());
        }  
        emailList.setModel(listModel);
    }//GEN-LAST:event_sentButtonActionPerformed

    private void trashButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trashButtonActionPerformed
        viewingInbox = false;
        viewingSent = false;
        viewingTrash = true;
        DefaultListModel listModel = new DefaultListModel();       
        emailList.removeAll();
        for (int i = 0; i < eSystem.getCurrentUser().Trash.size(); i++){
            listModel.addElement(eSystem.getCurrentUser().Trash.get(i).getSubject() + "--From--" + eSystem.getCurrentUser().Trash.get(i).getSender() + "--On--" + eSystem.getCurrentUser().Trash.get(i).getDate());
        }  
        emailList.setModel(listModel);
    }//GEN-LAST:event_trashButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (emailList.getSelectedIndex() >= 0){
            if (viewingInbox){
                Email e = eSystem.currentUser.Inbox.get(emailList.getSelectedIndex());
                eSystem.currentUser.removeFromInbox(e);
                eSystem.currentUser.addToTrash(e);
                updateEmailBox();
            }else if (viewingSent){
                Email e = eSystem.currentUser.Sent.get(emailList.getSelectedIndex());
                eSystem.currentUser.removeFromSent(e);
                eSystem.currentUser.addToTrash(e);
                updateEmailBox();
            }else if(viewingTrash){
                Email e = eSystem.currentUser.Trash.get(emailList.getSelectedIndex());
                eSystem.currentUser.removeFromTrash(e);
                updateEmailBox();
            }   
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void removeSiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSiteButtonActionPerformed
        if (siteComboBox.getSelectedIndex() >= 0){
            eSystem.deleteSite(eSystem.siteList.get(siteComboBox.getSelectedIndex()));
        }
        updateSiteBoxes();
        eSystem.currentUser = null;
        currentUserLabel.setText("Current User: none");
    }//GEN-LAST:event_removeSiteButtonActionPerformed

    private void removeUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeUserButtonActionPerformed
        if (userComboBox.getSelectedIndex() >= 0){
            eSystem.siteList.get(siteComboBox.getSelectedIndex()).removeUser(eSystem.siteList.get(siteComboBox.getSelectedIndex()).userList.get(userComboBox.getSelectedIndex()));
        }
        updateUserBoxes();
        eSystem.currentUser = null;
        currentUserLabel.setText("Current User: none");
    }//GEN-LAST:event_removeUserButtonActionPerformed
    
    public void updateSiteBoxes(){
        siteComboBox.removeAllItems();  
        for (int i = 0; i < eSystem.siteList.size(); i++){
            siteComboBox.addItem(eSystem.siteList.get(i).getSiteName());
        }     
    }
    
    public void updateUserBoxes(){
        userComboBox.removeAllItems();
        if (siteComboBox.getSelectedIndex() >= 0){
            Site s = eSystem.siteList.get(siteComboBox.getSelectedIndex());
            for (int i = 0; i < s.userList.size(); i++){
                userComboBox.addItem(s.userList.get(i).getUsername());
            }  
        }     
    }
    
    private void emailListActionPerformed() {
        if (viewingInbox){           
            messageField.setText(eSystem.currentUser.Inbox.get(emailList.getSelectedIndex()).getMessage());
            fromLabel.setText(eSystem.currentUser.Inbox.get(emailList.getSelectedIndex()).getSender());
            dateLabel.setText(eSystem.currentUser.Inbox.get(emailList.getSelectedIndex()).getDate());
        }else if (viewingSent){
            messageField.setText(eSystem.currentUser.Sent.get(emailList.getSelectedIndex()).getMessage());
            fromLabel.setText(eSystem.currentUser.Sent.get(emailList.getSelectedIndex()).getSender());
            dateLabel.setText(eSystem.currentUser.Sent.get(emailList.getSelectedIndex()).getDate());
        }else if(viewingTrash){
            messageField.setText(eSystem.currentUser.Trash.get(emailList.getSelectedIndex()).getMessage());
            fromLabel.setText(eSystem.currentUser.Trash.get(emailList.getSelectedIndex()).getSender());
            dateLabel.setText(eSystem.currentUser.Trash.get(emailList.getSelectedIndex()).getDate());
        }          
    }
    
    public void updateEmailBox(){
        emailList.removeAll();
        if (viewingInbox){           
            DefaultListModel listModel = new DefaultListModel();              
            for (int i = 0; i < eSystem.getCurrentUser().Inbox.size(); i++){
                listModel.addElement(eSystem.getCurrentUser().Inbox.get(i).getSubject() + "--From--" + eSystem.getCurrentUser().Inbox.get(i).getSender() + "--On--" + eSystem.getCurrentUser().Inbox.get(i).getDate());
            }  
            emailList.setModel(listModel);
        }else if (viewingSent){
            DefaultListModel listModel = new DefaultListModel();              
            for (int i = 0; i < eSystem.getCurrentUser().Sent.size(); i++){
                listModel.addElement(eSystem.getCurrentUser().Sent.get(i).getSubject() + "--From--" + eSystem.getCurrentUser().Sent.get(i).getSender() + "--On--" + eSystem.getCurrentUser().Sent.get(i).getDate());
            }  
            emailList.setModel(listModel);
        }else if(viewingTrash){
            DefaultListModel listModel = new DefaultListModel();              
            for (int i = 0; i < eSystem.getCurrentUser().Trash.size(); i++){
                listModel.addElement(eSystem.getCurrentUser().Trash.get(i).getSubject() + "--From--" + eSystem.getCurrentUser().Trash.get(i).getSender() + "--On--" + eSystem.getCurrentUser().Trash.get(i).getDate());
            }  
            emailList.setModel(listModel);
        }    

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUserButton;
    private javax.swing.JButton composeButton;
    private javax.swing.JLabel currentUserLabel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JList<String> emailList;
    private javax.swing.JLabel fromLabel;
    private javax.swing.JButton inboxButton;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea messageField;
    private javax.swing.JButton removeSiteButton;
    private javax.swing.JButton removeUserButton;
    private javax.swing.JButton sentButton;
    private javax.swing.JComboBox<String> siteComboBox;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton trashButton;
    private javax.swing.JComboBox<String> userComboBox;
    // End of variables declaration//GEN-END:variables
}
