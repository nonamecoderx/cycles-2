public class Main {
    public static void main(String[] args) {
        int totalCoin = 15_000;
        int i = 0;
        for ( i = 1; totalCoin < 12_000_000; i++) {
            totalCoin = totalCoin + totalCoin * 7 / 100 / 12;
            System.out.println("Месяц " + i + ", сумма накоплений " + totalCoin);
        }
    }
}