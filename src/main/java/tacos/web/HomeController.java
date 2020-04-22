package tacos.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: TacoCloud
 * @description: 主页控制器
 * @author: wjk
 * @create: 2020-04-17 14:46
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}