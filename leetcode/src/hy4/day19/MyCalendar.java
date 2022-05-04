package hy4.day19;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 729.我的日程安排表Ⅰ
 * @author: Mr.Hu
 * @create: 2022-05-04 22:59
 **/
public class MyCalendar {

    List<List<Integer>> list;

    public MyCalendar() {
        list = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        if (list.size() == 0) {
            ArrayList<Integer> book = new ArrayList<>();
            book.add(start);
            book.add(end);
            list.add(book);
            return true;
        } else {
            for (int i = 0; i < list.size(); i++) {
                if ((start >= list.get(i).get(0) && start < list.get(i).get(1)) || (end > list.get(i).get(0) && end <= list.get(i).get(1)) || (start < list.get(i).get(0) && end >= list.get(i).get(1))) {
                    return false;
                }
            }
            ArrayList<Integer> book = new ArrayList<>();
            book.add(start);
            book.add(end);
            list.add(book);
            return true;
        }
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.book(37, 50);
        myCalendar.book(33, 50);
        myCalendar.book(4, 17);
        myCalendar.book(35, 48);
        myCalendar.book(8, 25);

        myCalendar.list.forEach(System.out::println);
    }

}
