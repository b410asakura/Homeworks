package com.company;

import java.awt.desktop.ScreenSleepEvent;
import java.lang.invoke.LambdaConversionException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    Bread bread = new Bread(350, 25);
	    bread.bakeBread();
	    bread.packBread();
	    bread.show();
	    bread.setPriceSom(scanner.nextInt());
	    bread.setWeightGramm(scanner.nextInt());
		System.out.println();

	    Lepeshka lepeshka = new Lepeshka();
	    lepeshka.drawPrints();
	    lepeshka.bakeBread();
	    lepeshka.varnish();
	    lepeshka.packBread();
	    lepeshka.show();
	    lepeshka.setPriceSom(scanner.nextInt());
	    lepeshka.setWeightGramm(scanner.nextInt());
		System.out.println();

		Lavash lavash = new Lavash();
		lavash.bakeBread();
		lavash.packBread();
		lavash.show();
		lavash.setPriceSom(scanner.nextInt());
		lavash.setWeightGramm(scanner.nextInt());
		lavash.setBrandName(scanner.next());
		System.out.println();

		Baget baget = new Baget();
		baget.bakeBread();
		baget.packBread();
		baget.show();
		baget.setPriceSom(scanner.nextInt());
		baget.setWeightGramm(scanner.nextInt());
		baget.setBrandName(scanner.next());
    }
}
