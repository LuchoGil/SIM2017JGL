
import java.util.ArrayList;

public class Gestor {

    private Generador g;
    private Prueba1 p;

    public Gestor() {
        g = new Generador();
        p = new Prueba1();
    }

    public Object[][] CalcularResultadoDistribuciones(ArrayList lista, float rango, int i, int[] fo, int cantNum, float lambda, float media,int lamdaP, float desviacion, int orden) {
        Object[][] resultado = null;

        if (orden == 1) {
            resultado = p.cargarMatrizUni(i, fo, cantNum);
        }
        if (orden == 2 || orden == 3) {
            float[] desde = this.desde(lista, rango, i);
            float[] hasta = this.hasta(lista, rango, i);

            resultado = p.cargarMatrizDistribuciones(desde, hasta, i, fo, cantNum, media, desviacion, lambda, orden);
        }
        if(orden==4){
             int[] desde = this.desdeP(lista, (int)rango, i);
            int[] hasta = this.hastaP(lista, (int)rango, i);
            resultado=p.cargarMatrizP(desde,hasta,fo, cantNum,lamdaP, i);
            
        }

        return resultado;
    }

    public float[] desde(ArrayList<Float> lista, float rango, int intervalos) {
        int tamaño = lista.size();
        float min = this.minContinuo(lista);
        float[] desde = new float[intervalos];
        for (int i = 0; i < desde.length; i++) {
            desde[i] = min;
            min = min + rango;
        }
        return desde;
    }
        public int[] desdeP(ArrayList<Integer> lista, int rango, int intervalos) {
        int tamaño = lista.size();
        int min = this.numMin(rango, lista);
        int[] desde = new int[intervalos];
        for (int i = 0; i < desde.length; i++) {
            desde[i] = min;
            min = min + rango;
        }
        return desde;
    }

    public float[] hasta(ArrayList<Float> lista, float rango, int intervalos) {
        int tamaño = lista.size();
        float min = this.minContinuo(lista)+rango;
        float[] desde = new float[intervalos];
        for (int i = 0; i < desde.length; i++) {
            desde[i] = min;
            min = min + rango;
        }
        return desde;
    }
     public int[] hastaP(ArrayList<Integer> lista, int rango, int intervalos) {
        int tamaño = lista.size();
        int min = this.numMin(rango, lista)+rango;
        int[] hasta = new int[intervalos];
        for (int i = 0; i < hasta.length; i++) {
            hasta[i] = min;
            min = min + rango;
        }
        return hasta;
    }

    public ArrayList<Float> generarUniforme(int muestra, float a, float b) {
        ArrayList<Float> lista = new ArrayList<Float>();
        for (int i = 0; i < muestra; i++) {
            lista.add(g.uniforme(a, b));
        }
        return lista;
    }

    public ArrayList<Float> generarExponencial(int muestra, float lamda) {
        ArrayList lista = new ArrayList<Float>();
        for (int i = 0; i < muestra; i++) {
            lista.add((Float) g.exponencial(lamda));
        }
        return lista;
    }

