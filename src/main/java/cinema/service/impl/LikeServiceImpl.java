package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.Like;
import cinema.service.LikeService;
import cinema.mapper.LikeMapper;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【like】的数据库操作Service实现
* @createDate 2023-04-02 19:21:49
*/
@Service
public class LikeServiceImpl extends ServiceImpl<LikeMapper, Like>
    implements LikeService{
    @Override
    public Boolean addLike(Like like){
        if(baseMapper.insert(like)>0){
            return true;
        }
        return false;
    }
}




