package TaxiService;

import java.util.ArrayList;

public class FeedBackList {
    private static ArrayList<FeedBack> feedBacks = new ArrayList<>();



    public static ArrayList<FeedBack> getFeedBacks() {
        return feedBacks;
    }

    public static void setFeedBacks(ArrayList<FeedBack> feedBacks) {
        FeedBackList.feedBacks = feedBacks;
    }

    public static void setFeedBacks(FeedBack feedBack) {
        feedBacks.add(feedBack);
    }

    public static FeedBack myFeedBack(){
        FeedBack myFeedBack;
        myFeedBack = feedBacks.get(0);
        return myFeedBack;
    }
}
