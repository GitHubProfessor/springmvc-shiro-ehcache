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
 * 字典
 * </p>
 *
 * @author xj
 * @since 2017-06-25
 */
@TableName("system_dict")
public class SystemDict extends Model<SystemDict> implements Serializable{

	private static final long serialVersionUID = -6579533328390250520L;

	@TableId(value="id", type= IdType.AUTO)
	private Long id;
    /**
     * 名称
     */
	private String name;
    /**
     * 创建时间
     */
	@TableField("create_date")
	private Date createDate;
    /**
     * 创建人
     */
	@TableField("create_user")
	private Long createUser;
    /**
     * 操作时间
     */
	@TableField("operation_date")
	private Date operationDate;
    /**
     * 操作人
     */
	@TableField("operation_user")
	private Long operationUser;
    /**
     * 关键词
     */
	@TableField("type_key")
	private String typeKey;

	/**
     *字典值
     */
	@TableField("value")
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
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

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Long createUser) {
		this.createUser = createUser;
	}

	public Date getOperationDate() {
		return operationDate;
	}

	public void setOperationDate(Date operationDate) {
		this.operationDate = operationDate;
	}

	public Long getOperationUser() {
		return operationUser;
	}

	public void setOperationUser(Long operationUser) {
		this.operationUser = operationUser;
	}

	public String getTypeKey() {
		return typeKey;
	}

	public void setTypeKey(String typeKey) {
		this.typeKey = typeKey;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
