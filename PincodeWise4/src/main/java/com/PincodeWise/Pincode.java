package com.PincodeWise;
import javax.persistence.*;
import java.util.List;

@Entity
public class Pincode {
    @Id
    @Column(name = "pincode")
    private int pincode;
   // private String PincodeName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pincode",referencedColumnName = "pincode")
    private List<State> states;
    

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pincode",referencedColumnName = "pincode")
    private List<District> districts;
    
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

//	public String getPincodeName() {
//		return PincodeName;
//	}
//
//	public void setPincodeName(String PincodeName) {
//		this.PincodeName = PincodeName;
//	}


	public List<State> getStates() {
		return states;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}
	
	

	public List<District> getDistricts() {
		return districts;
	}
	
	public void setDistricts(List<District> districts) {
		this.districts = districts;
	}


	
	
	
//	@Override
//	public String toString() {
//		return "Pincode [pincodeId=" + pincodeId + ", PincodeName=" + PincodeName + ", states=" + states
//				+ ", districts=" + districts + "]";
//	}
//	
//	public Pincode() {
//	}
//
//	public Pincode(String PincodeName, List<State> states, List<District> districts) {
//		this.PincodeName = PincodeName;
//		this.states = states;
//		this.districts = districts;
//}
//	
	


	@Override
	public String toString() {
		return "Pincode [pincode=" + pincode + ", states=" + states + ", districts="
				+ districts + "]";
	}
	
	
	public Pincode() {
	} 
	


	public Pincode(List<State> states, List<District> districts) {
		this.states = states;
		this.districts = districts;
	}



//	@Override
//	public String toString() {
//		return "Pincode [pincodeId=" + pincodeId + ", PincodeName=" + PincodeName + ", states=" + states
//				+ "]";
//	}
//	
//	public Pincode() {
//	}
//
//	public Pincode(String PincodeName, List<State> states) {
//		this.PincodeName = PincodeName;
//		this.states = states;
//	
//	}
	
}
