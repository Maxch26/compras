package mx.uv.ejercicio.ComprasCliente;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class ProductosConfig {
    @Bean
    public Jaxb2Marshaller marshallerProductos(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // revisar en el pom.xml <packageName>
        marshaller.setContextPath("xx.mx.uv.consumo.wsdl");//!ESTA RUTA ESTA EN EL POM
        return marshaller;
    }

    /*
     !EL METODO HACE REFERENCIA A LA CLASE CREADA DE ProductosCliente 
     */
    @Bean
    public ProductosCliente clienteProducto(@Qualifier("marshallerProductos") Jaxb2Marshaller marshallerCompra){
        ProductosCliente c = new ProductosCliente();//!SE CREA UN OBJETO DE LA CLASE PRODUCTOSCLIENTE
        // URI donde está el servicio
        c.setDefaultUri("https://produsctoss-production.up.railway.app/ws/productos");//!SE HACE ENFASIS AL WEB SERVICE A CONSUMIR
        c.setMarshaller(marshallerCompra);
        c.setUnmarshaller(marshallerCompra);
        return c;
    }
}
