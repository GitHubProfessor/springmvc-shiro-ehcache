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
 * 网站信息
 * </p>
 *
 * @author xj
 * @since 2017-07-16
 */
@TableName("system_website")
public class SystemWebsite extends Model<SystemWebsite> {

    private static final long serialVersionUID = 1L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 系统logo
     */
	private String logo;
    /**
     * 网站名称
     */
	private String title;
    /**
     * 公司名称
     */
	private String company;
    /**
     * 备案号
     */
	private String beian;
    /**
     * 客服电话
     */
	private String phone;
	private String qq;
    /**
     * 版权
     */
	private String copyright;
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


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getBeian() {
		return beian;
	}

	public void setBeian(String beian) {
		this.beian = beian;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
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
