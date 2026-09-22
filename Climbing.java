public class Climbing {
    public static void main(String[] args) {
        int n = 4;
        int first = 0;
        int second = 1;
        int next = 0;
        if(n > 3) {
            for(int i = 1; i <= n; i++) {
                next = first + second;
                int temp = second;
                first = temp;
                second = next;
            }
        } else {
            System.out.println(n);
            return;
        }

        System.out.println(next);
    }
}