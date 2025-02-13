package com.list;

import java.util.*;

public class FrequencyElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        int n = scanner.nextInt();

        List<String> list = new ArrayList<>();

        System.out.println("Enter elements of list");
        for(int i=0; i<n; i++){
            list.add(scanner.next());
        }

        System.out.println(countFrequency(list));
    }

    static Map<String, Integer> countFrequency(List<String>list){
        // creating Map interface by implementing it with HashMap to count the frequency
        Map<String, Integer> frequency = new HashMap<>();

        for (String s : list) {
            // getOrDefault method is used to set the default value of element is 0 and if it already exist in map then increase it's frequency by 1
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }

        // return map
        return frequency;
    }
}
