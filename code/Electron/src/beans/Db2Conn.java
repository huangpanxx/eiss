package beans;
import java.sql.*;

public class Db2Conn{
	private static String db2Url = "jdbc:db2://202.115.7.252:446/";
	private static String db2Usr = "CU083";
	private static String db2Pwd = "1313986";
	private static String db2Name = "TSTDB201";
	private Connection db2conn;
	
	// (构造函数)默认连接数据库
	public Db2Conn() 
	{
		try {
			Class.forName("COM.ibm.db2os390.sqlj.jdbc.DB2SQLJDriver").newInstance();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InstantiationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.db2conn  = DriverManager.getConnection(db2Url+db2Name, db2Usr, db2Pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//  手动连接数据库
	public static  Connection reConnnect(String db2url, String db2usr, String db2pwd) throws SQLException
	{
		Connection conn =   DriverManager.getConnection(db2url, db2usr, db2pwd);
		return conn;
	}
	
	
	
	public ResultSet execquery(String query) throws SQLException
	{
		Statement statmet =  this.db2conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		return statmet.executeQuery(query);
	}
	
	public int execupdate(String query) throws SQLException
	{
		Statement statmet =  this.db2conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		return statmet.executeUpdate(query);
	}
	/**
	 * @return the db2conn
	 */
	public Connection getDb2conn() {
		return db2conn;
	}

}
