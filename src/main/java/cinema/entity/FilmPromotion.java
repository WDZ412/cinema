package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName film_promotion
 */
@Data
@TableName(value ="film_promotion")
public class FilmPromotion implements Serializable {//有关电影的宣发的文件的路径
    private Long id;

    private Long movieId;//属于的电影

    private String picture;//图片

    private String video;//视频

    private String trailer;//预告片

    private static final long serialVersionUID = 1L;
}