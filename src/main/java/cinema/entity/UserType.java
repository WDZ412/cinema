package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName user_type
 */
@Data
@TableName(value ="user_type")
public class UserType implements Serializable {//用户类型
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;//用户类型名称

    private static final long serialVersionUID = 1L;
}