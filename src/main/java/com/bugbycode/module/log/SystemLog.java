package com.bugbycode.module.log;

import java.io.Serializable;

public class SystemLog implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6142557140992153677L;

	private String _id;			//唯一标识
	
	private String userName;   //执行者姓名
	
	private String userLoginName; //执行者账号
	
	private int level; //日志级别
	
	private int type; //操作类型 即：增删改
	
	private int module; //信息类型 用户、角色、设备、授权等
	
	private String moduleId; //信息ID，信息类型为用户时，则此处存储用户ID
	
	private String detail; //操作详情 存储具体操作内容 如用户具体变更信息
	
	private long createTime; //创建时间 即：操作时间

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserLoginName() {
		return userLoginName;
	}

	public void setUserLoginName(String userLoginName) {
		this.userLoginName = userLoginName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getModule() {
		return module;
	}

	public void setModule(int module) {
		this.module = module;
	}

	public String getModuleId() {
		return moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}
}
