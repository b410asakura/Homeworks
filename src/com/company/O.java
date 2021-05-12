package com.company;

public class O extends MobileOperator{
    public O(String number){
        super("700", number, 0.95, 2, 30);
    }

    @Override
    public double call(String code, String number, double minute) {
        System.out.println("O calling: (" + code + ") " + number);
        System.out.println("Playing O music");
        return getCallPrize(code, minute);
    }

    @Override
    public double sendSMS(String code, String number, String textSMS) {
        System.out.println("O sending SMS: (" + code +") " + number);
        System.out.println("SMS text: " + textSMS);
        return getSMSPrize(code);
    }
}
