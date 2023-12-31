package com.ohrm.factories;

import com.ohrm.utils.FrameworkConfig;

public final class ConfigFactory { //no one can extend this

    private ConfigFactory(){}

    public static FrameworkConfig getConfig(){
        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}