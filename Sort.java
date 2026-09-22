import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] head = {1 , 1 , 1};
        int sort[] = {head[0]};
        for(int i = 0; i < head.length - 1; i++) {
            if(head[i] != head[i + 1]) {
                sort = Arrays.copyOf(sort, sort.length + 1);
                sort[sort.length - 1] = head[i + 1];
            }
        }

        System.out.println(Arrays.toString(sort));

    }
}
