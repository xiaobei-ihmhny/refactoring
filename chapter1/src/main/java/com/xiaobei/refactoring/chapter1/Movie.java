package com.xiaobei.refactoring.chapter1;

public class Movie {

    /**
     * 儿童片
     */
    public static final int CHILDRENS = 2;
    /**
     * 普通片
     */
    public static final int REGULAR = 0;
    /**
     * 新片
     */
    public static final int NEW_RELEASE = 1;

    /**
     * 影片名称
     */
    private String title;
    /**
     * 影片类别
     */
    private int priceCode;

    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }

    /**
     * 根据影片种类和租用周期计算租金
     * @return
     */
    public double getCharge(int daysRented){
        return price.getCharge(daysRented);

    }

    /**
     * 计算积分
     * @return
     */
    public int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }
}
