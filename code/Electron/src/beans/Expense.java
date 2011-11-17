package beans;

import java.util.Date;

public class Expense {
	private String iD;
	private String bussiId;
	private String expenId;
	private String summny;
	private Date   date;
	
	private Db2Conn conn = null;
	
	private  boolean connectDB2()
    {
     	boolean if_con = false;
        this.conn = new Db2Conn();
        return if_con;
	}
	  
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getiD() {
		return iD;
	}
	public void setBussiId(String bussiId) {
		this.bussiId = bussiId;
	}
	public String getBussiId() {
		return bussiId;
	}
	public void setExpenId(String expenId) {
		this.expenId = expenId;
	}
	public String getExpenId() {
		return expenId;
	}
	/**
	 * @param summny the summny to set
	 */
	public void setSummny(String summny) {
		this.summny = summny;
	}
	/**
	 * @return the summny
	 */
	public String getSummny() {
		return summny;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
}
