public class Main {
    public static void main(String[] args) {
        int salary = 15000;
        int total = 0;
        int i = 0;
        while ( total < 2459000 ) {
            total = total + total / 100;
            total = total + salary;
            //System.out.println("Месяц " + i + " сумма - " + total);
            i =i+1;
            System.out.println("Месяц " + i + " сумма накоплений " + total);
        }
    }
}