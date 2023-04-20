package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName order_for_goods
 */
@Data
@TableName(value ="order_for_goods")
public class OrderForGoods implements Serializable {//订单
    private Long id;

    private String orderNumber;//订单号

    private Date dateTime;//下订单时间

    private static final long serialVersionUID = 1L;
}