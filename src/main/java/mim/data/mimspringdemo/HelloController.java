package mim.data.mimspringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloServiceInterface helloService;

    public HelloController(HelloServiceInterface helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String hello() {
        return helloService.hello();
    }
@GetMapping(path = "/hello")
    public String wasHello(@RequestParam("name") String userName) {
        return helloService.wasHello(userName);
    }
}
