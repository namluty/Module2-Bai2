import java.util.Scanner;

public class drawing {
    public static void main(String[] args) {
        int chosse = -1;
        Scanner input = new Scanner(System.in);
        while (chosse != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            chosse = input.nextInt();
            switch (chosse) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 0; i <= 5; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*\t");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 1; i--) {
                        for (int j = 2; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("*\t");
                    }
                    break;
            }
        }
    }
}