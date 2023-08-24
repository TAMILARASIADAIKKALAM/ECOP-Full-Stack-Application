package com.example.ECOP.apicontroller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.ECOP.entity.Victim;
import com.example.ECOP.service.Victimservice;
@CrossOrigin
@RestController
public class VictimController {

	@Autowired
	private Victimservice s;
	
	@PostMapping("/addvictim")  
	public Victim postvictim(@RequestBody Victim T)
	{
		return s.savedetails(T);
	}
	
	@GetMapping("/showvictim")
	public List<Victim> showvictim()
	{
		List<Victim> a = new ArrayList<>();
		a = s.getAllRegistrations();
		return a;
	}
	@DeleteMapping("/del/{id}")
	public String delvictim(@PathVariable("id") int id) {
		s.delete(id);
		return "Susscessfully deleted";
	}

	@PutMapping("/update/{id}")
	public String updatevictim(@PathVariable int id, @RequestBody Victim obj) {
		s.update(id, obj);
		return "Susscessfully updated";
	}
}

