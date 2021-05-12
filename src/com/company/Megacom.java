package com.company;

public class Megacom extends MobileOperator{
    public Megacom(String number){
        super("500", number, 1.3, 1.7, 35);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("Megacom calling: (" + code + ") " + number);
        System.out.println("Playing Megacom music");
        return getCallPrize(code, minute);
    }

    @Override
    public double sendSMS(String code, String number, String textSMS) {
        System.out.println("Megacom sending SMS: (" + code +") " + number);
        System.out.println("SMS text: " + textSMS);
        return getSMSPrize(code);
    }
}
