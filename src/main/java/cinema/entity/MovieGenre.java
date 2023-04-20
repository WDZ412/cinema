package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName movie_genre
 */
@Data
@TableName(value ="movie_genre")
public class MovieGenre implements Serializable {//电影类型
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;//电影类型名称

    private static final long serialVersionUID = 1L;
}