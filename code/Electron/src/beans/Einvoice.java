package beans;

public class Einvoice {
	private String iD;
    private double summny;
    private String type;
    private boolean ifPrize;
    private String expRecordId;
    private static String tablename = "ELEINV";
    private Db2Conn conn = null;
	
	private  boolean connectDB2()
    {
     	boolean if_con = false;
        this.conn = new Db2Conn();
        return if_con;
	}
	
	public void setSummny(double summny) {
		this.summny = summny;
	}
	public double getSummny() {
		return summny;
	}
	public void setiD(String iD) {
		this.iD = iD;
	}
	public String getiD() {
		return iD;
	}
	public void setIfPrize(boolean ifPrize) {
		this.ifPrize = ifPrize;
	}
	public boolean isIfPrize() {
		return ifPrize;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getType() {
		return type;
	}
	public void setExpRecordId(String expRecordId) {
		this.expRecordId = expRecordId;
	}
	public String getExpRecordId() {
		return expRecordId;
	}
    
}
