package com.kosarevskiy.systechtestapp.data.entity;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "Currency", strict = false) // strict - нестрогая сериализация
public class EntityCurrency {
        @Element(name = "Scale")
        private String scale;
        @Element(name = "Name")
        private String name;
        @Element(name = "CharCode")
        private String charCode;
        @Element(name = "Rate")
        private String rate;

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
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

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
