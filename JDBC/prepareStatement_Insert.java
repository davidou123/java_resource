import java.sql.*;

// Insert one employee
public class prepareStatement_Insert {
	public static void main(String[] args) {
		Connection conn = null;
		try {     
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String connUrl = "jdbc:sqlserver://localhost:1433;databaseName=db01";  //資料庫位置 名稱
			conn = DriverManager.getConnection(connUrl, "sa", "passw0rd"); //使用者帳號 密碼
			
			String ins_stmt = "INSERT INTO employee VALUES (?, ?, ?, ?, ?, ?)"; //sql指令 此為新增 欄位數量依需要修改
			PreparedStatement pstmt = conn.prepareStatement(ins_stmt);
			pstmt.setInt(1, 1009);                  //下列幾行為insert進去的資料 到時就是抓user輸入的資料
			pstmt.setString(2, "Jean Tsao");
			pstmt.setString(3, "2008/10/10");
			pstmt.setDouble(4, 55000);
			pstmt.setString(5, "100");
			pstmt.setString(6, "senior engineer");
			int num = pstmt.executeUpdate();
			System.out.println("insert count = " + num);
			
			pstmt = conn.prepareStatement("SELECT * FROM employee");  //讀出table內的資料
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print("name = " + rs.getString("empname") + ", ");  //印出讀出的資料以確認資料狀態
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
}// end of class InsertDemo
