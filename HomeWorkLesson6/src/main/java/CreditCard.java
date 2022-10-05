import static java.lang.System.out;

public class CreditCard extends CreditCards {

    public CreditCard(String cardNumber, double balance) {
        super(cardNumber, balance);
    }

    public static void main(String[] args) {
        CreditCards bpsBank = new CreditCards("5800 3658 4789 5111",58.1);
        bpsBank.setReplenishCard(13.5);

        CreditCards bnbBank= new CreditCards("5993 3698 1458 3678", 13.8);
        bnbBank.setReplenishCard(11.4);

        CreditCards vtbBank = new CreditCards("5479 6589 4365 1848", 36.5);
        vtbBank.setWithDrawCard(31.7);

        CreditCards mtbBank = new CreditCards("5697 3657 3694 1575",1.0);
        mtbBank.setWithDrawCard(10.3);


        bpsBank.showInformation();
        bnbBank.showInformation();
        vtbBank.showInformation();
        mtbBank.showInformation();


    }


}
class CreditCards {
   private final String cardNumber;
    private double balance;

    public CreditCards(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public void setReplenishCard(double replenishCard) {
        this.balance = balance + replenishCard;
    }
    void showInformation(){
        String formatBalance = String.format("%.2f",balance);
        if (balance<0){
            out.println("You don't have enough money");
        }else {
            out.println("Card number: "+cardNumber + "\nCurrent balance: " +formatBalance+"\n");
        }
    }
    public void setWithDrawCard(double withDraw) {
        if (withDraw < balance) {
            String formatBalance = String.format("%.2f",balance);
            this.balance = balance - withDraw;
            out.println("Card number: "+ cardNumber + "\nCurrent balance: "+formatBalance);
        }
        else out.println("Card number: "+ cardNumber + "\nDoesn't have  enough money\n");
    }

}




