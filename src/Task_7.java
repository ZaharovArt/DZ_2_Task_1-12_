public class Task_7 {
    public static void main (String[] args){
        int vklad=50000;
        float procent=0.05f;
        int period =2;
        double rez;
        rez=vklad*Math.pow((1+procent),2);
        System.out.println("Сумма вклада через 2 года равна  "+rez);
    }

}
