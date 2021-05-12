package com.company;

public class Beeline extends MobileOperator{
    public Beeline(String number){
        super("777", number, 1, 1.2, 30);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("Beeline calling: (" + code + ") " + number);
        System.out.println("Playing Beeline music");
        return getCallPrize(code, minute);
    }

    @Override
    public double sendSMS(String code, String number, String textSMS) {
        System.out.println("Beeline sending SMS: (" + code +") " + number);
        System.out.println("SMS text: " + textSMS);
        return getSMSPrize(code);
    }
}
