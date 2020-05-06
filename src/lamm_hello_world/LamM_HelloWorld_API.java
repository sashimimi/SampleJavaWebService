package lamm_hello_world;

public class LamM_HelloWorld_API {
	
	public static LamM_ProductDB aProductDB;
	
	public String createProductDB_Object()
	{
	
		String rValue = "";
		try{
			aProductDB = new LamM_ProductDB();
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
			LamM_HelloWorld aProduct = LamM_ProductDB.getProduct(aProductCode);
		rValue = aProduct.toString();	
		}
		catch(Exception err)
		{
			rValue = "Error: " + err.toString();
		}
		return rValue;
		
	}
	
	public LamM_HelloWorld getProductObject(String aProductCode)
	{
		try{
			LamM_HelloWorld aProduct = LamM_ProductDB.getProduct(aProductCode);
		return aProduct;	
		}
		catch(Exception err)
		{
			LamM_HelloWorld aProduct = LamM_ProductDB.getProduct(err.toString());
			return aProduct;
		}
	}
	
}
