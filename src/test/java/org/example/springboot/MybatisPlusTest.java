package org.example.springboot;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.springboot.entity.UserInfo;
import org.example.springboot.mapper.UserInfoMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * <p>Mybatis Plus 练习</p>
 *
 * @author : ninggelin
 * @date : 2022-04-21 16:15
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusTest extends ServiceImpl<UserInfoMapper, UserInfo> {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void listUserInfo() {
        List<UserInfo> userInfoList = this.list();
        UserInfo userInfo = this.getById(111);

        QueryWrapper<UserInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("name", "aaa");
        queryWrapper.eq("id", 2);

        this.list(queryWrapper);
    }
}
