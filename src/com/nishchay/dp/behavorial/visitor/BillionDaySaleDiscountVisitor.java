package com.nishchay.dp.behavorial.visitor;

import com.nishchay.dp.behavorial.visitor.objects.Earphone;
import com.nishchay.dp.behavorial.visitor.objects.Laptop;
import com.nishchay.dp.behavorial.visitor.objects.Mobile;
import com.nishchay.dp.behavorial.visitor.objects.TV;

public class BillionDaySaleDiscountVisitor implements IVisitor {

    public BillionDaySaleDiscountVisitor() {
    }

    @Override
    public double visit(Mobile mobileItem) {
        return mobileItem.getPrice() * 10 / 100;
    }

    @Override
    public double visit(TV TVItem) {
        return TVItem.getPrice() * 15 / 100;
    }

    @Override
    public double visit(Earphone earphoneItem) {
        return earphoneItem.getPrice() * 5 / 100;
    }

    @Override
    public double visit(Laptop laptopItem) {
        return laptopItem.getPrice() * 12 / 100;
    }

}