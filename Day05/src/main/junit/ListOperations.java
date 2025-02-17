package junit;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

        addElement(list,5);
        addElement(list,3);
        addElement(list,8);

        removeElement(list, 5);

        System.out.println(list + " " + getLength(list));
    }

    // method add element
    public static void addElement(List<Integer>list, int element){
        list.add(element);
    }

    // method remove element
    public static void removeElement(List<Integer>list, int element){
        // converting primitive to object
        list.remove(Integer.valueOf(element));
    }

    // method return length of list
    public static int getLength(List<Integer>list){
        return list.size();
    }

}
