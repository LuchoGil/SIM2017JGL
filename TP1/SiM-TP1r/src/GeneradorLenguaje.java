/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author julieta
 */
public class GeneradorLenguaje extends javax.swing.JFrame {

    private Generador g;
    JFreeChart grafico;
    JFreeChart grafico2;
    DefaultCategoryDataset datos ;
    DefaultCategoryDataset datos2;
    
    /**
     * Creates new form Principal
     */
    public GeneradorLenguaje() {
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

        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_graficar = new javax.swing.JButton();
        btn_atras = new javax.swing.JButton();
        txt_n = new javax.swing.JTextField();
        txt_i = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_chiCuadrado = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_valorEsperado = new javax.swing.JTextField();
        lbl_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("N:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jLabel11.setText("Intervalos:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Prueba de Frecuencia:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 190, 20));

        btn_graficar.setText("Graficar");
        btn_graficar.setPreferredSize(new java.awt.Dimension(75, 50));
        btn_graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_graficarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_graficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        txt_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nKeyTyped(evt);
            }
        });
        getContentPane().add(txt_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 60, -1));

        txt_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_iKeyTyped(evt);
            }
        });
        getContentPane().add(txt_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, -1));

        tbl_chiCuadrado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Intervalo", "Fre. Observada", "Fre.  Esperada", "(Fo - Fe)^2"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_chiCuadrado);
        if (tbl_chiCuadrado.getColumnModel().getColumnCount() > 0) {
            tbl_chiCuadrado.getColumnModel().getColumn(0).setResizable(false);
            tbl_chiCuadrado.getColumnModel().getColumn(1).setResizable(false);
            tbl_chiCuadrado.getColumnModel().getColumn(2).setResizable(false);
            tbl_chiCuadrado.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 430, 90));

        jLabel2.setText("Valor esperado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));
        getContentPane().add(txt_valorEsperado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 60, -1));
        getContentPane().add(lbl_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 430, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_graficarActionPerformed
        // TODO add your handling code here:
        if (!validar()) {
            g = new Generador();
            datos = new DefaultCategoryDataset();
            datos2 = new DefaultCategoryDataset();
            
            int[] vector = new int[Integer.parseInt(txt_i.getText())];
            vector = g.frecuenciaIntervalo(Integer.parseInt(txt_n.getText()), Integer.parseInt(txt_i.getText()));
            float rango = g.numIntervalo(Integer.parseInt(txt_i.getText()));
            float esperado = Float.parseFloat(txt_n.getText()) / Float.parseFloat(txt_i.getText());

            float desde = 0;
            float hasta = rango;
            for (int i = 0; i < vector.length; i++) {
                datos.addValue(vector[i], "Frecuencia", desde + "-" + hasta);
                desde = desde + rango;
                hasta = hasta + rango;
            }

            desde = 0;
            hasta = rango;
            for (int i = 0; i < vector.length; i++) {
                datos2.addValue(esperado, "Frecuencia", desde + "-" + hasta);
                desde = desde + rango;
                hasta = hasta + rango;
            }

            grafico2 = ChartFactory.createBarChart("Gráfico de Frecuencias Esperadas", "Rango", "Frecuencia Esperada", datos2, PlotOrientation.VERTICAL, true, true, false);
            grafico = ChartFactory.createBarChart("Gráfico de Frecuencias Obtenidas", "Rango", "Frecuencia Obtenida", datos, PlotOrientation.VERTICAL, true, true, false);
            ChartPanel panel = new ChartPanel(grafico);
            ChartPanel panel2 = new ChartPanel(grafico2);
            JFrame ventana = new JFrame("Gráficos de Frecuencia");
//        ventana.getContentPane().add(panel);
//        ventana.getContentPane().add(panel2);
            ventana.add(panel, BorderLayout.NORTH);
            ventana.add(panel2, BorderLayout.SOUTH);
            ventana.pack();
            ventana.setVisible(true);
            ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            
                      
            int [] diferencia=g.calculoDiferencias(vector, Integer.parseInt(txt_n.getText()),Integer.parseInt(txt_i.getText()));
            Object [][] matriz= new Object [Integer.parseInt(txt_i.getText())][4];
            for (int i = 0; i < Integer.parseInt(txt_i.getText()); i++) 
            {
                matriz[i][0]=i+1;
                matriz[i][1]=vector[i];
                matriz[i][2]=esperado;
                matriz[i][3]=diferencia[i];
            }
            
            tbl_chiCuadrado.setModel(new javax.swing.table.DefaultTableModel(matriz, new String []{"Intervalo", "Fre. Observada", "Fre. Esperada","(Fo-Fe)^2"}));
            int num= g.calculoChiCuadrado(diferencia,Integer.parseInt(txt_n.getText()),Integer.parseInt(txt_i.getText()));

            if(g.pasaPrueba(diferencia,Integer.parseInt(txt_n.getText()),Integer.parseInt(txt_i.getText()),Integer.parseInt(txt_valorEsperado.getText())))
                lbl_resultado.setText(""+num+ " es menor que "+ txt_valorEsperado.getText()+" , por lo tanto, no se rechaza la Ho");
            else
                lbl_resultado.setText(""+num+ " es mayor que "+ txt_valorEsperado.getText()+" , por lo tanto, se rechaza la Ho");
        }
    }//GEN-LAST:event_btn_graficarActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void txt_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if (a < '0' || a > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txt_nKeyTyped

    private void txt_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_iKeyTyped
        // TODO add your handling code here:
        char a = evt.getKeyChar();
        if (a < '0' || a > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_txt_iKeyTyped

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
            java.util.logging.Logger.getLogger(GeneradorLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneradorLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneradorLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneradorLenguaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneradorLenguaje().setVisible(true);
            }
        });
    }

    private boolean validar() {
        boolean ban = false;
        if (txt_n.getText().equals("") || txt_i.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar algunas constantes");
            ban = true;
        }
        if (txt_n.getText().equals("0") || txt_i.getText().equals("0")) {
            JOptionPane.showMessageDialog(null, "Las constantes deben ser enteras positivas");
            ban = true;
        }
        if (txt_valorEsperado.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe completar el valor esperado");
            ban = true;
        }
        return ban;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_atras;
    private javax.swing.JButton btn_graficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JTable tbl_chiCuadrado;
    private javax.swing.JTextField txt_i;
    private javax.swing.JTextField txt_n;
    private javax.swing.JTextField txt_valorEsperado;
    // End of variables declaration//GEN-END:variables
}
