import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // задание №1
        // добавляеем чуть-чуть интерактива
        Scanner in = new Scanner(System.in);//ввод операционной системы из консоли
        System.out.println("Введите операционную систему вашего телефона буквами (iOS или Android)"); // вводим тип ОС
        String osType = in.nextLine().toLowerCase();//привожу вводимые значения к нижнему регситру для простоты
        boolean containsIos = osType.contains("ios");//равна true если в строке есть ios
        boolean containsDroid = osType.contains("android");//равна true если в строке есть android
        byte clientOS = 0;
        if (containsIos) {
            clientOS = 0;
            System.out.println("Установите версию приложения для iOs по ссылке");
        }        else
        {
            clientOS =1;
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //задание №2
        short clientDeviceYear;//год выпуска телефона
        System.out.println("Введите год выпуска телефона"); // вводим год выпуска
        clientDeviceYear = in.nextShort();
        if (clientDeviceYear < 2015 && clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOs по ссылке");
            } else if ( clientDeviceYear < 2015 && clientOS == 1) {
                System.out.println("Установите облегченную версию приложение для Android по ссылке");
            } else if (clientDeviceYear >= 2015 && clientOS == 0)
        {
            System.out.println("Вам нужна обычная версия приложения iOs");
        }
            else {
            System.out.println("Вам нужна обычная версия приложения Android");
        }

        //задание №3
        System.out.println("Введите год");//ввод года
        int year = in.nextInt();
        if (year > 1584) { //сразу проверяем, что год больше 1584, тогда едем дальше
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) { //условие - год делится на 4, не делится на 100 и делится на 400
                System.out.println("Год високосный");
            } else {
                System.out.println("Год обычный");
            }
        }
        //задание №4
        int deliveryDistance = 95;//дистанция доставки
        if (deliveryDistance > 100 || deliveryDistance < 0) {
            System.out.println("На такие расстояния доставки нет");
        } else if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3");
        }
        //задание №5
        System.out.println("Введите номер месяца");
        int monthNumber = in.nextInt();
        if (monthNumber < 0 || monthNumber > 12) {
            return;
        } else switch (monthNumber) {
            case 12:
                System.out.println("Это зимний месяц");
                break;
            case 1:
                System.out.println("Это зимний месяц");
                break;
            case 2:
                System.out.println("Это зимний месяц");
                break;
            case 3:
                System.out.println("Это весенний месяц");
                break;
            case 4:
                System.out.println("Это весенний месяц");
                break;
            case 5:
                System.out.println("Это весенний месяц");
                break;
            case 6:
                System.out.println("Это летний месяц");
                break;
            case 7:
                System.out.println("Это летний месяц");
                break;
            case 8:
                System.out.println("Это летний месяц");
                break;
            case 9:
                System.out.println("Это осенний месяц");
                break;
            case 10:
                System.out.println("Это осенний месяц");
                break;
            case 11:
                System.out.println("Это осенний месяц");
                break;

        }
    }
}