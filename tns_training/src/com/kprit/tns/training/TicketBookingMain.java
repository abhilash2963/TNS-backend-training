package com.kprit.tns.training;
import java.util.Scanner;
public class TicketBookingMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		TicketBooking ob = new TicketBooking();
        System.out.print("Enter Stage Event: ");
        String stageEvent = sc.nextLine();
        ob.setStageEvent(stageEvent);
        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();
        ob.setCustomer(customer);
        System.out.print("Enter No. of Seats: ");
        int seats = sc.nextInt();
        ob.setNoOfSeats(seats);
        TicketBooking booking = new TicketBooking(stageEvent, customer, seats);
        System.out.println("\nChoose Payment Method:");
        System.out.println("1. Cash");
        System.out.println("2. Wallet");
        System.out.println("3. Credit Card");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
        case 1:
            System.out.print("Enter Cash Amount: ");
            double cash = sc.nextDouble();
            booking.makePayment(cash);
            break;

        case 2:
            System.out.print("Enter Wallet Number: ");
            String walletNo = sc.nextLine();
            System.out.print("Enter Amount: ");
            double walletAmt = sc.nextDouble();
            booking.makePayment(walletNo, walletAmt);
            break;

        case 3:
            System.out.print("Enter Credit Card Number: ");
            String cardNo = sc.nextLine();
            System.out.print("Enter CVV: ");
            String cvv = sc.nextLine();
            System.out.print("Enter Card Holder Name: ");
            String cardName = sc.nextLine();
            System.out.print("Enter Amount: ");
            double cardAmt = sc.nextDouble();
            booking.makePayment(cardNo, cvv, cardName, cardAmt);
            break;

        default:
            System.out.println("Invalid choice!");
    }

    sc.close();
}

	}


