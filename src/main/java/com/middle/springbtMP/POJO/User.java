package com.middle.springbtMP.POJO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Auther: middle
 * @Date: 2019/9/29 12:17
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("tb_user")
public class User implements Serializable {
    @TableId("user_id")
    private long userId;
    private String userName;
    private Integer userAge;
}
