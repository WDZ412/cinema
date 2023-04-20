package cinema.controllert;

import cinema.entity.Movie;
import cinema.entity.User;
import cinema.service.MovieService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
@RequestMapping("/movie/")
public class MovieControllert{
    @Autowired
    MovieService movieService;
    @RequestMapping("selectkeyword")//通过搜索栏关键字查询符合（电影名、主类型名称、导演、演员）的电影的基本信息
    public String selectKeyword(HttpServletRequest request){
        String keyword=request.getParameter("keyword");
        List<Movie> movieList=movieService.getMovieByKeyword(keyword);
        return "";
    }
    @RequestMapping("selectbymoviegenre/{movieGenreId}")//根据主类型查询电影的基本信息
    public String selectByMovieGenre(@PathVariable("movieGenreId") Long movieGenreId,HttpServletRequest request){
        List<Movie> movieList=movieService.getMovieByMovieGenreId(movieGenreId);
        return "";
    }
    @RequestMapping("selectbyid/{movieId}")//根据点击的电影查询其详细信息
    @ResponseBody
    public Object selectById(@PathVariable("movieId") Long movieId){
        Movie movie=movieService.getMovieById(movieId);
        //集合转JSON
        return movie;
    }
    @RequestMapping("selectuserlike")//根据用户id查询其喜欢的电影的基本信息
    public String selectUserLike(HttpSession session){
        User user =(User) session.getAttribute("user");
        List<Movie> movieList=movieService.getMovieByUserId(user.getId());
        return "";
    }
    @RequestMapping("select")
    @ResponseBody
    public Object b(){
        return movieService.list();
    }
}