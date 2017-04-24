
public class Prueba1 {

    public Prueba1() {
    }

    public float[] calcularMarcaClase(float[] desde, float[] hasta) {
        float[] marca = new float[desde.length];

        for (int i = 0; i < marca.length; i++) {
            marca[i] = (desde[i] + hasta[i]) / 2;
        }
        return marca;
    }

    public float[] expoCalcularProConMC(float[] desde, float[] hasta, float lambda) {
        float[] marca = this.calcularMarcaClase(desde, hasta);
        float[] proConMC = new float[marca.length];

        for (int i = 0; i < marca.length; i++) {
            proConMC[i] = lambda * (float) Math.exp(-lambda * marca[i]) * (hasta[i] - desde[i]);
        }
        return proConMC;
    }

    public float[] expoCalcularProConPac(float[] desde, float[] hasta, float lambda) {
        float[] proConPac = new float[desde.length];
        for (int i = 0; i < desde.length; i++) {
            proConPac[i] = (1 - (float) Math.exp(-lambda * hasta[i])) - (1 - (float) Math.exp(-lambda * desde[i]));
        }
        return proConPac;
    }

    public float[] normalCalcularProConMC(float[] desde, float[] hasta, float media, float desviacion) {
        float [] marca= this.calcularMarcaClase(desde, hasta);
        float [] proConMC=new float [marca.length];
        float numerador;
        float denominador;
        float exponente;
        float cuadradoExponente;
        
        System.out.println("ProConMC");
        for (int i = 0; i < marca.length; i++) 
        {
//            float exp=(float)Math.exp((-0.5)*(float)Math.pow((float)(marca[i]-media)/desviacion),2);
            exponente= (float)((marca[i]-media)/desviacion);
            System.out.println("e"+exponente);
            cuadradoExponente=(float)Math.pow(exponente, 2)*(float)(-0.5);
            System.out.println("c"+cuadradoExponente);
            numerador=(float)Math.pow((float)Math.E, cuadradoExponente);
            System.out.println("n"+numerador);
            denominador=desviacion*(float)Math.pow(2*(float)Math.PI,0.5);
            System.out.println("d"+denominador);
            proConMC[i]=(float)numerador/denominador;
            System.out.println("P"+proConMC[i]);
        }
        return proConMC;
    }

    public float[] normalCalcularPro(float media, float desviacion, float[] desde, float[] hasta) {
        float[] proConMC = this.normalCalcularProConMC(desde, hasta, media, desviacion);
        float[] pro = new float[proConMC.length];
        for (int i = 0; i < proConMC.length; i++) {
            pro[i] = (float)proConMC[i] * (hasta[i] - desde[i]);
        }
        return pro;
    }

    //orden
    //1 uniforme
    //2 exponencial
    //3 normal
    //4 poisson
    public float[] calcularFeDistribucion(float[] desde, float[] hasta, float lambda, float media, float desviacion, int cantNum, int orden) {
        float[] pro = new float[desde.length];
        if (orden == 2) {
            pro = this.expoCalcularProConPac(desde, hasta, lambda);
        }
        if (orden == 3) {
            pro = this.normalCalcularPro(media, desviacion, desde, hasta);
        }
        float[] fe = new float[pro.length];
        for (int i = 0; i < pro.length; i++) {
            fe[i] = pro[i] * cantNum;
        }
        return fe;
    }

    public float[] calcularFeUniforme(int cantNum, int i) {
        float[] fe = new float[i];
        for (int j = 0; j < fe.length; j++) {
            fe[j] = (float) cantNum / i;
        }
        return fe;
    }

    public float[] calcularPo(int[] fo, int cantNum) {
        float[] po = new float[fo.length];

        for (int i = 0; i < fo.length; i++) {
            System.out.println(fo[i]);
            System.out.println(cantNum);
            po[i] = (float) (fo[i]) / (float) (cantNum);
        }
        return po;
    }

    public float[] calcularPe(float[] fe, int cantNum) {
        float[] pe = new float[fe.length];
        for (int i = 0; i < fe.length; i++) {
            pe[i] = fe[i] / cantNum;
        }
        return pe;
    }

    public float[] calcularPoAc(int[] fo, int cantNum) {
        float[] po = this.calcularPo(fo, cantNum);
        float[] poAc = new float[po.length];

        poAc[0] = po[0];
        for (int i = 1; i < po.length; i++) {
            poAc[i] = poAc[i - 1] + po[i];
        }

        return poAc;
    }

    public float[] calcularPeAc(float[] fe, int cantNum) {
        float[] pe = this.calcularPe(fe, cantNum);
        float[] peAc = new float[pe.length];

        peAc[0] = pe[0];
        for (int i = 1; i < pe.length; i++) {
            peAc[i] = peAc[i - 1] + pe[i];
        }

        return peAc;
    }

    public float[] calcularDiferenciaProbabilidades(int[] fo, float[] fe, int cantNum) {
        float[] poAc = this.calcularPoAc(fo, cantNum);
        float[] peAc = this.calcularPeAc(fe, cantNum);
        float[] diferencia = new float[poAc.length];

        for (int i = 0; i < peAc.length; i++) {
            diferencia[i] = Math.abs((poAc[i] - peAc[i]));
        }
        return diferencia;
    }

