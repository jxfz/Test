package com.refactor.visit;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/26 0026.
 */
public class Listen {

    private List<IDoInterface> list = new ArrayList<IDoInterface>();

    public void  gogo(){
        for(IDoInterface iDoInterface :list){
            iDoInterface.doSth();
        }
    }

    public void add(IDoInterface iDoInterface){
        list.add(iDoInterface);
    }
    public void remove(IDoInterface iDoInterface){
        list.remove(iDoInterface);
    }
}
