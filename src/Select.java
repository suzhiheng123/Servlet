import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;



public class Select {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("���سɹ�");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("���쳣");
			e.printStackTrace();

		}
		try {
			Connection con = (Connection) DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studb", "root", "liuhui");
			System.out.println("���Ӵ����ɹ�");
			Statement sta = (Statement) con.createStatement();
			ResultSet a = (ResultSet) sta
							.executeQuery("SELECT * FROM studb.studentinfo;");
					while (a.next()) {
						String stuid = a.getString(1);
						String name = a.getString(2);
						int age = a.getInt(3);
						System.out.println(stuid + name + age);
					}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ӵ���ʧ��");
			e.printStackTrace();
		}
	}
}
