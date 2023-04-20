package cinema.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.User;
import cinema.service.UserService;
import cinema.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-03-27 16:05:20
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{
    @Override
    public User getUser(String account,String password){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq(account!=null,"account",account);
        queryWrapper.eq(password!=null,"password",password);
        return baseMapper.selectOne(queryWrapper);
    }
    @Override
    public Boolean updateUserPasswordById(Long userId,String password){
        if(baseMapper.updateUserPassword(userId,password)>0){
            return true;
        }
        return false;
    }
    @Override
    public Boolean deleteUserById(Long userId){
        QueryWrapper<User> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",userId);
        if(baseMapper.delete(queryWrapper)>0){
            return true;
        }
        return false;
    }
    @Override
    public Boolean updateUserNameById(Long userId,String name){
        if(baseMapper.updateUserName(userId,name)>0){
            return true;
        }
        return false;
    }
    @Override
    public Boolean addUser(User user){
        if(baseMapper.insert(user)>0){
            return true;
        }
        return false;
    }
}




