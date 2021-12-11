/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.screens;

import data.CommunityAdmin;
import data.News;
import data.Report;
import data.Resident;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import utils.FileUtils;
import utils.ImagePanel;

/**
 *
 * @author prath
 */
public class CommAdminReports extends javax.swing.JFrame {
    
    private CommunityAdmin c;
    private int currentEncounter;
    private int index = -1;
    private int count = -1;
    private int totalEncounters = 0;
    private ArrayList<Report> newsList;
    private ArrayList<Report> userNews;
    private ArrayList<Resident> residents;
    private ArrayList<Resident> residentsFound;
    private ArrayList<Report> report;
    
    /**
     * Creates new form CommAdminReports
     */
    public CommAdminReports() {
        initComponents();
    }
    
      /**
     * Creates new form CommAdminReports
     */
    public CommAdminReports(CommunityAdmin c) {
        this.c = c;
        initComponents();
        this.newsList = FileUtils.readReport();
        this.userNews = new ArrayList<>();
        this.residentsFound = new ArrayList<>();
        this.report = new ArrayList<>();
        currentEncounter = 0;
        initImage();
        search();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminName = new javax.swing.JLabel();
        patientPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        dateTitle = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        subjectTitle = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        messageTitle = new javax.swing.JTextField();
        encounterNumber = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nameTitle = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        adminName.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        adminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminName.setText("Welcome to Knowbourhood");

        patientPanel.setBackground(new java.awt.Color(47, 57, 84));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Reports");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Message:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Date:");

        dateTitle.setEditable(false);
        dateTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        dateTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTitleActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Subject:");

        subjectTitle.setEditable(false);
        subjectTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        subjectTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTitleActionPerformed(evt);
            }
        });

        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        messageTitle.setEditable(false);
        messageTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        messageTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTitleActionPerformed(evt);
            }
        });

        encounterNumber.setForeground(new java.awt.Color(255, 255, 255));
        encounterNumber.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        encounterNumber.setText("Encounter");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Name:");

        nameTitle.setEditable(false);
        nameTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jButton1.setText("Accept");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Decline");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout patientPanelLayout = new javax.swing.GroupLayout(patientPanel);
        patientPanel.setLayout(patientPanelLayout);
        patientPanelLayout.setHorizontalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientPanelLayout.createSequentialGroup()
                                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11))
                                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(patientPanelLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(messageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(subjectTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nameTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, patientPanelLayout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(encounterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(patientPanelLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)))))
                .addContainerGap())
        );
        patientPanelLayout.setVerticalGroup(
            patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(patientPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subjectTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(messageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(patientPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, patientPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(dateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(27, 27, 27)
                .addGroup(patientPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(encounterNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jButton5.setText("<-- Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(patientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(781, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adminName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(patientPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTitleActionPerformed

    private void subjectTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTitleActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (currentEncounter < userNews.size() - 1) {
            currentEncounter++;
            System.out.println("PLUS" + currentEncounter);
            Report encounter = userNews.get(currentEncounter);
            subjectTitle.setText(encounter.getSubject());
            encounterNumber.setText(currentEncounter+1 + " / " + String.valueOf(totalEncounters));
            messageTitle.setText(encounter.getMessage());
            nameTitle.setText(encounter.getName());
            dateTitle.setText(encounter.getDate() + "");
        } else {
            JOptionPane.showMessageDialog(this, "There are only " + String.valueOf(totalEncounters) + " messages for " + c.getName());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if (currentEncounter > 0) {
            currentEncounter--;
            System.out.println("MINUS" + currentEncounter);
            Report encounter = userNews.get(currentEncounter);
            subjectTitle.setText(encounter.getSubject());
            messageTitle.setText(encounter.getMessage());
            nameTitle.setText(encounter.getName());
            dateTitle.setText(encounter.getDate() + "");
            encounterNumber.setText(currentEncounter+1 + " / " + String.valueOf(totalEncounters));
        } else {
            JOptionPane.showMessageDialog(this, "There are only " + String.valueOf(totalEncounters) + " messages for " + c.getName());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void messageTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTitleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       sendMail("All", newsList.get(currentEncounter).getSubject(), newsList.get(currentEncounter).getMessage());
        ArrayList<Report> reportFound = FileUtils.readReport();
        int indexFound = -1;
        for (int i = 0 ; i < reportFound.size(); i++) {
            if (reportFound.get(i).getMessage().equals(messageTitle.getText())) {
                indexFound = i;
            }
        }
        reportFound.remove(indexFound);
        FileUtils.writeReport(reportFound);
        super.dispose();
        CommAdminReports cd = new CommAdminReports(c);
        cd.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      ArrayList<Report> reportFound = FileUtils.readReport();
        int indexFound = -1;
        for (int i = 0 ; i < reportFound.size(); i++) {
            if (reportFound.get(i).getMessage().equals(messageTitle.getText())) {
                indexFound = i;
            }
        }

        JOptionPane.showMessageDialog(this, "Deleted report of " +  reportFound.get(indexFound).getName());
        reportFound.remove(indexFound);
        FileUtils.writeReport(reportFound);
        super.dispose();
        CommAdminReports cd = new CommAdminReports(c);
        cd.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        super.dispose();
        CommAdminDashboard ad = new CommAdminDashboard(c);
        ad.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    public void sendMail(String to, String subject, String email_body) {
        String username = "knowbourhood@gmail.com";
        String password = "aedpassword123";
        residents = FileUtils.readResidents();
        for (int x = 0; x < residents.size(); x++) {
            if (residents.get(x).getCommunity().equals(c.getCommunityName())) {
                residentsFound.add(residents.get(x));
            }
        }
        
        if (to.equals("All")) {
            for (int i = 0; i < residentsFound.size(); i++) {
                doSendMail(username, password, residentsFound.get(i).getEmail(), subject, email_body);
            }
            JOptionPane.showMessageDialog(null, "Message Sent!", "Sent", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    private void initImage() {
        adminName.setText("Welcome " + c.getName());
        ImagePanel jPanel1 = new ImagePanel("src/assets/commadminreports.jpg");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(CommAdminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommAdminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommAdminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommAdminReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommAdminReports().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.JTextField dateTitle;
    private javax.swing.JLabel encounterNumber;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JTextField messageTitle;
    private javax.swing.JTextField nameTitle;
    private javax.swing.JPanel patientPanel;
    private javax.swing.JTextField subjectTitle;
    // End of variables declaration//GEN-END:variables
}
