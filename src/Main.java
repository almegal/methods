import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        printLeapYear(2009);
        detectedVersionApp(1, 2014);
        printDaysToDelivery(102);
    }

    public static  void printAppVersionMessage(int year, int os){

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

    public static void detectedVersionApp(int clientOS, int deviceYear, int... date){
        final int iOS = 0;
        final int Android = 1;

        //default parametr currentDate if not provided
        int currentDate = date.length > 0 ? date[0] : LocalDate.now().getYear();

        boolean needLightVersion = deviceYear < 2015;

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
}