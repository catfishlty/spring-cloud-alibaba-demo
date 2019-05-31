package top.catfish.dubboserver;

import org.apache.dubbo.config.annotation.Service;

import top.catifh.service.TestService;
/**
 * @author Catfish
 * @version V1.0 2019/5/31 15:11
 * @email catfish_lty@qq.com
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String echo(String data) {
        return "Response: "+data;
    }
}
