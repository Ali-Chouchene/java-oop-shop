package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	private int code;
	private String name;
	private String description;
	private double price;
	private double iva = 0.22;

	public Prodotto(String name, String description, double price) {

		Random rand = new Random();
		int ranNum = rand.nextInt(99999999 + 1 - 10) + 10;
		String ranNumL = Integer.toString(ranNum);

		if (ranNumL.length() < 8) {
			do {
				ranNumL += "0";
			} while (ranNumL.length() < 8);
			code = Integer.parseInt(ranNumL);
		}
		code = Integer.parseInt(ranNumL);

		setName(name);
		setDescription(description);
		setPrice(price);
	}

	public int getCode() {

		return code;
	}

	// --------------------------------------------------------------------------//
	public String getFullName() {
		String codeS = Integer.toString(code);
		String fullName = codeS + "-" + name;
		return fullName;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	// ----------------------------------------------------------------------//
	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	// --------------------------------------------------------------------//
	public double getPrice() {

		return price;
	}

	public void setPrice(double price) {

		this.price = price;
	}

	public double getFullPrice() {
		double fullPrice = price + (price * iva);
		return fullPrice;
	}
}
