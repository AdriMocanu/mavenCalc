package com.endava.google;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GsonExample {

    public static final Logger LOGGER = LogManager.getLogger(GsonExample.class);

    public static void main(String[] args) {

        Payment p = new Payment();
        p.setAmount(100);
        p.setCurrency("RON");
        p.setCardNumber("45226682364852");
        p.setCustomerName("John Travolta");


        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(p);
        LOGGER.info("\n{}",json);

        // \n -> insert a new line

        Payment dP = gson.fromJson(json, Payment.class);
        LOGGER.info(p.equals(dP));
        LOGGER.info(dP.getCardNumber());
    }
}
