package org.jamescarr.configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("org.jamescarr.prime")
@ImportResource({
	"classpath:com/jamescarr/example/cache-context.xml", 
	"classpath:springmvc-resteasy.xml"})
public class AppConfig {
}
