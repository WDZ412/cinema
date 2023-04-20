package cinema.mapper;

import cinema.entity.Movie;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalTime;
import java.util.List;

/**
* @author A
* @description 针对表【movie】的数据库操作Mapper
* @createDate 2023-03-27 16:05:08
* @Entity cinema.entity.Movie
*/
public interface MovieMapper extends BaseMapper<Movie> {
    //根据搜索栏的输入内容模糊查询：电影名、主类型、导演、演员符合条件的电影的基本信息
    List<Movie> selectMovieByKeyword(@Param("keyword") String keyword);
    //根据点击的电影（记得存储对应的id）查询电影的详细信息
    Movie selectMovieById(@Param("movieId") Long movieId);
    //根据电影类型查询电影的基本信息
    List<Movie> selectMovieByMovieGenreId(@Param("movieGenreId") Long movieGenreId);
    //根据用户查询用户的喜欢电影的基本信息
    List<Movie> selectMovieByUserId(@Param("userId") Long userId);
}




