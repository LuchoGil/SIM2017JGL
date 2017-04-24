/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julieta
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form GeneradorLenguaje
     */
    public Main() {
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

        btn_lineal = new javax.swing.JButton();
        btn_multiplicativo = new javax.swing.JButton();
        btn_lenguaje = new javax.swing.JButton();
        btn_prueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridLayout(4, 1));

        btn_lineal.setText("Generador Congruencial Lineal");
        btn_lineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_linealActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lineal);

        btn_multiplicativo.setText("Generador Congruencial Multiplicativo");
        btn_multiplicativo.setMaximumSize(new java.awt.Dimension(179, 23));
        btn_multiplicativo.setMinimumSize(new java.awt.Dimension(179, 23));
        btn_multiplicativo.setPreferredSize(new java.awt.Dimension(179, 23));
        btn_multiplicativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiplicativoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_multiplicativo);

        btn_lenguaje.setText("Generador del Lenguaje");
        btn_lenguaje.setPreferredSize(new java.awt.Dimension(179, 23));
        btn_lenguaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lenguajeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_lenguaje);

        btn_prueba.setText("Prueba de Frecuencia Mixto");
        btn_prueba.setPreferredSize(new java.awt.Dimension(179, 23));
        btn_prueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pruebaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_prueba);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_linealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_linealActionPerformed
        // TODO add your handling code here:
        CongruencialLineal lineal= new CongruencialLineal();
        lineal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_linealActionPerformed

    private void btn_multiplicativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiplicativoActionPerformed
        // TODO add your handling code here:
        CongruencialMultiplicativo multiplicativo= new CongruencialMultiplicativo();
        multiplicativo.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_multiplicativoActionPerformed

    private void btn_lenguajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lenguajeActionPerformed
        // TODO add your handling code here:
        GeneradorLenguaje lenguaje= new GeneradorLenguaje();
        lenguaje.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_lenguajeActionPerformed

    private void btn_pruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pruebaActionPerformed
        // TODO add your handling code here:
        PruebaMixto mixto= new PruebaMixto();
        mixto.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_pruebaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_lenguaje;
    private javax.swing.JButton btn_lineal;
    private javax.swing.JButton btn_multiplicativo;
    private javax.swing.JButton btn_prueba;
    // End of variables declaration//GEN-END:variables
}
