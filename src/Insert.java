import java.sql.DriverManager;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Insert {
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
			 int a=
			 sta.executeUpdate("insert studentinfo values('10008','��',20) ");
			
			 System.out.println("����"+a+"��");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("���Ӵ���ʧ��");
			e.printStackTrace();
		}
	}
}
