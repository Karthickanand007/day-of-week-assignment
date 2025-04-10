public class Main {
    public static String findDay(int day, int month, int year) {
        // Zeller’s Congruence algorithm
        if (month < 3) {
            month += 12;
            year -= 1;
        }

        int q = day;
        int m = month;
        int K = year % 100;
        int J = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) + 5 * J) % 7;

        String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        return days[h];
    }

    public static void main(String[] args) {
        System.out.println(findDay(10, 4, 2025)); // Should print "Thursday"
    }
}
