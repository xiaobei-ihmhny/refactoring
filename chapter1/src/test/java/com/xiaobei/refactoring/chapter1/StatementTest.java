package com.xiaobei.refactoring.chapter1;

import org.junit.Test;

public class StatementTest {

    @Test
    public void testStatement(){
        Movie movie0_1 = new Movie("人在囧途",0);
        Movie movie1_1 = new Movie("复仇者联盟",1);
        Movie movie0_2 = new Movie("无人区",0);
        Movie movie2_1 = new Movie("泰坦尼克号",2);
        Movie movie2_2 = new Movie("无极",2);
        Movie movie1_2 = new Movie("肖申克的救赎",1);

        Rental rental1_2 = new Rental(movie0_1,2);
        Rental rental2_3 = new Rental(movie1_1,3);
        Rental rental1_1 = new Rental(movie0_2,1);
        Rental rental3_2 = new Rental(movie2_1,2);
        Rental rental3_3 = new Rental(movie2_2,3);
        Rental rental2_1 = new Rental(movie1_2,1);

        Customer customer = new Customer("xiaobei");
        customer.addRental(rental1_1);
        customer.addRental(rental1_2);
        customer.addRental(rental2_1);
        customer.addRental(rental2_3);
        customer.addRental(rental3_2);
        customer.addRental(rental3_3);
        String statement = customer.statement();
        System.out.println("result为：" + statement);
    }
}
