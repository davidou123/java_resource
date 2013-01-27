import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {

	public static void main(String[] args) {
		ArrayList Lssist = new ArrayList();
		for (int i = 0; i < 10; i++)
			// 給數組增加10個Int元素
			Lssist.add(i);

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
