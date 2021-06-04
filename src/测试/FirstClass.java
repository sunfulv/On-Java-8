package 测试;

import java.util.ArrayList;

/**
 * @author fulv
 */
public class FirstClass {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<10;i++){
            array.add(i*i);
        }
        System.out.println(array);


    }
}
