package com.PincodeWise;

import java.util.List;

import javax.persistence.*;

@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "stateId")
    private int stateId;
    private String stateName;
    

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "stateId",referencedColumnName = "stateId")
//    private List<District> districts;


	public int getStateId() {
		return stateId;
	}


	public void setStateId(int stateId) {
		this.stateId = stateId;
	}


	public String getStateName() {
		return stateName;
	}


	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	

//
//	public Country getCountry() {
//		return country;
//	}
//
//
//	public void setCountry(Country country) {
//		this.country = country;
//	}


//	@Override
//	public String toString() {
//		return "state [stateId=" + stateId + ", stateName=" + stateName + ", country=" + country + "]";
//	}
	
	
	
	
	
	
	
//	public List<District> getDistricts() {
//		return districts;
//	}
//
//
//	public void setDistricts(List<District> districts) {
//		this.districts = districts;
//	}

	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "State [stateId=" + stateId + ", stateName=" + stateName + "]"; //, districts=" + districts + "
	}

	public State() {
		
	}

	public State(String stateName, List<District> districts) {
		this.stateName = stateName;
		//this.districts = districts;
	}

    
}
