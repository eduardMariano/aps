package Strategy;

public class Paypal implements Payments {

    private String emailId;
    private String password;

    public Paypal(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pago usando Paypal.");
    }

}
