
package javaapplication1;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

/**
 *
 * @author jsaunders
 */
public class GUIprogram extends javax.swing.JFrame {
    

//Controller control = new Controller();
       

    
    public void displayPrompt()  {
       JOptionPane.showMessageDialog(this, "Incorrect Username or Password", "Invalid Credentials", JOptionPane.ERROR_MESSAGE);
   //     jLoginFail.setVisible(true);


    }
        

 
    public GUIprogram() {
        
        

try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    // If Nimbus is not available, you can set the GUI to another look and feel.
}
        
        initComponents();
         jLogin.setVisible(true);
        
    }
    
   

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jHomeScreen = new javax.swing.JDialog();
        onetooneB = new javax.swing.JButton();
        roomsB = new javax.swing.JButton();
        asB = new javax.swing.JButton();
        backB = new javax.swing.JButton();
        titleHomeScreen = new javax.swing.JLabel();
        backgroundHomeScreen = new javax.swing.JLabel();
        jOnetoOne = new javax.swing.JDialog();
        sendM = new javax.swing.JTextField();
        sendB = new javax.swing.JButton();
        backB2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ipAdd = new javax.swing.JLabel();
        ipaddTF = new javax.swing.JTextField();
        portTF = new javax.swing.JTextField();
        port = new javax.swing.JLabel();
        connectionButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        histTF = new javax.swing.JTextArea();
        background1to1 = new javax.swing.JLabel();
        jLogin = new javax.swing.JDialog();
        username = new javax.swing.JLabel();
        uName = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        pwd = new javax.swing.JPasswordField();
        loginB = new javax.swing.JButton();
        titleLogin = new javax.swing.JLabel();
        forgotunamepwd = new javax.swing.JButton();
        clickHereB = new javax.swing.JButton();
        backgroundLogin = new javax.swing.JLabel();
        jRegistration = new javax.swing.JDialog();
        titleReg = new javax.swing.JLabel();
        emailReg = new javax.swing.JLabel();
        emTF = new javax.swing.JTextField();
        usernameReg = new javax.swing.JLabel();
        unTF = new javax.swing.JTextField();
        passwordReg = new javax.swing.JLabel();
        pwPF = new javax.swing.JPasswordField();
        verfiyPassword = new javax.swing.JLabel();
        vpwPF = new javax.swing.JPasswordField();
        regB = new javax.swing.JButton();
        cancelReg = new javax.swing.JButton();
        backgroundRegistration = new javax.swing.JLabel();
        jLoginFail = new javax.swing.JDialog();
        jRecovery = new javax.swing.JDialog();
        titleRecover = new javax.swing.JLabel();
        emRec = new javax.swing.JLabel();
        emailRecTF = new javax.swing.JTextField();
        submitBRec = new javax.swing.JButton();
        cancelRec = new javax.swing.JButton();
        backgroundRec = new javax.swing.JLabel();
        jAccountSettings = new javax.swing.JDialog();
        changePasswordB = new javax.swing.JButton();
        contactSupportB = new javax.swing.JButton();
        deleteAccountB = new javax.swing.JButton();
        backBAS = new javax.swing.JButton();
        titleAS = new javax.swing.JLabel();
        backgroundAS = new javax.swing.JLabel();

        jHomeScreen.setMinimumSize(new java.awt.Dimension(390, 700));
        jHomeScreen.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        onetooneB.setBackground(new java.awt.Color(163, 163, 181));
        onetooneB.setForeground(new java.awt.Color(55, 55, 71));
        onetooneB.setText("1 TO 1");
        onetooneB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onetooneBActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(onetooneB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 70));

        roomsB.setBackground(new java.awt.Color(163, 163, 181));
        roomsB.setForeground(new java.awt.Color(55, 55, 71));
        roomsB.setText("ROOMS");
        roomsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomsBActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(roomsB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 70));

        asB.setBackground(new java.awt.Color(163, 163, 181));
        asB.setForeground(new java.awt.Color(55, 55, 71));
        asB.setText("ACCOUNT SETTINGS");
        asB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asBActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(asB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, 70));

        backB.setBackground(new java.awt.Color(163, 163, 181));
        backB.setForeground(new java.awt.Color(55, 55, 71));
        backB.setText("LOG OUT");
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });
        jHomeScreen.getContentPane().add(backB, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 40));

        titleHomeScreen.setBackground(new java.awt.Color(55, 55, 71));
        titleHomeScreen.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleHomeScreen.setForeground(java.awt.Color.lightGray);
        titleHomeScreen.setText("WELCOME");
        jHomeScreen.getContentPane().add(titleHomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        backgroundHomeScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        backgroundHomeScreen.setMaximumSize(new java.awt.Dimension(450, 725));
        backgroundHomeScreen.setMinimumSize(new java.awt.Dimension(400, 700));
        backgroundHomeScreen.setPreferredSize(new java.awt.Dimension(400, 720));
        jHomeScreen.getContentPane().add(backgroundHomeScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 377, 666));

        jOnetoOne.setMinimumSize(new java.awt.Dimension(385, 700));
        jOnetoOne.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sendM.setBackground(new java.awt.Color(163, 163, 181));
        sendM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        sendM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(sendM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 260, 30));

        sendB.setBackground(new java.awt.Color(163, 163, 181));
        sendB.setForeground(new java.awt.Color(55, 55, 71));
        sendB.setText("ENTER");
        sendB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(sendB, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, -1, 30));

        backB2.setBackground(new java.awt.Color(163, 163, 181));
        backB2.setForeground(new java.awt.Color(55, 55, 71));
        backB2.setText("BACK");
        backB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backB2ActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(backB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, 340, -1));

        jLabel1.setBackground(new java.awt.Color(55, 55, 71));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setText("CHAT 1 ON 1");
        jOnetoOne.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        ipAdd.setForeground(new java.awt.Color(229, 124, 0));
        ipAdd.setText("IP Address:");
        jOnetoOne.getContentPane().add(ipAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        ipaddTF.setBackground(new java.awt.Color(163, 163, 181));
        ipaddTF.setForeground(new java.awt.Color(55, 55, 71));
        ipaddTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jOnetoOne.getContentPane().add(ipaddTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 140, 30));

        portTF.setBackground(new java.awt.Color(163, 163, 181));
        portTF.setForeground(new java.awt.Color(55, 55, 71));
        portTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        portTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portTFActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(portTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 60, 30));

        port.setForeground(new java.awt.Color(229, 124, 0));
        port.setText("Port:");
        jOnetoOne.getContentPane().add(port, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        connectionButton.setBackground(new java.awt.Color(163, 163, 181));
        connectionButton.setForeground(new java.awt.Color(55, 55, 71));
        connectionButton.setText("CONNECT");
        connectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectionButtonActionPerformed(evt);
            }
        });
        jOnetoOne.getContentPane().add(connectionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 100, 30));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0), 3));

        histTF.setBackground(new java.awt.Color(163, 163, 181));
        histTF.setColumns(20);
        histTF.setRows(5);
        histTF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jScrollPane1.setViewportView(histTF);

        jOnetoOne.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, 330));

        background1to1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jOnetoOne.getContentPane().add(background1to1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLogin.setMinimumSize(new java.awt.Dimension(400, 720));
        jLogin.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setForeground(new java.awt.Color(229, 124, 0));
        username.setText("Username: ");
        jLogin.getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        uName.setBackground(new java.awt.Color(163, 163, 181));
        uName.setForeground(new java.awt.Color(55, 55, 71));
        uName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        uName.setOpaque(true);
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(uName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 320, 40));

        password.setForeground(new java.awt.Color(229, 124, 0));
        password.setText("Password:");
        jLogin.getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        pwd.setBackground(new java.awt.Color(163, 163, 181));
        pwd.setForeground(new java.awt.Color(55, 55, 71));
        pwd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        pwd.setOpaque(true);
        jLogin.getContentPane().add(pwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 320, 40));

        loginB.setBackground(new java.awt.Color(163, 163, 181));
        loginB.setForeground(new java.awt.Color(55, 55, 71));
        loginB.setText("LOGIN: ");
        loginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(loginB, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 400, 320, 40));

        titleLogin.setBackground(new java.awt.Color(55, 55, 71));
        titleLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleLogin.setForeground(java.awt.Color.lightGray);
        titleLogin.setText("LOGIN SCREEN");
        jLogin.getContentPane().add(titleLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        forgotunamepwd.setBackground(new java.awt.Color(163, 163, 181));
        forgotunamepwd.setForeground(new java.awt.Color(55, 55, 71));
        forgotunamepwd.setText("Forgot Username or Password?");
        forgotunamepwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotunamepwdActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(forgotunamepwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 320, -1));

        clickHereB.setBackground(new java.awt.Color(163, 163, 181));
        clickHereB.setForeground(new java.awt.Color(55, 55, 71));
        clickHereB.setText("Don't have an account?");
        clickHereB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickHereBActionPerformed(evt);
            }
        });
        jLogin.getContentPane().add(clickHereB, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 320, -1));

        backgroundLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jLogin.getContentPane().add(backgroundLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 2, 380, 670));

        jRegistration.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleReg.setBackground(new java.awt.Color(55, 55, 71));
        titleReg.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleReg.setForeground(java.awt.Color.lightGray);
        titleReg.setText("REGISTRATION SCREEN");
        jRegistration.getContentPane().add(titleReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        emailReg.setForeground(new java.awt.Color(229, 124, 0));
        emailReg.setText("Enter Email Address:");
        jRegistration.getContentPane().add(emailReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        emTF.setBackground(new java.awt.Color(163, 163, 181));
        emTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        emTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emTFActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(emTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 320, 40));

        usernameReg.setForeground(new java.awt.Color(229, 124, 0));
        usernameReg.setText("Enter Username: ");
        jRegistration.getContentPane().add(usernameReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        unTF.setBackground(new java.awt.Color(163, 163, 181));
        unTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        jRegistration.getContentPane().add(unTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 320, 40));

        passwordReg.setForeground(new java.awt.Color(229, 124, 0));
        passwordReg.setText("Password: ");
        jRegistration.getContentPane().add(passwordReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        pwPF.setBackground(new java.awt.Color(163, 163, 181));
        pwPF.setForeground(new java.awt.Color(55, 55, 71));
        pwPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwPFActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(pwPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 320, 40));

        verfiyPassword.setForeground(new java.awt.Color(229, 124, 0));
        verfiyPassword.setText("Verify Password:");
        jRegistration.getContentPane().add(verfiyPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        vpwPF.setBackground(new java.awt.Color(163, 163, 181));
        vpwPF.setForeground(new java.awt.Color(55, 55, 71));
        vpwPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vpwPFActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(vpwPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 320, 40));

        regB.setBackground(new java.awt.Color(163, 163, 181));
        regB.setForeground(new java.awt.Color(55, 55, 71));
        regB.setText("REGISTER");
        regB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBActionPerformed(evt);
            }
        });
        jRegistration.getContentPane().add(regB, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 600, -1, 40));

        cancelReg.setBackground(new java.awt.Color(163, 163, 181));
        cancelReg.setForeground(new java.awt.Color(55, 55, 71));
        cancelReg.setText("CANCEL");
        jRegistration.getContentPane().add(cancelReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, 40));

        backgroundRegistration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jRegistration.getContentPane().add(backgroundRegistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jLoginFail.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRecovery.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleRecover.setBackground(new java.awt.Color(55, 55, 71));
        titleRecover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleRecover.setForeground(java.awt.Color.lightGray);
        titleRecover.setText("RECOVERY ");
        jRecovery.getContentPane().add(titleRecover, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));
        titleRecover.getAccessibleContext().setAccessibleName("");

        emRec.setForeground(new java.awt.Color(229, 124, 0));
        emRec.setText("Enter your Email Address:");
        jRecovery.getContentPane().add(emRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        emailRecTF.setBackground(new java.awt.Color(163, 163, 181));
        emailRecTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(229, 124, 0)));
        emailRecTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailRecTFActionPerformed(evt);
            }
        });
        jRecovery.getContentPane().add(emailRecTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 260, 40));

        submitBRec.setForeground(new java.awt.Color(55, 55, 71));
        submitBRec.setText("SUBMIT");
        submitBRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBRecActionPerformed(evt);
            }
        });
        jRecovery.getContentPane().add(submitBRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, 40));

        cancelRec.setForeground(new java.awt.Color(55, 55, 71));
        cancelRec.setText("CANCEL RECOVERY");
        cancelRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelRecActionPerformed(evt);
            }
        });
        jRecovery.getContentPane().add(cancelRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 40));

        backgroundRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jRecovery.getContentPane().add(backgroundRec, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jAccountSettings.setPreferredSize(new java.awt.Dimension(381, 672));
        jAccountSettings.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        changePasswordB.setBackground(new java.awt.Color(163, 163, 181));
        changePasswordB.setForeground(new java.awt.Color(55, 55, 71));
        changePasswordB.setText("CHANGE PASSWORD");
        jAccountSettings.getContentPane().add(changePasswordB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 230, 70));

        contactSupportB.setBackground(new java.awt.Color(163, 163, 181));
        contactSupportB.setForeground(new java.awt.Color(55, 55, 71));
        contactSupportB.setText("CONTACT SUPPORT");
        jAccountSettings.getContentPane().add(contactSupportB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 230, 70));

        deleteAccountB.setBackground(new java.awt.Color(163, 163, 181));
        deleteAccountB.setForeground(new java.awt.Color(55, 55, 71));
        deleteAccountB.setText("DELETE ACCOUNT");
        jAccountSettings.getContentPane().add(deleteAccountB, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 230, 70));

        backBAS.setBackground(new java.awt.Color(163, 163, 181));
        backBAS.setForeground(new java.awt.Color(55, 55, 71));
        backBAS.setText("BACK");
        backBAS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBASActionPerformed(evt);
            }
        });
        jAccountSettings.getContentPane().add(backBAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, -1, 40));

        titleAS.setBackground(new java.awt.Color(55, 55, 71));
        titleAS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        titleAS.setForeground(java.awt.Color.lightGray);
        titleAS.setText("ACCOUNT SETTINGS");
        jAccountSettings.getContentPane().add(titleAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        backgroundAS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/pictures/background_simple_smaller.png"))); // NOI18N
        jAccountSettings.getContentPane().add(backgroundAS, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(375, 666));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomsBActionPerformed
       //userControl.chatRooms();
       
       jHomeScreen.setVisible(true);
    }//GEN-LAST:event_roomsBActionPerformed

    private void asBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asBActionPerformed
        jHomeScreen.setVisible(false);
        jAccountSettings.setVisible(true);           //userControl.accountSetting();
    }//GEN-LAST:event_asBActionPerformed

    private void clickHereBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clickHereBActionPerformed
        jLogin.setVisible(false);
        jRegistration.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_clickHereBActionPerformed

    private void onetooneBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onetooneBActionPerformed
        jHomeScreen.setVisible(false);
        jOnetoOne.setVisible(true);   
    }//GEN-LAST:event_onetooneBActionPerformed

    private void backB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backB2ActionPerformed
       jOnetoOne.setVisible(false);
        jHomeScreen.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_backB2ActionPerformed

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void emTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emTFActionPerformed

    private void sendMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMActionPerformed

    private void emailRecTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailRecTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailRecTFActionPerformed

    private void loginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBActionPerformed
