package com.kosarevskiy.systechtestapp.mvp.model;


public class Currency {

    private int scale;
    private String name;
    private String charCode;
    private double rate;

    public Currency() {
    }

    public Currency(int scale, String name, String charCode, double rate) {
        this.scale = scale;
        this.name = name;
        this.charCode = charCode;
        this.rate = rate;
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

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "scale=" + scale +
                ", name='" + name + '\'' +
                ", charCode='" + charCode + '\'' +
                ", rate=" + rate +
                '}';
    }
}
