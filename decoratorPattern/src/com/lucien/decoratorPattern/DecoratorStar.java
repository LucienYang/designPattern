package com.lucien.decoratorPattern;

/**
 * Created by Lucien on 2017/4/24.
 */
public class DecoratorStar extends SuperStar {
    private SuperStar superStar;

    public DecoratorStar(SuperStar superStar) {
        this.superStar = superStar;
    }

    @Override
    public void singing() {
        this.superStar.singing();
    }

    @Override
    public void playMovie() {
        this.superStar.playMovie();
    }
}
