package com.ice;

import com.ice.entity.User;
import com.ice.mapper.UserMapper;
import org.apache.ibatis.binding.MapperProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author ice
 * @date 19-3-21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        User user = new User();
        user.setId(10L);
        user.setPassword("123");
        user.setName("zhangsan");
        MapperProxy mapperProxy = null;
        userMapper.insert(user);
    }
}
