package MobilkaShop;

public class Cart {
    private int idOfProduct;
    private String nameOfProduct;
    private int priceOfProduct;
    private int numberOfProducts;
    private double sumOfProducts;

    public Cart(int idOfProduct, String nameOfProduct, int priceOfProduct, int numberOfProducts, int sumOfProducts) {
        this.idOfProduct = idOfProduct;
        this.nameOfProduct = nameOfProduct;
        this.priceOfProduct = priceOfProduct;
        this.numberOfProducts = numberOfProducts;
        this.sumOfProducts = sumOfProducts;
    }

    public int getIdOfProduct() {
        return idOfProduct;
    }

    public void setIdOfProduct(int idOfProduct) {
        this.idOfProduct = idOfProduct;
    }

    public String getNameOfProduct() {
        return nameOfProduct;
    }

    public void setNameOfProduct(String nameOfProduct) {
        this.nameOfProduct = nameOfProduct;
    }

    public int getPriceOfProduct() {
        return priceOfProduct;
    }

    public void setPriceOfProduct(int priceOfProduct) {
        this.priceOfProduct = priceOfProduct;
    }

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public double getSumOfProducts() {
        return sumOfProducts;
    }

    public void setSumOfProducts(double sumOfProducts) {
        this.sumOfProducts = sumOfProducts;
    }
}
