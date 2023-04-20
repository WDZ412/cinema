package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.Seat;
import cinema.service.SeatService;
import cinema.mapper.SeatMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author A
* @description 针对表【seat】的数据库操作Service实现
* @createDate 2023-03-27 16:05:17
*/
@Service
public class SeatServiceImpl extends ServiceImpl<SeatMapper, Seat>
    implements SeatService{
    @Override
    public List<Seat> getSeatByCinemaHallIdAndTime(Long cinemaHallId, LocalDateTime screeningStartTime, LocalDateTime screeningEndTime){
        return baseMapper.selectSeatByCinemaHallIdAndTime(cinemaHallId,screeningStartTime,screeningEndTime);
    }
}




