package asm2_1649;

public interface MyAbstractArrayList {
    boolean add(Object element); // Thêm một phần tử vào cuối danh sách
    boolean add(int index, Object element); // Chèn một phần tử vào vị trí chỉ định trong danh sách
    Object get(int index); // Trả về phần tử ở vị trí chỉ định trong danh sách
    Object set(int index, Object element); // Thay thế phần tử ở vị trí chỉ định trong danh sách bằng một phần tử mới
    Object remove(int index); // Loại bỏ phần tử ở vị trí chỉ định trong danh sách và trả về phần tử đã bị loại bỏ
    int size(); // Trả về số lượng phần tử trong danh sách
    int indexOf(Object element); // Trả về chỉ mục của phần tử đầu tiên có giá trị xác định trong danh sách
    boolean contains(Object element); // Kiểm tra xem danh sách có chứa một phần tử xác định hay không
    boolean isEmpty();
}
