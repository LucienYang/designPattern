package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public class Mediation extends AbstractMediation {
    @Override
    public void execute(String command, Object... objects) {
        if("purchase.buy".equals(command)){
            this.buyComputer((int)objects[0]);
        }else if("sale.sale".equals(command)){
            this.sale((int)objects[0]);
        }else if("warehouse.count".equals(command)){
            this.warehouse.count();
        }
    }

    private void buyComputer(int num){
        int warehouse_count = super.warehouse.getWAREHOUSE_COUNT();
        if(warehouse_count<80){
            super.warehouse.increase(num);
            System.out.println("采购"+num+"台电脑");
        }else{
            super.purchase.refuseBuyComputer();
        }
    }

    private void sale(int num){
        int warehouse_count = super.warehouse.getWAREHOUSE_COUNT();
        if(warehouse_count>num){
            super.warehouse.decrease(num);
        }else{
            super.purchase.buyComputer(num - warehouse_count);
            super.warehouse.decrease(num);
        }
        System.out.println("销售了"+num+"台电脑");
    }

}
