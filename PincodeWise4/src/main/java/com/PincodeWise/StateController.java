package com.PincodeWise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/state")
public class StateController {
    @Autowired
    private StateService stateService;

    @GetMapping
    public List<State> getStates(){
        return stateService.getStates();
    }
    @GetMapping("/{id}")
    public State getState(@PathVariable int id){
        return stateService.getState(id);
    }
    @PostMapping
    public State addState(@RequestBody State state){
        return stateService.addState(state);
    }
    @PutMapping("/{id}")
    public State addState(@PathVariable int id,@RequestBody State state){
        return stateService.updateState(id,state);
    }
    @DeleteMapping("/{id}")
    public void deleteState(@PathVariable int id){
        stateService.deleteState(id);
    }
}
