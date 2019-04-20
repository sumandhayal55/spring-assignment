package com.ui.demo.model;

public class Owner {

	private String name;
	private String address;
	private String city;
	private String telephone;
	private String pets;
	
	
	private String firstName;
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String lastName;
	
	public Owner() {
		
	}
	
	public Owner(String fn, String ln, String tel, String adrs, String city) {
		this.firstName = fn;
		this.lastName = ln;
		this.telephone = tel;
		this.address = adrs;
		this.city = city;
		this.name = fn + " " + ln;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Owner withName(String name) {
		this.name = name;
		return this;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Owner withAddress(String address) {
		this.address = address;
		return this;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Owner withCity(String city) {
		this.city = city;
		return this;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Owner withTelephone(String telephone) {
		this.telephone = telephone;
		return this;
	}

	public String getPets() {
		return pets;
	}

	public void setPets(String pets) {
		this.pets = pets;
	}

	public Owner withPets(String pets) {
		this.pets = pets;
		return this;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", address=" + address + ", city=" + city + ", telephone=" + telephone
				+ ", pets=" + pets + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pets == null) ? 0 : pets.hashCode());
		result = prime * result + ((telephone == null) ? 0 : telephone.hashCode());
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
		Owner other = (Owner) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pets == null) {
			if (other.pets != null)
				return false;
		} else if (!pets.equals(other.pets))
			return false;
		if (telephone == null) {
			if (other.telephone != null)
				return false;
		} else if (!telephone.equals(other.telephone))
			return false;
		return true;
	}
}
