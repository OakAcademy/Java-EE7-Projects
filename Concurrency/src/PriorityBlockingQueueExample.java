//// Illustrates the use of PriorityBlockingQueue. In this case, if there is no element available in the priority queue
//// the thread calling take() method will block (i.e., wait) until another thread inserts an element
//import java.util.concurrent.*;
//class PriorityBlockingQueueExample {
// public static void main(String []args) {
// final PriorityBlockingQueue<Integer> priorityBlockingQueue
// = new PriorityBlockingQueue<>();
// new Thread() { 
// public void run() {
// try {
// // use take() instead of remove()
// // note that take() blocks, whereas remove() doesn't block
// System.out.println("The removed element is: "
// + priorityBlockingQueue.take());
// } catch(InterruptedException ie) {
// // its safe to ignore this exception
// ie.printStackTrace();
// }
// }
//}.start();
// new Thread() {
// public void run() {
// // add an element with value 10 to the priority queue
// priorityBlockingQueue.add(10);
// System.out.println("Successfully added an element to the queue ");
// }
// }.start();
// }
//}
//
//
//
//
//
//
//
//
//
//import java.util.concurrent.*;
////this class simulates the start of a running race by counting down from 5. It holds
////three runner threads to be ready to start in the start line of the race and once the count down
////reaches zero, all the three runners start running...
//class RunningRaceStarter {
//public static void main(String []args) throws InterruptedException {
//CountDownLatch counter = new CountDownLatch(5);
//// count from 5 to 0 and then start the race
//
//// instantiate three runner threads
//new Runner(counter, "Carl");
//new Runner(counter, "Joe");
//new Runner(counter, "Jack");
//
//System.out.println("Starting the countdown ");
//long countVal = counter.getCount();
//while(countVal > 0) {
//Thread.sleep(1000); // 1000 milliseconds = 1 second
//System.out.println(countVal);
//if(countVal == 1) {
//// once counter.countDown(); in the next statement is called,
//// Count down will reach zero; so shout "Start"
//System.out.println("Start");
//}
//counter.countDown(); // count down by 1 for each second
//countVal = counter.getCount();
//}
//}
//}
////this Runner class simulates a track runner in a 100-meter dash race. The runner waits until the
////count down timer gets to zero and then starts running
//
