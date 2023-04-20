package cinema.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @TableName user
 */
@Data
@TableName(value ="user")
public class User implements Serializable {//用户的账户
    @TableId(type = IdType.AUTO)
    private Long id;

    private String account;//账户号码，

    private String name;//用户名称

    private String password;//账户的密码，长度8至20必须带英文

    private String picture;//用户头像封面图片的路径
    private short available;//账户是否可用（0：不可用，1：可用）
    @TableField("user_type_id")
    private Integer userTypeId;//用户类型id，根据不同用户类型登录到不同功能页面

    private static final long serialVersionUID = 1L;
}