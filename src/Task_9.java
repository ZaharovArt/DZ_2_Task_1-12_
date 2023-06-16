public class Task_9 {
    public static void main(String[] args){

        float n=3.56f;
        int temp;
        temp= (int) n;
        float mate;
        mate =n-temp;
        if (mate>0){
            System.out.println("Число имеет вещественную часть");
        }
        else System.out.println("Число не имеет вещественной части");
    }
}
