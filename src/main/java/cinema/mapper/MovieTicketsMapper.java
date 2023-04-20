package cinema.mapper;

import cinema.entity.MovieTickets;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【movie_tickets】的数据库操作Mapper
* @createDate 2023-03-27 16:05:15
* @Entity cinema.entity.MovieTickets
*/
public interface MovieTicketsMapper extends BaseMapper<MovieTickets> {
    List<MovieTickets> selectMovieTicketsByIdOrUserId(@Param("movieTicketsId") Long movieTicketsId,@Param("userId") Long userId);
    //根据用户id，电影id，影厅id找到指定
    Integer ExpiredOrNot(@Param("userId") Long userId,@Param("movieId") Long movieId,@Param("cinemaHallId") Long cinemaHallId);
}


