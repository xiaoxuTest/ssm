package cn.demo.dao;

import cn.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author xiaoxu
 * @date  2020年4月14日
 * @description user接口
 * */
@Repository
public interface UserDao {
    //查询所有用户
    public List<User> findAll();

    //保存用户
    public void  saveUser(User user);

    //修改用户
    public  void updateUser(User user);

    //删除用户
    public  void deleteUser(int id);

    //获取用户信息
    public  void getUserInfo(int id);
}
