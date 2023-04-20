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
 * @TableName movie_tickets
 */
@Data
@TableName(value ="movie_tickets")
public class MovieTickets implements Serializable {//电影票
    @TableId(type = IdType.AUTO)
    private Long id;

    private Long userId;//购买该电影票的用户

    private Long cinemaArrangementId;//通过院线排片获取获取观看的电影和放映的影厅等详情信息

    private Long seatId;//观影座位

    private short physical_ticket;	//是否被兑换为实体票，被兑换后不可修改电影票，0代表未被兑换，1代表已兑换

    private short watch;            //是否进入电影院观看，0代表未观看，1代表已观看，检票员决定是否进入电影院观看
    @TableField(exist = false)
    private String userName;//用户名
    @TableField(exist = false)
    private String movieName;//观看的电影
    @TableField(exist = false)
    private String cinemaHallName;//去的影厅
    @TableField(exist = false)
    private short seatNumber;//座位号
    @TableField(exist = false)
    private String viewingEquipmentName;//额外观影设备
    @TableField(exist = false)
    private LocalDateTime screeningStartTime;
    @TableField(exist = false)
    private LocalDateTime screeningEndTime;
    @TableField(exist = false)
    private String totalAmount;//总金额
    private static final long serialVersionUID = 1L;
}