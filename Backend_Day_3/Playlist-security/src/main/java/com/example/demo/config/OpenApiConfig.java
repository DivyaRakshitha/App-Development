package com.example.demo.config;

	import com.example.demo.constant.Api;

	import io.swagger.v3.oas.annotations.OpenAPIDefinition;
	import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
	import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
	import io.swagger.v3.oas.annotations.info.Contact;
	import io.swagger.v3.oas.annotations.info.Info;
	import io.swagger.v3.oas.annotations.info.License;
	import io.swagger.v3.oas.annotations.security.SecurityScheme;
	import io.swagger.v3.oas.annotations.servers.Server;

	@OpenAPIDefinition(info = @Info(contact = @Contact(name = "Divya", email = "divya.p@gmail.com", url = "https://localhost:8080.com"), description = "This is open api documentation for playlist management system", title = "Playlist", version = "1.0", license = @License(name = "MIT", url = "https://some-url.com"), termsOfService = "Terms of service"), servers = @Server(description = "DEV ENV", url = Api.DEFAULT))
	@SecurityScheme(name = "bearerAuth", description = "JWT auth description", scheme = "bearer", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", in = SecuritySchemeIn.HEADER)
	public class OpenApiConfig {

	}


