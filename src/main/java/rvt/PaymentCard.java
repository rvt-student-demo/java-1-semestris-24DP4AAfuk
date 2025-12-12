package rvt;

public class PaymentCard {
   private double balance;
   
   public PaymentCard(double initialBalance) {
       this.balance = initialBalance;
   }

   public String toString() {
       return "The card has a balance of " + this.balance + " euros";
   }

   public double balance() {
       return this.balance;
   }

   public void addMoney(double amount) {
       if (amount > 0) {
           this.balance += amount;
           if (this.balance > 150) {
               this.balance = 150;
           }
       }
   }

   public boolean takeMoney(double amount) {
       if (amount > this.balance) {
           return false;
       }
       this.balance -= amount;
       return true;
   }

   public void eatAffordably() {
       if (this.balance >= 2.60) {
           this.balance -= 2.60;
       }
   }

    public void eatHeartily() {
         if (this.balance >= 4.60) {
              this.balance -= 4.60;
         }
    }

   public static void main(String[] args) {
        PaymentCard card = new PaymentCard(10);
        System.out.println(card);
   }
}
