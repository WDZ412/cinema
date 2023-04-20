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
 * @TableName cinema_arrangement
 */
@Data
@TableName(value ="cinema_arrangement")
public class CinemaArrangement implements Serializable {//院线排片
    @TableId(type = IdType.AUTO)
    private Long id;

    private LocalDateTime screeningStartTime;//放映开始时间

    private LocalDateTime screeningEndTime;//放映结束时间

    private Long cinemaHallId;//放映的影厅

    private Long movieId;//放映的电影
    @TableField(exist = false)
    String movieName;//存储放映的电影的名称
    @TableField(exist = false)
    String cinemaHallName;//存储放映的影厅的名称
    private static final long serialVersionUID = 1L;

}