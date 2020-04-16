package cn.demo.test;

import cn.demo.dao.UserDao;
import cn.demo.entity.User;
import cn.demo.service.UserService;
import cn.demo.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

/**
 * @author huluxia
 * @description 1
 * @date 2020/4/14
 **/

public class TestSpring {

    @Test()
    public void run() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.findAll();
    }

    @Test
    public void run1()throws  Exception {
        System.out.println(123);
        SqlSession sqlSession= SqlSessionFactoryUtil.getSqlSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        List<User> list = userDao.findAll();

        for(User user:list){
            System.out.println(user);
        }

    }

}
