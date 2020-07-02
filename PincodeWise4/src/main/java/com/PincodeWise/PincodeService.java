package com.PincodeWise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PincodeService {
    @Autowired
    private PincodeRepository pincodeRepository;

    public List<Pincode> getPincodes(){
        return pincodeRepository.findAll();
    }
    public Pincode getPincode(int id){
        Optional<Pincode> pincode = pincodeRepository.findById(id);
        if(!pincode.isPresent())
                throw new NotFoundException("Pincode not found!");
        return pincode.get();
    }
    public Pincode addPincode(Pincode pincode){
        return pincodeRepository.save(pincode);
    }
    public Pincode updatePincode(int id,Pincode pincode){
        pincode.setPincode(id);
        return pincodeRepository.save(pincode);
    }
    public void deletePincode(int id){
        pincodeRepository.deleteById(id);
    }
    
    public Pincode save (Pincode cou) {
		return pincodeRepository.save(cou);
	}
}
