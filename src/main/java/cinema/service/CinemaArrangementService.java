package cinema.service;

import cinema.entity.CinemaArrangement;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author A
* @description 针对表【cinema_arrangement】的数据库操作Service
* @createDate 2023-03-27 16:04:39
*/
public interface CinemaArrangementService extends IService<CinemaArrangement> {
    List<CinemaArrangement> getCinemaArrangement(Long movieId,Long cinemaHallId);
}
