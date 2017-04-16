package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/15.
 */
public abstract class AbstractMediation {
    protected Purchase purchase;
    protected Sale sale;
    protected Warehouse warehouse;

    public AbstractMediation() {
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.warehouse = new Warehouse();
    }

    public abstract void execute(String command,Object...objects);
}
