public class BankAccount {
    private String accNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double dep){
        if(dep <= 0){
            System.out.println("Not Deposited");
        }else {

            balance = balance + dep;

            System.out.println("Susesfully Deposited");
        }
    }

    public void withdraw(double with){

        if(with > balance){

            System.out.println("Insufficient Bulance");
        }else {

            balance = balance - with;

            System.out.println("Succesfull Withdraw");
        }

    }

    public void acStatus(){

        System.out.println();
        System.out.println(customerName);
        System.out.println("Acc No "  + accNumber);
        System.out.println("Balance "+ balance);
        System.out.println("Email " + email);
        System.out.println("Phone No " + phoneNumber);
        System.out.println();
    }
}
