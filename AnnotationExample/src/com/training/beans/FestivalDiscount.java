package com.training.beans;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Default;
import javax.inject.Named;

@Default
public class FestivalDiscount implements Service {

    @Override
    public double findDiscount(Book bk) {
        double discount = 0.30;

        if (bk.getBookName().startsWith("Head")) {
            discount = 0.25;
        }
        return discount;
    }
}
