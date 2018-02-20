public class bim {

    public static void main(String[] args) {

        //this code execute the answer of question 12
        even ev = new even();
        odd od = new odd();
        Thread a = new Thread(ev);
        Thread b = new Thread(od);
        a.start();
        b.start();

        //this code execute the answer of question 14
        stringDemo sd = new stringDemo();
        sd.fillName();
        sd.check();
    }
}
