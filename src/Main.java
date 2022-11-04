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

    }

}