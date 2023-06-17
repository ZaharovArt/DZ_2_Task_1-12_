import java.util.Scanner;

public class Task_12 {
    public static void main (String[] args){

        int n=100;
        System.out.println("Введите процент школьников с весом менее 30 кг.");
        Scanner scanner =new Scanner(System.in);

        int percent = scanner.nextInt();

        float moloko;

        moloko =n*percent/100*0.2f;
        float tempMol;
        tempMol=moloko/0.9f;
        int temp=(int)tempMol;
        float tempPac;
        tempPac=tempMol-temp;
        if (tempPac>0){
            temp+=1;
        }
        int pirogok=n*percent/100;

        System.out.println("при "+percent+ "% Молока -"+temp+" пакетов, Пирожков -"+ pirogok+" шт.");
    }
}
