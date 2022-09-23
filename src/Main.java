public class Main {
    public static void main(String[] args) {
        int friday = 5;
        int date = 1;
        while ( date <= 31 ) {
            date = date + 1;
            if (date == friday) {
                System.out.println("Сегодня пятница, " + date + " число. Необходимо подготовить отчет.");
                friday = friday + 7;
            }
        }
    }
}