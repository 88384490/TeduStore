package cn.tedu.store.aop;

import javax.annotation.Resource;

/**
 * 代理类的特点
 * 1. 和目标类有共同的接口
 * 2. 同时拥有目标类的对象和切面类的对象
 */
public class StudentProxy implements StudentService{

    @Resource
    private StudentService studentService;
    @Resource
    private StudentAspect studentAspect;
    //模拟前置通知
    @Override
    public void add() {
        studentAspect.test();
        studentService.add();
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void get() {

    }

    @Override
    public void getALL() {

    }
}
