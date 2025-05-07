interface paymentmethood{
    String authentication();
    String processingflow();
}
class craditcard implements paymentmethood{
    String cardnumber;
    int CVVnumber;
    String issuedate;
    craditcard(String cardnumber, int CVVnumber, String issuedate){
        this.cardnumber=cardnumber;
        this.CVVnumber=CVVnumber;
        this.issuedate=issuedate;
    }

    @Override
    public String authentication() {
        if (cardnumber != null && cardnumber.length() == 16){
            return "Approved";
        }else {
            return "Failed";
        }
    }

    @Override
    public String processingflow() {
        System.out.println("--------Credit Card Payment--------");
        if (authentication().equals("Failed")){
            System.out.println("Authentication Failed: ");
            return "Failed";
        }else {
            System.out.println("Authentication Successful: ");
            return "Approved";
        }
    }
}
class paypal implements paymentmethood{
    String name;
    String number;
    String email;
    paypal(String name, String number,String email){
        this.name=name;
        this.number=number;
        this.email=email;
    }

    @Override
    public String authentication() {
        if (number != null && number.length() == 11){
            return "Approved";
        }else {
            return "Failed";
        }
    }

    @Override
    public String processingflow() {
        System.out.println("--------Paypal--------");
        if (authentication().equals("Failed")){
            System.out.println("Authentication Failed: ");
            return "Failed";
        }else {
            System.out.println("Authentication Successful: ");
            return "Approved";
        }
    }
}
class cryptocurrencies implements paymentmethood{
    String walletAddress;
    cryptocurrencies(String walletAddress){
        this.walletAddress=walletAddress;

    }

    @Override
    public String authentication() {
        if (walletAddress != null && walletAddress.length() == 20){
            return "Approved";
        }else {
            return "Failed";
        }
    }

    @Override
    public String processingflow() {
        System.out.println("--------Cryptocurrencies--------");
        if (authentication().equals("Failed")){
            System.out.println("Authentication Failed: ");
            return "Failed";
        }else {
            System.out.println("Authentication Successful: ");
            return "Approved";
        }
    }
}

public class Assigment3Qno2 {
    public static void main(String[] args){
        paymentmethood obj = new craditcard("1234567891234567", 123, "12-12-12");
        obj.processingflow();
        paymentmethood obj2 = new paypal("dasd","01234567891","abcd@gmail.com"  );
        obj2.processingflow();
        paymentmethood obj3 = new cryptocurrencies("dadqdasddqdqfcjhfyeu");
        obj3.processingflow();

    }
}
