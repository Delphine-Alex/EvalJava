package tp.structurededonnees.queue;

import static org.junit.Assert.assertEquals;

public class Main {

    public static void main(String[] args){
        Fifo fifo = new Fifo(10);
        fifo.offer("test00");
        fifo.offer("test01");
        fifo.offer("test02");
        fifo.offer("test03");
        fifo.offer("test04");
        fifo.offer("test05");
        fifo.offer("test06");
        fifo.offer("test07");
        fifo.offer("test08");

        Object object = fifo.peek();
        System.out.println(object);

        fifo.poll();
        fifo.poll();
        fifo.poll();
        fifo.poll();

        Object bool = fifo.isEmpty();
        System.out.println(bool);
        System.out.println(fifo.size());

    }
}
