package com.zuolizhu.Interfaces;

public class Gearbox {
    private boolean clutchIsIn;

    /**
     * if this component has changed, the program is easy to broke
     */
    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
