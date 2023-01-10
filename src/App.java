public class App {
    public static void main(String[] args) {
        int start = 1;
        int end = 9;

        for (int i = start; i <= end; i++) {
            String numbers = "";
            for (int j = 1; j <= i; j++) {
                numbers += i;
            }
            System.out.println(numbers);
        }
    }
}
