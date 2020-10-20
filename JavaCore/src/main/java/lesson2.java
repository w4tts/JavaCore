import java.util.Scanner;

public class lesson2 {
    // Реализация треугольника Флойда
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = scanner.nextInt();
        int num = 1;
        for(int x = 1; x <= row; x++){
            for (int y = 1; y <= x; y++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}