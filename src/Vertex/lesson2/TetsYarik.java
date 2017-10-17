package Vertex.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class TetsYarik {

        public static Scanner scn = new Scanner(System.in);
        public static int[] mas = new int[0];
        public static void main(String[] args) {
            interfaceShow();
        }

        public static void interfaceShow() {

            show();
            System.out.println();
            System.out.println("choose number ");
            Scanner scn1 = new Scanner(System.in);
            if (scn1.hasNextInt()) {
                int value = scn1.nextInt();
                while (value > 6) {
                    System.out.println("Попробуй еще");
                    value = scn1.nextInt();
                }
                switch (value) {
                    case 1:
                        array();
                        break;
                    case 2:
                        if(mas.length == 0){
                            System.out.println("Вернись обратно в меню , и заполни массив");
                            out();
                        }
                        System.out.println("Elements array");
                        showArray(mas);
                        break;
                    case 3:
                        editItem(mas);
                        break;
                    case 4:
                        System.exit(1);
                        break;
                    default:
                        System.out.println("Что-то пошло не так ");
                        break;
                }
            } else
                System.out.println("Exception 0_1");
            scn1.close();
        }


        private static void show() {
            System.out.print("[ Please enter size array   press  [ 1 ]" + " Длина массива "  + "["+ mas.length +"]"+
                    "\n[ Output and array          press  [ 2 ]" +
                    "\n[ Edit item                 press  [ 3 ]" +
                    "\n[ Say Hello                 press  [ 4 ]" +
                    "\n[ Exit                      press  [ 5 ]");
        }

        private static void out() {
            System.out.println("Для выхова в главное меню нажать   [ 1 ]");
            Scanner scanner1 = new Scanner(System.in);
            int value2 = scanner1.nextInt();
            while (value2 > 1) {
                System.out.println("Try it again ");
                value2 = scanner1.nextInt();
            }
            interfaceShow();
            scanner1.close();
        }

        private static int[] array() {

            System.out.println("Please enter size array  ");
            Scanner scn = new Scanner(System.in);
            int value2 = scn.nextInt();
            System.out.println("Заполненте массива....");
            mas = new int[value2];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = scn.nextInt();
            }

            out();
            scn.close();
            return showArray(mas);
        }

        private static int[] showArray(int[] mas) {
            System.out.println(Arrays.toString(mas));
            out();
            return mas;
        }


        private static int[] editItem(int[] mas){
            System.out.println("Какой елементы массива хочешь поменять?");
            if(scn.hasNextInt()){
                int value = scn.nextInt();
                change(value, mas);

            }
            scn.close();
            return mas;
        }

        private static int change(int value, int[] mas ) {
            int res = 0;
            if(mas.length < value){
                System.out.println("длина массива меньше чем ваша цифра");
                System.out.println("Try it again ");
                while (value < mas.length) {
                    System.out.println("Try it again ");
                    value = scn.nextInt();
                }
            }
            else if (mas.length>value){
                mas[value] = scn.nextInt();
            }
            System.out.println(Arrays.toString(mas));
            out();
            scn.close();
            return res;
        }
    }

