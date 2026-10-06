import java.util.Scanner;

public class ej6t4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int temp;
        array = new int[10];
        System.out.print("Introduce 10 valores enteros: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        //invertimos array
        for (int i = 0; i <= array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index" + i + " = " + array[i]);
        }
    }
}
