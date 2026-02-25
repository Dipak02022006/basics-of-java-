import java.util.Scanner;

class SortArray {
    public static void main(String args[]) {
        int a[] = new int[10];
        int temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
