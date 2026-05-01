package com.java.practice.day18;


/* Question: 

                +----------------------+
                |      Payment         |  <<interface>>
                +----------------------+
                | + pay(amount)        |
                +----------------------+
                          ▲
          ┌───────────────┼───────────────┐
          │                               │
+----------------------+     +----------------------+
|   CreditCardPayment  |     |     UpiPayment       |
+----------------------+     +----------------------+
| - cardNumber         |     | - upiId              |
| - holderName         |     +----------------------+
+----------------------+     | + pay(amount)        |
| + pay(amount)        |     +----------------------+
+----------------------+

                          ▲
                          |
                +----------------------+
                |       User           |
                +----------------------+
                | - name               |
                +----------------------+
                | + makePayment()      |
                +----------------------+
                
*/

 interface Payment {

	public void Pay(double ammount);
}


 class CreditCardPayment implements Payment{
	 
	 private int cardNumber;
	 private String holderName;
	 	
	 CreditCardPayment(int cardNumber)
	 {
		 this.cardNumber = cardNumber;
	 }

 	
 	@Override
 	public void Pay(double ammount)
 	{		
 		System.out.println("Paid " + ammount + " " + "Using Credit Card:" + " "+ cardNumber);
 	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
 	
 	
 	
 }


 class UpiPayment implements Payment{

		private String upiId;
		
		UpiPayment(String upiId)
		{
			this.upiId = upiId;
		}
		
		@Override
		public void Pay(double ammount)
		{
			System.out.println("Paid "+ ammount + " Using UPI: " + upiId);
		}

		public String getUpiId() {
			return upiId;
		}

		public void setUpiId(String upiId) {
			this.upiId = upiId;
		}
	}
 
 
 class User {

		//private String name;
		
		public void makePayment(Payment p, double ammount)
		{
			p.Pay(ammount);
		}
		
	}




public class Driver {
	
	public static void main(String[] args)
	{
		CreditCardPayment ccP = new CreditCardPayment(101011);
		UpiPayment upiP = new UpiPayment("@raza123");
		
		User u1 = new User();		
		
		u1.makePayment(ccP, 5000);
		u1.makePayment(upiP, 200);
	}

}
