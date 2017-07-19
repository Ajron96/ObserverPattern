package sample;


public class Internet implements Observer, Media {
    private Subject subject;
    private int results[];

    Internet(Subject subject){
        this.subject = subject;
        results = new int[]{0,0,0,0,0};

        subject.registerObserver(this);
    }

    @Override
    public void update(int results[]){
        for(int i=0; i<5; i++){
            this.results[i] = results[i];
        }
    }

    @Override
    public void inform(){
        System.out.println("Internet - results: ");

        for(int i=0; i<5; i++){
            System.out.print(results[i] + " ");
        }
        System.out.println('\n');
    }
}
