package lab1;

public class Multiples {
    public static void main(String[] args) {
        int count = multiples(1000, 3, 5);
        System.out.println(count);
    }

    public static int multiples(int n, int a, int b) {
        int nums = 0;
        for (int i = 1; i < n; i++){
            boolean divA = i % a == 0;
            boolean divB = i % b == 0;
            if (divA || divB) {
                nums++;
            }
        }
        return nums;
    }

    public static int multiples() {
        int nums = 0;
        for (int i = 1; i < 100; i++){
            boolean divA = i % 3 == 0;
            boolean divB = i % 5 == 0;
            if (divA || divB) {
                nums++;
            }
        }
        return nums;
    }
}
