package com.kosarevskiy.systechtestapp.data.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.Objects;

@Entity(tableName = "rates")
public class Currency {
    @PrimaryKey
    private int scale;
    private String name;
    private String charCode;
    private double firstDayRate;
    private double secondDayRate;
    private String firstDate;
    private String secondDate;

    @ColumnInfo(name = "is_enable")
    private boolean isEnable;
    @ColumnInfo(name = "user_order")
    private int order;

    public Currency() {
    }

    public Currency(int scale, String name, String charCode, double firstDayRate, double secondDayRate, String firstDate, String secondDate, boolean isEnable, int order) {
        this.scale = scale;
        this.name = name;
        this.charCode = charCode;
        this.firstDayRate = firstDayRate;
        this.secondDayRate = secondDayRate;
        this.firstDate = firstDate;
        this.secondDate = secondDate;
        this.isEnable = isEnable;
        this.order = order;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getSecondDate() {
        return secondDate;
    }

    public void setSecondDate(String secondDate) {
        this.secondDate = secondDate;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currency currency = (Currency) o;
        return scale == currency.scale &&
                Double.compare(currency.firstDayRate, firstDayRate) == 0 &&
                Double.compare(currency.secondDayRate, secondDayRate) == 0 &&
                isEnable == currency.isEnable &&
                order == currency.order &&
                Objects.equals(name, currency.name) &&
                Objects.equals(charCode, currency.charCode);
    }

    @Override
    public int hashCode() {

        return Objects.hash(scale, name, charCode, firstDayRate, secondDayRate, isEnable, order);
    }
}
