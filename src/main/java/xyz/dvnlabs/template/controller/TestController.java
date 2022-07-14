package xyz.dvnlabs.template.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.dvnlabs.template.core.Translator;
import xyz.dvnlabs.template.dto.HelloWorldDTO;

@RestController
@RequestMapping("/test")
@Tag(name = "Test")
public class TestController {

    @GetMapping("/hello")
    @Operation(summary = "Hello World")
    public HelloWorldDTO helloWorld(){
        return new HelloWorldDTO(Translator.toLocale("hello"));
    }

}