//      LoginWindow checkLogin = new LoginWindow();
//        if(checkLogin.credentials()==true){ 
        jLogin.setVisible(false);
        jHomeScreen.setVisible(true);
//        }
//       else{
//            JOptionPane.showMessageDialog(this, 
//                    "Wrong Username or Password",
//                    "Invalid Credentials" , JOptionPane.ERROR_MESSAGE);       }
//      
    }//GEN-LAST:event_loginBActionPerformed

    private void forgotunamepwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotunamepwdActionPerformed
        jLogin.setVisible(false);
        jRecovery.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_forgotunamepwdActionPerformed

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        jHomeScreen.setVisible(false);
        jLogin.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_backBActionPerformed

    private void cancelRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelRecActionPerformed
        jRecovery.setVisible(false);
        jLogin.setVisible(true);           // TODO add your handling code here:
    }//GEN-LAST:event_cancelRecActionPerformed

    private void backBASActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBASActionPerformed
        jAccountSettings.setVisible(false);
        jHomeScreen.setVisible(true);
    }//GEN-LAST:event_backBASActionPerformed

    private void pwPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwPFActionPerformed

    private void vpwPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vpwPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vpwPFActionPerformed

    private void sendBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBActionPerformed
       messageSent(true);
    }//GEN-LAST:event_sendBActionPerformed

    private void submitBRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBRecActionPerformed
        recoverPasswordPressed(true);
        JOptionPane.showMessageDialog(this, 
                    "Check your email address for your new password",
                    "Emailed Password" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_submitBRecActionPerformed

    private void regBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBActionPerformed
        registerPressed(true);       
    }//GEN-LAST:event_regBActionPerformed

    private void portTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_portTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_portTFActionPerformed

    private void connectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectionButtonActionPerformed
        connectionButtonPressed(true);
        MessagePanel connection = new MessagePanel();
