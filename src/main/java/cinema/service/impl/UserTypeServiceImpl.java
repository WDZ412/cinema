package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.UserType;
import cinema.service.UserTypeService;
import cinema.mapper.UserTypeMapper;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【user_type】的数据库操作Service实现
* @createDate 2023-03-27 16:05:24
*/
@Service
public class UserTypeServiceImpl extends ServiceImpl<UserTypeMapper, UserType>
    implements UserTypeService{

}




