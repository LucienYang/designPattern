package com.lucien.mediationPattern;

/**
 * Created by Lucien on 2017/4/16.
 */
public abstract class Colleague {
    protected AbstractMediation mediation;

    public Colleague(AbstractMediation mediation) {
        this.mediation = mediation;
    }
}
