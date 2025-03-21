package io.geekidea.boot.cat.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import io.geekidea.boot.cat.data.UserProfile;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenzeng
 * @version 0.0.1
 * @date 2025/3/20 00:11
 */
@Mapper
public interface UserProfileMapper extends BaseMapper<UserProfile> {

}