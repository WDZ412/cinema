package cinema.service;

import cinema.entity.Seat;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author A
* @description 针对表【seat】的数据库操作Service
* @createDate 2023-03-27 16:05:17
*/
public interface SeatService extends IService<Seat> {
    List<Seat> getSeatByCinemaHallIdAndTime(Long cinemaHallId,LocalDateTime screeningStartTime,LocalDateTime screeningEndTime);
}
