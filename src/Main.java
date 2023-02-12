import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 3;
        int y = 5;
        int z = 7;

        System.out.println("Введите число a в массив");
        int a = scanner.nextInt();
        System.out.println("Введите число b в массив");
        int b = scanner.nextInt();
        int[] massiv = {a, b};
        while (a!=x || a!=y || a!=z || b!=x || b!=y || b!=z){
            System.out.println("Введите число a в массив");
            a = scanner.nextInt();
            System.out.println("Введите число b в массив");
            b = scanner.nextInt();
            if (a==x || a==y || a==z || b==x || b==y || b==z) {
            break;
        }
        }
        System.out.println("Данное значение имеется в константах");
    }
    }