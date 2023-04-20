package cinema.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cinema.entity.MovieGenre;
import cinema.service.MovieGenreService;
import cinema.mapper.MovieGenreMapper;
import org.springframework.stereotype.Service;

/**
* @author A
* @description 针对表【movie_genre】的数据库操作Service实现
* @createDate 2023-03-27 16:05:12
*/
@Service
public class MovieGenreServiceImpl extends ServiceImpl<MovieGenreMapper, MovieGenre>
    implements MovieGenreService{

}




