package liu.cn.ixj.start;

import liu.cn.ixj.exceptions.ServiceException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@SpringBootApplication(scanBasePackages = {"liu.cn.ixj.start"})
@EnableWebSecurity
@Controller
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @RequestMapping("/select/aaa")
    @ResponseBody
    public ArrayList<TestDemo> aa(Integer i){
        System.out.println(10/i);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ArrayList<TestDemo> testDemos = new ArrayList<>();
        testDemos.add(new TestDemo());
        testDemos.add(new TestDemo());
        return testDemos;
    }

    @RequestMapping("/select/bbb")
    @ResponseBody
    public ArrayList<TestDemo> bb(Integer i) throws ServiceException {
        throw new ServiceException("这是一个测试异常");
    }
}
class  TestDemo{
    private String name1="1";
    private String name2="2";
    private String name3="3";
    private String name4="4";

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }
}