    public ArrayList<Integer> generarPoisson(int muestra, float lamda) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < muestra; i++) {
            lista.add((Integer) g.poisson(lamda));
        }
        return lista;
    }

    public ArrayList<Float> generarNormal(int muestra, float desv, float media) {
        ArrayList<Float> lista = new ArrayList<Float>();
        if (muestra == 12) {
            lista.add(g.normalConvolucion(desv, media));
        } else {
            if (muestra % 2 == 0) {
                for (int i = 0; i < muestra / 2; i++) {
                    float v[] = g.normalBM(desv, media);
                    lista.add((Float) v[0]);
                    lista.add((Float) v[1]);
                }
            } else {
                for (int i = 0; i < muestra / 2+1; i++) {
                    float v[] = g.normalBM(desv, media);
                    lista.add((Float) v[0]);
                    if (i != muestra / 2) {
                        lista.add((Float) v[1]);
                    }

                }
            }
        }
        return lista;
    }

    public int[] frecuenciaIntervaloU(float a, float rango, int i, ArrayList lista) {
        int frecuencia[] = new int[i];
        float desde = a;
        float hasta = a + rango;
        int tamaño = lista.size();
        float num = 0;
        int k = 0;
        int posicion = 0;

        while (tamaño > 0) {
            num = (float) lista.get(k);
            if (num > desde && num < hasta) {
                frecuencia[posicion]++;
                k++;
                tamaño--;
                posicion = 0;
                desde = a;
                hasta = a + rango;
            } else {
                desde = hasta;
                hasta = hasta + rango;
                posicion++;
            }
        }
        return frecuencia;
    }

    public int[] frecuenciaIntervaloE(float rango, int i, ArrayList lista) {
        int frecuencia[] = new int[i];
        float desde = this.minContinuo(lista);
        float hasta = this.minContinuo(lista) + rango;
        int tamaño = lista.size();
        float num = 0;
        int k = 0;
        int posicion = 0;

        while (tamaño > 0) {
            num = (float) lista.get(k);
            if (num >= desde && num < hasta) {
                frecuencia[posicion]++;
                k++;
                tamaño--;
                posicion = 0;
                desde = this.minContinuo(lista);
                hasta = this.minContinuo(lista) + rango;
            } else {
                desde = hasta;
                hasta = hasta + rango;
                posicion++;
            }
        }
        return frecuencia;
    }
    public int[] frecuenciaIntervaloP(int rango, int i, ArrayList lista) {
        int min = this.numMin(rango, lista);
        int[] frecuencia = new int[i];

        int desde = min;
        int hasta = min + rango;
        int tamaño = lista.size();
        int num = 0;
        int k = 0;
        int posicion = 0;

        while (tamaño > 0) {
            num = (int) lista.get(k);

            if (num >= desde && num < hasta) {
                frecuencia[posicion]++;
                k++;
                tamaño--;
                posicion = 0;
                desde = min;
                hasta = min + rango;
            } else {
                desde = hasta;
                hasta = hasta + rango;
                if(posicion<(i-1))
                    posicion++;
            }
        }
        return frecuencia;

    }

    public int[] frecuenciaIntervaloN(float min, float rango, int i, ArrayList lista) {
        int frecuencia[] = new int[i];
        float desde = min;
        float hasta = min + rango;
        int tamaño = lista.size();
        float num = 0;
        int k = 0;
        int posicion = 0;
        while (tamaño > 0) {
            num = (float) lista.get(k);
            if (num >= desde && num < hasta) {

                frecuencia[posicion]++;
                k++;
                tamaño--;
                posicion = 0;
                desde = min;
                hasta = min + rango;
            } else {

                desde = hasta;
                hasta = hasta + rango;
                if (posicion < i) {
                    posicion++;
                }

            }
        }
        return frecuencia;
    }

    public float numIntervaloU(float a, float b, int i) {
        return (b - a) / i;

    }

    public float numIntervaloE(int i, ArrayList<Float> lista) {
        Float max = lista.get(0);
        Float min = lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(max) >= 0) {
                max = lista.get(j);
            }
            if (lista.get(j).compareTo(min) <= 0) {
                min = lista.get(j);
            }

        }
        return (((max + 1) - min) / i);
    }

    public int numMin(int rango, ArrayList lista) {
        Integer min = this.minDiscreto(lista);
        if (rango == 1) {
            min = min - 1;
        }
        if (rango % 2 == 0) {
            int mitad = rango / 2;
            min = min - mitad;
        } else {
            int division = (int) (rango / 2);
            int diferencia = rango - division;
            min = min - (int) (rango / 2);
        }
        if (min < 0) {
            min = 0;
        }
        return min;
    }

    public int numIntervaloP(int i, ArrayList<Integer> lista) {
        Integer max = lista.get(0);
        Integer min = lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(max) >= 0) {
                max = lista.get(j);
            }
            if (lista.get(j).compareTo(min) <= 0) {
                min = lista.get(j);
            }
        }
        int resultado = (int) (((max + 1) - min) / i);
        resultado = resultado + 1;
        return resultado;

    }

    public float numIntervaloN(int inter, ArrayList<Float> lista) {
        Float max = lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(max) >= 0) {
                max = lista.get(j);
            }
        }
        Float min = lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(min) <= 0) {
                min = lista.get(j);
            }
        }
        return ((max + 1) - min) / inter;
    }

    public int minDiscreto(ArrayList<Integer> lista) {
        Integer min = lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(min) <= 0) {
                min = lista.get(j);
            }
        }
        return min;
    }

    public int max(ArrayList<Integer> lista) {
        Integer max = lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(max) >= 0) {
                max = lista.get(j);
            }
        }
        return max;
    }

    public float minContinuo(ArrayList<Float> lista) {
        Float min = (float) lista.get(0);
        for (int j = 1; j < lista.size(); j++) {
            if (lista.get(j).compareTo(min) <= 0) {
                min = (float) lista.get(j);
            }
        }
        return min;

    }

}
