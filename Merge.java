public class Merge {
    public static void main(String[] args) {
        int list1[] = {1, 2, 3};
        int list2[] = {2, 3, 4};
        int result[] = new int[list1.length + list2.length];

        int j = 0;
        int k = 0;
        int count = 0;

        while(j < list1.length && k < list2.length) {
            if (list1[j] <= list2[k]) {
                result[count++] = list1[j++];
            } else {
                result[count++] = list2[k++];
            }
        }

        while (j < list1.length) {
            result[count++] = list1[j++];
        }
        while (k < list2.length) {
            result[count++] = list2[k++];
        }

        for (int number : result) {
            System.out.print(number + " ");
        }
    }
}