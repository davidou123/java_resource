 import java.sql.*; 
 
public class DBConnectionDemo { 
    public static void main(String[] args) { 
        String driver = "com.mysql.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/curlplurk"; 
        String user = "root"; 
        String password = "0000"; 
        try { 
            Class.forName(driver);  //1
            Connection conn = DriverManager.getConnection(url,user, password);  //2
 
            if(conn != null && !conn.isClosed()) {
                System.out.println("��Ʈw�s�u���զ��\�I"); 
                
                Statement st = conn.createStatement();    //3.�ЫإΩ�����R�Asql�y�y��Statement��H�Ast�ݧ����ܶq  
                ResultSet rs = st.executeQuery("select * from user");    //4.����sql�d�߻y�y�A��^�d�߼ƾڪ����G��  
                System.out.println("�̫᪺�d�ߵ��G���G");  
				
                while (rs.next()) { // �P�_�O�_�٦��U�@�Ӽƾ�  
                    String user1 = rs.getString("user");    
                    String done = rs.getString("done");  

                    System.out.println(user1 + " " + done );  
                }  
                conn.close();
            }
            
        } 
        catch(ClassNotFoundException e) { 
            System.out.println("�䤣���X�ʵ{�����O"); 
            e.printStackTrace(); 
        } 
        catch(SQLException e) { 
            e.printStackTrace(); 
        } 
    } 
} 
//�o�O�s��mysql���d�ҵ{��
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
//�����ȱo�t�C�N���Ogettype �Ҧp�W����getString getDouble getObject getInt�� �᭱�i�H��@��getxxxx�� �ݧA�Oԣ���A�Ngetԣ


