package org.example.springboot;

import org.example.springboot.entity.UserInfo;
import org.example.springboot.repository.UserInfoRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * <p>Jpa测试</p>
 *
 * @author : ninggelin
 * @date : 2022-04-21 09:36
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class JpaTest {

    @Autowired
    private UserInfoRepository userInfoRepository;

    @Test
    public void testDate() {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(2L);
        userInfo.setDate(new Date());
        userInfoRepository.save(userInfo);
    }

    public static void main(String[] args) {
        Integer state = 1;
        System.out.println(state == 1);
    }
}
