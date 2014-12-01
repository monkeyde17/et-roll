package com.Project.M;

public class ETPerson {
	
	private String id;
	private String name;
	private int count;
	private String note;
	
	public ETPerson() {
		// TODO Auto-generated constructor stub
		id = "";
		name = "";
		count = 0;
		note = "";
	}
	
	public ETPerson(String format) {
		String[] array = format.split(",");
				
		id = array[0];
		name = array[1];
		count = Integer.valueOf(array[2]);
		note = array[3];
	}
	
	public boolean isCountRight() {
		String[] array = note.split("|");
		
		if (array.length == count) {
			return true;
		}
		
		count = array.length;
		
		return false;
	}
	
	public void appendNote(String time) {
		isCountRight();
			
		if (count != 0) {
			note += "|";
		}
		
		note += time;
	}
	
	public String getFormatString() {
		return id + ',' + name + ',' + count + ',' + note;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}

}
