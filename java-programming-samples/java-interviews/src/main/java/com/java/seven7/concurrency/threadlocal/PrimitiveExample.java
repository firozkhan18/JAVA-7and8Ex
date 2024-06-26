package com.java.seven7.concurrency.threadlocal;

public class PrimitiveExample {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Task task = new Task(generator);

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }

    public static class Task implements Runnable {
        private int number = 0;
        private NumberGenerator generator;

        public Task(NumberGenerator generator) {
            this.generator = generator;
        }

        @Override
        public void run() {
            number = this.generator.random(100); // generate a random number between 0~99.
            System.out.println(number);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            System.out.println(number);
        }
    }
}
