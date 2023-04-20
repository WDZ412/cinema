package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName viewing_equipment
 */
@Data
@TableName(value ="viewing_equipment")
public class ViewingEquipment implements Serializable {//额外观影设备
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;//观影设备

    private static final long serialVersionUID = 1L;
}