public class Task_11 {
    public static void main (String[] args){
        int time =583960;
        int day,hours,min,sec;

        day=time/86400;
        hours=time/3600;
        min=(time%3600)/60;
        sec=time%60;

        System.out.println(hours+" "+min+" "+ sec);



    }
}
