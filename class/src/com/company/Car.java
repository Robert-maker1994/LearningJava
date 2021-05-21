package com.company;

import javax.swing.*;
import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String engine;
    private String model;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("Tesla") || validModel.equals("modalx11")) {
            this.model = model;
        } else {
            this.model = "Dunno that pal";
        }
    }
    public String getModel( ) {
            return this.model;
        }
    }

