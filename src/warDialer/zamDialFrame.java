package warDialer;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Vector;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class zamDialFrame extends javax.swing.JFrame {

    public static String CWD;
    public static String arrIP;
    public static String Argue;
    public static Vector allThreads = new Vector();

    public zamDialFrame() {
        initComponents();
        try {
            CWD = new java.io.File(".").getCanonicalPath();
        } catch (java.io.IOException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FileCoose = new javax.swing.JFileChooser();
        kumpulTab = new javax.swing.JTabbedPane();
        panInpo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        panCoro = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtUsage = new javax.swing.JTextArea();
        panAturan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtIP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtArg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        panPesen = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLog = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnList = new javax.swing.JMenu();
        mnOpen = new javax.swing.JMenuItem();
        mnSaveDefault = new javax.swing.JMenuItem();
        mnSaveAs = new javax.swing.JMenuItem();
        mnConnect = new javax.swing.JMenuItem();
        mnDisco = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GalundengDialer IP Hunter");
        setResizable(false);

        kumpulTab.setForeground(new java.awt.Color(51, 255, 0));

        txtInfo.setBackground(new java.awt.Color(0, 0, 0));
        txtInfo.setColumns(20);
        txtInfo.setEditable(false);
        txtInfo.setForeground(new java.awt.Color(255, 0, 0));
        txtInfo.setRows(5);
        txtInfo.setText("Galundeng Dialer IP Hunter v1.0\n\nDigawe :\nGalundeng@ekstramedia.org\nGratis ae lah...\n\nCopyright(c)zamSoft 2012\n");
        jScrollPane2.setViewportView(txtInfo);

        javax.swing.GroupLayout panInpoLayout = new javax.swing.GroupLayout(panInpo);
        panInpo.setLayout(panInpoLayout);
        panInpoLayout.setHorizontalGroup(
            panInpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panInpoLayout.setVerticalGroup(
            panInpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panInpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        kumpulTab.addTab("Inpo", panInpo);

        txtUsage.setBackground(new java.awt.Color(0, 0, 0));
        txtUsage.setColumns(20);
        txtUsage.setEditable(false);
        txtUsage.setForeground(new java.awt.Color(255, 51, 51));
        txtUsage.setRows(5);
        txtUsage.setText("Lebokno ip sing arep digoleki\nneng bagian aturan \"Golek IP\".\n\nContone ngene:\n182.1.,182.2.,182.4.\n\nCatetan :\nBatesi nganggo tondo koma,\ntur eling samben ip dirampungi\ngo tondo titik.");
        jScrollPane3.setViewportView(txtUsage);

        javax.swing.GroupLayout panCoroLayout = new javax.swing.GroupLayout(panCoro);
        panCoro.setLayout(panCoroLayout);
        panCoroLayout.setHorizontalGroup(
            panCoroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCoroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panCoroLayout.setVerticalGroup(
            panCoroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panCoroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        kumpulTab.addTab("Coro", panCoro);

        jLabel1.setText("Golek IP :");

        jLabel2.setText("Jeneng konfig wvdial :");

        jLabel3.setText("(kosongi ae yen standar)");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAturanLayout = new javax.swing.GroupLayout(panAturan);
        panAturan.setLayout(panAturanLayout);
        panAturanLayout.setHorizontalGroup(
            panAturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAturanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIP, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtArg, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
                .addContainerGap())
        );
        panAturanLayout.setVerticalGroup(
            panAturanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAturanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addContainerGap())
        );

        kumpulTab.addTab("Aturan", panAturan);

        txtLog.setBackground(new java.awt.Color(0, 0, 0));
        txtLog.setColumns(21);
        txtLog.setFont(new java.awt.Font("Dialog", 0, 10));
        txtLog.setForeground(new java.awt.Color(0, 255, 0));
        txtLog.setRows(5);
        jScrollPane1.setViewportView(txtLog);

        javax.swing.GroupLayout panPesenLayout = new javax.swing.GroupLayout(panPesen);
        panPesen.setLayout(panPesenLayout);
        panPesenLayout.setHorizontalGroup(
            panPesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );
        panPesenLayout.setVerticalGroup(
            panPesenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPesenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        kumpulTab.addTab("Pesen", panPesen);

        mnList.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnList.setText("File");

        mnOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnOpen.setText("Bukak");
        mnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnOpenActionPerformed(evt);
            }
        });
        mnList.add(mnOpen);

        mnSaveDefault.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnSaveDefault.setText("Simpen");
        mnSaveDefault.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveDefaultActionPerformed(evt);
            }
        });
        mnList.add(mnSaveDefault);

        mnSaveAs.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnSaveAs.setText("Simpen Dadi");
        mnSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSaveAsActionPerformed(evt);
            }
        });
        mnList.add(mnSaveAs);

        mnConnect.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        mnConnect.setText("Konek");
        mnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConnectActionPerformed(evt);
            }
        });
        mnList.add(mnConnect);

        mnDisco.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        mnDisco.setText("Pedhot");
        mnDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDiscoActionPerformed(evt);
            }
        });
        mnList.add(mnDisco);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        mnExit.setText("Metu");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        mnList.add(mnExit);

        jMenuBar1.add(mnList);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kumpulTab, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(kumpulTab, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnOpenActionPerformed
        FileFilter ft = new FileNameExtensionFilter("Config File", "cfg");
        FileCoose.addChoosableFileFilter(ft);
        FileCoose.setCurrentDirectory(new File("."));
        String file_name = null;
        int returnVal = FileCoose.showOpenDialog(this);
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            File file = FileCoose.getSelectedFile();
            file_name = file.toString();
            setFormData(file_name);
        }
        panAturan.setFocusable(true);
    }//GEN-LAST:event_mnOpenActionPerformed

    public void saveOn(String savef) {
        Writer out = null;
        File save = new File(savef);
        try {
            if (save.exists()) {
                save.delete();
            }
            out = new BufferedWriter(new FileWriter(save));
            out.write("CariIP = " + txtIP.getText() + "\n");
            out.write("WvArg = " + txtArg.getText() + "\n");
            out.write(">>>Woyow Man<<<<");
            out.close();
        } catch (Exception e) {
        }

    }

    private void mnSaveDefaultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveDefaultActionPerformed
        if (isWindows()) {
            saveOn(CWD + "\\WarDial.cfg");
        } else {
            saveOn(CWD + "/WarDial.cfg");
        }
    }//GEN-LAST:event_mnSaveDefaultActionPerformed

    private void mnSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSaveAsActionPerformed
        FileFilter ft = new FileNameExtensionFilter("Config File", "cfg");
        FileCoose.addChoosableFileFilter(ft);
        FileCoose.setCurrentDirectory(new File("."));
        int returnVal = FileCoose.showSaveDialog(this);
        if (returnVal == javax.swing.JFileChooser.APPROVE_OPTION) {
            File file = FileCoose.getSelectedFile();
            String file_name = file.toString();
            saveOn(file_name);
        }
    }//GEN-LAST:event_mnSaveAsActionPerformed

    private void mnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConnectActionPerformed
        stop();
        variabel();
        panPesen.setFocusable(true);
        txtLog.setFocusable(true);
        txtIP.setEditable(false);
        txtArg.setEditable(false);
        zamDial.bunuh();
        zamDial zam = new zamDial();
        zam.start();
        allThreads.add(zam);
    }//GEN-LAST:event_mnConnectActionPerformed

    private void mnDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDiscoActionPerformed
        zamDial.bunuh();
        stop();
    }//GEN-LAST:event_mnDiscoActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        zamDial.bunuh();
        stop();
        System.exit(0);
    }//GEN-LAST:event_mnExitActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        txtIP.setEditable(true);
        txtArg.setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    public static boolean isWindows() {
        String os = System.getProperty("os.name").toLowerCase();
        return (os.indexOf("win") >= 0);
    }

    public void stop() {
        for (Enumeration e = allThreads.elements(); e.hasMoreElements();) {
            Thread t = (Thread) e.nextElement();
            try {
                t.stop();
            } catch (Exception ex) {
            } finally {
            }
        }
    }

    public void setFormData(String files) {
        Properties setkan = new Properties();
        File save = new File(files);
        try {
            if (save.exists()) {
                setkan.load(new FileInputStream(files));
                if (setkan.getProperty("CariIP") != null) {
                    txtIP.setText(setkan.getProperty("CariIP"));
                }
                if (setkan.getProperty("WvArg") != null) {
                    txtArg.setText(setkan.getProperty("WvArg"));
                }
            }
        } catch (IOException e) {
        }
    }

    public void variabel() {
        arrIP = txtIP.getText();
        Argue = txtArg.getText();
    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(zamDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(zamDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(zamDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(zamDialFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                zamDialFrame WarD = new zamDialFrame();
                WarD.pack();
                WarD.setDefaultCloseOperation(zamDialFrame.EXIT_ON_CLOSE);
                Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
                WarD.setLocationRelativeTo(null);
                WarD.setVisible(true);
                if (isWindows()) {
                    WarD.setFormData(CWD + "\\WarDial.cfg");
                } else {
                    WarD.setFormData(CWD + "/WarDial.cfg");
                }
                WarD.panInpo.setFocusable(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser FileCoose;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane kumpulTab;
    private javax.swing.JMenuItem mnConnect;
    private javax.swing.JMenuItem mnDisco;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnList;
    private javax.swing.JMenuItem mnOpen;
    private javax.swing.JMenuItem mnSaveAs;
    private javax.swing.JMenuItem mnSaveDefault;
    private javax.swing.JPanel panAturan;
    private javax.swing.JPanel panCoro;
    private javax.swing.JPanel panInpo;
    private javax.swing.JPanel panPesen;
    public javax.swing.JTextField txtArg;
    public javax.swing.JTextField txtIP;
    private javax.swing.JTextArea txtInfo;
    protected static javax.swing.JTextArea txtLog;
    private javax.swing.JTextArea txtUsage;
    // End of variables declaration//GEN-END:variables
}
