package com.amora;

import java.util.Scanner;

//https://codeforces.com/problemset/problem/466/A
public class CheapTravel {
    private static void getMinimumAmount(
            int amountTravelsNeeded,
            int amountRidesSpecialTicket,
            int priceSingleRideTicket,
            int priceSpecialTicket) {
        /*
            we have 3 options to pay for this
            1.- buy [o] number of single ride tickets to cover the amount of travels needed
            2.- buy [p] number of special tickets to cover the amount of travels needed
            3.- buy x number of special tickets, plus ++ y number of single ride tickets
        * */

        int costForSingleTickets = priceSingleRideTicket * amountTravelsNeeded;
        double costForSpecialTickets = (Math.ceil((double) amountTravelsNeeded / amountRidesSpecialTicket) * priceSpecialTicket);

        double requiredSpecialTickets = Math.floor((double) amountTravelsNeeded / amountRidesSpecialTicket);
        int requiredSingleRideTickets = amountTravelsNeeded % amountRidesSpecialTicket;
        double costBuyingBothTicketTypes = (requiredSpecialTickets * priceSpecialTicket) + (requiredSingleRideTickets * priceSingleRideTicket);

        System.out.println((int) Math.min(Math.min(costForSingleTickets, costForSpecialTickets), costBuyingBothTicketTypes));
    }
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        String [] inputList = input.split(" ");
        int amountTravelsNeeded = Integer.parseInt(inputList[0]);
        int amountRidesSpecialTicket = Integer.parseInt(inputList[1]);
        int priceSingleRideTicket = Integer.parseInt(inputList[2]);
        int priceSpecialTicket = Integer.parseInt(inputList[3]);
        getMinimumAmount(amountTravelsNeeded, amountRidesSpecialTicket, priceSingleRideTicket, priceSpecialTicket);
    }
}
