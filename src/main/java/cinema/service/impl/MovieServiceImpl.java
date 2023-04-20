package cinema.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.Movie;
import cinema.service.MovieService;
import cinema.mapper.MovieMapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author A
* @description 针对表【movie】的数据库操作Service实现
* @createDate 2023-03-27 16:05:08
*/
@Service
public class MovieServiceImpl extends ServiceImpl<MovieMapper, Movie> implements MovieService{
    @Override
    public List<Movie> getMovieByKeyword(String keyword){
        return baseMapper.selectMovieByKeyword(keyword);
    }
    @Override
    public Movie getMovieById(Long movieId){
        return baseMapper.selectMovieById(movieId);
    }
    @Override
    public List<Movie> getMovieByMovieGenreId(Long movieGenreId){
        return baseMapper.selectMovieByMovieGenreId(movieGenreId);
    }
    @Override
    public List<Movie> getMovieByUserId(Long userId){
        return baseMapper.selectMovieByUserId(userId);
    }
}




