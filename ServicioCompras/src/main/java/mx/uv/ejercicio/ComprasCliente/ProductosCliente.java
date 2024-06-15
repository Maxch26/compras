package mx.uv.ejercicio.ComprasCliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import xx.mx.uv.consumo.wsdl.RegistrarProductoRequest;
import xx.mx.uv.consumo.wsdl.RegistrarProductoResponse;


public class ProductosCliente extends WebServiceGatewaySupport{
     @Autowired
     private Jaxb2Marshaller marshallerProductos;
    /*REGISTRAR PRODUCTO REQUEST ES  LA CLASE QUE SE OBTIENE DE PRODUCTOS
     * ESTO SE GENERO DADO QUE EN EL POM SE DESCARGAN LAS CLASES DADO EL URL DEL WSDL DEL PLUGIN
    */
    //! EN EL PARAMETRO SE PASA EL REGISTRAR PRODUCTO REQUEST DADO QUE VAMOS A RETORNAR UN REGISTRARPRODUCTORESPONSE
    //! SE HACE USO DE REGISTRARPRODUCTORESPONSE DADO QUE SE HARA ALUCIÓN A ESA ACCIÓN DEL D

    public RegistrarProductoResponse solicitarRegistro(RegistrarProductoRequest request){
        try{
            return (RegistrarProductoResponse) getWebServiceTemplate()
            .marshalSendAndReceive(request, new SoapActionCallback("https://produsctoss-production.up.railway.app/ws/productos"));
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            return null;
        } 
    }
    
}
