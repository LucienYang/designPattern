package com.lucien.decoratorPattern;

/**
 * Created by Lucien on 2017/4/24.
 */
public class DancingSkill extends DecoratorStar {


    public DancingSkill(SuperStar superStar) {
        super(superStar);
    }

    public void dancing(){
        System.out.println("明星学习跳舞");
    }

    @Override
    public void singing() {
        this.dancing();
        super.singing();
    }
}
