import com.yhy.application.Application;
import com.yhy.application.service.ApiService;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author YuHongYe
 * @create 2019-04-08-16:04
 */
@SpringBootTest(classes = Application.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class Test {
    @Resource
    private ApiService apiService;

    @org.junit.Test
    public void test(){
        System.out.println(apiService.index());
    }
}
