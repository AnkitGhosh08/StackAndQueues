package com.codinclub;


public class QueueMain {
    public static void main(String[] args) {

         // Created an object of service class and called the method
         
        QueueServices queue = new QueueServices();
        queue.enqueu(56);
        queue.enqueu(30);
        queue.enqueu(70);

        queue.display();

        queue.dequeue();
        queue.display();
        queue.dequeue();
        queue.dequeue();
        queue.display();
    }
}