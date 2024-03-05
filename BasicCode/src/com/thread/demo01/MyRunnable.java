package com.thread.demo01;


/**
 * @author 艾宾如
 */
public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {//sleep会发生异常要显示处理
				//暂停20毫秒
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "打了:" + i + "个小兵");
		}
	}


	public static void main(String[] args) {
		//需要单独创建Thread对象

		// TODO Auto-generated method stub
		//创建MyRunnable类
		MyRunnable mr = new MyRunnable();
		//创建Thread类的有参构造,并设置线程名
		Thread t1 = new Thread(mr, "张飞");
		Thread t2 = new Thread(mr, "貂蝉");
		Thread t3 = new Thread(mr, "吕布");
		//启动线程
		t1.start();
		t2.start();
		t3.start();

	}

}
