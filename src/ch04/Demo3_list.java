package ch04;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by zou on 2016/12/17.
 */
public class Demo3_list {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("a");                                    //Object obj = new String();
		list.add("b");
		list.add("world");
		list.add("c");
		list.add("d");
		list.add("e");

		/*Iterator it = list.iterator();					//获取迭代器
		while(it.hasNext()) {							//判断集合中是否有元素
			String str = (String)it.next();				//向下转型
			if("world".equals(str)) {
				list.add("javaee");						//遍历的同时在增加元素,并发修改ConcurrentModificationException
			}
		}*/

		ListIterator lit = list.listIterator();            //获取迭代器(List集合特有的)
		while (lit.hasNext()) {
			String str = (String) lit.next();            //向下转型
			if ("world".equals(str)) {
				//list.add("javaee");						//遍历的同时在增加元素,并发修改ConcurrentModificationException
				lit.add("javaee");
			}
		}

		System.out.println(list);
	}
}


