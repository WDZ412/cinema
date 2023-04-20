package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.Business;
import cinema.service.BusinessService;
import cinema.mapper.BusinessMapper;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【business】的数据库操作Service实现
* @createDate 2023-04-13 19:28:47
*/
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business>
    implements BusinessService{

}




