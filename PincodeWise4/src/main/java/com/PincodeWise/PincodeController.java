package com.PincodeWise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/pincode")
public class PincodeController {
    @Autowired
    private PincodeService pincodeService;

    @GetMapping
    public List<Pincode> getPincodes(){
        return pincodeService.getPincodes();
    }
    @GetMapping("/{pincode}")
    public Pincode getPincode(@RequestBody @PathVariable int pincode){
        return pincodeService.getPincode(pincode);
    }
    @PostMapping
    public Pincode addPincode(@RequestBody Pincode pincode){
        return pincodeService.addPincode(pincode);
    }
    
    @PostMapping("/create")
	 public ResponseEntity <Pincode> create (@RequestBody Pincode pin){
		 return ResponseEntity.status(HttpStatus.CREATED).body(pincodeService.save(pin));
		 }
    @PutMapping("/{pincode}")
    public Pincode addPincode(@PathVariable int id,@RequestBody Pincode pincode){
        return pincodeService.updatePincode(id,pincode);
    }
    @DeleteMapping("/{pincode}")
    public void deletePincode(@PathVariable int id){
        pincodeService.deletePincode(id);
    }
}