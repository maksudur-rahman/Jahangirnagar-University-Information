package DatabaseHelper;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import FacultyUtils.Faculty;
import FacultyUtils.facultylist;
import HallUtils.FHall;
import HallUtils.Hall;
import LoginSignup.UserRegistration;

public class Database {
	private Connection connection;
	Statement stmt = null;

	public void connect() throws Exception {

		if (connection != null)
			return;

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			throw new Exception("Driver not found");
		}

		String connectionUrl = "jdbc:mysql://localhost:3306/ju";
		connection = DriverManager.getConnection(connectionUrl, "root", "");

		System.out.println("Connected: " + connection);

	}

	public void disconnect() {
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Can't close the connection");
			}
		}
	}

	public String login(String str1, String str2) throws SQLException {
		PreparedStatement ps = connection.prepareStatement("select * from test where name=? and password=?");
		ps.setString(1, str1);
		ps.setString(2, str2);

		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			return "Connected";
		} else {
			return "Wrong password Or User Name";
		}
	}

	public int addUser(UserRegistration userRegistration) throws ClassNotFoundException, SQLException {

		String query = "insert into test values ('" + userRegistration.getUserName() + "','"
				+ userRegistration.getPassword() + "')";

		java.sql.Statement stm = connection.createStatement();

		int executeUpdate = ((java.sql.Statement) stm).executeUpdate(query);

		return executeUpdate;
	}

	public ArrayList<Hall> hallList() throws SQLException {
		ArrayList<Hall> hArrayList = new ArrayList<>();
		String insertsql = "select *from malehall";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			Hall hall = new Hall(results.getInt("hid"), results.getString("hname"), results.getString("hprovostname"),
					results.getString("htelephone"));
			hArrayList.add(hall);
		}
		return hArrayList;

	}

	public ArrayList<FHall> fhallList() throws SQLException {
		ArrayList<FHall> hArrayList = new ArrayList<>();
		String insertsql = "select *from femalehall";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			FHall hall = new FHall(results.getInt("hid"), results.getString("hname"), results.getString("hprovostname"),
					results.getString("htelephone"));
			hArrayList.add(hall);
		}
		return hArrayList;

	}
	public ArrayList<Faculty> facultyList() throws SQLException {
		ArrayList<Faculty> fArrayList = new ArrayList<>();
		String insertsql = "select *from faculty";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			Faculty faculty = new Faculty(results.getInt("id"), results.getString("name"), results.getString("deanName"));
			fArrayList.add(faculty);
		}
		return fArrayList;

	}
	public ArrayList<facultylist> mathphysics() throws SQLException {
		ArrayList<facultylist> fArrayList = new ArrayList<>();
		String insertsql = "select *from  mathphysics";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			facultylist facultylist = new facultylist(results.getInt("id"), results.getString("name"));
			fArrayList.add(facultylist);
		}
		return fArrayList;

	}
	public ArrayList<facultylist> socialscience() throws SQLException {
		ArrayList<facultylist> fArrayList = new ArrayList<>();
		String insertsql = "select *from  socialscience";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			facultylist facultylist = new facultylist(results.getInt("id"), results.getString("name"));
			fArrayList.add(facultylist);
		}
		return fArrayList;

	}
	public ArrayList<facultylist> biological() throws SQLException {
		ArrayList<facultylist> fArrayList = new ArrayList<>();
		String insertsql = "select *from  biological";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			facultylist facultylist = new facultylist(results.getInt("id"), results.getString("name"));
			fArrayList.add(facultylist);
		}
		return fArrayList;

	}
	public ArrayList<facultylist> business() throws SQLException {
		ArrayList<facultylist> fArrayList = new ArrayList<>();
		String insertsql = "select *from  business";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			facultylist facultylist = new facultylist(results.getInt("id"), results.getString("name"));
			fArrayList.add(facultylist);
		}
		return fArrayList;

	}
	public ArrayList<facultylist> arts() throws SQLException {
		ArrayList<facultylist> fArrayList = new ArrayList<>();
		String insertsql = "select *from  arts";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			facultylist facultylist = new facultylist(results.getInt("id"), results.getString("name"));
			fArrayList.add(facultylist);
		}
		return fArrayList;

	}
	public ArrayList<facultylist>  law() throws SQLException {
		ArrayList<facultylist> fArrayList = new ArrayList<>();
		String insertsql = "select *from   law";
		java.sql.Statement statement = connection.createStatement();
		ResultSet results = statement.executeQuery(insertsql);
		while (results.next()) {
			facultylist facultylist = new facultylist(results.getInt("id"), results.getString("name"));
			fArrayList.add(facultylist);
		}
		return fArrayList;

	}
}
