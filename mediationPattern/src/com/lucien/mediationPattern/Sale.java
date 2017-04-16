package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/15.
 */
public class Sale extends Colleague{
    public Sale(AbstractMediation mediation) {
        super(mediation);
    }

    public void sale(int num){
        super.mediation.execute("sale.sale", num);
    }

}
