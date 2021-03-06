package org.dbCompare.jdbchandlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.dbCompare.pojoclasses.DBServerDetails;
import org.dbCompare.utils.StringUtils;

public class DBConnection {
	
	public static final String postgres_DriverName = "org.postgresql.Driver";
	public static final String oracle_DriverName = "oracle.jdbc.driver.OracleDriver";
	
	public static final String postgres_ConnectionString = "jdbc:postgresql://";
	public static final String oracle_ConnectionString = "jdbc:oracle:thin:@";

	public static Connection getConnection(DBServerDetails serverDetails) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String finalConnString = null;
		if(serverDetails.getDbType().equalsIgnoreCase("oracle")) {
			Class.forName(oracle_DriverName);
			finalConnString = StringUtils.prepareConnString(oracle_ConnectionString, serverDetails);
			conn = DriverManager.getConnection(finalConnString,serverDetails.getUsername(),serverDetails.getPassword());
			System.out.println("Connection Established Successfully!");
			return conn;
		}
		else if(serverDetails.getDbType().equalsIgnoreCase("postgresql")) {
			Class.forName(postgres_DriverName);
			finalConnString = StringUtils.prepareConnString(postgres_ConnectionString, serverDetails);
			conn = DriverManager.getConnection(finalConnString, serverDetails.getUsername(), serverDetails.getPassword());
			System.out.println("Connection Established Successfully!");
			return conn;
		}
		return null;
	}
	
}
