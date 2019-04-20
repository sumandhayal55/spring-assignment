package com.ui.demo.model;

public class Veterniarians {
	private String name;
	private String specialities;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Veterniarians withName(String name) {
		this.name = name;
		return this;
	}

	public String getSpecialities() {
		return specialities;
	}

	public void setSpecialities(String specialities) {
		this.specialities = specialities;
	}

	public Veterniarians withSpecialities(String specialities) {
		this.specialities = specialities;
		return this;
	}

	@Override
	public String toString() {
		return "Veterniarians [name=" + name + ", specialities=" + specialities + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((specialities == null) ? 0 : specialities.hashCode());
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
		Veterniarians other = (Veterniarians) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (specialities == null) {
			if (other.specialities != null)
				return false;
		} else if (!specialities.equals(other.specialities))
			return false;
		return true;
	}

}
