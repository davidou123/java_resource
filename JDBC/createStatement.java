 import java.sql.*; 
 
public class createStatement { 
    public static void main(String[] args) { 
        String driver = "com.mysql.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/curlplurk"; 
        String user = "root"; 
        String password = "0000"; 
        try { 
            Class.forName(driver);  //1
            Connection conn = DriverManager.getConnection(url,user, password);  //2
 
            if(conn != null && !conn.isClosed()) {
                System.out.println("資料庫連線測試成功！"); 
                
                Statement st = conn.createStatement();    //3.創建用於執行靜態sql語句的Statement對象，st屬局部變量  
				st.execute("INSERT INTO student VALUES('2', '良葛格', '2004-5-26','0974121345')"); //這行就可以insert了
                ResultSet rs = st.executeQuery("select * from user");    //4.執行sql查詢語句，返回查詢數據的結果集  
                System.out.println("最後的查詢結果為：");  
				
                while (rs.next()) { // 判斷是否還有下一個數據  
                    String user1 = rs.getString("user");    
                    String done = rs.getString("done");  

                    System.out.println(user1 + " " + done );  
                }  
                conn.close();
            }
            
        } 
        catch(ClassNotFoundException e) { 
            System.out.println("找不到驅動程式類別"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
//這是連接mysql的範例程式
//next()
//previous()
//first()
//last()
//before()
//beforeFirst()
//afterLast()
//absolute(int row)
// trlative(int row)
//ifFirst()
//isLast()
//isBeforeFirst()
//isAfterLast()
//wasNull()
//其實取值得系列就都是gettype 例如上面的getString getDouble getObject getInt等 後面可以塞一堆getxxxx的 看你是啥型態就get啥


