import com.spring.aop.Calculator;
import com.spring.aop.impl.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author wzc
 * @Date 2022/9/12
 */
public class AspectTest {

    @Test
    public void testAspect() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aspect.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.add(1, 1);
    }
}
