package cinema.service;

import cinema.entity.Movie;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【movie】的数据库操作Service
* @createDate 2023-03-27 16:05:08
*/
public interface MovieService extends IService<Movie> {
    List<Movie> getMovieByKeyword(String keyword);
    Movie getMovieById(Long movieId);
    List<Movie> getMovieByMovieGenreId(Long movieGenreId);
    List<Movie> getMovieByUserId(Long userId);
}
