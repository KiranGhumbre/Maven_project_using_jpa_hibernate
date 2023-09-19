package com.kiran;

import javax.persistence.*;

@Entity
public class StudentInfo {
    private String name;
    
    @Id
    private int roll_no;
    private int class_room;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public int getClass_room() {
		return class_room;
	}
	public void setClass_room(int class_room) {
		this.class_room = class_room;
	}
    
}
