package com.company;

import com.google.gson.GsonBuilder;

public class Serialization {

    public static String serialize(Object input){
        GsonBuilder gsonBuilder = new GsonBuilder();
        return gsonBuilder.setPrettyPrinting().create().toJson(input);
    }

}