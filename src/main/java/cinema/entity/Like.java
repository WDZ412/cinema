package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName like
 */
@Data
@TableName(value ="like")
public class Like implements Serializable {//用户的喜欢电影
    private Long id;

    private Long movieId;//喜欢的电影

    private Long userId;//此喜欢记录的用户

    private static final long serialVersionUID = 1L;

}