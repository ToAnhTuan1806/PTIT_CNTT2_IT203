package BTTH;
import java.util.ArrayList;
import java.util.List;

public class BookManager implements IManager<Book>{
    private final List<Book> books = new ArrayList<>();
    private final CategoryManager categoryManager;

    public BookManager(CategoryManager categoryManager) {
        this.categoryManager = categoryManager;
    }

    @Override
    public void add(Book item) {
        if (findById(item.getId()) != null) {
            System.out.println("ID sách đã tồn tại. Không thể thêm.");
            return;
        }

        if (!categoryManager.exists(item.getCategoryId())) {
            System.out.println("categoryId không tồn tại. Không thể thêm sách.");
            return;
        }

        books.add(item);
        System.out.println("Thêm sách thành công.");
    }

    @Override
    public void update(Book item) {
        Book existing = findById(item.getId());
        if (existing == null) {
            System.out.println("Không tìm thấy sách với ID = " + item.getId());
            return;
        }

        if (!categoryManager.exists(item.getCategoryId())) {
            System.out.println("categoryId không tồn tại. Không thể cập nhật.");
            return;
        }

        existing.setTitle(item.getTitle());
        existing.setAuthor(item.getAuthor());
        existing.setCategoryId(item.getCategoryId());
        System.out.println("Cập nhật sách thành công.");
    }

    @Override
    public void delete(int id) {
        Book existing = findById(id);
        if (existing == null) {
            System.out.println("Không tìm thấy sách với ID = " + id);
            return;
        }
        books.remove(existing);
        System.out.println("Xóa sách thành công.");
    }

    @Override
    public void displayAll() {
        if (books.isEmpty()) {
            System.out.println("Danh sách sách trống.");
            return;
        }

        System.out.println("===== DANH SÁCH SÁCH =====");
        for (Book b : books) {
            b.displayData();
        }
    }

    public Book findById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }
}
