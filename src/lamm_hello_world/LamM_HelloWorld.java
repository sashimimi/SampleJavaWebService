package lamm_hello_world;

import java.text.NumberFormat;

public class LamM_HelloWorld {
	
	private String code;
	private String description;
	private double price;
	private String name;
	private String userName;

	//default constructor method
	public LamM_HelloWorld()
	{
		setCode("Dflt");
		setDescription("Default Description");
		setPrice(0.0);
		setName("Default Name");
	}
	
	//parameterized constructor method
	public LamM_HelloWorld(String aCode)
	{
		setCode(aCode);
		setDescription("Description of " + aCode);
		setPrice(99.99);
		setName("Default Name");
	}
	
	
	//parameterized constructor method
	public LamM_HelloWorld(String aCode, String aDescription, double aPrice, String aName)
	{
		setCode(aCode);
		setDescription(aDescription);
		setPrice(aPrice);
		setName(aName);
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString()
	{
		String rValue = "Product Code: " + getCode() + ", "
				+ "Product Description: " + getDescription()
				+ ", Product Price: " + getFormattedPrice()
				+ ", Hello world, Mimi Lam!";
		return rValue;
	}
}
