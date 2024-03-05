package com.design.single;

/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-2-29 11:23
 * @description: 单例模式
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){}

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage(){
        System.out.println("hello Single Object");
    }

    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }

}
