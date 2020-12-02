package cn.bdqn.springboot_day1.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@ConfigurationProperties(prefix = "user")  //读取application配置文件
@Validated       //用于校验
public class T_account {

  @TableId(type = IdType.AUTO )
   int id ;
    String name;
     Integer age;
    /* Boolean boss;
     Date  birth;
     Map<String,Object> map;
     List<Object> list;
     Dog dog;
     String lastName;*/
     String balance;
     @TableField(fill = FieldFill.INSERT)   //自动注解
     Date createTime;
     @TableField(fill =FieldFill.INSERT_UPDATE)   //自动注解
     Date updateTime;
     @Version  //乐观锁
     int version;

     @TableLogic //逻辑删除
     int deleted;

    /* String Email;*/
}
