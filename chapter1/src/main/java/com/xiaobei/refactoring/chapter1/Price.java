package com.xiaobei.refactoring.chapter1;

abstract class Price {
    /**
     * 影片类型代码
     * @return
     */
    abstract int getPriceCode();

    /**
     * 根据影片种类和租用周期计算租金
     * @return
     */
    abstract double getCharge(int daysRented);

    /**
     * 计算积分
     * @return
     */
    int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
