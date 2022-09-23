public class Main {
    public static void main(String[] args) {
        int total = 12_000_000;
        int fertilityPerK = 17;
        int mortalityPerK = 8;
        int fertilityPerYear = ( total / 1000 ) * fertilityPerK;
        int mortalityPerYear = (total / 1000 ) * mortalityPerK;
        int y = 1;
        for (; y <= 10; y++) {
        total = total + fertilityPerYear - mortalityPerYear;
            System.out.println("Год "+ y + " ,численность "+ total);
        }
    }
}