import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a: ");
        int a = sc.nextInt();
        System.out.print("nhập b: ");
        int b = sc.nextInt();
        System.out.print("nhập c: ");
        int c = sc.nextInt();

        try {
            triangle(a,b,c);
        }
        catch (IllegalTriangleException e){
            System.out.println("3 cạnh không tạo thành tam giác hợp lệ");
        }

    }

    public static void triangle(int a, int b, int c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException();
            }
        }
        else {
            System.out.println("3 cạnh là tam giác hợp lệ");
        }

    }
}
