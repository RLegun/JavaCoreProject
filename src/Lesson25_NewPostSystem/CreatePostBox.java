package Lesson25_NewPostSystem;

public class CreatePostBox {
    private static Parcel box = new Parcel(50,50,5,1000,"відправлено");
    private static Parcel[] boxes = {box};
    private static PostOffice<Parcel> boxPostOffice;

    public static void createPostBox(){
        boxPostOffice = new PostOffice<>(boxes);
    }

    public static PostOffice<Parcel> getBoxPostOffice() {
        return boxPostOffice;
    }
}
