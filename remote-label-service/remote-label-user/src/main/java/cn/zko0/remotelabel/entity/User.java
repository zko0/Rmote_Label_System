package cn.zko0.remotelabel.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author zko0
 * @since 2023-02-15
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * user_id
     */
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 邮箱号
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 注册时间
     */
    private Date createTime;

    /**
     * 是否可用 1正常  2冻结
     */
    private Boolean isAvaliable;

    /**
     * 用户头像
     */
    private String picImg;

    /**
     * QQ联合登陆id
     */
    private String qqOpenid;

    /**
     * 微信公众号关注id
     */
    private String wxOpenid;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getIsAvaliable() {
        return isAvaliable;
    }

    public void setIsAvaliable(Boolean isAvaliable) {
        this.isAvaliable = isAvaliable;
    }

    public String getPicImg() {
        return picImg;
    }

    public void setPicImg(String picImg) {
        this.picImg = picImg;
    }

    public String getQqOpenid() {
        return qqOpenid;
    }

    public void setQqOpenid(String qqOpenid) {
        this.qqOpenid = qqOpenid;
    }

    public String getWxOpenid() {
        return wxOpenid;
    }

    public void setWxOpenid(String wxOpenid) {
        this.wxOpenid = wxOpenid;
    }

    @Override
    public String toString() {
        return "User{" +
        ", userId = " + userId +
        ", mobile = " + mobile +
        ", email = " + email +
        ", password = " + password +
        ", userName = " + userName +
        ", createTime = " + createTime +
        ", isAvaliable = " + isAvaliable +
        ", picImg = " + picImg +
        ", qqOpenid = " + qqOpenid +
        ", wxOpenid = " + wxOpenid +
        "}";
    }
}
