package com.xiaobei.refactoring.chapter1;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 顾客
 */
public class Customer {
    private String name;

    /**
     * 出租
     */
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return name;
    }

    /**
     *
     * @return
     */
    public String statement() {
        /**
         * 总费用
         */
        double totalAmout = 0;
        /**
         * 总的积分
         */
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
            totalAmout += each.getCharge();
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmout) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

}
