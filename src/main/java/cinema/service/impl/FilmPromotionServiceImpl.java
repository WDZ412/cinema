package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.FilmPromotion;
import cinema.service.FilmPromotionService;
import cinema.mapper.FilmPromotionMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author A
* @description 针对表【film_promotion】的数据库操作Service实现
* @createDate 2023-03-31 09:39:58
*/
@Service
public class FilmPromotionServiceImpl extends ServiceImpl<FilmPromotionMapper, FilmPromotion>
    implements FilmPromotionService{
    public List<FilmPromotion> getFilmPromotionByMovieId(Long movieId){
        return baseMapper.selectFilmPromotionByMovieId(movieId);
    }
}




