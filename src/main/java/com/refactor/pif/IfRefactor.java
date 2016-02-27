package com.refactor.pif;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/2/26 0026.
 */
public class IfRefactor  {

    public void test(int a){
        /*switch (a){
            case 1 :
                System.out.println("111111");
                break;
            case 2 :
                System.out.println("222222");
                break;
            case 3 :
                System.out.println("333333");
                break;
            default:
                System.out.println("default");
        }*/
        test1(a);
    }
    public void test2(int a){
        if(a>1){
            System.out.println("1111");
            if(a >3){
                System.out.println("33333");
            }else{
                System.out.println("33333333333333333");
            }
        }else {
            System.out.println("11111111111111");
        }
        return;
    }


    public void test3(int a ){
       if(a <= 1){
           System.out.println("111111111111111111");
           return;
       }
       System.out.println("11111");
       if(a <= 3){
           System.out.println("3333333333333333");
           return;
       }
        System.out.println("33333333");
    }

    public void test1(int a){
        Map<Integer,Object> map = new HashMap<Integer, Object>();
        map.put(1, new Testa());
        map.put(2, new Testb());
        map.put(3, new Testc());
         if(map.containsKey(a)){
             ITest test = (ITest)map.get(a);
             test.dosth();
         }else{
             new TestDefault().dosth();
         }
    }

    public static void main(String[] argus) {
        IfRefactor testIf = new IfRefactor();
        testIf.test(1);
        testIf.test(22);
    }
}
