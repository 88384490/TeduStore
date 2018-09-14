package cn.tedu.store.aop;

import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Override
    public void add() {
        System.out.println("添加成功");
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
