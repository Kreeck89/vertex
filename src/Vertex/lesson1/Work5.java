package Vertex.lesson1;

public class Work5 {
    public static void main(String[] args) {
        final int i = 3;
        switch (i) {
            case 1:
                System.out.println("111111");
                break;
            case 2:
                System.out.println("2222222");
                break;
            case 3:
            case 4:
                System.out.println("33333333");
                break;
                default:
                    System.out.println("444444");
                    break;
        }
    }
}
