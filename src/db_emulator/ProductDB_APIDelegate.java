package db_emulator;

import javax.jws.WebService;


@WebService (targetNamespace="http://db_emulator/", serviceName="ProductDB_APIService", portName="ProductDB_APIPort")
public class ProductDB_APIDelegate{

    db_emulator.ProductDB_API _productDB_API = null;

    public String createProductDB_Object () {
        return _productDB_API.createProductDB_Object();
    }

    public String getProduct (String aProductCode) {
        return _productDB_API.getProduct(aProductCode);
    }

    public Product getProductObject (String aProductCode) {
        return _productDB_API.getProductObject(aProductCode);
    }

    public ProductDB_APIDelegate() {
        _productDB_API = new db_emulator.ProductDB_API(); }

}