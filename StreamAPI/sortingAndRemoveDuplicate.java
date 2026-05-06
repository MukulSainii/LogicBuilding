package StreamAPI;

import java.util.Arrays;

public class sortingAndRemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {22, 2, 23, 2, 23, 4, 9, 6, 4, 9, 5};
        /* Sort the array using bubble sort
        outer first iteration push the largest element to the end of the array.
        then in the second iteration, the second largest element will be at the second last position and so on.
        so after n-1 iteration, the array will be sorted.
        and inner iteration is used to comparing the adjacent element and swap if they are in wrong order.
        */
        int[] sortedArr = sorting(arr);
        for(int element: sortedArr){
            System.out.println("element : "+element);
        }
        System.out.println("after removing duplicate element:\n");
        int[] uniqueArr = removeDuplicate(sortedArr);
        for(int element: uniqueArr){
            System.out.println("element : "+element);
        }

        //solved using stream
        Arrays.stream(arr)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }
    public static int[] sorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] removeDuplicate(int[] arr){
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[arr.length-1]; //adding last element.
        return temp;
    }
}
