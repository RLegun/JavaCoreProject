package TaxiService;

public class CreateNewFeedBack {
    public static FeedBack newFeedBack(){
        FeedBack feedBack = new FeedBack(0,"Ваш коментар");

        feedBack.setRating(100);
        feedBack.setComment("Мій перший коментар!");

        FeedBackList.setFeedBacks(feedBack);
        return feedBack;
    }
}
