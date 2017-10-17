package Vertex.lesson3;

import java.util.Arrays;

public class Work3 {

    public static void main(String[] args) {
        int masLength = 10;
       final int [] m =  add(masLength);

        System.out.println(Arrays.toString(m));
    }

    private static int[] add(int length) {
        final int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

}
