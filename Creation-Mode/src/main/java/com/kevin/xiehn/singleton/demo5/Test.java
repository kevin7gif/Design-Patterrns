package com.kevin.xiehn.singleton.demo5;

/**
 * @author kevin
 * @version 1.0
 * @date 2023-12-08 16:59
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            ThreadRun test=new ThreadRun();
            Thread th = new Thread(test);
            th.start();
            test.run();
        }
    }
}

class ThreadRun implements Runnable{
    public void run() {
        for(int i=0;i<100;i++){
            Singleton instance = Singleton.getInstance();
            System.out.println(instance);
        }
    }
}
