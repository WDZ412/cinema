package cinema.service;

import cinema.entity.Like;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author A
* @description 针对表【like】的数据库操作Service
* @createDate 2023-04-02 19:21:49
*/
public interface LikeService extends IService<Like> {
    Boolean addLike(Like like);
}
