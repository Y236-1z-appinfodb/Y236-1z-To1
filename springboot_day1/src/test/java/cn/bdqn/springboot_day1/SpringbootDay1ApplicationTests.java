package cn.bdqn.springboot_day1;

import cn.bdqn.springboot_day1.domain.T_account;
import cn.bdqn.springboot_day1.mapper.UserMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import  org.slf4j.Logger;
import  org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@SpringBootTest
class SpringbootDay1ApplicationTests {


    @Autowired
   private   UserMapper userMapper;
    //plus
    @Test
    void contextLoads() {
        //普通查询
        List<T_account> list=userMapper.selectList(null);
        //in 查询 selectBatchIds
     //   List<T_account> list1=userMapper.selectBatchIds(Arrays.asList(1,2,3));
        //筛选查询 map
      //  Map<String,Object> map=new HashMap<>();
     //   map.put("name","沈野");  //map值为筛选条件
    //    map.put("age",20);  //map值为筛选条件
    //    List<T_account> list2=userMapper.selectByMap(map);

        list.forEach(System.out::println);

    }

    //plus
    @Test
    void TestInsert(){
        T_account user=new T_account();
        user.setBalance("0000");
        user.setAge(21);
        user.setName("沈野");
        int result=userMapper.insert(user);
        System.out.println(">>>>>>>>>>>>>"+result);
        System.out.println(user);
    }

    //plus
    @Test
    void TestUpdate(){
        T_account user=userMapper.selectById(508);
       user.setId(508);
        user.setAge(21);
        user.setName("沈野测试乐观锁");

        T_account user1=userMapper.selectById(508);
        user1.setId(508);
        user1.setAge(22);
        user1.setName("沈野测试乐观锁之并发");
        int result2=userMapper.updateById(user1);
        int result=userMapper.updateById(user);
        System.out.println(">>>>>>>>>>>>>"+result2);
        System.out.println(">>>>>>>>>>>>>"+result);
        System.out.println(user);
    }

    //boot测试
    @Test
    public  void logTest(){
       Logger logger=LoggerFactory.getLogger(getClass());
        //日志的级别；
        //由低到高   trace<debug<info<warn<error
        //可以调整输出的日志级别；日志就只会在这个级别以以后的高级别生效
        logger.trace("这是trace日志...");
        logger.debug("这是debug日志...");
        //SpringBoot默认给我们使用的是info级别的，没有指定级别的就用SpringBoot默认规定的级别；root级别
        logger.info("这是info日志...");
        logger.warn("这是warn日志...");
        logger.error("这是error日志...");
    }
    //plus
    @Test
    public  void Feny_Test(){
        Page<T_account> page=new Page<>(7,10);
        userMapper.selectPage(page,null);
        System.out.println( "第"+page.getCurrent()+"页-----------------------------");
            page.getRecords().forEach(System.out::println);
        System.out.println( "每页"+page.getSize()+"条记录---------------------------------");
        System.out.println( page.getTotal()+"总记录数");
        System.out.println("总页数"+ page.getPages());
    }

    //plus
    @Test
    public  void DelectTest(){
        //id删除
        // userMapper.deleteById(2);
        //批量删除
    //    userMapper.deleteBatchIds(Arrays.asList(3,4));
        //Map删除
        Map<String,Object> map=new HashMap<>();
        map.put("id",5);
        userMapper.deleteByMap(map);
}







}
