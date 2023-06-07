package mim.data.mimspringdemo;

import org.springframework.stereotype.Service;

@Service
public class HelloService implements HelloServiceInterface{

    public String hello() {
        return "<b>hello </b>";
    }

    public String wasHello(String userName) {
        return "<b>hello </b>" + userName;
    }
}
