import java.util.LinkedList;
import java.util.Vector;

public class LinkList
{
  public static void main(String[] arg)
  {
    //初使化一個鏈表
    LinkedList head = new LinkedList();
    int size = 0;
    head.add("陣列1");
    head.add("陣列2");
    head.add("陣列3!");
    head.add(2, "陣列4");  //放到第二個位置 從0開始
    //鏈表會自動用遍歷的方式打印所有內容
    System.out.println(head);
    System.out.println("-------");
    
    //利用Vector或者是ArrayList等Collection往鏈表中加數據
    Vector v = new Vector();
    //向Vector中加入東西
    v.add("Vector1");
    v.add("Vector2");
    //將當前Vector加在當前鏈表的最後
    head.addAll(v);
    System.out.println(head);
    
    //將當前Vector加在當前鏈表的指定位置
    head.addAll(2, v);
    System.out.println(head);
    System.out.println("-------");
    //印指定位置的內容
    System.out.println(head.get(2));
    head.addFirst("第一個");
    System.out.println(head);
    head.addLast("最後一個");
    System.out.println(head);
    //刪除第一個
    head.remove(head.getFirst());
    System.out.println(head);
    //再刪除第一個，採用下標的方式，下標從0開始
    head.remove(0);
    System.out.println(head);
    head.remove(head.getLast());
    System.out.println(head);
  }
}