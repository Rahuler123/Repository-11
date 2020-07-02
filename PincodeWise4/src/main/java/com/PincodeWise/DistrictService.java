package com.PincodeWise;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictService {
    @Autowired
    private DistrictRepository districtRepository;
    public List<District> getDistricts(){
        return districtRepository.findAll();
    }
    
    
    public District getDistrict(int id){
        Optional<District> district = districtRepository.findById(id);
        if(!district.isPresent())
            throw new NotFoundException("District not found!");
        return district.get();
    }
    
    
    public District addDistrict(District district){
        return districtRepository.save(district);
    }
    
    
    public District updateDistrict(int id,District district){
    	district.setDistrictId(id);
        return districtRepository.save(district);
    }
    public void deleteDistrict(int id){
    	districtRepository.deleteById(id);
    }
}

