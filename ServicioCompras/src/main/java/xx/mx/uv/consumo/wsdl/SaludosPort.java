
package xx.mx.uv.consumo.wsdl;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;
import jakarta.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "saludosPort", targetNamespace = "t4is.uv.mx/saludos")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SaludosPort {


    /**
     * 
     * @param productoDisponibleRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.ProductoDisponibleResponse
     */
    @WebMethod(operationName = "ProductoDisponible")
    @WebResult(name = "ProductoDisponibleResponse", targetNamespace = "t4is.uv.mx/saludos", partName = "ProductoDisponibleResponse")
    public ProductoDisponibleResponse productoDisponible(
        @WebParam(name = "ProductoDisponibleRequest", targetNamespace = "t4is.uv.mx/saludos", partName = "ProductoDisponibleRequest")
        ProductoDisponibleRequest productoDisponibleRequest);

    /**
     * 
     * @param registrarProductoRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.RegistrarProductoResponse
     */
    @WebMethod(operationName = "RegistrarProducto")
    @WebResult(name = "RegistrarProductoResponse", targetNamespace = "t4is.uv.mx/saludos", partName = "RegistrarProductoResponse")
    public RegistrarProductoResponse registrarProducto(
        @WebParam(name = "RegistrarProductoRequest", targetNamespace = "t4is.uv.mx/saludos", partName = "RegistrarProductoRequest")
        RegistrarProductoRequest registrarProductoRequest);

    /**
     * 
     * @param historialProductosRequest
     * @return
     *     returns xx.mx.uv.consumo.wsdl.HistorialProductosResponse
     */
    @WebMethod(operationName = "HistorialProductos")
    @WebResult(name = "HistorialProductosResponse", targetNamespace = "t4is.uv.mx/saludos", partName = "HistorialProductosResponse")
    public HistorialProductosResponse historialProductos(
        @WebParam(name = "HistorialProductosRequest", targetNamespace = "t4is.uv.mx/saludos", partName = "HistorialProductosRequest")
        Object historialProductosRequest);

}