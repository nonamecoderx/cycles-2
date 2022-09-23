public class Main {
    public static void main(String[] args) {
        int totalCoin = 15_000;
        int i = 0;
        int totalYears = 9;
        int totalMounth = totalYears * 12;
        for (i = 1; i <= totalMounth; i++) {
            totalCoin = totalCoin + totalCoin * 7 / 100 / 12;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + ", сумма накоплений " + totalCoin);
            }
        }
    }
}