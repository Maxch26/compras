package mx.uv.ejercicio.Factura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import vv.mx.uv.consumo.wsdl.GenerarFacturaRequest;
import vv.mx.uv.consumo.wsdl.GenerarFacturaResponse;


public class FacturasCliente extends WebServiceGatewaySupport{
    @Autowired
    private Jaxb2Marshaller marshallerFactura;
    /*REGISTRAR PRODUCTO REQUEST ES  LA CLASE QUE SE OBTIENE DE PRODUCTOS
     * ESTO SE GENERO DADO QUE EN EL POM SE DESCARGAN LAS CLASES DADO EL URL DEL WSDL DEL PLUGIN
    */
    //! EN EL PARAMETRO SE PASA EL REGISTRAR PRODUCTO REQUEST DADO QUE VAMOS A RETORNAR UN REGISTRARPRODUCTORESPONSE
    //! SE HACE USO DE REGISTRARPRODUCTORESPONSE DADO QUE SE HARA ALUCIÓN A ESA ACCIÓN DEL D
     public GenerarFacturaResponse generarFactura(GenerarFacturaRequest request){
        
            return (GenerarFacturaResponse) getWebServiceTemplate()
            .marshalSendAndReceive(request, new SoapActionCallback("https://facturas-production-a07e.up.railway.app/ws/facturas"));
        
    }
}
