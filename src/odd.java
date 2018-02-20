public class odd implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i< 200; i++){
            if(i%2==1){
                System.out.println("odd :" +i);
            }
        }
    }
}
