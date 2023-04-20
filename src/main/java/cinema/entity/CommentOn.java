package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * @TableName comment_on
 */
@Data
@TableName(value ="comment_on")
public class CommentOn implements Serializable {//评论
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userId;//发布评论的用户

    private String content;//评论内容

    private LocalDateTime publishTime;//评论发布的时间

    private Long movieId;//评论的电影
    //看评论的用户可以选择：赞或踩，改变评论的好数或差数
    private Integer good;//此评论的好评数

    private Integer differFrom;//此评论的差评数

    @TableField(exist = false)
    private User user;
    private static final long serialVersionUID = 1L;
}