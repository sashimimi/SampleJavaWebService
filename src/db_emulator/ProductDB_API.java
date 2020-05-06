package db_emulator;

/* The "Application Interface"/API class "exposes" those methods that you wish
 * clients (often from outside organizations/companies) to be able to access / utilize.
 */

public class ProductDB_API {
	
	public static ProductDB aProductDB;
		
	public String createProductDB_Object()
	{
	
		String rValue = "";
		try{
			aProductDB = new ProductDB();
			rValue =  "ProductDB object created successfully";
		}
		catch(Exception err)
		{
			rValue = "Error: " + err.toString();
		}
		
		return rValue;
	}
	
	public String getProduct(String aProductCode)
	{
		String rValue = "";
		try{
		Product aProduct = ProductDB.getProduct(aProductCode);
		rValue = aProduct.toString();	
		}
		catch(Exception err)
		{
			rValue = "Error: " + err.toString();
		}
		return rValue;
		
	}
	
	public Product getProductObject(String aProductCode)
	{
		try{
		Product aProduct = ProductDB.getProduct(aProductCode);
		return aProduct;	
		}
		catch(Exception err)
		{
			Product aProduct = ProductDB.getProduct(err.toString());
			return aProduct;
		}
	
		
	}

}
