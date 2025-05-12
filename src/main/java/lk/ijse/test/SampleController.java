package lk.ijse.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 5/12/2025 6:18 AM
 * Project: Test
 * --------------------------------------------
 **/

@RestController
@RequestMapping("/api")
public class SampleController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }

    @GetMapping("/test")
    public String getHello() {
        return "test";
    }
}

