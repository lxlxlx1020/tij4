package concurrency;//: concurrency/EvenGenerator.java
// When threads collide.

import java.util.ArrayList;
import java.util.LinkedList;

public class EvenGenerator extends IntGenerator {
  private int currentEvenValue = 0;
  public synchronized  int next() throws InterruptedException {
    ++currentEvenValue; // Danger point here!
    ++currentEvenValue;
    Thread.sleep(1000);
    return currentEvenValue;
  }
  public static void main(String[] args) {
//    EvenChecker.test(new EvenGenerator());

    LinkedList linkedList = new LinkedList();
    System.out.println("------start------");
    long startLinkedListTime = System.currentTimeMillis();
    for (int i = 0; i< 800000; i++) {
      linkedList.add(0,i);
    }
    System.out.println("------end--linkedList--spendTime="+ (System.currentTimeMillis() - startLinkedListTime) +"---");

    ArrayList arrayList = new ArrayList();
    System.out.println("------start------");
    long startArrayListTime = System.currentTimeMillis();
    for (int i = 0; i< 800000; i++) {
      arrayList.add(0,i);
    }
    System.out.println("------end--arrayList--spendTime="+ (System.currentTimeMillis() - startArrayListTime) +"---");
  }
} /* Output: (Sample)
Press Control-C to exit
89476993 not even!
89476993 not even!
*///:~
