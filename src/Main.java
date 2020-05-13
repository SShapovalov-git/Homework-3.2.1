public class Main {
    public static void main(String[] args) {
        long balance = 2_000_000_000;
        System.out.println("balance: " + balance);
        int transfer = 500_000_000;
        System.out.println("transfer: " + transfer);
        long total = balance + transfer;
        System.out.println("total: " + total);
    }
}