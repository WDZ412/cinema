package cinema.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.CommentOn;
import cinema.service.CommentOnService;
import cinema.mapper.CommentOnMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author A
* @description 针对表【comment_on】的数据库操作Service实现
* @createDate 2023-03-30 16:57:51
*/
@Service
public class CommentOnServiceImpl extends ServiceImpl<CommentOnMapper, CommentOn>
    implements CommentOnService{
    public List<CommentOn> getCommentOnByMovieId(Long movieId, Page<CommentOn> page){
        return baseMapper.selectCommentOnByMovieId(movieId,page);
    }
}




