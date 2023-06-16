public class Task_3 {
    public static void main(String[] args){
        double n=232.46;
        int whole;
        whole=(int)n;
        double fract;
        fract=n-whole;
        int rez;
        if (fract>=0.5){
            rez=whole+1;
        }
        else rez=whole;
        System.out.println("Округление числа "+n+ " равно "+rez);
    }
}
