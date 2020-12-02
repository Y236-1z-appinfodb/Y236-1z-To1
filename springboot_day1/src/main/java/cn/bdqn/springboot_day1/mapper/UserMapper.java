package cn.bdqn.springboot_day1.mapper;

import cn.bdqn.springboot_day1.domain.T_account;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<T_account> {
}
