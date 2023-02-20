import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Hw {
    public static void main(String[] args) {
        LinkedList <String> link = new LinkedList<>();
        ArrayList <String>  aList = new ArrayList<>();
        zapolnit(link);
        zapolnit(aList);
        test(link);
        test(aList);
        System.out.println("время ArrayList "+ ms(aList));
        System.out.println("время LinkedList "+ ms(link));
    }


    public static long ms(List list){
        Date nowDate = new Date();
        test(list);
        Date endDate = new Date();
        long fin = endDate.getTime() - nowDate.getTime();
        return fin;
    }

    public static List zapolnit(List list){
        for (int i = 0; i < 10000; i++) {
            list.add(i,new Object());
        }
        return list;
    }


    private static List test(List list){
        int x = list.size() / 2;
        for (int i = 0; i < 10000; i++) {
            list.set(x,new Object());
        }
        return list;
    }




}
