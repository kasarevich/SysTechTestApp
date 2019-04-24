package com.kosarevskiy.systechtestapp.mvp.model;


public class Currency {

    private int scale;
    private String name;
    private String charCode;
    private double firstDayRate;
    private double secondDayRate;
    private boolean isEnable;
    private int order;

    public Currency() {
    }

    public Currency(int scale, String name, String charCode, double firstDayRate, double secondDayRate, boolean isEnable, int order) {
        this.scale = scale;
        this.name = name;
        this.charCode = charCode;
        this.firstDayRate = firstDayRate;
        this.secondDayRate = secondDayRate;
        this.isEnable = isEnable;
        this.order = order;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharCode() {
        return charCode;
    }

    public void setCharCode(String charCode) {
        this.charCode = charCode;
    }

    public double getFirstDayRate() {
        return firstDayRate;
    }

    public void setFirstDayRate(double firstDayRate) {
        this.firstDayRate = firstDayRate;
    }

    public double getSecondDayRate() {
        return secondDayRate;
    }

    public void setSecondDayRate(double secondDayRate) {
        this.secondDayRate = secondDayRate;
    }

    public boolean isEnable() {
        return isEnable;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
