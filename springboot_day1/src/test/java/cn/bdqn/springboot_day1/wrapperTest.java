package cn.bdqn.springboot_day1;

import cn.bdqn.springboot_day1.domain.T_account;
import cn.bdqn.springboot_day1.mapper.UserMapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@SpringBootTest
public class wrapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public  void Test(){
        QueryWrapper<T_account> wrapper=new QueryWrapper<>();
        wrapper
                .likeRight("name","沈")
                .notLike("name","2");

        List<Map<String,Object>> maps=userMapper.selectMaps(wrapper);

              maps.forEach(System.out::println);

    }
}
