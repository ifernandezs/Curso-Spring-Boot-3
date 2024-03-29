package es.ejemplo.factura.ejemplofactura.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import es.ejemplo.factura.ejemplofactura.models.Item;
import es.ejemplo.factura.ejemplofactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

        @Bean
        List<Item> itemsInvoice() {
                return Arrays.asList(
                                Item.builder()
                                                .product(Product.builder().name("Camara Sony").price(100).build())
                                                .quantity(2).build(),
                                Item.builder()
                                                .product(Product.builder().name("Television Samsung").price(100)
                                                                .build())
                                                .quantity(4).build());
        }

        @Bean("default")
        List<Item> itemsInvoiceOffice() {
                return Arrays.asList(
                                Item.builder()
                                                .product(Product.builder().name("Monitor Asus 24").price(100).build())
                                                .quantity(4).build(),
                                Item.builder()
                                                .product(Product.builder().name("NoteBook Racer").price(100)
                                                                .build())
                                                .quantity(6).build(),
                                Item.builder()
                                                .product(Product.builder().name("Impresora Hp").price(100).build())
                                                .quantity(2).build(),
                                Item.builder()
                                                .product(Product.builder().name("Escritorio").price(100)
                                                                .build())
                                                .quantity(4).build());
        }
}
