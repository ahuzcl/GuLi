package com.cunliang.mpdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cunliang.mpdemo.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
public interface UserMapper extends BaseMapper<User> {
}
