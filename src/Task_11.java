public class Task_11 {
    public static void main (String[] args){
        int time =361517;
        int day,hours,min,sec;

        day=time/86400;
        hours=(time%86400)/3600;
        min=(time%3600)/60;
        sec=time%60;

        System.out.println(day+" Дней "+hours+" Часов "+min+" Минут "+ sec+" Секунд");



    }
}
