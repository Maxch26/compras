
package vv.mx.uv.consumo.wsdl;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the vv.mx.uv.consumo.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HistorialFacturasRequest_QNAME = new QName("t4is.uv.mx/facturas", "HistorialFacturasRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: vv.mx.uv.consumo.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link HistorialFacturasResponse }
     * 
     */
    public HistorialFacturasResponse createHistorialFacturasResponse() {
        return new HistorialFacturasResponse();
    }

    /**
     * Create an instance of {@link GenerarFacturaRequest }
     * 
     */
    public GenerarFacturaRequest createGenerarFacturaRequest() {
        return new GenerarFacturaRequest();
    }

    /**
     * Create an instance of {@link GenerarFacturaResponse }
     * 
     */
    public GenerarFacturaResponse createGenerarFacturaResponse() {
        return new GenerarFacturaResponse();
    }

    /**
     * Create an instance of {@link HistorialFacturasResponse.Factura }
     * 
     */
    public HistorialFacturasResponse.Factura createHistorialFacturasResponseFactura() {
        return new HistorialFacturasResponse.Factura();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "t4is.uv.mx/facturas", name = "HistorialFacturasRequest")
    public JAXBElement<Object> createHistorialFacturasRequest(Object value) {
        return new JAXBElement<Object>(_HistorialFacturasRequest_QNAME, Object.class, null, value);
    }

}
