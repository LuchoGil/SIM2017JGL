

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julieta
 */
public class Generador {

    private int a;
    private int c;
    private int m;
    private int semilla;
    private float numAleatorio;
    private ArrayList<Float> lista = new ArrayList<>();
    private NumberFormat numberFormat = NumberFormat.getInstance();

    public Generador() {
    }

    public Generador(int a, int c, int m, int s) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.semilla = s;
        System.out.println(a + "," + c + "," + m + "," + s);
    }

    public Generador(int a, int m, int s) {
        this.a = a;
        this.m = m;
        this.semilla = s;
    }

    public ArrayList <Float> logicaLineal(int n, int semilla) {
        lista.clear();
        int truncado;
        float numTruncado;
        
        while (n > 0) {
            semilla = (a * semilla + c) % m;
            numAleatorio = (float) semilla / (m - 1);
            truncado= (int)(numAleatorio*10000);
            numTruncado= (float)truncado/10000;
            lista.add(numTruncado);
            n--;
        }
        System.out.println(lista);

        return lista;
    }

    public ArrayList<Float> logicaMultiplicativo(int n, int semilla) {
        lista.clear();
        int truncado;
        float numTruncado;
        while (n > 0) {
            semilla = (a * semilla) % m;
            numAleatorio = (float) semilla / (m - 1);
            truncado= (int)(numAleatorio*10000);
            numTruncado= (float)truncado/10000;
            lista.add(numTruncado);
            n--;
        }
        System.out.println(lista);

        return lista;
    }

    public int[] frecuenciaIntervaloMixto(int n, int semilla, int i) {
        float rango = numIntervalo(i);
        int[] frecuencia = new int[i];
        ArrayList<Float> prueba = this.logicaLineal(n, semilla);

        int posicion = 0;
        int k = 0;
        int tamaño = prueba.size();
        float num = 0;
        while (tamaño > 0) {
            num = prueba.get(k);
            if (num == 1.0) {
                frecuencia[frecuencia.length - 1]++;
            } else {
                posicion = (int) (num / rango);
                frecuencia[posicion]++;
            }
            k++;
            tamaño--;

        }
        return frecuencia;
    }

    public float numIntervalo(int i) {
        float rango = (float) 1 / i;

        return rango;
    }

    public int[] frecuenciaIntervalo(int n, int i) {
        float rango = numIntervalo(i);
        float num;
        int posicion;
        int[] frecuencia = new int[i];

        while (n > 0) {
            num = (float) Math.random();
            posicion = (int) (num/rango);
            frecuencia[posicion]++;

            n--;
        }

        return frecuencia;
    }

    public int frecuenciaEsperada(int n, int i)
    {
        return n/i;
    }
    
    public int[] calculoDiferencias(int[] v, int n, int i)
    {
        int [] diferencia= new int [v.length];
        int esperada= this.frecuenciaEsperada(n, i);
        
        for (int j = 0; j < v.length; j++) 
        {
            float num=v[j];
            float resta=num-esperada;
            diferencia[j]=(int)Math.pow(resta, 2);
        }
        
        for (int j = 0; j < diferencia.length; j++) {
            System.out.println(diferencia[j]);
        }
        return diferencia;
        
    }
    
    public int calculoChiCuadrado(int[] v, int n, int i)
    {
        int acumulada=0;
        int esperada= this.frecuenciaEsperada(n, i);
        
        for (int j = 0; j < v.length; j++) 
        {   
            acumulada=acumulada+v[j];
        }
   
        int acu=acumulada/esperada;
        return acu;
    }
    public boolean pasaPrueba (int v[], int n, int i, float num)
    {
        if(this.calculoChiCuadrado(v, n, i) < num)
        {
            return true;
        }
        else
            return false;
    }
            
    public ArrayList generadorLenguaje(int n) ////////////
    {
        ArrayList numeros = new ArrayList();

        while (n > 0) {
            numeros.add(Math.random());
            n--;

        }
        return numeros;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the m
     */
    public int getM() {
        return m;
    }

    /**
     * @param m the m to set
     */
    public void setM(int m) {
        this.m = m;
    }

    /**
     * @return the semilla
     */
    public int getSemilla() {
        return semilla;
    }

    /**
     * @param semilla the semilla to set
     */
    public void setSemilla(int semilla) {
        this.semilla = semilla;
    }

    /**
     * @return the numAleatorio
     */
    public float getNumAleatorio() {
        return numAleatorio;
    }

    /**
     * @param numAleatorio the numAleatorio to set
     */
    public void setNumAleatorio(float numAleatorio) {
        this.numAleatorio = numAleatorio;
    }

    /**
     * @return the lista
     */
    public ArrayList getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

}
