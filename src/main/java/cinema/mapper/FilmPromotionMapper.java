package cinema.mapper;

import cinema.entity.FilmPromotion;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【film_promotion】的数据库操作Mapper
* @createDate 2023-03-31 09:39:58
* @Entity cinema.entity.FilmPromotion
*/
public interface FilmPromotionMapper extends BaseMapper<FilmPromotion> {
    List<FilmPromotion> selectFilmPromotionByMovieId(@Param("movieId") Long movieId);
}




