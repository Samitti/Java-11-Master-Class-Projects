public class Main {
    public static void main(String[] args) {

        BankAccount bAcc = new BankAccount();
        bAcc.setCustomerName("Sami");
        bAcc.setAccNumber("123");
        bAcc.setBalance(1000);
        bAcc.setEmail("sam@gmail.com");
        bAcc.setPhoneNumber("+123");

        bAcc.acStatus();

        bAcc.deposit(100);
        bAcc.deposit(-1);
        bAcc.withdraw(1000);
        bAcc.withdraw(2000);

        bAcc.acStatus();


    }




}
