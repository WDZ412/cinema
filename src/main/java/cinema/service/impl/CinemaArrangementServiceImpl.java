package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.CinemaArrangement;
import cinema.service.CinemaArrangementService;
import cinema.mapper.CinemaArrangementMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author A
* @description 针对表【cinema_arrangement】的数据库操作Service实现
* @createDate 2023-03-27 16:04:39
*/
@Service
public class CinemaArrangementServiceImpl extends ServiceImpl<CinemaArrangementMapper, CinemaArrangement>
    implements CinemaArrangementService{
    @Override
    public List<CinemaArrangement> getCinemaArrangement(Long movieId,Long cinemaHallId){
        return baseMapper.selectCinemaArrangement(movieId,cinemaHallId);
    }
}




