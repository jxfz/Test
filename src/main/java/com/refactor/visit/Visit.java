package com.refactor.visit;

/**
 * Created by Administrator on 2016/2/26 0026.
 */
public class Visit {
    Listen listen = new Listen();
    public static void main(String[] argus) {
        IDoInterface a = new Ado();
        IDoInterface b = new Bdo();
        IDoInterface c = new Cdo();
        Listen listen = new Listen();
        listen.add(a);
        listen.add(b);
        listen.add(c);
        Visit visit = new Visit();
        visit.listen = listen;
        visit.doo();
    }

    public void doo(){
        listen.gogo();
    }

}
