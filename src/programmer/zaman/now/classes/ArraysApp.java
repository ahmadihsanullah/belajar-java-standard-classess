package programmer.zaman.now.classes;

import java.util.Arrays;

public class ArraysApp {

    public static void main(String[] args) {
        int[] numbers = {
                1,21,232,1212,33,121,323,132,14,4,2,21,13,4,5,55
        };

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        //mencari nilai di array, data yang dikembalikan berupa index dari array
        System.out.println(Arrays.binarySearch(numbers,132));
        System.out.println(Arrays.binarySearch(numbers,1));
        System.out.println(Arrays.binarySearch(numbers,100));

        int[] copyNumbers = Arrays.copyOf(numbers, 5);

        System.out.println(Arrays.toString(copyNumbers));

        int[] copyNumbers2 = Arrays.copyOfRange(numbers, 5, 10);
        System.out.println(Arrays.toString(copyNumbers2));

    }
}
