package top.hyzhu.oa.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @Description SysUser
 * @Author zhy
 * @Date 2023/11/27 20:26
 */
@TableName("sys_user")
public class SysUser {
    /* 用户编号*/
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    /*用户名*/
    private String username;

    /*密码*/
    private String password;

    /*员工编号*/
    private int employeeId;

    /*盐值*/
    private int salt;

//    public SysUser(Long userId) {
//        this.userId = userId;
//    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getSalt() {
        return salt;
    }

    public void setSalt(int salt) {
        this.salt = salt;
    }

    public SysUser(Long userId, String username, String password, int employeeId, int salt) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.employeeId = employeeId;
        this.salt = salt;
    }

    public SysUser() {
    }
}
