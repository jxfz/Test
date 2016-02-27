package com.refactor.pif;

/**
 * Created by Administrator on 2016/2/26 0026.
 */
public class TestIf {
    public static void main(String[] argus) {
        TestIf testIf = new TestIf();
        testIf.test(1);
        testIf.test(22);
    }
    public void test(int a){
        switch (a){
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
        }
    }
}
