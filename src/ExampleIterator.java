import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExampleIterator {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("text1");
        list.add("text2");
        list.add("text3");

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String element = iterator.next();
//            System.out.println(element);
//        }
        for (String s : list) {
            System.out.println(s);
        }


    }
}
