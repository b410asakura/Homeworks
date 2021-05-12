package com.company;

public class MobileOperator {
    private String code;
    private String number;
    private double minutePrice;
    private double smsPrice;
    private double gbPrice;

    public MobileOperator(){}

    public MobileOperator(String code, String number, double minutePrice,
                          double smsPrice, double gbPrice) {
        this.code = code;
        this.number = number;
        this.minutePrice = minutePrice;
        this.smsPrice = smsPrice;
        this.gbPrice = gbPrice;
    }

    public double call(String code, String number, double minute){
        System.out.println("Calling: (" + code + ") " + number);
        return getCallPrize(code, minute);
    }

    public double sendSMS(String code, String number, String textSMS){
        System.out.println("Sending SMS: (" + code +") " + number);
        System.out.println("SMS text: " + textSMS);
        return getSMSPrize(code);
    }

    public double useInternet(double amountGB){
        System.out.println("Using: " + amountGB + ") GB of internet");
        return getInternetPrize(amountGB);
    }

    public double getCallPrize(String code, double minute){
        if (code.equals(this.code)) return 0;
        else return minute * minutePrice;
    }

    public double getSMSPrize(String code){
        if (code.equals(this.code)) return 0;
        else return smsPrice;
    }

    public double getInternetPrize(double amountGB){
        return amountGB * gbPrice;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getMinutePrice() {
        return minutePrice;
    }

    public void setMinutePrice(double minutePrice) {
        this.minutePrice = minutePrice;
    }

    public double getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(double smsPrice) {
        this.smsPrice = smsPrice;
    }

    public double getGbPrice() {
        return gbPrice;
    }

    public void setGbPrice(double gbPrice) {
        this.gbPrice = gbPrice;
    }
}
