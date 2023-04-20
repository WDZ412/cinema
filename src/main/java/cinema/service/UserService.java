package cinema.service;

import cinema.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
* @author A
* @description 针对表【user】的数据库操作Service
* @createDate 2023-03-27 16:05:20
*/
public interface UserService extends IService<User> {
    User getUser(String account,String password);
    Boolean updateUserPasswordById(Long userId,String password);
    Boolean deleteUserById(Long userId);
    Boolean updateUserNameById(Long userId,String name);
    Boolean addUser(User user);
}
