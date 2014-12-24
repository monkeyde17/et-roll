package com.Project.M;

public class ETPerson {
	
	private String id;
	private String name;
	private String imageUrl;
	
	public ETPerson() {
		// TODO Auto-generated constructor stub
		id = "";
		name = "";
		imageUrl = "";
	}
	
	public ETPerson(String format) {
		String[] array = format.split(";");
				
		id = array[0];
		name = array[1];
		imageUrl = array[2];
	}

	
	public String getFormatString() {
		return id + ',' + name + ',' + imageUrl;
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
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setNote(String url) {
		this.imageUrl = url;
	}

	/**
	 * 
	 * @param type
	 *		0 	-- id
	 *		1 	-- name
	 * 		2	-- id + name
	 * @return the rand show
	 */
	public String getNameByType(int type) {

		switch (type) {
		case 0:
			return id + "";
		case 1:
			return name;
		case 2:
			return id + ":" + name;
		}

		return id + ":" + name;
	}

}
