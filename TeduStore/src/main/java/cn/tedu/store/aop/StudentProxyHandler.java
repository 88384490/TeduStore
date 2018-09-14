package cn.tedu.store.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import javax.annotation.Resource;

/**
 * jdk动态代理的实现
 * 注意：StudentProxyHandler并不是动态代理类，是辅助类
 * 辅助类特点：必须要实现InvocationHandler
 */
public class StudentProxyHandler implements InvocationHandler {
    @Resource
    private StudentService studentService;
    @Resource
    private StudentAspect studentAspect;

    //通过反射，实现目标类的方法的调用
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public Object getObject() {
        return Proxy.newProxyInstance(
            studentService.getClass().getClassLoader(),
            studentService.getClass().getInterfaces(), this
        );
    }
}
