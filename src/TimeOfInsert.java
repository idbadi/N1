import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class TimeOfInsert {
    public static void main(String[] args) {
        System.out.println(getTimeMsOfInsert(fill(new ArrayList())));
        System.out.println(getTimeMsOfInsert(fill(new LinkedList())));
    }
    private static List fill(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }
    public static long getTimeMsOfInsert(List list) {
        Date startTime = new Date();
        insert10000(list);
        Date endTime = new Date();
        long fin = endTime.getTime() - startTime.getTime();
        return  fin;
    }
    public static void insert10000(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(0, new Object());
        }
    }
}
