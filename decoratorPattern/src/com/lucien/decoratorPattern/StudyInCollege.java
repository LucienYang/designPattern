package com.lucien.decoratorPattern;

/**
 * Created by Lucien on 2017/4/24.
 */
public class StudyInCollege extends DecoratorStar {
    public StudyInCollege(SuperStar superStar) {
        super(superStar);
    }

    public void study(){
        System.out.println("电影学院学习表演");
    }

    @Override
    public void playMovie() {
        this.study();
        super.playMovie();
    }
}
