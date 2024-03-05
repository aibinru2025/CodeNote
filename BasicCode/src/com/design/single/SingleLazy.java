package com.design.single;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 14:20
 * @description:懒汉模式
 */
public class SingleLazy {
    private static SingleLazy instance;

    private SingleLazy(){}

    public static synchronized SingleLazy getInstance() {
        if(instance == null){
            instance = new SingleLazy();
        }
        return instance;
    }
}
