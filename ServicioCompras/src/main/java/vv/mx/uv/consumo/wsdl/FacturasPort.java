
package vv.mx.uv.consumo.wsdl;

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
@WebService(name = "facturasPort", targetNamespace = "https://t4is.uv.mx/facturas")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FacturasPort {


    /**
     * 
     * @param generarFacturaRequest
     * @return
     *     returns vv.mx.uv.consumo.wsdl.GenerarFacturaResponse
     */
    @WebMethod(operationName = "GenerarFactura")
    @WebResult(name = "GenerarFacturaResponse", targetNamespace = "t4is.uv.mx/facturas", partName = "GenerarFacturaResponse")
    public GenerarFacturaResponse generarFactura(
        @WebParam(name = "GenerarFacturaRequest", targetNamespace = "t4is.uv.mx/facturas", partName = "GenerarFacturaRequest")
        GenerarFacturaRequest generarFacturaRequest);

    /**
     * 
     * @param historialFacturasRequest
     * @return
     *     returns vv.mx.uv.consumo.wsdl.HistorialFacturasResponse
     */
    @WebMethod(operationName = "HistorialFacturas")
    @WebResult(name = "HistorialFacturasResponse", targetNamespace = "t4is.uv.mx/facturas", partName = "HistorialFacturasResponse")
    public HistorialFacturasResponse historialFacturas(
        @WebParam(name = "HistorialFacturasRequest", targetNamespace = "t4is.uv.mx/facturas", partName = "HistorialFacturasRequest")
        Object historialFacturasRequest);

}
