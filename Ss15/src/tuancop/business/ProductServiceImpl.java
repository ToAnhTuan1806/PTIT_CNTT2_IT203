package tuancop.business;

import tuancop.model.Product;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductServiceImpl implements  IProductService{
    private static final List<Product> list = new ArrayList<>();

    static {
        list.add(new Product("P001","IPhone 14 promax 512Gb",500, 99, "Zin",new Date()));
        list.add(new Product("P002","IPhone 15 promax 512Gb",600, 99, "Zin",new Date()));
        list.add(new Product("P003","IPhone 16 promax 512Gb",800, 99, "Zin",new Date()));
    }

    @Override
    public List<Product> findAll() {
        return list;
    }
}