    public Object[][] cargarMatrizUni(int i, int[] fo, int cantNum) {
        Object[][] resultado = new Object[i][8];
        float[] fe = this.calcularFeUniforme(cantNum, i);
        float[] po = this.calcularPo(fo, cantNum);
        float[] pe = this.calcularPe(fe, cantNum);
        float[] poAc = this.calcularPoAc(fo, cantNum);
        float[] peAc = this.calcularPeAc(fe, cantNum);
        float[] diferencia = this.calcularDiferenciaProbabilidades(fo, fe, cantNum);

        for (int j = 0; j < i; j++) {
            resultado[j][0] = j + 1;
            resultado[j][1] = fo[j];
            resultado[j][2] = fe[j];
            resultado[j][3] = po[j];
            resultado[j][4] = pe[j];
            resultado[j][5] = poAc[j];
            resultado[j][6] = peAc[j];
            resultado[j][7] = diferencia[j];
        }
        return resultado;
    }

    public Object[][] cargarMatrizDistribuciones(float[] desde, float[] hasta, int i, int[] fo, int cantNum, float media, float desviacion, float lambda, int orden) {
        Object[][] resultado = new Object[i][8];
        float[] fe = this.calcularFeDistribucion(desde, hasta, lambda, media, desviacion, cantNum, orden);
        float[] po = this.calcularPo(fo, cantNum);
        float[] pe = this.calcularPe(fe, cantNum);
        float[] poAc = this.calcularPoAc(fo, cantNum);
        float[] peAc = this.calcularPeAc(fe, cantNum);
        float[] diferencia = this.calcularDiferenciaProbabilidades(fo, fe, cantNum);

        for (int j = 0; j < i; j++) {
            resultado[j][0] = j + 1;
            resultado[j][1] = fo[j];
            resultado[j][2] = fe[j];
            resultado[j][3] = po[j];
            resultado[j][4] = pe[j];
            resultado[j][5] = poAc[j];
            resultado[j][6] = peAc[j];
            resultado[j][7] = diferencia[j];
        }
        return resultado;
    }

    public Object[][] cargarMatrizP(int[] desde, int[] hasta, int[] vecFrecuencia, int n, int lambda, int inter) {
        Object[][] res = new Object[inter][4];
        float[] p = this.poissonCalcularPro(desde, hasta, lambda);
        int[] fe = this.calcularFe(n, p, lambda);
        for (int j = 0; j < inter; j++) {
            res[j][0] = j + 1;
            res[j][1] = vecFrecuencia[j];
            res[j][2] = p[j];
            res[j][3] = fe[j];
        }
        return res;

    }

    private int[] calcularFe(int n, float[] p, int lambda) {
        int[] fe = new int[p.length];
        for (int i = 0; i < fe.length; i++) {
            fe[i] = (int) (n * p[i]);
        }
        return fe;

    }

    private int factorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }

    }

    private Object[] calcularC(int[] fe, int[] fo) {
        float[] c = new float[fe.length];
        float[] cAc = new float[fe.length];
        cAc[0] = c[0] = (float) Math.pow(fe[0] - fo[0], 2) / fe[0];
        Object[] vectores = new Object[2];

        for (int i = 1; i < c.length; i++) {
            c[i] = (float) Math.pow(fe[i] - fo[i], 2) / fe[i];
            cAc[i] = cAc[i - 1] + (float) Math.pow(fe[i] - fo[i], 2) / fe[i];
        }
        vectores[0] = c;
        vectores[1] = cAc;
        return vectores;
    }

    public float[] poissonCalcularPro(int[] desde, int[] hasta, int lambda) {

        float[] p = new float[desde.length];
        float exp;
        float expo;
        float expo1;
        float termino1;
        float termino2;
        exp=(float)Math.pow((float)Math.E,(-lambda));
            exp=exp*10000;
            float expTrun=(float)exp/10000;
        for (int i = 0; i < p.length; i++) 
        {
            System.out.println("desde"+desde[i]);
            System.out.println("hasta"+hasta[i]);
            
            System.out.println("e"+expTrun);
            expo=(float)Math.pow(lambda,desde[i])*expTrun;
            expo=expo*10000;
            float expoTrun=(float)expo/10000;
            System.out.println("expo"+expoTrun);
            expo1=(float)Math.pow(lambda,hasta[i])*expTrun;
            expo1=expo1*10000;
            float expo1Trun=(float)expo1/10000;
            System.out.println("expo1"+expo1Trun);
            termino1=(float)expoTrun/factorial(desde[i]);
            System.out.println("termino1"+termino1);
            termino2=(float)expo1Trun/factorial(hasta[i]);
            System.out.println("termino2"+termino2);
            
//            p[i] = (float) ((Math.pow(lambda, (int) desde[i]) * Math.exp(-lambda)) / (factorial( desde[i]) )+ (Math.pow(lambda, hasta[i]) * Math.exp(-lambda)) / (factorial(hasta[i])));
            p[i]=(float)termino1+termino2;
        }
        
        return p;
    }

}
