/**
 * 
 */
package main.java.com.tango.uberscrum.services;

import java.util.Date;
import org.springframework.data.annotation.Id;

/**
 * @author mtang1
 *
 */
public class DailyScrum {

	@Id
	private String id;
	
	private int teamId;
	private String yesterdayAccomplishment;
	private String todayTask;
	private String opportunities;
	private Date scrumDateTime;
	private String teamMemberName;
	
	public DailyScrum(int teamId) {
		this.setTeamId(teamId);
	}
	
	public DailyScrum(int teamId, String accomplishment, String task, String opps, Date date, String teamMember) {
		this.setYesterdayAccomplishment(accomplishment);
		this.setTodayTask(task);
		this.setOpportunities(opps);		
		this.setTeamId(teamId);
		this.setScrumDateTime(date);
		this.setTeamMemberName(teamMember);
	}
	
	public String getYesterdayAccomplishment() {
		return yesterdayAccomplishment;
	}
	
	public void setYesterdayAccomplishment(String accomplishment) {
		this.yesterdayAccomplishment = accomplishment;
	}
	
	public String getTodayTask() {
		return todayTask;
	}
	
	public void setTodayTask(String task) {
		this.todayTask = task;
	}
	
	public String getOpportunities() {
		return opportunities;
	}
	
	public void setOpportunities(String opportunities) {
		this.opportunities = opportunities;
	}
	
	public Date getScrumDateTime() {
		return scrumDateTime;
	}
	
	public void setScrumDateTime(Date date) {
		this.scrumDateTime = date;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamMemberName() {
		return teamMemberName;
	}

	public void setTeamMemberName(String teamMemberName) {
		this.teamMemberName = teamMemberName;
	}
	
	@Override
	public String toString() {
		return String.format("DailyScrum[id='%s', teamId='%s', teamMemberName='%s', yesterdayAccomplishment='%s', todayTask='%s']", id, this.getTeamId(), this.getTeamMemberName(), this.getYesterdayAccomplishment(), this.getTodayTask());		
	}
	
}
