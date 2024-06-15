package mx.uv.ejercicio.Factura;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;


@Configuration
public class FacturasConfig {
    @Bean
    public Jaxb2Marshaller marshallerFactura(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // revisar en el pom.xml <packageName>
        marshaller.setContextPath("vv.mx.uv.consumo.wsdl");//!ESTA RUTA ESTA EN EL POM
        return marshaller;
    }

    /*
     !EL METODO HACE REFERENCIA A LA CLASE CREADA DE ProductosCliente 
     */
    @Bean
    public FacturasCliente clienteFactura(@Qualifier("marshallerFactura") Jaxb2Marshaller marshallerFactura){
        FacturasCliente c = new FacturasCliente();//!SE CREA UN OBJETO DE LA CLASE PRODUCTOSCLIENTE
        // URI donde está el servicio
        c.setDefaultUri("https://facturas-production-a07e.up.railway.app/ws/facturas");//!SE HACE ENFASIS AL WEB SERVICE A CONSUMIR
        c.setMarshaller(marshallerFactura);
        c.setUnmarshaller(marshallerFactura);
        return c;
    }
}
