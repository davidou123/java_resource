
import java.util.*;
 
public class HashMap {
    public static void main(String[] args) {
        Map<String, String> map = 
                        new HashMap<String, String>();
        
        map.put("小民", "男生");
        map.put("小華", "女生");
        
        System.out.println(map.get("小華"));
        System.out.println(map.get("小民"));
    }
} 
//clear			-移除所有映射關係
//containsKey	-判斷是否包含指定key
//containValue	-判斷是否包含指定value
//equals		-判斷是否與指定物件相同
//get			-傳回指定key所映射的value
//isEmpty		-判斷是否為空
//keySet		-獲得map集合所有的key
//put			-向指定索引位置增加物件
//putAll		-追加另一個map物件到目前map集合
//remove		-移除map集合中指定key的內容
//size			-獲得map集合類別的大小
//valuse		-獲得 map集合中所有鍵值物件
