package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @TableName cinema_hall
 */
@Data
@TableName(value ="cinema_hall")
public class CinemaHall implements Serializable {//影厅
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;//影厅名称

    private Integer viewingEquipmentId;//额外的观影设备

    private BigDecimal price;//影厅价格

    private Short cinemaHallTypeId;//电影厅类型
    private static final long serialVersionUID = 1L;
}