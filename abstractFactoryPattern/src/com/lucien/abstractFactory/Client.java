package com.lucien.abstractFactory;

/**
 * Created by Lucien on 2017/3/29.
 */
public class Client {
    public static void main(String[] args) {
        Product productAclass1 = (new Class1Factory()).CreateProductA();
        productAclass1.say();
        productAclass1.doSomething();
        productAclass1.doOthorThing();
        Product productAclass2 = (new Class2Factory()).CreateProductA();
        productAclass2.say();
        productAclass2.doSomething();
        productAclass2.doOthorThing();

        Product productBclass1 = (new Class1Factory()).CreateProductB();
        productBclass1.say();
        productBclass1.doSomething();
        productBclass1.doOthorThing();
        Product productBclass2 = (new Class2Factory()).CreateProductB();
        productBclass2.say();
        productBclass2.doSomething();
        productBclass2.doOthorThing();
    }
}
