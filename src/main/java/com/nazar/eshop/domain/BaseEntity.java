package com.nazar.eshop.domain;

public abstract class BaseEntity {
	
	protected Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object other) {
		if(other == null || id == null) 
			return false;
		
		if (this == other)
			return true;
		
		
		if(other.getClass() == getClass()) {
			return id.equals(((BaseEntity) other).id);
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		return id == null ? 0 : id.hashCode();
	}

}
