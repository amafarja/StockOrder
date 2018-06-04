package edu.birzeit.soa.assignment5;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * The rest controller of the Instrument class
 * 
 * @author amafarja
 *
 */
@RestController
@RequestMapping("/instrument")
public class InstrumentController {

	/** Maps between ids and their corresponding instruments **/
	Map<Integer, Instrument> instruments = new HashMap<>();

	/**
	 * Get a specific instrument by its id
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public double getInstrumentPrice(@PathVariable int id) {
		Instrument instrument = instruments.get(id);
		if (instrument != null) {
			return instrument.getCost();
		}
		return 0;
	}

	/**
	 * Adds an instrument to the map @instruments
	 * 
	 * @param instrument
	 * @return
	 */
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
