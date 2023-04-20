package cinema.mapper;

import cinema.entity.Seat;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDateTime;
import java.util.List;

/**
* @author A
* @description 针对表【seat】的数据库操作Mapper
* @createDate 2023-03-27 16:05:17
* @Entity cinema.entity.Seat
*/
public interface SeatMapper extends BaseMapper<Seat> {
    List<Seat> selectSeatByCinemaHallIdAndTime(@Param("cinemaHallId") Long cinemaHallId,@Param("screeningStartTime") LocalDateTime screeningStartTime,@Param("screeningEndTime") LocalDateTime screeningEndTime);
}



