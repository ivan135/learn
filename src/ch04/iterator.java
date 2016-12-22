package ch04;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by zou on 2016/12/16.
 */
public class iterator
{


        public static void main(String[] args) {
            ArrayList c = new ArrayList();
            c.add(new Student("张三", 23));
            c.add(new Student("李四", 24));
            c.add(new Student("王五", 25));
            c.add(new Student("赵六", 26));
            Iterator it = c.iterator();

            //迭代器遍历
            while(it.hasNext()) {
                Student s = (Student)it.next();
                System.out.println(s.getName() + "..." + s.getAge());
            }

        }



        }


