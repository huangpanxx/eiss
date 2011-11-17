package beans;

import java.sql.ResultSet;
import java.sql.SQLException;


public class Bussiniss {
	//private static  String tabelName = "";
	private int iD;
	private String name;
	private String licsNum;
	private String passwrd;
    private String securewrd;
    
    private static String tablename = "BUSS";
	/**
	 * @param securewrd the securewrd to set
	 * @throws SQLException 
	 */

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
	
	public static Bussiniss getBussById(int bID)
	    {
		    Db2Conn conn_tmp = new Db2Conn();
		    Bussiniss buss = null;
	    	ResultSet rest = null;
	    	String chekone  = "SELECT * FROM "+ tablename + " WHERE BUSSID = "+String.valueOf(bID);	
	    	try {
		    	rest= conn_tmp.execquery(chekone);
		    	buss.setiD(bID);
		    	buss.setName( rest.getString("NAME"));
		    	buss.setLicsNum( rest.getString("LICENSE"));
		    	buss.setPasswrd(rest.getString("PWD"));
		    	buss.setSecurewrd(rest.getString("SC"));
	    	} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
	    	return buss;
	    }
	 
    public static  Bussiniss[] getAllBuss()
    {
    	Db2Conn conn_tmp = new Db2Conn();
		Bussiniss buss = null;
	    Bussiniss[] busses = null;
    	ResultSet rest = null;
    	String chekall  = "SELECT * FROM "+ tablename;	
    	try {
	    	rest= conn_tmp.execquery(chekall);
	    	int n = rest.getRow();
	    	busses =new Bussiniss[n];
    		rest.first();
    		for(int i =0;i<n;i++)
    		{
		    	buss.setiD(rest.getInt("BUSSID"));
		    	buss.setName( rest.getString("NAME"));
		    	buss.setLicsNum( rest.getString("LICENSE"));
		    	buss.setPasswrd(rest.getString("PWD"));
		    	buss.setSecurewrd(rest.getString("SC"));
		    	busses[i] =buss;
		    	if(!rest.next())
		    		break;
    		}
    	} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	return busses;
    }
    
    
    // 检查数据库里是否有
    public static boolean chekin(int bID,String bPasswrd)
    {
    	Db2Conn conn_tmp = new Db2Conn();
    	ResultSet rest = null;
    	String chekone = "SELECT PWD FROM "+ tablename + " WHERE BUSSID = "+String.valueOf(bID);	
    	try {
			rest= conn_tmp.execquery(chekone);
			if( rest.getString("PWD").equals(bPasswrd))
				return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return false;
    }
    
    public boolean update(String bussID)
    {
    	if(this.connectDB2()){
    		String updateone = "UPDATE "+Bussiniss.tablename+" SET NAME="+this.name+" LICENSE="+
    		               this.licsNum+" SC="+this.securewrd+" PWD="+this.passwrd+" WHERE BUSSID="+String.valueOf(bussID);
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
    		String updateone = "DELETE  FROM "+Bussiniss.tablename+" WHERE BUSSID="+String.valueOf(bussID);
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
    		String updateone = "INSERT INTO "+Bussiniss.tablename+" (BUSSID, NAME, LICENSE,SC, PWD) VALUES(' "+
    		               this.iD+" ',' "+this.name+" ',' "+this.licsNum+" ',' "+ this.securewrd+" ',' "+this.passwrd+")";
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
    
    //  属性
	public void setSecurewrd(String securewrd) {
		this.securewrd = securewrd;
	}
	/**
	 * @return the securewrd
	 */
	public String getSecurewrd() {
		return securewrd;
	}
	/**
	 * @param passwrd the passwrd to set
	 */
	public void setPasswrd(String passwrd) {
		this.passwrd = passwrd;
	}
	/**
	 * @return the passwrd
	 */
	public String getPasswrd() {
		return passwrd;
	}
	/**
	 * @param licsNum the licsNum to set
	 */
	public void setLicsNum(String licsNum) {
		this.licsNum = licsNum;
	}
	/**
	 * @return the licsNum
	 */
	public String getLicsNum() {
		return licsNum;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param bID the iD to set
	 */
	public void setiD(int bID) {
		this.iD = bID;
	}
	/**
	 * @return the iD
	 */
	public int getiD() {
		return iD;
	}
}
