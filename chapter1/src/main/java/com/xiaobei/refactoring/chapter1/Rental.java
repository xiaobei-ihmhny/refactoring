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
        return movie.getCharge(daysRented);
    }

    /**
     * 计算积分
     * @return
     */
    public int getFrequentRenterPoints() {
        return movie.getFrequentRenterPoints(daysRented);
    }
}
