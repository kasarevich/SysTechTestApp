package com.kosarevskiy.systechtestapp.data.entity;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="DailyExRates", strict=false)
public class ExcangeRatesEntity {

    @Attribute(name = "Date")
    private String date;

    @ElementList(inline = true, required = false)
    private List<EntityCurrency> mEntityCurrencies;


    public List<EntityCurrency> getEntityCurrencies() {
        return mEntityCurrencies;
    }

    public void setEntityCurrencies(List<EntityCurrency> entityCurrencies) {
        mEntityCurrencies = entityCurrencies;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
