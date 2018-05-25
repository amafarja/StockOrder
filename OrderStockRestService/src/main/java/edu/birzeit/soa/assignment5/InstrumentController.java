package edu.birzeit.soa.assignment5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/instrument")
public class InstrumentController {

	Map<Integer, Instrument> instruments = new HashMap<>();
	
	@RequestMapping(method=RequestMethod.GET, value = "/{id}")
	public double getInstrumentPrice(@PathVariable int id) {
		return instruments.get(id).getCost();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public boolean addInstrument(@RequestBody Instrument instrument) {
		try {
			instruments.put(instrument.getId(), instrument);
		} catch (Exception ex) {
			return false;
		}
		
		return true;
	}
}
