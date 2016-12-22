package ch05;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zou on 2016/12/19.
 */
public class Demo2_ArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Person("张三", 23));
        list.add(new Person("张三", 23));
        list.add(new Person("李四", 24));
        list.add(new Person("李四", 24));
        list.add(new Person("李四", 24));
        list.add(new Person("王五", 25));
        list.add(new Person("王五", 25));
        list.add(new Person("王五", 25));
        list.add(new Person("赵六", 26));
        list.add(new Person("赵六", 26));
        list.add(new Person("赵六", 26));

        ArrayList newlist = getSingle(list);
        System.out.println(newlist);
    }
    public static ArrayList getSingle(ArrayList list) {
        ArrayList newlist = new ArrayList<>();
        Iterator it = list.iterator();

        while (it.hasNext()) {
            Object obj = it.next();
            if (!newlist.contains(obj)) {
                newlist.add(obj);
            }
        }
        return newlist;
    }
}


