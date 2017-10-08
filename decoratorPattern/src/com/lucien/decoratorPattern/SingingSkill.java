package com.lucien.decoratorPattern;

/**
 * Created by Lucien on 2017/4/24.
 */
public class SingingSkill extends DecoratorStar {
    public SingingSkill(SuperStar superStar) {
        super(superStar);
    }

    public void studySinging(){
        System.out.println("明星学习唱歌");
    }

    @Override
    public void singing() {
        this.studySinging();
        super.singing();
    }
}
