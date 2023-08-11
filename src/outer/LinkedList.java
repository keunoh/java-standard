package outer;
//
//
//import java.util.AbstractSequentialList;
//import java.util.Collection;
//import java.util.Deque;
//
//public class LinkedList<E>
//    extends AbstractSequentialList<E>
//    implements List<E>, Deque<E>, Cloneable, java.io.Serializable
//{
//    transient int size = 0;
//
//    transient Node<E> first;
//
//    transient Node<E> last;
//
//    public LinkedList() {
//    }
//
//    public LinkedList(Collection<? extends E> c) {
//        this();
//        addAll(c);
//    }
//
//    private void linkFirst(E e) {
//        final Node<E> f = first;
//        final Node<E> newNode = new Node<>(null, e, f);
//        first = newNode;
//        if (f == null)
//            last = newNode;
//        else
//            f.prev = newNode;
//        size++;
//        modCount++;
//    }
//
//
//}
//
//
//
//
//
//
//
