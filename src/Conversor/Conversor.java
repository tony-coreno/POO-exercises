package Conversor;

public class Conversor {

    private float ar;
    private float per;
    private float lado1;
    private float lado2;


    public Conversor(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

    public Conversor(float lado1, float lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }


    public float getLado1() {
        ar = 2 * (lado1 + lado2);
        return ar;
    }

    public float getLado2(){
        per = lado1 * lado2;
        return per;
    }
}
