package com.PincodeWise;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class District {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column(name="districtId")
	private int districtId;
    private String districtName;
    
    @ManyToMany(cascade = CascadeType.ALL)
    
	public int getDistrictId() {
		return districtId;
	}
	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	
	public District() {
		
	}
			
	public District(String districtName) {
		this.districtName = districtName;
	}
	
	@Override
	public String toString() {
		return "District [districtId=" + districtId + ", districtName=" + districtName + "]";
	}
	
    

}
