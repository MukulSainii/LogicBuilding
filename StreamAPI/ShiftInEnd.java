package StreamAPI;

public class ShiftInEnd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};
        int nonZeroIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

//        output : 1 2 3 4 0 0 0
    }
}
