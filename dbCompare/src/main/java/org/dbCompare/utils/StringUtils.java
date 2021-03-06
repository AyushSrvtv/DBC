package org.dbCompare.utils;

import org.dbCompare.pojoclasses.DBServerDetails;

public class StringUtils {
	
	public static String prepareConnString(String connectionString, DBServerDetails sd) {
		StringBuilder sb = new StringBuilder();
		sb.append(connectionString).append(sd.getUrl()).append(":").append(sd.getPort());
		if(sd.getDbType().equalsIgnoreCase("oracle")) {
			sb.append(":");
		}
		else if(sd.getDbType().equalsIgnoreCase("postgresql")) {
			sb.append("/");
		}
		sb.append(sd.getDbName());
		return sb.toString();
	}

}
