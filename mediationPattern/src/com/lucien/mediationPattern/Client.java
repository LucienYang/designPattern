package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public class Client {
    public static void main(String[] args) {
        AbstractMediation mediation = new Mediation();
        mediation.execute("purchase.buy",100);
        mediation.execute("warehouse.count");
        mediation.execute("sale.sale",100);
        mediation.execute("warehouse.count");
        mediation.execute("purchase.buy",100);
    }
}
