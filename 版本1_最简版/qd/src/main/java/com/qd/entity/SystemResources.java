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
 * 系统菜单
 * </p>
 *
 * @author xj
 * @since 2017-07-02
 */
@TableName("system_resources")
public class SystemResources extends Model<SystemResources> {

	private static final long serialVersionUID = 1L;

	@TableId(value = "id", type = IdType.AUTO)
	private Long id;
	private String name;
	/**
	 * 类型 0 菜单 1按钮
	 */
	private Integer type;
	/**
	 * 自关联上级ID
	 */
	private Long pid;
	/**
	 * 网址链接
	 */
	private String url;
	/**
	 * 排序
	 */
	private Integer sort;
	private Integer level;
	/**
	 * 权限标示
	 */
	private String permission;

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

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
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
