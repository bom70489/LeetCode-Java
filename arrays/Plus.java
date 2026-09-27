import java.util.Arrays;

public class Plus {
    public static void main(String[] args) {
        int digits[] = {9,8,7,6,5,4,3,2,1,0};
        long cal = 0;
        for(int i = 0; i < digits.length; i++) {
            cal = (cal * 10) + digits[i];
        }
        cal += 1;
        String to_str = String.valueOf(cal);
        long result[] = new long[to_str.length()];

        for(int i = 0; i < to_str.length(); i++) {
            result[i] = to_str.charAt(i) - '0';
        }

        System.out.println(Arrays.toString(result));
    }
}
