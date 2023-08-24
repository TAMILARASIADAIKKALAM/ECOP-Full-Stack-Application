package com.example.ECOP.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ECOP.entity.Victim;
import com.example.ECOP.repository.VictimRepo;


@Service
public class Victimservice {	    
	    @Autowired
	    private VictimRepo Repo;

	    public Victim savedetails(Victim registration) {
	        return Repo.save(registration);
	    }
	    
	    public List<Victim> getAllRegistrations() {
	    	List<Victim> li=new ArrayList<>();
	    	li=Repo.findAll();
	        return li;
	    }
	    public String delete(int id) {
	    	Repo.deleteById(id);
	    	return "deleted successfully";
	    }
	    public Victim update(int id,Victim obj) {
	       return Repo.saveAndFlush(obj);
	    }

		
}
