package com.design.single;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 14:25
 * @description:
 */
public class SingleHungry {
    private static SingleHungry instance = new SingleHungry();

    private SingleHungry() { }

    public static SingleHungry getInstance() {
        return instance;
    }
}
