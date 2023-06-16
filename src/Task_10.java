public class Task_10 {
    public static void main (String[] args){

        final float weight=80;
        final float height=176;
        float idealWeight=height-110;
        System.out.println("Вес: "+weight);
        System.out.println("Рост: "+height);
        System.out.println("Идеальный вес :"+idealWeight);
        if (idealWeight<weight){
            System.out.println("Необходимо сбросить :"+(weight-idealWeight)+" кг.");
        }
        else {
            System.out.println("Необходимо набрать :"+(idealWeight-weight)+" кг.");
        }
    }
}
