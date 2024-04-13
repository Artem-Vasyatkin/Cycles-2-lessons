public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //test 1
        int start = 5;
        while (start > 0) {
            System.out.println(start);
            start = start - 1;
        }
        //test 2
        System.out.println("\n");

        int salary = 65535;
        int total = 0;
        for (; total < 1_000_000;){
            total = total + total / 100;
            total = total + salary;
            System.out.println(total);
        }
        //test 3
        System.out.println("\n");

        int salary1 = 65535;
        int total1 = 0;
        while (total1 < 1_000_000){
            total1 = total1 + total1 / 100;
            total1 = total1 + salary1;
            System.out.println(total1);
        }
        //test 4.1
        System.out.println("\n");

        int days = 10;

        if (days == 0) {
            System.out.println("Желаем приятной поездки.");
        } else {
            while (days > 0) {
                days--;
                System.out.println("До конца поездки "
                        + days + " дней.");
            }
            System.out.println("Путеществие окончено. " +
                    "Пора возвращаться домой.");
        }
        //test 4.2
        System.out.println("\n");

        int days1 = 10;
        if (days1 == 0) {
            System.out.println("Желаем приятной поездки.");
        } else {
            for (int i = 10; i >= 0; i--) {
                System.out.println("До конца поездки "
                        + i + " дней.");
            }
            System.out.println("Путеществие окончено. " +
                    "Пора возвращаться домой.");
        }
        //test 5
        System.out.println("\n");

        int salary2 = 65535;
        int total2 = 0;
        int z = 0;
        for (; total2 < 1_000_000; z++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + salary2;
            if (z % 5 == 0) {
                System.out.println("Месяц " + z +
                        " Итого " + total2);
            }
        }
        System.out.println(total2);

        //test 6
        System.out.println("\n");

        int start1 = 5;
        do {
            System.out.println(start1);
            start1 = start1 - 1;
        }
        while (start1 > 0);

        //test 7
        System.out.println("\n");

        int userWantsContinue = 1;
        int level = 1;
        do {
            System.out.println("Завершен уровень "
                    + level);
            System.out.println("Хотете продолжить?");
            level++;
        } while (userWantsContinue == 1 && level <= 5);

        //test 8
        System.out.println("\n");

        int points = 10;

        do {
            System.out.println("Осталось " + points +
                    " баллов.");
            points--;
        } while (points >= 0);

        System.out.println("Игра окнченна!");
    }
}