package cinema.mapper;

import cinema.entity.CinemaArrangement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【cinema_arrangement】的数据库操作Mapper
* @createDate 2023-03-27 16:04:39
* @Entity cinema.entity.CinemaArrangement
*/
public interface CinemaArrangementMapper extends BaseMapper<CinemaArrangement> {
    List<CinemaArrangement> selectCinemaArrangement(@Param("movieId") Long movieId,@Param("cinemaHallId") Long cinemaHallId);
}