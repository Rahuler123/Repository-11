package com.PincodeWise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/district")
public class DistrictController {
	
    @Autowired
    private DistrictService districtService;

    @GetMapping
    public List<District> getDistricts(){
        return districtService.getDistricts();
    }
    @GetMapping("/{districtName}")
    public District getDistrict(@PathVariable int id){
        return districtService.getDistrict(id);
    }
    @PostMapping
    public District addDistrict(@RequestBody District district){
        return districtService.addDistrict(district);
    }
    @PutMapping("/{id}")
    public District addDistrict(@PathVariable int id,@RequestBody District district){
        return districtService.updateDistrict(id,district);
    }
    @DeleteMapping("/{id}")
    public void deleteDistrict(@PathVariable int id){
    	districtService.deleteDistrict(id);
    }
}

