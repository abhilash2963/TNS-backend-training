
package com.kprit.tns.training;

public class TicketBooking {
	private String stageEvent;
	private String customer;
	private int noOfSeats;
	public String getStageEvent() {
		return stageEvent;
	}
	public void setStageEvent(String stageEvent) {
		this.stageEvent = stageEvent;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public TicketBooking(String stageEvent, String 
			customer, Integer noOfSeats) {
		this.stageEvent=stageEvent;
		this.customer=customer;
		this.noOfSeats=noOfSeats;
	}
	
	public void makePayment(Double amount) {
		 System.out.println("\n--- CASH PAYMENT ---");
	        printReceipt("Cash", amount);
		
		
	}
	public void makePayment(String walletNo,Double amount) {
		
		System.out.println("\n--- WALLET PAYMENT ---");
        System.out.println("Wallet Number: " + walletNo);
        printReceipt("Wallet", amount);
		
	}
	
	public void makePayment(String creditCard,String cvv,String name,Double amount) {
		
		 System.out.println("\n--- CREDIT CARD PAYMENT ---");
	        System.out.println("Card Number:" + creditCard);
	        System.out.println("Card Holder: " + name);
	        System.out.println("CVV: " + cvv);
	        printReceipt("Credit Card", amount);
		
	}
	public void printReceipt(String paymentMode, Double amount) {
		 double ticketPrice = 500; 
	        double total = noOfSeats * ticketPrice;
	        System.out.println("Customer: " + customer);
	        System.out.println("Stage Event: " + stageEvent);
	        System.out.println("No. of Seats: " + noOfSeats);
	        System.out.println("Ticket Price: ₹" + ticketPrice);
	        System.out.println("Total Amount: ₹" + total);
	        System.out.println("Paid Amount: ₹" + amount);
	        System.out.println("Payment Mode: " + paymentMode);
	        System.out.println("Transaction Successful!\n");
	}
	
	

}