//        if(connection.getStatus()==false) {
//            JOptionPane.showMessageDialog(this, "No Connection", "Connection Fail!", JOptionPane.ERROR_MESSAGE);
//        }
//        else{
           
            JOptionPane.showMessageDialog(this, 
                    "Connection Successful!\n\nConnection:\t"+ipaddTF.getText()+": "+portTF.getText()+
                    "\n\nIP Address:\t"+ipaddTF.getText()+
                    "\nPort Number:\t"+portTF.getText(), 
                    "Success!" , JOptionPane.INFORMATION_MESSAGE);
//        }
    }//GEN-LAST:event_connectionButtonActionPerformed


    public static void main(String args[]) {
       
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            GUIprogram guIprogram = new GUIprogram();
        });
    }

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton asB;
    private javax.swing.JButton backB;
    private javax.swing.JButton backB2;
    private javax.swing.JButton backBAS;
    private javax.swing.JLabel background1to1;
    private javax.swing.JLabel backgroundAS;
    private javax.swing.JLabel backgroundHomeScreen;
    private javax.swing.JLabel backgroundLogin;
    private javax.swing.JLabel backgroundRec;
    private javax.swing.JLabel backgroundRegistration;
    private javax.swing.JButton cancelRec;
    private javax.swing.JButton cancelReg;
    private javax.swing.JButton changePasswordB;
    private javax.swing.JButton clickHereB;
    private javax.swing.JButton connectionButton;
    private javax.swing.JButton contactSupportB;
    private javax.swing.JButton deleteAccountB;
    private javax.swing.JLabel emRec;
    private javax.swing.JTextField emTF;
    private javax.swing.JTextField emailRecTF;
    private javax.swing.JLabel emailReg;
    private javax.swing.JButton forgotunamepwd;
    private javax.swing.JTextArea histTF;
    private javax.swing.JLabel ipAdd;
    private javax.swing.JTextField ipaddTF;
    private javax.swing.JDialog jAccountSettings;
    private javax.swing.JDialog jHomeScreen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDialog jLogin;
    private javax.swing.JDialog jLoginFail;
    private javax.swing.JDialog jOnetoOne;
    private javax.swing.JDialog jRecovery;
    private javax.swing.JDialog jRegistration;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginB;
    private javax.swing.JButton onetooneB;
    private javax.swing.JLabel password;
    private javax.swing.JLabel passwordReg;
    private javax.swing.JLabel port;
    private javax.swing.JTextField portTF;
    private javax.swing.JPasswordField pwPF;
    private javax.swing.JPasswordField pwd;
    private javax.swing.JButton regB;
    private javax.swing.JButton roomsB;
    private javax.swing.JButton sendB;
    private javax.swing.JTextField sendM;
    private javax.swing.JButton submitBRec;
    private javax.swing.JLabel titleAS;
    private javax.swing.JLabel titleHomeScreen;
    private javax.swing.JLabel titleLogin;
    private javax.swing.JLabel titleRecover;
    private javax.swing.JLabel titleReg;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField unTF;
    private javax.swing.JLabel username;
    private javax.swing.JLabel usernameReg;
    private javax.swing.JLabel verfiyPassword;
    private javax.swing.JPasswordField vpwPF;
    // End of variables declaration//GEN-END:variables


    
    public String getSentM(){
        String message = sendM.getText();
        return message;
    }
    
    public String getUserName(){
        String message = uName.getText();
        return message;
    }
    
    public char[] getPassword(){
        char[] message = pwd.getPassword();
        return message;
    }
    
    public String getEmailAddress(){
        String message = emailRecTF.getText();
        return message;
    }
    
    public String getEmailRegistered(){
        String message = emTF.getText();
        return message;
    }
    public String getUserNameRegistered(){
        String message = unTF.getText();
        return message;
    }
    
    public char[] getPasswordRegistered(){
        char[] pwdArray = pwPF.getPassword();
        return pwdArray;
    }
    
    public char[] getPasswordVerifyRegistered(){
        char[] pwdArray = vpwPF.getPassword();
        return pwdArray;
    }
    
    public String getSentMessage(){
        String sentMessage = sendM.getText();
        return sentMessage;
    }    
    
    public String getIP(){
        String ipAddress = ipaddTF.getText();
        return ipAddress;
    }
    
    public String getPort(){
        String portNum = portTF.getText();
        return portNum;
    }
    
    public boolean recoverPasswordPressed(boolean pressed){
        return pressed;
    }
    public boolean registerPressed(boolean pressed){
        return pressed;
    }
    
    public boolean messageSent(boolean pressed){
        return pressed;
    }
    
    public boolean connectionButtonPressed(boolean pressed){
        return pressed;
    }
    
    
}