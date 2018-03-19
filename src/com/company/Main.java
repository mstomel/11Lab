package com.company;

/**
 * This is a class that tests the Card class.
 */

public class Main {
    /**
     * The main method in this class checks the Card operations for consistency.
     *	@param args is not used.
     */
    public static void main(String[] args) {

        Card a = new Card("2","Spade",2);
        System.out.println(a.toString());

        Card b = new Card("5","Hearts",5);
        System.out.println(b.toString());

        Card c = new Card("Ace","Spade",1);
        System.out.println(c.toString());
    }
}
