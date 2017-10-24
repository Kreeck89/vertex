package Vertex.javaStart.lesson2;

public class Work9 {

    public static void main(String[] args) {
        int a = 0;
        int arr[] = new int[10];
        while (a < arr.length) {
            arr[a] = a;
            System.out.print(arr[a] + " ");
            a++;
        }
        System.out.println("");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
