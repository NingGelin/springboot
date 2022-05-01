package org.example.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.springboot.entity.UserInfo;

/**
 * UserInfo dao层（mybatis plus）
 *
 * @author ninggelin
 * @date 2022-04-21 16:14:01
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo>{
}
