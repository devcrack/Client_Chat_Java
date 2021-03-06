/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_client_app;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author delcracnk
 */
public class Client_Gui extends javax.swing.JFrame {
    private static int num_port;
    private String server_name;
    private String  user_name;
    private String password;
    private BufferedReader client_input;
    private PrintWriter client_output;
    private Socket client_socket;
    private ArrayList<String> name_list_clients;//Esto fue en el ultimo commit 
    /**
     * Creates new form Client_Gui
     */
    public Client_Gui() {
        this.server_name = "localhost";
        this.num_port = 7520;
        this.name_list_clients = new ArrayList<String>();
        this.name_list_clients.add("$All");
        initComponents();
        jComboBox_Users.removeAllItems();
        jComboBox_Users.setModel(new DefaultComboBoxModel(name_list_clients.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Show_Messages = new javax.swing.JTextArea();
        jTextField_user_name = new javax.swing.JTextField();
        jTextField_address = new javax.swing.JTextField();
        jButton_Connect = new javax.swing.JButton();
        jPassword_Field = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Editable = new javax.swing.JTextArea();
        jButton_Send_Message = new javax.swing.JButton();
        jComboBox_Users = new javax.swing.JComboBox<>();
        jLabel_users = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTextArea_Show_Messages.setEditable(false);
        jTextArea_Show_Messages.setColumns(20);
        jTextArea_Show_Messages.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Show_Messages);

        jTextField_user_name.setText("user");

        jTextField_address.setText("localhost");

        jButton_Connect.setText("Connect");
        jButton_Connect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ConnectActionPerformed(evt);
            }
        });

        jPassword_Field.setText("1234");

        jTextArea_Editable.setColumns(20);
        jTextArea_Editable.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Editable);

        jButton_Send_Message.setText("Send");
        jButton_Send_Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Send_MessageActionPerformed(evt);
            }
        });

        jComboBox_Users.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox_Users.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox_UsersItemStateChanged(evt);
            }
        });

        jLabel_users.setText("Send to User:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jTextField_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(jPassword_Field, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jButton_Connect))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_users)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_Users, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Send_Message)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_user_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Connect)
                    .addComponent(jPassword_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_users)
                    .addComponent(jComboBox_Users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Send_Message))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            // TODO add your handling code here:
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
            
            this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
            this.jButton_Send_Message.setVisible(false);
            this.jTextArea_Editable.setVisible(false);
            this.jComboBox_Users.setVisible(false);
            this.jLabel_users.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void jButton_ConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ConnectActionPerformed
    
        String confirmation;
        /*GUi interaction*/
        this.server_name = this.jTextField_address.getText();
        this.user_name = this.jTextField_user_name.getText();
        this.password = Arrays.toString(this.jPassword_Field.getPassword());
        
        /*Validate data*/
         if (this.user_name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter name.");
            return;
        }
        if (this.user_name.length() > 8) {
            JOptionPane.showMessageDialog(this, "Max length of name is 8 characters.");
            return;
        }
        if (this.password.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter password.");
            return;
        }
        if (this.server_name.equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter servername.");
            return;
        }
        
        // Handle the Gui Elements                    
        this.jButton_Connect.setVisible(false);
        this.jPassword_Field.setVisible(false);
        this.jTextField_address.setVisible(false);
        this.jTextField_user_name.setVisible(false);

        this.jButton_Send_Message.setVisible(true);
        this.jTextArea_Editable.setVisible(true);  
        this.jComboBox_Users.setVisible(true);
        this.jLabel_users.setVisible(true);

        /*Client things*/
        try {             
            this.jTextArea_Show_Messages.append("Connecting to " + this.server_name + " on port" +  this.num_port + "\n" );
            this.client_socket = new Socket(this.server_name, this.num_port);
            this.jTextArea_Show_Messages.append("Connected to: " + client_socket.getRemoteSocketAddress() + "\n");
            
            /*Getting the input and outputs from soc ket*/
            this.client_input =  new BufferedReader(new InputStreamReader(this.client_socket.getInputStream()));
            this.client_output = new PrintWriter(this.client_socket.getOutputStream(), true);
            
            /*Sending data of user to Server*/
            this.client_output.println(this.user_name);
            this.client_output.println(this.password);            
            /*Wating confirmation from server*/
            confirmation = this.client_input.readLine();
            /*Checking if the confirmation was correct*/
            if(confirmation.equals("added")) 
                JOptionPane.showMessageDialog(this, "User Added.");
            else {
                JOptionPane.showMessageDialog(this, "There is something wrong Houston");
                return;
            }
            this.jTextArea_Show_Messages.append("Welcome " + this.user_name + "\n");     
            Thread client_read = new Read(this.user_name);
            client_read.start();
        }
        catch(IOException e) {
            this.jTextArea_Show_Messages.append("\nCould not connect to Server");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }                      
    }//GEN-LAST:event_jButton_ConnectActionPerformed

    private void jButton_Send_MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Send_MessageActionPerformed
        // TODO add your handling code here:       
        this.send_message(jComboBox_Users.getSelectedItem().toString());
        this.jTextArea_Editable.setText("");
    }//GEN-LAST:event_jButton_Send_MessageActionPerformed

    
    private void jComboBox_UsersItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox_UsersItemStateChanged
        // TODO add your handling code here:
        int is_here = 0;
    }//GEN-LAST:event_jComboBox_UsersItemStateChanged

    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.client_output.println("~<N!_/_!D>~" + " left");
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void send_message(String to_who) {                
        try {
            String message_send = this.user_name + ":" + jTextArea_Editable.getText().trim();
            if(message_send.equals(""))
                return;            
            /*Adding message to show messages text area*/
            jTextArea_Show_Messages.append("\n" + "Yo : " + jTextArea_Editable.getText().trim());           
            this.client_output.println(message_send + ":" + to_who.trim());
        }
        catch(Exception e){
            
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
            java.util.logging.Logger.getLogger(Client_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Client_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Client_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Client_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Client_Gui().setVisible(true);
            }
        });
    }
    
    /**
     Inner Class for read the incoming messages
     */
    class Read extends Thread {
        String message;
        String name_user;
        String user_nme_tmp;
        /*
        Simple Constructor
        */
        Read(String client_name) {
            this.name_user = client_name;
        }
        
        public void run(){
            while(true) {
                try {   
                    this.message = client_input.readLine();
                    if(message.indexOf('$') == 0) { //if is this ($) the lead character then means that a new user going to be insert
                        this.user_nme_tmp = this.message.substring(1);
                        if(!name_list_clients.contains(this.user_nme_tmp)) {                           
                            if(this.user_nme_tmp.compareTo(this.name_user)!= 0)
                                name_list_clients.add(this.user_nme_tmp);
                        }
                        jComboBox_Users.removeAllItems();
                        jComboBox_Users.setModel(new DefaultComboBoxModel(name_list_clients.toArray()));
                    }
                    else if(message.indexOf("%") == 0){ //If is this(%) the lead character then means that a user must be to be kicked out from list.
                        this.user_nme_tmp = this.message.substring(1);
                        name_list_clients.remove(this.user_nme_tmp);
                        jComboBox_Users.removeAllItems();
                        jComboBox_Users.setModel(new DefaultComboBoxModel(name_list_clients.toArray()));
                    }
                    else //If its not none of previous then, is just a message                        
                        jTextArea_Show_Messages.append("\n" + message);                        
                }
                catch (Exception e) {
                    
                }
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Connect;
    private javax.swing.JButton jButton_Send_Message;
    private javax.swing.JComboBox<String> jComboBox_Users;
    private javax.swing.JLabel jLabel_users;
    private javax.swing.JPasswordField jPassword_Field;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Editable;
    private javax.swing.JTextArea jTextArea_Show_Messages;
    private javax.swing.JTextField jTextField_address;
    private javax.swing.JTextField jTextField_user_name;
    // End of variables declaration//GEN-END:variables
}
