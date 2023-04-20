package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName business
 */
@Data
@TableName(value ="business")
public class Business implements Serializable {//交易内容
    private Long id;

    private Long orderForGoodsId;//订单

    private Long movieTicketsId;//交易的电影票

    private static final long serialVersionUID = 1L;
}