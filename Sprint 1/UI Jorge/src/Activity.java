import java.util.GregorianCalendar;


/**
 * @author Julio
 *
 */
public class Activity {
	private String activityName;
	private GregorianCalendar startDate;
	private GregorianCalendar endDate;
	private int scholarshipHourWage; 
	
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	
	public int getScholarshipHourWage() {
		return scholarshipHourWage;
	}
	public void setScholarshipHourWage(int scholarshipHourWage) {
		this.scholarshipHourWage = scholarshipHourWage;
	}
	public GregorianCalendar getStartDate() {
		return startDate;
	}
	public void setStartDate(GregorianCalendar startDate) {
		this.startDate = startDate;
	}
	public GregorianCalendar getEndDate() {
		return endDate;
	}
	public void setEndDate(GregorianCalendar endDate) {
		this.endDate = endDate;
	}
	
	
}
