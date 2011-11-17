package beans;

import java.sql.ResultSet;
import java.sql.SQLException;



public class Consumer {
    private int iD;
    private String phoneNum;
    private String passwrd;
    private String securewrd;
    private static String tablename = "CONSUMRE";
    private Db2Conn conn = null;
	
    
    private  boolean connectDB2()
    {
		Db2Conn conn_tmp = new Db2Conn();
        if(conn != null){
        	this.conn = conn_tmp;
        	return true;
        }
        else
        	return false;
	}
	
    public static Consumer getConsuById(int cID)
    {
	    Db2Conn conn_tmp = new Db2Conn();
	    Consumer cons = null;
    	ResultSet rest = null;
    	String chekone  = "SELECT * FROM "+ Consumer.tablename + " WHERE CONSMID = "+String.valueOf(cID);	
    	try {
	    	rest= conn_tmp.execquery(chekone);
	    	cons.setID(cID);
	    	cons.setPasswrd(rest.getString("PWD"));
	    	cons.setPhoneNum("TEL");
	    	cons.setSecurewrd("SC");
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return cons;
    }
 
public static  Consumer[] getAllCons()
{
	Db2Conn conn_tmp = new Db2Conn();
	Consumer cons = null;
    Consumer[] conses = null;
	ResultSet rest = null;
	String chekall  = "SELECT * FROM "+ tablename;	
	try {
    	rest= conn_tmp.execquery(chekall);
    	int n = rest.getRow();
    	conses =new Consumer[n];
		rest.first();
		for(int i =0;i<n;i++)
		{
			rest= conn_tmp.execquery(chekall);
	    	cons.setID(rest.getInt("CONSMID"));
	    	cons.setPasswrd(rest.getString("PWD"));
	    	cons.setPhoneNum("TEL");
	    	cons.setSecurewrd("SC");
	    	if(!rest.next())
	    		break;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return conses;
}


// 检查数据库里是否有
public static boolean chekin(int cID,String cPasswrd)
{
	Db2Conn conn_tmp = new Db2Conn();
	ResultSet rest = null;
	String chekone = "SELECT PWD FROM "+ Consumer.tablename + " WHERE CONSMID = "+String.valueOf(cID);	
	try {
		rest= conn_tmp.execquery(chekone);
		if( rest.getString("PWD").equals(cPasswrd))
			return true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return false;
	}
	return false;
}

public boolean update(String cID)
{
	if(this.connectDB2()){
		String updateone = "UPDATE "+Consumer.tablename+" SET TEL="+this.phoneNum+" SC="+
		               this.securewrd+"  PWD="+this.passwrd+" WHERE CONSMID="+String.valueOf(cID);
		try {
			this.conn.execupdate(updateone);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	return false;
	
}

public boolean delete(String bussID)
{
	if(this.connectDB2()){
		String updateone = "DELETE  FROM "+Consumer.tablename+" WHERE CONSMID="+String.valueOf(bussID);
		try {
			this.conn.execupdate(updateone);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	return false;
	
}

public boolean save()
{
	if(this.connectDB2()){
		String updateone = "INSERT INTO "+Consumer.tablename+" SET TEL="+this.phoneNum+" SC="+
        this.securewrd+"  PWD="+this.passwrd+" CONSMID="+String.valueOf(this.iD);
		try {
			this.conn.execupdate(updateone);
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	return false;
	
}
   
    public static String register(String phoneNmr,String passwrd)
    {
    	String ret= "";
    	return ret;
    }
	public void setID(int cID) {
		this.iD = cID;
	}
	public int getID() {
		return iD;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	public String getPasswrd() {
		return passwrd;
	}
	public void setSecurewrd(String securewrd) {
		this.securewrd = securewrd;
	}
	public String getSecurewrd() {
		return securewrd;
	}
}
