package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName movie_genre_s
 */
@Data
@TableName(value ="movie_genre_s")
public class MovieGenreS implements Serializable {//电影的多个类型
    //一部电影可以属于多种类型，通过电影的id索引统计电影属于的多种类型
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long movieId;//属于这个电影类型的电影

    private Integer movieGenreId;//属于的类型

    private static final long serialVersionUID = 1L;
}