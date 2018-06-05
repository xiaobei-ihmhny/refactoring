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
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

    /**
     * 计算总费用
     * @return
     */
    private double getTotalCharge() {
        double result = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    /**
     *
     * @return
     */
    private int getFrequentRenterPoints() {
        /**
         * 总的积分
         */
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        while(rentals.hasMoreElements()){
            Rental each = (Rental) rentals.nextElement();
            // add frequent renter points
            frequentRenterPoints += each.getFrequentRenterPoints();
        }
        return frequentRenterPoints;
    }

}
