import java.util.ArrayList;
import java.util.Iterator;
//對於循序加入跟存取arraylist比較好，經常變動的話就要用linklist
public class arraylist {

	public static void main(String[] args) {
		ArrayList Lssist = new ArrayList();
		for (int i = 0; i < 10; i++)
			// 給數組增加10個Int元素
			Lssist.add(i);

		Lssist.add("元素");
		//計算有幾個元素在裡面
		int count = Lssist.size();
		System.out.println(count);

		//輸出
		Iterator iterator = Lssist.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

}
//add			-向清單插入元素
//addAll		-將指定collection增加到列表中
//clear			-從清單移除所有元素
//contains		-判斷清單中是否包含指定元素
//containAll	-判斷列表中是否包含指定collection所有元素
//equals		-比較指定的物件與列表是否相等
//get			-獲得清單指定位置的元素
//set			-替換清單中指定位置的元素
//hashcode		-傳回列表中的雜湊碼值
//indexOf		-傳回第一次出現指定元素的位置
//lastIndexOf	-傳回最後一次出現指定元素的位置
//isEmpty		-判斷集合是否為空
//iterator		-傳回反覆運算器
//listIterator	-傳回列表反覆運算器
//remove		-移除清單中的指定元素
//removeAll		-從列表中除指定collection包含的所有元素
//retainALL		-保留指定collection包含的所有元素
//size			-傳回清單中元素的個數
//subList		-獲得列表中指定範圍的子列表
//toArray		-傳回所有元素的陣列