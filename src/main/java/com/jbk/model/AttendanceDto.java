package com.jbk.model;

import java.util.List;

import com.jbk.entity.Student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AttendanceDto {

	private String id;
	private List<Long> rollNos;
	private String username;
	private String date;
	private String time;
	private int counts;
	private long subjectId;
	public void setId(String id2) {
		// TODO Auto-generated method stub
		
	}
	public Object getDate() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Long> getRollNos() {
		// TODO Auto-generated method stub
		return null;
	}
	public long getSubjectId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTime() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
