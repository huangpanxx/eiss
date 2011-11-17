package beans;

public class Price {
	private String iD;
	private String eleId;
	private double   summny;
	
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
	public void setEleId(String eleId) {
		this.eleId = eleId;
	}
	public String getEleId() {
		return eleId;
	}
	public void setSummny(double summny) {
		this.summny = summny;
	}
	public double getSummny() {
		return summny;
	}
}
