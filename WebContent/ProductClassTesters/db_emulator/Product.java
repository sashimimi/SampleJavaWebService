package db_emulator;

import java.text.NumberFormat;

public class Product
{
	private String code;
	private String description;
	private double price;

	//default constructor method
	public Product()
	{
		setCode("Dflt");
		setDescription("Default Description");
		setPrice(0.0);
	}
	
	//parameterized constructor method
		public Product(String aCode)
		{
			setCode(aCode);
			setDescription("Description of " + aCode);
			setPrice(99.99);
		}
	
	
	//parameterized constructor method
	public Product(String aCode, String aDescription, double aPrice)
	{
		setCode(aCode);
		setDescription(aDescription);
		setPrice(aPrice);
	}

	public void setCode(String aCode)
	{
		code = aCode;
	}

	public String getCode(){
		return code;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getDescription()
	{
		return description;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getPrice()
	{
		return price;
	}

	public String getFormattedPrice()
	{
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		return currency.format(getPrice());
	}
	
	public String toString()
	{
		String rValue = "Product Code: " + getCode() + ", "
				+ "Product Description: " + getDescription()
				+ ", Product Price: " + getFormattedPrice();
		return rValue;
	}

}