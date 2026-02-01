public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        if (price>0){
            this.price = price;
        }else {
            System.out.println("Gia khong hop le");
        }
    }

    public void displayInfo() {
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Product p = new Product("SP01", "Laptop Dell", 20000000);
        p.displayInfo();

        //gia k op le
        p.setPrice(-5000);

        //gia k thay doi
        p.displayInfo();

        //set gia hop le
        p.setPrice(18000000);
        p.displayInfo();
    }
}
