
public class Main {
    public static void main(String[] args) {

        int x=25;
        int y=3;
        int rez;
        rez=x/y;
        System.out.println("x="+x+"\ny="+y+"\nЦелочисленное деление x/y="+rez);
        System.out.println("Остаток от деления :"+(x-rez*y));
        System.out.println("Квадратный корень из "+x+" равен "+(int) Math.sqrt(x));

    }
}