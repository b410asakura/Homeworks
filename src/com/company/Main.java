package com.company;

public class Main {

    public static void main(String[] args) {

        HHD hdd = new HHD(1024, 2);
        Display display = new Display(20, 1000, "very zynk");
        RAM ram = new RAM(16, 2048);
        USB usb = new USB("blabla", 404);
        Keyboard keyboard = new Keyboard(true, true);

        Computer myComp = new Computer("asus", "grey",
                "RX3070", hdd, display, ram, usb, keyboard);

        myComp.printInfo();
    }
}
