/**
 * Created by Андрей on 28.05.2016.
 */
public class Massiv {
    public static void main(String[] args) {

        //задали массив
        int[] intArray = new int[5];

        //Массив задан в диапазоне от -257 до 346
        int i;
        for (i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 347 - 257);
            System.out.println(intArray[i]);
            int min = intArray[0];
            if (min > intArray[i]){
                min = intArray[i];
                System.out.println("Минимум здесь - " + min);
            }

        }
    }
}
