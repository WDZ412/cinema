package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

/**
 * @TableName movie
 */
@Data
@TableName(value ="movie")
public class Movie implements Serializable {//电影
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;//电影名称

    private short hostMovieGenreId;//电影的主类型

    private String introduce;//简介

    private LocalTime duration;//电影的时长

    private LocalDate releaseDate;//上映日期

    private String director;//导演

    private String actor;//演员，目前暂无能力细分所以就记录所有演员姓名

    //（电影票表被确认进入电影院观看了该电影和放映的电影结束了的电影票持有用户可以选择：赞或踩，改变好评或差评数）
    private Integer good;//在本电影院的好评数

    private Integer differFrom;//在本电影院的差评数

    private BigDecimal price;//观影价格

    private String filmCover;//电影封面图片的路径
    @TableField(exist = false)
    private List<MovieGenre> movieGenre;//存储电影的类型
    @TableField(exist = false)
    private String hostMovieGenre;//存储电影的主类型
    private static final long serialVersionUID = 1L;
}