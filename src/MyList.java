import java.util.Arrays;

public class MyList<E> {
    private int size;
    private final int DEFAUL_CAPACITY = 5;
    private Object element[];

    public MyList(){
        element = new Object[DEFAUL_CAPACITY];
    }
    private void ensureCapacity(){
        int newSize = element.length*2;
        element = Arrays.copyOf(element, newSize);
    }
    public void add(E e){
        if(element.length == size){
            ensureCapacity();
            element[size++] = e;
        }
    }
    public E get(int index){
        if( index < 0 || index > element.length){
            throw new IndexOutOfBoundsException();
        }
        return (E) element[index];
    }

    public static void main(String[] args) {
        MyList<Integer> listInterger = new MyList<Integer>();
        listInterger.add(0);
        listInterger.add(1);
        listInterger.add(2);
        listInterger.add(3);
        listInterger.add(4);

        System.out.println("Element 4: " + listInterger.get(4));
        System.out.println("Element 0: " + listInterger.get(0));
        System.out.println("Element 1: " + listInterger.get(1));
        listInterger.get(6);
        System.out.println("Element 6: " + listInterger.get(6));
    }
}
