package com.lucien.abstractFactory;

/**
 * Created by Lucien on 2017/3/29.
 */
public class Class2Factory implements ProductFactory {
    @Override
    public Product CreateProductA() {
        return new ProductAClass2();
    }

    @Override
    public Product CreateProductB() {
        return new ProductBClass2();
    }
}
