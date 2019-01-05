package concurrency;//: concurrency/LiftOff.java
// Demonstration of the Runnable interface.

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
  protected int countDown = 10; // Default
  private static int taskCount = 0;
  private final int id = taskCount++;
  public LiftOff() {}
  public LiftOff(int countDown) {
    this.countDown = countDown;
  }
  public String status() {
    return "#" + id + "(" +
      (countDown > 0 ? countDown : "Liftoff!") + "), ";
  }
  public void run() {
    while(countDown-- > 0) {
      System.out.print(status());
      Thread.yield();
    }
  }

  public static void main(String[] args) {
    /**
     * 原始方法
     */
//    for (int i = 0; i < 100;i++) {
//      new Thread(new LiftOff()).start();
//      System.out.println();
//    }
//    System.out.println("Waiting for LifeOff");

    /**
     * Executor方法
     */
//    ExecutorService exec = Executors.newFixedThreadPool(5);
    ExecutorService exec = Executors.newSingleThreadExecutor();
    for (int i = 0; i<5; i++) {
      exec.execute(new LiftOff());
      System.out.println(111111111+"   "+Thread.currentThread().getName() + Thread.currentThread().getId());
      System.out.println(222222222+"   "+Thread.currentThread().getName() + Thread.currentThread().getId());
      System.out.println(333333333+"   "+Thread.currentThread().getName() + Thread.currentThread().getId());
//      new LiftOff().run();
    }
    exec.shutdown();
  }
} ///:~
