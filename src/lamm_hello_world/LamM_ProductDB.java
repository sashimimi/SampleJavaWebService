package lamm_hello_world;


public class LamM_ProductDB
{
    public static LamM_HelloWorld getProduct(String productCode)
    {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        // create the Product object
    	LamM_HelloWorld product = new LamM_HelloWorld();

        // fill the Product object with data based on productCode received
        product.setCode(productCode);
        
        if (productCode.equalsIgnoreCase("java"))
        {
            product.setDescription("Murach's Beginning Java 2");
            product.setPrice(49.50);
            product.setName("Joel Murach");
        }
        else if (productCode.equalsIgnoreCase("jsps"))
        {
            product.setDescription("Murach's Java Servlets and JSP");
            product.setPrice(49.50);
            product.setName("Joel Murach");
        }
        else if (productCode.equalsIgnoreCase("mcb2"))
        {
            product.setDescription("Murach's Mainframe COBOL");
            product.setPrice(59.50);
            product.setName("Mike Murach");
        }
        else if (productCode.equalsIgnoreCase("txtp"))
        {
            product.setDescription("TextPad");
            product.setPrice(20.00);
            product.setName("Microsoft");
        }
        else if (productCode.equalsIgnoreCase("php"))
        {
        	product.setDescription("Murach's PHP and MySQL");
        	product.setPrice(49.50);
        	product.setName("Joel Murach");
        }
        else
        {
            product.setDescription("Unknown Product Code");
            product.setName("Unknown Name");
        }
        return product;
    }
}