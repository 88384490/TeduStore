package aop;

import cn.tedu.store.aop.StudentProxy;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAop {
    @Test
    public void testProxy(){
        AbstractApplicationContext ac =
                new ClassPathXmlApplicationContext("application-aop.xml","application-service.xml");
        ac.getBean("studentProxy",StudentProxy.class);
    }


}
