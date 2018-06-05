package com.xiaobei.refactoring.chapter1;

/**
 * 租赁
 */
public class Rental {
    /**
     *
     */
    private Movie movie;
    /**
     * 租用天数
     */
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return daysRented;
    }

    /**
     * 根据影片种类和租用周期计算租金
     * @return
     */
    public double getCharge(){
        double result = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (getDaysRented() > 2)
                    result += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (getDaysRented() > 3)
                    result += (getDaysRented() - 3) * 1.5;
                break;
        }
        return result;

    }

    /**
     * 计算积分
     * @return
     */
    public int getFrequentRenterPoints() {
        if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1) {
            return 2;
        }
        else {
            return 1;
        }
    }
}
