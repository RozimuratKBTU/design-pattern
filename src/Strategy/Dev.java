package Strategy;

public class Dev {
    Activity activity;

    public void setActivity(Activity activity){
        this.activity = activity;
    }

    public void executeActivity(){
        activity.event();
    }
}
