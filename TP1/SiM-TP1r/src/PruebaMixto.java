
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.*;
import org.jfree.data.category.DefaultCategoryDataset;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julieta
 */
public class PruebaMixto extends javax.swing.JFrame {

    private Generador g;
    JFreeChart grafico;
    JFreeChart grafico2;
    DefaultCategoryDataset datos;
    DefaultCategoryDataset datos2;
    /**
     * Creates new form PruebaMixto
     */
    public PruebaMixto() {
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

        btn_atras = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_graficar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_a = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();
        txt_m = new javax.swing.JTextField();
        txt_x = new javax.swing.JTextField();
        txt_n = new javax.swing.JTextField();
        txt_i = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_g = new javax.swing.JTextField();
        txt_k = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_chiCuadrado = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txt_valorEsperado = new javax.swing.JTextField();
        lbl_resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_atras.setText("Atrás");
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel11.setText("Intervalos:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setText("Prueba de Frecuencia:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, -1));

        btn_graficar.setText("Graficar");
        btn_graficar.setPreferredSize(new java.awt.Dimension(75, 50));
        btn_graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_graficarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_graficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel10.setText("N:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel2.setText("a:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel7.setText("x:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setText("m:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel4.setText("c:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        txt_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_aFocusLost(evt);
            }
        });
        txt_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_aActionPerformed(evt);
            }
        });
        txt_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_aKeyTyped(evt);
            }
        });
        getContentPane().add(txt_a, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 30, -1));

        txt_c.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cKeyTyped(evt);
            }
        });
        getContentPane().add(txt_c, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 30, -1));

        txt_m.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_mFocusLost(evt);
            }
        });
        txt_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_mKeyTyped(evt);
            }
        });
        getContentPane().add(txt_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 30, -1));

        txt_x.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_xKeyTyped(evt);
            }
        });
        getContentPane().add(txt_x, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 30, -1));

        txt_n.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nKeyTyped(evt);
            }
        });
        getContentPane().add(txt_n, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 60, -1));

        txt_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_iKeyTyped(evt);
            }
        });
        getContentPane().add(txt_i, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 60, -1));

        jLabel6.setText("g:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel8.setText("k:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        txt_g.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_gFocusLost(evt);
            }
        });
        txt_g.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_gActionPerformed(evt);
            }
        });
        txt_g.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_gKeyTyped(evt);
            }
        });
        getContentPane().add(txt_g, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 30, -1));

        txt_k.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_kFocusLost(evt);
            }
        });
        txt_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kActionPerformed(evt);
            }
        });
        txt_k.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_kKeyTyped(evt);
            }
        });
        getContentPane().add(txt_k, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 30, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 430, 90));

        jLabel3.setText("Valor esperado:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, -1, -1));
        getContentPane().add(txt_valorEsperado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 60, -1));
        getContentPane().add(lbl_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 430, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
        Main m= new Main();
        m.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void btn_graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_graficarActionPerformed
        // TODO add your handling code here:
        if(!validar()){
        g=new Generador();
        datos = new DefaultCategoryDataset();
        datos2 = new DefaultCategoryDataset();
        int[]vector=new int [Integer.parseInt(txt_i.getText())];
        g.setA(Integer.parseInt(txt_a.getText()));
        g.setC(Integer.parseInt(txt_c.getText()));
        g.setM(Integer.parseInt(txt_m.getText()));
        g.setSemilla(Integer.parseInt(txt_x.getText()));
        vector=g.frecuenciaIntervaloMixto(Integer.parseInt(txt_n.getText()),Integer.parseInt(txt_x.getText()),Integer.parseInt(txt_i.getText()));
        float rango=g.numIntervalo(Integer.parseInt(txt_i.getText()));
        int esperado=Integer.parseInt(txt_n.getText())/Integer.parseInt(txt_i.getText());
        
        
        float desde=0;
        float hasta=rango;
        for (int i = 0; i < vector.length; i++) 
        {
            datos.addValue(vector[i],"Frecuencia",desde+"-"+hasta);
            desde=desde+rango;
            hasta=hasta+rango;
        }
        
        desde=0;
        hasta=rango;
        for (int i = 0; i < vector.length; i++) {
            datos2.addValue(esperado,"Frecuencia",desde+"-"+hasta);
            desde=desde+rango;
            hasta=hasta+rango;
        }
        
        grafico2 = ChartFactory.createBarChart("Gráfico de Frecuencias Esperadas", "Rango", "Frecuencia Esperada", datos2, PlotOrientation.VERTICAL, true, true, false);
            grafico = ChartFactory.createBarChart("Gráfico de Frecuencias Obtenidas", "Rango", "Frecuencia Obtenida", datos, PlotOrientation.VERTICAL, true, true, false);
        ChartPanel panel=new ChartPanel(grafico);
        ChartPanel panel2=new ChartPanel(grafico2);
        JFrame ventana= new JFrame ("Gráficos de Frecuencias");
//        ventana.getContentPane().add(panel);
//        ventana.getContentPane().add(panel2);
        ventana.add(panel,BorderLayout.NORTH);
        ventana.add(panel2,BorderLayout.SOUTH);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
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

    private void txt_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_aActionPerformed

    private void txt_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_aKeyTyped
        // TODO add your handling code here:
         char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_aKeyTyped

    private void txt_cKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cKeyTyped
        // TODO add your handling code here:
         char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_cKeyTyped

    private void txt_mKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_mKeyTyped
        // TODO add your handling code here:
        txt_g.setEnabled(false);
    }//GEN-LAST:event_txt_mKeyTyped

    private void txt_xKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_xKeyTyped
        // TODO add your handling code here:
         char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_xKeyTyped

    private void txt_nKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nKeyTyped
        // TODO add your handling code here:
         char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_nKeyTyped

    private void txt_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_iKeyTyped
        // TODO add your handling code here:
         char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }
    }//GEN-LAST:event_txt_iKeyTyped
  

    private void txt_gFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_gFocusLost
        // TODO add your handling code here:
        if(!txt_g.getText().equals(""))
        {
            int exponente=Integer.parseInt(txt_g.getText());
            int numero=(int)Math.pow(2,exponente);
            String a=Integer.toString(numero);
            txt_m.setText(a);
        }

    }//GEN-LAST:event_txt_gFocusLost

    private void txt_gActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_gActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_gActionPerformed

    private void txt_gKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_gKeyTyped

        char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_gKeyTyped

    private void txt_kFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_kFocusLost
        // TODO add your handling code here:
        if(!txt_k.getText().equals(""))
        {
            int numero=(1 + 4*(Integer.parseInt(txt_k.getText())));
            String a=Integer.toString(numero);
            txt_a.setText(a);
        }
    }//GEN-LAST:event_txt_kFocusLost

    private void txt_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kActionPerformed
  
    private void txt_kKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_kKeyTyped

        char a= evt.getKeyChar();
        if(a < '0' || a >'9'){
            evt.consume();
        }// TODO add your handling code here:
    }//GEN-LAST:event_txt_kKeyTyped

    private void txt_mFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_mFocusLost
        // TODO add your handling code here:
         if (!txt_m.getText().equals("")) {
            txt_g.setText("");
            txt_g.setEnabled(false);
        } else {
            txt_g.setText("");
            txt_g.setEnabled(true);
        }
    }//GEN-LAST:event_txt_mFocusLost

    private void txt_aFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_aFocusLost
        // TODO add your handling code here:
         if(!txt_a.getText().equals(""))
         {
             txt_k.setText("");
             txt_k.setEnabled(false);
         }
         else
         {
             txt_k.setText("");
             txt_k.setEnabled(true);
         }
    }//GEN-LAST:event_txt_aFocusLost

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
            java.util.logging.Logger.getLogger(PruebaMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PruebaMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PruebaMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PruebaMixto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PruebaMixto().setVisible(true);
            }
        });
    }
    private boolean validar() {
        boolean ban=false;
        if (txt_a.getText().equals("") || txt_x.getText().equals("") || txt_c.getText().equals("") || txt_m.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Debe completar algunas constantes");
            ban=true;
        }
        if(txt_a.getText().equals("0")||txt_x.getText().equals("0")||txt_m.getText().equals("0")||txt_c.getText().equals("0")||txt_k.getText().equals("0")||txt_g.getText().equals("0"))
        {
            JOptionPane.showMessageDialog(null,"Las constantes deben ser enteras positivas");
            ban=true;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_resultado;
    private javax.swing.JTable tbl_chiCuadrado;
    private javax.swing.JTextField txt_a;
    private javax.swing.JTextField txt_c;
    private javax.swing.JTextField txt_g;
    private javax.swing.JTextField txt_i;
    private javax.swing.JTextField txt_k;
    private javax.swing.JTextField txt_m;
    private javax.swing.JTextField txt_n;
    private javax.swing.JTextField txt_valorEsperado;
    private javax.swing.JTextField txt_x;
    // End of variables declaration//GEN-END:variables
}