class PrimeCheck {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        int flag = 0;

        if (n <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}
