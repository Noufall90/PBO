/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package tubes_pbo;

/**
 *
 * @author USER
 */
public class HalamanAdmin extends javax.swing.JInternalFrame {

    /**
     * Creates new form loginAdmin
     */
    public HalamanAdmin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        fiturAdmin = new javax.swing.JMenu();
        updateMenu = new javax.swing.JMenuItem();
        historyMenu = new javax.swing.JMenuItem();
        konfirmasiMenu = new javax.swing.JMenuItem();

        setTitle("Halaman Admin");

        fiturAdmin.setText("Fitur Admin");
        fiturAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiturAdminActionPerformed(evt);
            }
        });

        updateMenu.setText("Update");
        updateMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuActionPerformed(evt);
            }
        });
        fiturAdmin.add(updateMenu);

        historyMenu.setText("History");
        fiturAdmin.add(historyMenu);

        konfirmasiMenu.setText("Konfirmasi");
        fiturAdmin.add(konfirmasiMenu);

        jMenuBar1.add(fiturAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fiturAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiturAdminActionPerformed
        
    }//GEN-LAST:event_fiturAdminActionPerformed

    private void updateMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMenuActionPerformed
        UpdateProduk updatep = new UpdateProduk();
        updatep.setVisible(true);
        add(updatep);
        
    }//GEN-LAST:event_updateMenuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu fiturAdmin;
    private javax.swing.JMenuItem historyMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem konfirmasiMenu;
    private javax.swing.JMenuItem updateMenu;
    // End of variables declaration//GEN-END:variables
}
