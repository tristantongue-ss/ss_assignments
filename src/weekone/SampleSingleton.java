package weekone;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class SampleSingleton {

	private static Connection conn = null;
	
	private static volatile SampleSingleton instance = null;
	
	
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
		}
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) {
		try {
			conn = DriverManager.getConnection("url of database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("select id from table");
			BigInteger x;
			while(rs.next()) {
				x = input.multiply(BigDecimal.valueOf(rs.getInt(1))).toBigInteger();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
