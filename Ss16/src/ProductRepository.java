import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository implements IRepository<Product> {
    List<Product> productList=new ArrayList<>();
    private Map<String, Product> productMap=new HashMap<>();

    @Override
    public boolean add(Product item){
        if(item==null || item.getId()==null){
            return false;
        }
        if(productMap.containsKey(item.getId())){
            return false;
        }
        productList.add(item);
        productMap.put(item.getId(),item);
        return true;
    }

    @Override
    public boolean removeById(String id) {
        if(id==null){
            return false;
        }
        Product p=productMap.remove(id);
        if(p!=null){
            productList.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Product findById(String id) {
        if (id==null) {
            return null;
        }
        return productMap.get(id);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }
}
