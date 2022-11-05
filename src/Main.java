public class Main {
    public static void main(String[] args) {
        // Задание 1
        int salary = 15000;
        int total = 0;
        int m = 0;
        while (total <= 2_459_000) {
            total = total + total/100;
            total = total + salary;
            m++;
            System.out.println("Месяц " + m + " Сумма накоплений равна " + total);

        }
        // Задание 2
        int q = 0;
        while (q < 10) {
            q++;
            System.out.print(q + " ");
        }
        System.out.println();
        for (; q >= 1; q--) {
            System.out.print(q + " ");
        }
        // Задание 3
        System.out.println();
        int populationCountry = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            populationCountry = populationCountry + (populationCountry * 17 / 1000) - (populationCountry * 8 / 1000);
            System.out.println("Год " + year + " Численность населения составляет " + populationCountry);
        }
        // Задание 2-1
        // int money = 15000;
        // int month = 0;
        // while (money < 12_000_000) {
        // month++;
        // money = money + (money * 7 / 100);
        // System.out.println("Месяц " + month + " Накопленная сумма " + money);
        // }

        // Задание 2-2
        int money = 15000;
        int month = 0;
        while (money < 12_000_000) {
            month++;
            money = money + (money * 7 / 100);
            if (month % 6 == 0 || money >= 12_000_000)
            System.out.println("Месяц " + month + " Накопленная сумма " + money);
        }
        // Задание 2-3
        int money1 = 15000;
        int month1 = 0;
        while (month1 <= 108) { // 9лет это 108мес.
            month1++;
            money1 = money1 + (money1 * 7 / 100);
            if (month1 % 6 == 0)
                System.out.println("Месяц " + month1 + " Накопленная сумма " + money1);
        }
        // Задание 2-4
        int Friday = 7; // первая пятница октября 2022г.
        while (Friday <=31) {
            System.out.println("Сегодня пятница " + Friday + "-е число. Нужно приготовить отчет");
            Friday = Friday + 7;
        }
        // Задание 3-1
        int currentYear = 2022;
        for (int Y = 0; Y <= currentYear + 100; Y = Y + 79) {
            if (Y > currentYear - 200)
                System.out.println(Y);
        }
        // Задание 3-2
        int factor = 2;
        int result = 0;
        for (int i = 1; i <= 10; i++) {
            result = factor * i;
            System.out.println(factor + " * "  + i + " = " + result);
        }


    }

}