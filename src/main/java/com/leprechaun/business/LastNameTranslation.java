package com.leprechaun.business;

import javax.persistence.*;

@Entity
public class LastNameTranslation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String birthMonth;
	
	public LastNameTranslation(int id, String birthMonth) {
		super();
		this.id = id;
		this.birthMonth = birthMonth;
	}
	private String translation;

	public LastNameTranslation() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBirthMonth() {
		return birthMonth;
	}

	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
	

}
