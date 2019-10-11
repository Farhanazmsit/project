package Todolist;

import java.util.Date;

public class task {
	
	private String name;
	private Date date;
	private String description;
	private String status;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "task [name=" + name + ", date=" + date + ", description=" + description + ", status=" + status + "]";
	}
	

}
