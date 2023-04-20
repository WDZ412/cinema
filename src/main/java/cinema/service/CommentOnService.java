package cinema.service;

import cinema.entity.CommentOn;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author A
* @description 针对表【comment_on】的数据库操作Service
* @createDate 2023-03-30 16:57:51
*/
public interface CommentOnService extends IService<CommentOn> {
    List<CommentOn> getCommentOnByMovieId(Long movieId, Page<CommentOn> page);
}
