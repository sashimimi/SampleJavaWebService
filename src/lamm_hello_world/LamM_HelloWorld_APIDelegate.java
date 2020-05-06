package lamm_hello_world;

import javax.jws.WebService;


@WebService (targetNamespace="http://lamm_hello_world/", serviceName="LamM_HelloWorld_APIService", portName="LamM_HelloWorld_APIPort")
public class LamM_HelloWorld_APIDelegate{

    lamm_hello_world.LamM_HelloWorld_API _lamM_HelloWorld_API = null;

    public String createProductDB_Object () {
        return _lamM_HelloWorld_API.createProductDB_Object();
    }

    public String getProduct (String aProductCode) {
        return _lamM_HelloWorld_API.getProduct(aProductCode);
    }

    public LamM_HelloWorld getProductObject (String aProductCode) {
        return _lamM_HelloWorld_API.getProductObject(aProductCode);
    }

    public LamM_HelloWorld_APIDelegate() {
        _lamM_HelloWorld_API = new lamm_hello_world.LamM_HelloWorld_API(); }

}