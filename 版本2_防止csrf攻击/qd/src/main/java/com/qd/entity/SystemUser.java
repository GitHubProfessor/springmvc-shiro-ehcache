package com.qd.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * <p>
 * 系统用户表
 * </p>
 *
 * @author xj
 * @since 2017-07-02
 */
@TableName("system_user")
public class SystemUser extends Model<SystemUser> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 用户名
     */
	@TableField("user_name")
	private String userName;
	@TableField("user_pass")
	private String userPass;
    /**
     * 真实姓名
     */
	@TableField("real_name")
	private String realName;
    /**
     * 1可用 2停用
     */
	private Integer state;
	private String remark;
    /**
     * 角色
     */
	private Long role;
    /**
     * 是否删除0 正常 1删除
     */
	private Integer isdel;
    /**
     * 最后登录时间
     */
	@TableField("last_login_date")
	private Date lastLoginDate;
    /**
     * 最后登录ip
     */
	@TableField("last_login_ip")
	private String lastLoginIp;
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
    /**
     * 修改用户
     */
	@TableField("modified_user")
	private Long modifiedUser;
    /**
     * 修改时间
     */
	@TableField("modified_date")
	private Date modifiedDate;

    /********************页面使用*************************/
	/**
	 * 角色ids
	 */
	@TableField(exist=false)
	private String roleIds;
	 
	
	public String getRoleIds() {
		return roleIds;
	}

	public void setRoleIds(String roleIds) {
		this.roleIds = roleIds;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getRole() {
		return role;
	}

	public void setRole(Long role) {
		this.role = role;
	}

	public Integer getIsdel() {
		return isdel;
	}

	public void setIsdel(Integer isdel) {
		this.isdel = isdel;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
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

	public Long getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(Long modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
