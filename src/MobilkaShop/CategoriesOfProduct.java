package MobilkaShop;

public class CategoriesOfProduct {
    private int idOfCategory;
    private String nameOfCategory;

    public CategoriesOfProduct(int idOfCategory, String nameOfCategory) {
        this.idOfCategory = idOfCategory;
        this.nameOfCategory = nameOfCategory;
    }

    public int getIdOfCategory() {
        return idOfCategory;
    }

    public void setIdOfCategory(int idOfCategory) {
        this.idOfCategory = idOfCategory;
    }

    public String getNameOfCategory() {
        return nameOfCategory;
    }

    public void setNameOfCategory(String nameOfCategory) {
        this.nameOfCategory = nameOfCategory;
    }
}
