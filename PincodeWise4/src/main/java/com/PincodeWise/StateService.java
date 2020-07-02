package com.PincodeWise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {
    @Autowired
    private StateRepository stateRepository;
    public List<State> getStates(){
        return stateRepository.findAll();
    }
    
    
    public State getState(int id){
        Optional<State> state = stateRepository.findById(id);
        if(!state.isPresent())
            throw new NotFoundException("state not found!");
        return state.get();
    }
    
    
    public State addState(State state){
        return stateRepository.save(state);
    }
    
    
    public State updateState(int id,State state){
        state.setStateId(id);
        return stateRepository.save(state);
    }
    public void deleteState(int id){
        stateRepository.deleteById(id);
    }
}
