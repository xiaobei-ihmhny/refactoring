package com.xiaobei.refactoring.chapter1;

import org.junit.Test;

public class StatementTest {

    /**
     * 修改前
     * @return
     */
    private Customer beforeStatement(){
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
        return customer;
    }

    @Test
    public void testStatement(){
        String statement = beforeStatement().statement();
        String htmlStatement = beforeStatement().htmlStatement();
        String beforeStatement = "Rental Record for xiaobei\n" +
                "\t无人区\t2.0\n" +
                "\t人在囧途\t2.0\n" +
                "\t肖申克的救赎\t3.0\n" +
                "\t复仇者联盟\t9.0\n" +
                "\t泰坦尼克号\t1.5\n" +
                "\t无极\t1.5\n" +
                "Amount owed is 19.0\n" +
                "You earned 7 frequent renter points";
        System.out.println("result：" + beforeStatement.equals(statement));
        System.out.println("result1-1为：" + statement);
//        System.out.println("result1-2为：" + htmlStatement);
        System.out.println("result2为：" + beforeStatement);
    }
}
