package application.handler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuHongYe
 * @create 2019-04-06-11:10
 */
@RestController
public class HelloHandler {

    @Value("${server.port}")
    private int port;

    @RequestMapping("/index")
    public String intdex() {
        return "Hello word!!!!!!" + port;
    }
}
