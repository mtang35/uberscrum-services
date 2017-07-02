/**
 * 
 */
package main.java.com.tango.uberscrum.services;

import java.util.List;
import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author mtang1
 *
 */
public interface DailyScrumRepository extends MongoRepository<DailyScrum, String> {

	public List<DailyScrum> findByDate(Date date);
	public DailyScrum findById(String id);
	public List<DailyScrum> findByTeamMemberName(String teamMemberName);
	
}
