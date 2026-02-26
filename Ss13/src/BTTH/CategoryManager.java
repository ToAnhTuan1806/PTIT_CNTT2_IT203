package BTTH;
import java.util.ArrayList;
import java.util.List;

public class CategoryManager implements IManager<Category>{
    private final List<Category> categories = new ArrayList<>();

    @Override
    public void add(Category item) {
        if (findById(item.getId()) != null) {
            System.out.println("ID danh mục đã tồn tại. Không thể thêm.");
            return;
        }
        categories.add(item);
        System.out.println("Thêm danh mục thành công.");
    }

    @Override
    public void update(Category item) {
        Category existing = findById(item.getId());
        if (existing == null) {
            System.out.println("Không tìm thấy danh mục với ID = " + item.getId());
            return;
        }

        existing.setName(item.getName());
        existing.setDescription(item.getDescription());
        System.out.println("Cập nhật danh mục thành công.");
    }

    @Override
    public void delete(int id) {
        Category existing = findById(id);
        if (existing == null) {
            System.out.println("Không tìm thấy danh mục với ID = " + id);
            return;
        }
        categories.remove(existing);
        System.out.println("Xóa danh mục thành công.");
    }

    @Override
    public void displayAll() {
        if (categories.isEmpty()) {
            System.out.println("Danh mục trống.");
            return;
        }

        System.out.println("===== DANH SÁCH DANH MỤC =====");
        for (Category c : categories) {
            c.displayData();
        }
    }

    public Category findById(int id) {
        for (Category c : categories) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public boolean exists(int id) {
        return findById(id) != null;
    }
}
