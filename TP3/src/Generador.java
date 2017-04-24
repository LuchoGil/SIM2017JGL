
public class Generador {

    public Generador() {
    }

    public float uniforme(float a, float b) {
        int truncado= (int)((a + Math.random() * (b - a))*10000);
        return (float)truncado/10000;
    }

    public float exponencial(float lamda) {
        int truncado= (int) (((-1 / lamda) * Math.log(1 - Math.random()))*10000);
            return (float) truncado/10000;
    }
    
    public int poisson(float lamda){
        float p=1,u;
        float x=-1;
        float a=(float) Math.exp((-1)*lamda);
        do{
            u=(float)Math.random();
            p=p*u;
            x=x+1;
        }while(p>=a);
        return (int) x;
    }
    
    public float[] normalBM(float desv,float media){
        float rnd1 =(float) Math.random();
        float rnd2 =(float) Math.random();
        float vec[]=new float[2];
        int truncado= (int) (((Math.sqrt((-2)*Math.log(rnd1))*Math.cos(2*3.1415*rnd2))*desv+media)*10000);
        vec[0]=(float) truncado/10000;
        int truncado2= (int) (((Math.sqrt((-2)*Math.log(rnd1))*Math.sin(2*3.1415*rnd2))*desv+media)*10000);
        vec[1]=(float) truncado2/10000;
        return vec;
    }
    
    public Float normalConvolucion(float desv,float media){
        Float vec[]=new Float[12];
        vec[0]=(float) Math.random();
        for (int i = 1; i < vec.length; i++) {
            vec[i]=vec[i-1]+(float) Math.random(); //acumula
        }
        int truncado= (int)(((vec[11]-6)*desv+media)*10000);//en vec[11] tengo la sumatoria
        return (float) truncado/10000; 
    }
}
