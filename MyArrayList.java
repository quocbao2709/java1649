package asm2_1649;

public class MyArrayList implements MyAbstractArrayList {
    private static final int INITIAL_CAPACITY = 10;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[INITIAL_CAPACITY];
        size = 0;
    }


    @Override
    public boolean add(Object element) {
        ensureCapacity();
        elements[size++] = element;
        return true;
    }

    @Override
    public boolean add(int index, Object element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        ensureCapacity();
        System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
        return true;
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        return elements[index];
    }

    @Override
    public Object set(int index, Object element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        Object oldValue = elements[index];
        elements[index] = (int) element;
        return oldValue;
    }

    @Override
    public Object remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        Object removedElement = elements[index];
        // Di chuyển các phần tử sang trái để lấp đầy chỗ trống từ phần tử bị xóa
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        elements[--size] = Integer.parseInt(null); // Xóa tham chiếu đến phần tử cuối cùng
        return removedElement;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(Object element) {

        return -1;
    }

    @Override
    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // Mở rộng dung lượng của mảng nếu cần thiết
    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[size * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
    }
}
