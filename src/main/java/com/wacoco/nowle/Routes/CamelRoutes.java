package com.wacoco.nowle.Routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelRoutes extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("direct:patent")
                .to("http://localhost:3000/patent")
                .log("Data retrieved from Camel controller")
                .log("");
        from("direct:linkedin")
                .to("http://localhost:3000/linkedin")
                .log("Data retrieved from Camel controller")
                .log("");

    }
}
