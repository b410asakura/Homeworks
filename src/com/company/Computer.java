package com.company;

public class Computer {
    String marka;
    String color;
    String graphicsCard;
    HHD hardDisk;
    Display display;
    RAM ram;
    USB usb;
    Keyboard keyboard;

    public Computer() {
    }

    public Computer(String marka, String color, String graphicsCard,
                    HHD hardDisk, Display display, RAM ram, USB usb, Keyboard keyboard) {
        this.marka = marka;
        this.color = color;
        this.graphicsCard = graphicsCard;
        this.hardDisk = hardDisk;
        this.display = display;
        this.ram = ram;
        this.usb = usb;
        this.keyboard = keyboard;
    }

    public void printInfo(){
        System.out.println("Compucter characteristics:");
        System.out.println("Marka: " + marka + ", color: " + color);
        System.out.println("Graphics Card: " + graphicsCard);
        hardDisk.printInfo();
        display.printInfo();
        ram.printInfo();
        usb.printInfo();
        keyboard.printInfo();
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public HHD getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HHD hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public USB getUsb() {
        return usb;
    }

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
