import com.spring.proxy.ProxyFactory;
import com.spring.proxy.Calculator;
import com.spring.proxy.impl.CalculatorImpl;
import org.junit.Test;

/**
 * @Author wzc
 * @Date 2022/9/11
 */
public class TestProxy {

    @Test
    public void testProxy() {
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
