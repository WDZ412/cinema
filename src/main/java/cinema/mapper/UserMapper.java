package cinema.mapper;

import cinema.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
* @author A
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-03-27 16:05:20
* @Entity cinema.entity.User
*/
public interface UserMapper extends BaseMapper<User> {
    Integer updateUserPassword(@Param("userId") Long userId,@Param("password") String password);
    Integer updateUserName(@Param("userId") Long userId,@Param("name") String name);
}




