
import java.time.LocalDate;
import java.util.Arrays;

import static java.lang.Math.round;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        printLeapYear(2009);
        detectedVersionApp(1, 2023);
        printDaysToDelivery(102);
        //
        int[] array = {3, 2, 1, 6, 5};
        reverseArray(array);
        checkDouble("abcdefghijjkk");

        int[] array1 = generateRandomArray(30, 100_000, 200_000);
        averageWestInMonth(array1);
    }

    public static void printLeapYear(int year){
        boolean isLeapYear =
                (year >= 1584) &&
                        (year % 4 == 0) &&
                        (year % 100 != 0) ||
                        (year % 400 == 0);

        if (isLeapYear) {
            System.out.println( year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
    }

    public static void detectedVersionApp(int clientOS, int deviceYear){
        final int iOS = 0;
        final int Android = 1;

        //default parametr
        final int currentDate = LocalDate.now().getYear();

        boolean needLightVersion = deviceYear < currentDate;

        if (clientOS == iOS && !needLightVersion) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == Android && !needLightVersion) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == iOS && needLightVersion) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == Android && needLightVersion) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    };

    public static void printDaysToDelivery(int distance){
        byte deliveryDays = 1;
        if(distance <=20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (distance > 20 && distance <=60 ) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (distance > 60 && distance < 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }


    }

    // hard task
    //task 4
    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            final int left = array[i];
            final int right = array[array.length - 1 - i];
            array[i] = right;
            array[array.length - 1 - i] = left;
        }
        System.out.println(Arrays.toString(array));
    }
    
    //task 5 
    public static void checkDouble(String a){
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i+1)){
                System.out.printf("У строки есть дубль. Задублированное значение: %s\n", a.charAt(i));
                return;
            }
        }
    }

    // task 6
    public static int[] generateRandomArray(int sizeOfArray, int minValue, int maxValue){
        //initial array with size
        int[] array = new int[sizeOfArray];

        for (int i = 0; i < array.length; i++) {
            // assignment random value from min to max
            array[i] = maxValue - (int) (Math.random() * minValue);
        }

        return array;
    }
    public static int getSumOfArray(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAndPrintAverage(double num1, int num2){
        double num = Math.floor((num1/num2) * 100) / 100;
        System.out.println(num);
        return num;
    }

    public static double averageWestInMonth(int[] array){

        double totalWest = getSumOfArray(array);
        double averageWest = getAndPrintAverage(totalWest, array.length);

        return averageWest;
    }
}