/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julieta
 */
public class Gestor {

    private int demanda;
    private int demora;
    private String ordenPedida;
    private int orden;
    private boolean pedido;
    private int llegadaPedido;
    private int costoTotal;
    private int costoAcumulado;
    private int stock;
    private int ko;
    private int km;
    private int ks;
    private int semana;
    private double random;
    private double random1;

    public Gestor() {
    }

    public Object[][] simulacion(int cantSimulaciones, int p, int desde) {
        semana = 0;
        pedido = false; //hay pedido en espera
        stock = 15;
        costoTotal = 0;
        costoAcumulado = 0;
        llegadaPedido = 0;
        ordenPedida = "NO";
        orden=0;
        random = 100;
        random1 = 100;
        ko = 0;
        km = 0;
        ks = 0;
        int hasta = desde+50;
        int j=0;
        Object matriz[][] = new Object[50][13];

        for (int i = 1; i <= cantSimulaciones; i++) {
            ko = 0;
            km = 0;
            ks = 0;
            semana = i;

            double numero = Math.random();
            int trun = (int) (numero * 100);
            random = (double) ((double) (trun) / 100);
            demanda = this.demanda(random);

            if (semana == llegadaPedido) {
                stock = stock + 15;
                llegadaPedido = 0;
                pedido=false;
                orden=0;
//                ordenPedida="NO";
            }
            
            stock = stock - demanda;
            
            if (stock <= p) {
                if (pedido != true) {
                    pedido = true;
                    double numero1 = Math.random();
                    double trun1 = (int) (numero1 * 100);
                    random1 = (double) ((double) trun1 / 100);
                    demora = this.demora(random1);
//                    ordenPedida = "SI";
                    orden=semana;
                    llegadaPedido = semana + demora;
                    ko = 50;
                } else {
                    random1 = 100;
//                    ordenPedida = "NO";
                }
            }else
            {
                pedido=false;
                random1=100;
//                ordenPedida="NO";
                orden=0;
            }
            if (stock > 0) {
                    km = stock * 5;
                } else {
                    stock = Math.abs(stock);
                    ks = stock * 8;
                    stock = 0;
                }

            costoTotal = ko + km + ks;
            costoAcumulado = costoAcumulado + costoTotal;
            if (i >= desde && i < hasta) {
                
                matriz[j][0] = semana;
                if (random == 100) {
                    matriz[j][1] = "-";
                } else {
                    matriz[j][1] = random;
                }
                matriz[j][2] = demanda;
                if (random1 == 100) {
                    matriz[j][3] = "-";
                    matriz[j][4] = "-";
                } else {
                    matriz[j][3] = random1;
                    matriz[j][4] = demora;
                }
                if(orden==0)
                {
                    matriz[j][5] = "-";
                }
                else
                {
                    matriz[j][5] = orden;
                }
                
                if (llegadaPedido != 0) {
                    matriz[j][6] = llegadaPedido;
                } else {
                    matriz[j][6] = "-";
                }
                matriz[j][7] = stock;

                matriz[j][8] = ko;

                matriz[j][9] = ks;
                matriz[j][10] = km;
                matriz[j][11] = costoTotal;
                matriz[j][12] = costoAcumulado;
                j++;
            }
        }
        return matriz;
    }

    private int demanda(double random) {

        int d = 0;

        if (random >= 0.00 && random <= 0.05) {
            d = 3;
        }
        if (random >= 0.06 && random <= 0.18) {
            d = 4;
        }
        if (random >= 0.19 && random <= 0.39) {
            d = 5;
        }
        if (random >= 0.40 && random <= 0.66) {
            d = 6;
        }
        if (random >= 0.67 && random <= 0.99) {
            d = 7;
        }

        return d;
    }

    private int demora(double random) {

        int d = 0;

        if (random >= 0.00 && random <= 0.42) {
            d = 1;
        }
        if (random >= 0.43 && random <= 0.74) {
            d = 2;
        }
        if (random >= 0.75 && random <= 0.99) {
            d = 3;
        }

        return d;
    }
    
    public double costoSemanalPromedio ()
    {
//        double numero=(double)costoAcumulado/semana;
//        int trun=(int)numero*100;
//        double promedio=(double)((double)trun/100);
//        System.out.println(promedio);
        return (double)costoAcumulado/semana;
    }
}
