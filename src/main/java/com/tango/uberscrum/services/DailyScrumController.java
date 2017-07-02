/**
 * 
 */
package main.java.com.tango.uberscrum.services;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author mtang1
 *
 */

@RestController
public class DailyScrumController {
	
	@Autowired
	DailyScrumRepository repository;
	
	@RequestMapping("/dailycheckin")
	public boolean DailyCheckIn(@RequestParam(value="teamid") int teamId, 
			@RequestParam(value="yesterdayAccomplishment") String yesterdayAccomplishment, 
			@RequestParam(value="todayTask") String todayTask,
			@RequestParam(value="opportunities") String opportunities,
			@RequestParam(value="teamMemberName") String teamMember) {
		
		repository.save(new DailyScrum(teamId, yesterdayAccomplishment, todayTask, opportunities, new Date(), teamMember));
		
		return true;
	}
}
