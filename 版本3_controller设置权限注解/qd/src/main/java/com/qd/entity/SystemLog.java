package com.qd.entity;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 后台系统日志记录
 * </p>
 *
 * @author xj
 * @since 2017-07-02
 */
@TableName("system_log")
public class SystemLog extends Model<SystemLog> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 访问地址
     */
	private String url;
    /**
     * ip地址
     */
	private String ip;
	private String remark;
    /**
     * 用户浏览器
     */
	@TableField("user_browser")
	private String userBrowser;
    /**
     * 操作系统
     */
	@TableField("user_os")
	private String userOs;
    /**
     * 创建用户
     */
	@TableField("create_user")
	private Long createUser;
    /**
     * 修改时间
     */
	@TableField("create_date")
	private Date createDate;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getUserBrowser() {
		return userBrowser;
	}

	public void setUserBrowser(String userBrowser) {
		this.userBrowser = userBrowser;
	}

	public String getUserOs() {
		return userOs;
	}

	public void setUserOs(String userOs) {
		this.userOs = userOs;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
