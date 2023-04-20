package cinema;


import cinema.entity.*;
import cinema.service.*;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@SpringBootTest
class CinemaApplicationTests {
    @Autowired
    CommentOnService commentOnService;
    @Autowired
    FilmPromotionService filmPromotionService;
    @Autowired
    UserService userService;
    @Autowired
    CinemaArrangementService cinemaArrangementService;
    @Autowired
    MovieTicketsService movieTicketsService;
    @Autowired
    MovieService movieService;
    @Autowired
    SeatService seatService;
    @Test
    public void movieTickets() {
        //根据电影票id或用户id查询指定电影票
        for(MovieTickets movieTickets:movieTicketsService.getMovieTicketsByIdOrUserId(null,1l)){
            System.out.println(movieTickets.getMovieName()+"\t"+movieTickets.getCinemaHallName()+"\t"+movieTickets.getScreeningEndTime());
            System.out.println("电影票id："+movieTickets.getId());
            System.out.println("用户名："+movieTickets.getUserName());
            System.out.println("电影："+movieTickets.getMovieName());
            System.out.println("电影厅："+movieTickets.getCinemaHallName());
            System.out.println("座位："+movieTickets.getSeatNumber());
            System.out.println("开始时间："+movieTickets.getScreeningStartTime());
            System.out.println("结束时间："+movieTickets.getScreeningEndTime());
            System.out.println("总金额："+movieTickets.getTotalAmount());
        }
    }
    @Test
    public void CinemaArrangement(){
        //根据电影id或影厅id查看排片详细信息
        List<CinemaArrangement> cinemaArrangementList=cinemaArrangementService.getCinemaArrangement(null,null);
        for(CinemaArrangement cinemaArrangement:cinemaArrangementList){
            System.out.println(cinemaArrangement.getMovieName());
        }
    }
    @Test
    public void CommentOn(){

    }
    @Test
    public void Movie(){
        //根据id查询指定电影详细信息，点击指定电影后进入展示电影的详细信息页面
        Movie movie=movieService.getMovieById(2l);
        //分开查询电影的宣传片、预告片、图片，展示再顶部
        List<FilmPromotion> filmPromotionList=filmPromotionService.getFilmPromotionByMovieId(2l);
        for(FilmPromotion filmPromotion:filmPromotionList){
            System.out.println("宣传片的路径："+filmPromotion.getVideo());
            System.out.println("预告片的路径："+filmPromotion.getTrailer());
            System.out.println("图片的路径："+filmPromotion.getPicture());
        }
        System.out.println("电影封面图片的路径："+movie.getFilmCover());
        System.out.println("电影id："+movie.getId());
        System.out.println("电影名称："+movie.getName());
        System.out.println("主类型："+movie.getHostMovieGenre());
        System.out.print("影片类型范围：");
        for(MovieGenre movieGenre:movie.getMovieGenre()){
            System.out.print(movieGenre.getName()+"、");
        }
        System.out.println("\n电影时长："+movie.getDuration());
        System.out.println("上映日期："+movie.getReleaseDate());
        System.out.println("简介："+movie.getIntroduce());
        System.out.println("导演："+movie.getDirector());
        System.out.println("演员："+movie.getActor());
        System.out.print("好评数："+movie.getGood()+"\t");
        System.out.println("差评数："+movie.getDifferFrom());
        System.out.println("观影价格："+movie.getPrice());
        //评论：分开查询把评论显示在底部，分页展示20条1页
        List<CommentOn> commentOnList=commentOnService.getCommentOnByMovieId(2l,new Page<CommentOn>(1,20));
        for(CommentOn commentOn:commentOnList){
            System.out.println("评论用户："+commentOn.getUser().getName());
            System.out.println("评论内容："+commentOn.getContent());
            System.out.println("发布评论时间："+commentOn.getPublishTime());
            System.out.println("赞："+commentOn.getGood());
            System.out.println("踩："+commentOn.getDifferFrom());
        }
        //通过点击类型查询不同类型的电影的基本信息（只判断主类型）
        List<Movie> movieList=movieService.getMovieByMovieGenreId(1l);
        for(Movie movie2:movieList){
            System.out.println("电影封面图片的路径："+movie.getFilmCover());
            System.out.println("电影id："+movie2.getId());
            System.out.println("电影名称："+movie2.getName());
            System.out.println("主类型："+movie2.getHostMovieGenre());
            System.out.println("电影时长："+movie2.getDuration());
            System.out.println("上映日期："+movie2.getReleaseDate());
            System.out.println("导演："+movie2.getDirector());
            System.out.print("好评数"+movie2.getGood()+"\t");
            System.out.println("差评数："+movie2.getDifferFrom());
            System.out.println("观影价格"+movie2.getPrice());
        }
        //根据关键字模糊查询电影基本信息，把符合条件的电影的基本信息全部以列表形式排序展示给用户
        List<Movie> movieList2=movieService.getMovieByKeyword("澳门");
        for(Movie movie2:movieList2){
            System.out.println("电影封面图片的路径："+movie.getFilmCover());
            System.out.println("电影id："+movie2.getId());
            System.out.println("电影名称："+movie2.getName());
            System.out.println("主类型："+movie2.getHostMovieGenre());
            System.out.println("电影时长："+movie2.getDuration());
            System.out.println("上映日期："+movie2.getReleaseDate());
            System.out.println("导演："+movie2.getDirector());
            System.out.print("好评数"+movie2.getGood()+"\t");
            System.out.println("差评数："+movie2.getDifferFrom());
            System.out.println("观影价格"+movie2.getPrice());
        }
    }
    @Test
    public String User(){
        //登录验证并判断用户类型登录到不同功能页面
        User user=userService.getUser("账户","密码");
        if(user!=null){
            switch (user.getUserTypeId()){
                case 1:
                    return "去普通用户页面";
                case 2:
                    return "去电影院数据库管理人员页面";
                case 3:
                    return "去保洁人员页面";
                case 4:
                    return "去放映人员页面";
                case 5:
                    return "去检票人员页面";
            }
        }
        return "账户或密码错误，回到输入账户和密码页面";
    }
    @Test
    public void Seat(){
        //根据放映的影厅、放映开始时间、放映结束时间、查询指定时间节点的影厅的座位信息
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime a=LocalDateTime.parse("2023-03-30 08:30:00",dateTimeFormatter);
        LocalDateTime b=LocalDateTime.parse("2023-03-30 10:50:00",dateTimeFormatter);
        List<Seat> seatList=seatService.getSeatByCinemaHallIdAndTime(1l,a,b);
        System.out.println("座位表中的id，座位号，是否被购买：0未被购买、1以被购买");
        for (Seat seat:seatList){
            System.out.print("座位id："+seat.getId()+"\t");
            System.out.print("座位号："+seat.getIds()+"\t");
            System.out.println("是否被购买："+seat.getPurchase());
        }
    }
}
