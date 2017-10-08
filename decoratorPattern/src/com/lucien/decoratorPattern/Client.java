package com.lucien.decoratorPattern;

/**
 * Created by Lucien on 2017/4/24.
 */
public class Client {
    public static void main(String[] args) {
        SuperStar superStar = new NewStar();
        superStar = new DancingSkill(superStar);
        superStar = new StudyInCollege(superStar);
        superStar = new SingingSkill(superStar);
        superStar.singing();
        superStar.playMovie();
    }
}
