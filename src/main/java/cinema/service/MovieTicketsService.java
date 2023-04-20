package cinema.service;

import cinema.entity.MovieTickets;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author A
* @description 针对表【movie_tickets】的数据库操作Service
* @createDate 2023-03-27 16:05:15
*/
public interface MovieTicketsService extends IService<MovieTickets> {
    List<MovieTickets> getMovieTicketsByIdOrUserId(Long movieTicketsId,Long userId);
    Boolean deteleMovieTicketsById(Long movieTicketsId);
    Boolean ExpiredOrNot(Long userId,Long movieId,Long cinemaHallId);
    Boolean addMovieTickets(MovieTickets movieTickets);
}
