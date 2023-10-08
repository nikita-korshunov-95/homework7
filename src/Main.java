public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int i = 1;
        int savings = 15000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + savings;
            System.out.println("Месяц " + i++ + " сумма накоплений равна " + total);
        }
        System.out.println("Задача №2");
        int k = 1;
        while (k <= 10) {
            System.out.print(" " + k++);
        }
        System.out.println();
        for (k = 10; k > 0; k--) {
            System.out.print(" " + k);

        }
        System.out.println();
        System.out.println("Задача №3");
        int population = 12_000_000;
        int born = 17;
        int death = 8;
        for (int l = 1; l <= 10; l++) {
            population = (population * (born - death) / 1000) + population;
            System.out.println("Год " + l + ", численность населения составляет " + population);
        }
        System.out.println("Задача №4");
        int z = 0;
        int deposit = 15000;
        int total1 = 0;
        while (total1 < 12_000_000) {
            total1 = total1 + (total1 / 100 * 7);
            total1 = total1 + deposit;
            System.out.println("Месяц " + z++ + " сумма накоплений равна " + total1);
        }
        System.out.println("Задача №5");
        int x = 0;
        int deposit2 = 15000;
        int total2 = 0;
        while (total2 < 12_000_000) {
            total2 = total2 + (total2 / 100 * 7);
            total2 = total2 + deposit2;
            x = x + 1;
            if (x % 6 == 0) {
                System.out.println("Месяц " + x + " сумма накоплений равна " + total2);
            }
        }
        System.out.println("Задача №6");
        int m = 0;
        int deposit3 = 15000;
        int total3 = 0;
        int nineYears = 9 * 12;
        while (m < nineYears) {
            total3 = total3 + (total3 / 100 * 7);
            total3 = total3 + deposit3;
            m = m + 1;
            if (m % 6 == 0) {
                System.out.println("Месяц " + m + " сумма накоплений равна " + total3);
            }
        }
        System.out.println("Задача №7");
        for (int d = 6; d <= 31; d = d + 7) {
            System.out.println("Сегодня пятница, " + d + "-е число. Необходимо сделать отчет");
        }
        System.out.println("Задача №8");
        int currentYear = 2023;
        int pastYear = currentYear - 200;
        int futureYear = currentYear + 100;
        while (pastYear < futureYear) {
            System.out.println(pastYear);
            pastYear = pastYear + 79;
        }


    }
}