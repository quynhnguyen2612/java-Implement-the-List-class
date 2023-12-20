public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E num) {
        if(size == elements.length) {
            newArrayAdd();
        }
        elements[size] = num;
        size++;
    }

    public void newArrayAdd() {
        Object[] newArray = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        elements = newArray;
    }

    public E get(int index) {
        if (index>= size || index <0){
            throw new IndexOutOfBoundsException("Index: " + index + "Size" + index);
        }
       return (E) elements[index];

    }
}
