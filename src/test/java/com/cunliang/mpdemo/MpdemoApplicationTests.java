package com.cunliang.mpdemo;

import com.cunliang.mpdemo.entity.User;
import com.cunliang.mpdemo.mapper.UserMapper;
import lombok.var;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MpdemoApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

    @Test
    public void insert(){
        User user = new User();
        user.setName("pang");
        user.setAge(3);
       // user.setID(6L);
        user.setEmail("pangpang@love.com");
        userMapper.insert(user);
    }

    @Test
    public void updateUser() {
        /**
         *修改某个数据
         */
        User user = new User();
        user.setID(2L);
        user.setAge(50);
        int row = userMapper.updateById(user);
        System.out.println(row);
    }

}
