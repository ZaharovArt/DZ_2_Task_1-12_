public class Task_2 {
    public static void main (String[] args){
        int n=375;
        int n1,n2,n3;
        n1=n%10;
        System.out.println(n1);
        n2=(n/10)%10;
        System.out.println(n2);
        n3=n/100;
        System.out.println(n3);
        System.out.print("Сумма цифр числа "+n+" равна "+(n1+n2+n3));
    }
}
