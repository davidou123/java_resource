import java.sql.*;

// delete a employee data
public class prepareStatement_Delete {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=db01";  //資料庫位置 名稱
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd");	//使用者名稱 密碼
			
			String del_stmt = "DELETE employee WHERE empno=?";  //sql指令 此為刪除輸入之員工序號的資料
			PreparedStatement pstmt = conn.prepareStatement(del_stmt);
			pstmt.setInt(1, 1009);  //輸入之序號為1009
			int num = pstmt.executeUpdate();
			System.out.println("delete count = " + num); //印出刪除的資料筆數
			
			pstmt = conn.prepareStatement("SELECT * FROM employee");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("name = " + rs.getString("empname") + ", ");
				System.out.println("salary = " + rs.getDouble("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch(Exception e) { 
					e.printStackTrace();
				}
		}
	}// end of main()
}// end of class DeleteDemo
