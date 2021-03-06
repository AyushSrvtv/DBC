package org.dbCompare.pojoclasses;

public class DBServerDetails {
	
	private String url;
	private String dbName;
	private String username;
	private String password;
	private String port;
	private String dbType;
	
	public DBServerDetails(String url, String dbName, String username, String password, String port, String dbType) {
		super();
		this.url = url;
		this.dbName = dbName;
		this.username = username;
		this.password = password;
		this.port = port;
		this.dbType = dbType;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	public String getDbType() {
		return dbType;
	}
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	@Override
	public String toString() {
		return "DBServerDetails [url=" + url + ", dbName=" + dbName + ", username=" + username + ", password="
				+ password + ", port=" + port + ", dbType=" + dbType + "]";
	}
}
