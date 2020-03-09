import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static void zegar(int a, int b, int c, int d){
//        int[] tab = new int[4];
//        if (a==2){
//            tab[0] = a;
//        }
//        if (b==2 && tab[0]!=){
//
//        }
//        alt+enter dodajesz kolekcje


        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(a);
        arrList.add(b);
        arrList.add(c);
        arrList.add(d);

        Collections.sort(arrList, Collections.reverseOrder());
        int max1;
        int max2;
        int max3;
        int max4;
        for (int i = 0; i < 4;i++){
            if (arrList.indexOf(i)<=2){
                max1 = arrList.indexOf(i);
                if (max1 < arrList.indexOf(i)){
                    max1 = arrList.get(i);
                }
//                continue;
            }
            if (arrList.indexOf(0)==2){
                if (arrList.indexOf(i)<4){
                    max2 = arrList.indexOf(i);
                    if (max2 < arrList.indexOf(i)){
                        max2=arrList.get(i);
                    }
                }

//                continue;
            }
            if (arrList.indexOf(0)<2){
                if (arrList.indexOf(i)<10){
                    max2 = arrList.indexOf(i);
                    if (max2 < arrList.indexOf(i)){
                        max2=arrList.get(i);
                    }
                }

//                continue;
            }
            if (arrList.indexOf(i)<=5){
                max3 = arrList.indexOf(i);
                if (max3 < arrList.indexOf(i)){
                    max3=arrList.get(i);
                }
//                continue;
            }
            if (arrList.indexOf(i)<=9){
                max4 = arrList.indexOf(i);
                if (max4 < arrList.indexOf(i)){
                    max4=arrList.get(i);
                }
//                continue;
            }
        }



    }
    public static void main(String[] args) {
        zegar(1,2,3,4);
//        System.out.println("Hello World!");
    }
}
