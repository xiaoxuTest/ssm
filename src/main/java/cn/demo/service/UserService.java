package cn.demo.service;

import cn.demo.entity.User;

import java.util.List;

/**
 * @author xiaoxu
 * @date 2020年4月14日
 * @description user接口
 */

public interface UserService {
    //查询所有
    public List<User> findAll();

    //保存用户
    public void saveUser(User user);

    //修改用户
    public void updateUser(User user);

    //删除用户
    public void deleteUser(int id);

    //获取用户信息
    public void getUserInfo(int id);
}
