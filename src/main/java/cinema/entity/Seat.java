package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName seat
 */
@Data
@TableName(value ="seat")
public class Seat implements Serializable {//座位
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long cinemaHallId;//属于那个影厅

    private Integer ids;//每个影厅拥有30不可重复的座位号
    @TableField(exist = false)
    private Short purchase;//这张座位是否被购买，0代表没有被购买、1代表被购买
    private static final long serialVersionUID = 1L;

}