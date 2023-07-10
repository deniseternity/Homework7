public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        int need = 2459000;
        int monthSalary = 15000;
        int total = 0;
        int month = 0;

        while (total < need) {
            total += monthSalary;
            System.out.println("Месяц" + month++ + ",сумма накоплений равна" + total + "рублей");
        }

        System.out.println("Задача 2");

        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");
        }
        System.out.println();
        for (; i > 0; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 3");

        int humans = 12000000;
        int birth = 17;
        int death = 8;
        int years = 10;

        for (int year = 1; year <= years; year++) {
            humans += humans / 1000 * (birth - death);
            System.out.println("Год " + year + ",численнность населения составляет " + humans +);
        }

        System.out.println("Задача 4");

        int goal = 12000000;
        int total = 15000;
        int percent = 7;

        for (int month = 0; total < goal; month++) {
            total += total * percent / 100;

            if (month % 6 == 0) {
                System.out.printf("В месяце %d накоплена сумма %.2f /n", month);
            }
        }

        System.out.println("Задача 6");

        int years = 9;
        int monthInYear = years * 12;
        float total = 15000;
        int percent = 7;

        for (int month = 1; month <= monthInYear; month++) {
            total += total * percent / 100;
            if (month % 6 == 0) {
                System.out.printf("В месяце %d накоплена сумма %.2f /n", month, total);
            }
        }

        System.out.println("Задача 7");

        int friday = 5;
        int daysInMonth = 31;
        for (; friday <= daysInMonth; friday += 7) {
            System.out.println("Сегодня пятница," + friday + "-e число Необходимо подготовить отчет");
        }

        while (friday <= daysInMonth) {
            System.out.println("Сегодня пятница," + friday + "-e число Необходимо подготовить отчет");
            friday += 7;
        }

        System.out.println("Задача 8");

        int frequency = 79;
        int currentYear = 2023;
        int beforeYear = currentYear - 200;
        int afterYear = currentYear + 100;
        for (int year = 0; year < afterYear; year += frequency) {
            if (year > beforeYear) {
                System.out.println(year);
            }
        }

    }
}