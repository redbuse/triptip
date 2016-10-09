package com.example.hc.triputil;


import java.util.HashMap;

/**
 * Created by hc on 2016-10-08.
 */

public class ExchangeRepo {
    String disclaimer;
    String license;
    Integer timestamp;
    String base;
    HashMap<String, Float>  rates;


    public String getDisclaimer()
    {
        return disclaimer;
    }

    public String getLicese()
    {
        return license;
    }

    public Integer getTimestamp()
    {
        return timestamp;
    }

    public String getBase()
    {
        return base;
    }

    public HashMap getRates()
    {
        return rates;
    }
}
