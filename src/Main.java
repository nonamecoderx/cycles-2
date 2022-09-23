public class Main {
    public static void main(String[] args) {
        int dayX = 79;
        int yearStart = 2022;
        int yearStop = yearStart - 200;
        int yearNext = yearStart + 100;
        int year = 0;
        while (year <= yearNext) {
            year++;
            if (year == dayX) {
                if (year > yearStop)
                    System.out.println(year);
                dayX = dayX + 79;
            }
        }
    }
}