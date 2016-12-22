package ch05;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zou on 2016/12/19.
 */
public class Dome4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");
        ArrayList newList = getSingle(list);
        System.out.println(newList);
    }

    public static ArrayList getSingle(ArrayList list) {
        ArrayList newList = new ArrayList();
        Iterator it = list.iterator();

        while(it.hasNext()) {
            String obj = (String)it.next();//不可以用 Object obj = it.next();因为无法去除重复元素
            if(!newList.contains(obj)) {
                newList.add(obj);
            }
        }

        return newList;
    }
}



