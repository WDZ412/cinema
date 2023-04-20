package cinema.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.MovieTickets;
import cinema.service.MovieTicketsService;
import cinema.mapper.MovieTicketsMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author A
* @description 针对表【movie_tickets】的数据库操作Service实现
* @createDate 2023-03-27 16:05:15
*/
@Service
public class MovieTicketsServiceImpl extends ServiceImpl<MovieTicketsMapper, MovieTickets>
    implements MovieTicketsService{
    @Override
    public List<MovieTickets> getMovieTicketsByIdOrUserId(Long movieTicketsId,Long userId) {
        return baseMapper.selectMovieTicketsByIdOrUserId(movieTicketsId,userId);
    }
    @Override
    public Boolean deteleMovieTicketsById(Long movieTicketsId){
        QueryWrapper<MovieTickets> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",movieTicketsId);
        if(baseMapper.delete(queryWrapper)>0){
            return true;
        }
        return false;
    }
    public Boolean ExpiredOrNot(Long userId,Long movieId,Long cinemaHallId){
        if(baseMapper.ExpiredOrNot(userId,movieId,cinemaHallId)>0){
            return true;
        }
        return false;
    }
    @Override
    public Boolean addMovieTickets(MovieTickets movieTickets){
        if(baseMapper.insert(movieTickets)>0){
            return true;
        }
        return false;
    }
}




