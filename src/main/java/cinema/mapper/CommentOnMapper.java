package cinema.mapper;

import cinema.entity.CommentOn;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【comment_on】的数据库操作Mapper
* @createDate 2023-03-30 16:57:51
* @Entity cinema.entity.CommentOn
*/
public interface CommentOnMapper extends BaseMapper<CommentOn> {
    List<CommentOn> selectCommentOnByMovieId(@Param("movieId")Long movieId, Page<CommentOn> page);
}




