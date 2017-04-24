
import java.util.ArrayList;


public class VentanaPrueba extends javax.swing.JFrame {

    private Gestor gestor;
    private int orden;
    private int cantNum;
    private int intervalos;
    private float rango;
    private int [] fo;
    private float lambda;
    private float media;
    private int lamdaP;
    private float desviacion;
    private ArrayList<Float> lista;
    private Object [][] matriz;
    private Object [][] matrizP;
    private ArrayList <Integer> listaP;
    
    public void setGestor (Gestor g)
    {
        gestor=g;
    }
    public void setLista(ArrayList <Float> l)
    {
        lista=l;
    }
    public void setListaP(ArrayList <Integer> l)
    {
        listaP=l;
    }
    public void setCantNum(int c)
    {
        cantNum=c;
    }
    public void setIntervalos (int i)
    {
        intervalos=i;
    }
    public void setVector (int[] v)
    {
        fo=v;
    }
    public void setOrden(int o)
    {
        orden=o;
    }
    public void setLambda(float l)
    {
        lambda=l;
    }
    public void setLamdaP(int l)
    {
        lamdaP=l;
    }
    public void setMedia(float m)
    {
        media=m;
    }
    public void setDesviacion(float d)
    {
        desviacion=d;
    }
    public void setRango(float r)
    {
        rango=r;
    }

    public void setMatriz() {
        this.matriz = gestor.CalcularResultadoDistribuciones(lista,rango,intervalos, fo, cantNum,lambda,media,lamdaP,desviacion,orden);
        jLayeredPane1.setVisible(true);
    }
    public void setMatrizP(){
        this.matrizP= gestor.CalcularResultadoDistribuciones(listaP,rango,intervalos, fo, cantNum,lambda,media,lamdaP,desviacion,orden);
        jLayeredPane2.setVisible(true);
    }
    
    
    public VentanaPrueba() {
        initComponents();
        jLayeredPane2.setVisible(false);
        jLayeredPane1.setVisible(false);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_prueba = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_pruebaChi = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_pruebaChi2 = new javax.swing.JTable();

        setMinimumSize(new java.awt.Dimension(600, 400));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_prueba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Intervalo", "Fo", "Fe", "Po()", "Pe()", "PoAc()", "PeAc()", "|PoAc - PeAc|"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_prueba);

        jLayeredPane1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 640, 360));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_pruebaChi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Intervalo", "Fo", "Fe", "c", "c(acu)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbl_pruebaChi);

        jLayeredPane2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 690, 160));

        tbl_pruebaChi2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Intervalo", "fo", "P()", "fe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_pruebaChi2);

        jLayeredPane2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 510, 160));

        getContentPane().add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void cargarTabla(){

   
        tbl_prueba.setModel(new javax.swing.table.DefaultTableModel(matriz, new String []{"Intervalo", "Fo", "Fe","Po()","Pe()","PoAc()","PeAc()","|PoAc - PeAc|"}));
      
    }
    public void cargarTablaChi(){
   
        tbl_pruebaChi2.setModel(new javax.swing.table.DefaultTableModel(matrizP, new String []{"Intervalo", "Fo", "P","Fe"}));
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
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrueba().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_prueba;
    private javax.swing.JTable tbl_pruebaChi;
    private javax.swing.JTable tbl_pruebaChi2;
    // End of variables declaration//GEN-END:variables
}
