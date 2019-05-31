package top.catfish.dubboclient;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import top.catifh.service.TestService;

/**
 * @author Catfish
 * @version V1.0 2019/5/31 15:52
 * @email catfish_lty@qq.com
 */
@RestController
@RequestMapping("")
public class TestController {
    @Reference
    private TestService testService;

    @GetMapping("{msg}")
    public String test(@PathVariable("msg") String msg) {
        return testService.echo(msg);
    }
}
