package com.springboot.web.model;

import java.sql.Date;

public class Todo {
	private int id;
	private String user;
	private String desc;
	public Todo(int id, String user, String desc, boolean isDone) {
		super();
		this.id = id;
		this.user = user;
		this.desc = desc;
		this.isDone = isDone;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desc == null) ? 0 : desc.hashCode());
		result = prime * result + id;
		result = prime * result + (isDone ? 1231 : 1237);
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (desc == null) {
			if (other.desc != null)
				return false;
		} else if (!desc.equals(other.desc))
			return false;
		if (id != other.id)
			return false;
		if (isDone != other.isDone)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Todo [id=" + id + ", user=" + user + ", desc=" + desc + ", isDone=" + isDone + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public boolean isDone() {
		return isDone;
	}
	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}
	private boolean isDone;

}
