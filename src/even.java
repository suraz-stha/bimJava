public class even implements Runnable
{
    Thread even;
    @Override
    public void run() {
        for (int i =50; i<=100 ; i ++){
            if(i%2==0){
                System.out.println("even :" + i);
            }
        }
    }
}
