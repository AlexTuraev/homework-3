public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- Task1 - homework3 -----------------");
        byte clientOS = 0;
        if(clientOS == 0){
            System.out.println("Install iOS version by following link");
        } else if(clientOS == 1){
            System.out.println("Install Android version by following link");
        }

        System.out.println("\n----------------- Task2 - homework3 -----------------");

        clientOS = 1;
        int clientDeviceYear = 2017;
        if (clientOS == 0 && clientDeviceYear < 2015){
            System.out.println("Install iOS light version by following link");
        } else if (clientOS == 1 && clientDeviceYear < 2015){
            System.out.println("Install Android light version by following link");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install iOS version by following link");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Install Android version by following link");
        }

        System.out.println("\n----------------- Task3 - homework3 -----------------");
        int year = 2022;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " is leap year");
        } else{
            System.out.println(year + " isn't leap year");
        }

        System.out.println("\n----------------- Task4 - homework3 -----------------");
        int deliveryDistance = 95;
        int timeDelivery = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60){
            timeDelivery++;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            timeDelivery += 2;
        }

        if(timeDelivery == 1){
            System.out.println("It will take: " + timeDelivery + " day");
        } else if (timeDelivery >= 2){
            System.out.println("It will take: " + timeDelivery + " days");
        }

        System.out.println("\n----------------- Task5 - homework3 -----------------");
        byte monthNumber = 12;

        switch (monthNumber){
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println(monthNumber + "is wrong month number");
                break;
        }
    }
}