import java.util.*;

public class Main {
    public static void main(String[] args) {
        ProductRepository repo = new ProductRepository();
        repo.add(new ElectronicProduct("E01", "Laptop", 15000000, 24));
        repo.add(new ElectronicProduct("E02", "Dien thoai", 8000000, 12));
        repo.add(new FoodProduct("F01", "Banh mi", 20000, 10));
        repo.add(new FoodProduct("F02", "Sua", 30000, 5));

        System.out.println("Danh sach san pham");
        for (Product p : repo.findAll()) {
            p.displayInfo();
            System.out.println("Thanh tien: " + p.calculateFinalPrice());
            System.out.println();
        }

        //tim theo id
        System.out.println("tim theo id E01");
        Product found = repo.findById("E01");
        if (found!=null) {
            found.displayInfo();
        } else {
            System.out.println("khong tim thay");
        }
        System.out.println();

        //sap xep theo gia tang dan
        System.out.println("Sap xep theo gia tang dan");
        List<Product> sortedList = new ArrayList<>(repo.findAll());
        Collections.sort(sortedList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });

        for (Product p : sortedList) {
            System.out.println(p.getId() + " - Gia: " + p.getPrice());
        }
        System.out.println();

        //thong ke theo loai
        System.out.println("Thogn ke");
        Map<String, Integer> statistics = new HashMap<>();
        for (Product p : repo.findAll()) {
            String type = p.getClass().getSimpleName();
            statistics.put(type, statistics.getOrDefault(type, 0)+1);
        }

        System.out.println(statistics);
    }
}