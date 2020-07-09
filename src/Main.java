public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        System.out.println(service.calculate(12, 1_000_000,9.99F));

        System.out.println(service.calculate(24, 1_000_000,9.99F));

        System.out.println(service.calculate(36, 1_000_000,9.99F));
   }
}
