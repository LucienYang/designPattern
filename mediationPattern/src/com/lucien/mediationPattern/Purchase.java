package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/15.
 */
public class Purchase extends Colleague{
    public Purchase(AbstractMediation mediation) {
        super(mediation);
    }

    public void buyComputer(int num){
        super.mediation.execute("purchase.buyComputer", num);
    }

    public void refuseBuyComputer(){
        System.out.println("库存足够，不需要购买");
    }
}
