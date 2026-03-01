package re.edu.map;

import java.util.*;

public class BTList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();

        Random rad=new Random();
        //tao 100 so ngau nhien tu 0-999
        for(int i=0; i<100; i++){
            list.add(rad.nextInt(50));
        }
        System.out.println(list);



        // 1.1: Loai bo cac phan tu trung lap trong danh sach
        Set<Integer> set=new TreeSet<>(list);
        System.out.println("list: "+list.size());
        System.out.println(set);
        System.out.println("set: "+set.size());

        // 1.2: Dem so lan xuat hien cua cac phan tu
        Map<Integer,Integer> map=new TreeMap<>();
        for(Integer num:list){
            if(!map.containsKey(num)){
                map.put(num, 1);
            }else{
                map.put(num, map.get(num)+1);
        }

        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(
                    entry.getKey() + " xuất hiện " + entry.getValue() + " lần"
            );

        }

    }

}
