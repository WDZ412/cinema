package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName cinema_hall_type
 */
@Data
@TableName(value ="cinema_hall_type")
public class CinemaHallType implements Serializable {//影厅类型
    private Integer id;

    private String name;//电影厅类型

    private static final long serialVersionUID = 1L;
}