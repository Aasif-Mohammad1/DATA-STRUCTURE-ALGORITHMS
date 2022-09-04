package AasifMohammad;
import java.util.ArrayList;

class ArrayL {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements
        list.add(0);
        list.add(1);
        list.add(3);

        System.out.println(list.get(2));
        list.add(2,2);

        list.set(0,10);
        System.out.println(list);


    }
}
