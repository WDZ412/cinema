package cinema.service;

import cinema.entity.FilmPromotion;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【film_promotion】的数据库操作Service
* @createDate 2023-03-31 09:39:58
*/
public interface FilmPromotionService extends IService<FilmPromotion> {
    List<FilmPromotion> getFilmPromotionByMovieId(Long movieId);
}
