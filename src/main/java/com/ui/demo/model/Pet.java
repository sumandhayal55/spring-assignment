package com.ui.demo.model;


public class Pet {
	
	private static String name;
	private static String dob;
	private static String type;
	
	public Pet(String name, String dob, String type) {
		this.name = name;
		this.dob = dob;
		this.type = type;
	}
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Pet withName(String name) {
		this.name = name;
		return this;
	}
	
	public static String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public Pet withDOB(String dob) {
		this.dob = dob;
		return this;
	}
	public static String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Pet withTypeOfSelection(String type) {
		this.type = type;
		return this;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", DOB =" + dob + ", PetType =" + type +"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dob == null) ? 0 : dob.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Pet other = (Pet) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (dob == null) {
			if (other.dob != null)
				return false;
		} else if (!dob.equals(other.dob))
			return false;
		if (type == null) {
			if (other.name != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
}
