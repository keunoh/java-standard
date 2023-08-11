//import java.util.*;
//import java.util.function.UnaryOperator;
//
//public interface List<E> extends Collection<E> {
//
//    int size();
//
//    boolean isEmpty();
//
//    /**
//     * Returns true if this list contains the specified element. More formally, returns true if and only if this
//     * list contains at least one element ae such that Objects.equals(o, e).
//     *
//     * @param o element whose presence in this collection is to be tested
//     * @return true if this list contains the specified element
//     * @throws ClassCastException - if the type of the specified element is incompatible with this list
//     *                            (optional)
//     *                            NullPointerException - if the specified element is null and this list does not permit null
//     *                            elements (optional)
//     */
//    boolean contains(Object o);
//
//    /**
//     * Returns an iterator over the elements in this list in proper sequence.
//     * Returns: an iterator over the elements in this list in proper sequence
//     */
//    Iterator<E> iterator();
//
//    /**
//     * Returns an array containing all of the elements in this list in proper sequence (from first to last
//     * element).
//     * The returned array will be "safe" in that no references to it are maintained by this list. (In other
//     * words, this method must allocate a new array even if this list is backed by an array). The caller is
//     * thus free to modify the returned array.
//     * This method acts as bridge between array-based and collection-based APIs.
//     * Returns: an array containing all of the elements in this list in proper sequence
//     * See Also: Arrays.asList(Object[])
//     */
//    Object[] toArray();
//
//    /**
//     * Returns an array containing all of the elements in this list in
//     * proper sequence (from first to last element); the runtime type of
//     * the returned array is that of the specified array. If the list fits
//     * in the specified array, it is returned therein. Otherwise, a new
//     * array is allocated with the runtime type of the specified array and
//     * this size of this list.
//     *
//     * <p>If the list fits in the specified array with room to spare (i.e.,
//     * the array has more elements than the list), the element in the array
//     * immediately following the end of the list is set to {@code null}.
//     * (This is useful in determining the length of the list <i>only</i> if
//     * the caller knows that the list does not contain any null elements.)
//     *
//     * <p>Like the {@link #toArray()} method, this method acts as bridge between
//     * array-based and collection-based APIs. Further, this method allows
//     * precise control over the runtime type of the output array, and may,
//     * under certain circumstances, be used to save allocation costs.
//     *
//     * <p>Suppose {@code x} is a list known to contain only strings.
//     * The following code can be used to dump the list into a newly
//     * allocated array of {@code String}:
//     *
//     * <pre>{@code
//     *      String[] y = x.toArray(new String[0]);
//     * }</pre>
//     * <p>
//     * Note that {@code toArray(new Object[0])} is identical in function to
//     * {@code toArray()}.
//     *
//     * @param a the array into which the elements of this collection are to be
//     *          stored, if it is big enough; otherwise, a new array of the same
//     *          runtime type is allocated for this purpose.
//     * @return an array containing the elements of this list
//     * @throws ArrayStoreException  if the runtime type of the specified array
//     *                              is not a supertype of the runtime type of every element in
//     *                              this list
//     * @throws NullPointerException if the specified array is null
//     */
//    <T> T[] toArray(T[] a);
//
//
//    /**
//     * Appends the specified element to the end of this list (optional
//     * operation).
//     *
//     * <p>Lists that support this operation may place limitations on what
//     * elements may be added to this list. In particular, some
//     * lists will refuse to add null elements, and others will impose
//     * restrictions on the type of elements that may be added. List
//     * classes should clearly specify in their documentation any restrictions
//     * on what elements may be added.
//     *
//     * @param e element to be appended to this list
//     * @return {@code true} (as specified by {@link Collection#add})
//     * @throws UnsupportedOperationException if the {@code add} operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of the specified element
//     *                                       prevents it from being added to this list
//     * @throws NullPointerException          if the specified element is null and this
//     *                                       list does not permit null elements
//     * @throws IllegalArgumentException      if some property of this element
//     *                                       prevents it from being added to this list
//     */
//    boolean add(E e);
//
//    /**
//     * Removes the first occurrence of the specified element from this list,
//     * if it is present (optional operation). If this list does not contain
//     * the element, it is unchanged. More formally, removes the element with
//     * the lowest index {@code i} such that
//     * {@code Objects.equals(o, get(i))}
//     * (if such an element exists). Returns {@code true} if this list
//     * contained the specified element (or equivalently, if this list changed
//     * as a result of the call).
//     *
//     * @param o element to be removed from this list, if present
//     * @return {@code true} if this list contained the specified element
//     * @throws ClassCastException            if the type of the specified element
//     *                                       is incompatible with this list
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException          if the specified element is null and this
//     *                                       list does not permit null elements
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws UnsupportedOperationException if the {@code remove} operation
//     *                                       is not supported by this list
//     */
//    boolean remove(Object o);
//
//    // Bulk Modification Operations
//
//    /**
//     * Returns {@code true} if this list contains all of the elements of the
//     * specified collection.
//     *
//     * @param c collection to be checked for containment in this list
//     * @return {@code true} if this list contains all of the elements of the
//     * specified collection
//     * @throws ClassCastException   if the types of one or more elements
//     *                              in the specified collection are incompatible with this
//     *                              list
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException if the specified collection contains one
//     *                              or more null elements and this list does not permit null
//     *                              elements
//     *                              (<a href="Collection.html#optional-restrictions">optional</a>),
//     *                              or if the specified collection is null
//     * @see #contains(Object)
//     */
//    boolean containsAll(Collection<?> c);
//
//    /**
//     * Appends all of the elements in the specified collection to the end of
//     * this list, in the order that they are returned by the specified
//     * collection's iterator (optional operation).  The behavior of this
//     * operation is undefined if the specified collection is modified while
//     * the operation is in progress.  (Note that this will occur if the
//     * specified collection is this list, and it's nonempty.)
//     *
//     * @param c collection containing elements to be added to this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the {@code addAll} operation
//     *                                       is not supported by this list
//     * @throws NullPointerException          if the specified collection contains one
//     *                                       or more null elements and this list does not permit null
//     *                                       elements, or if the specified collection is null
//     * @throws IllegalArgumentException      if some property of an element of the
//     *                                       specified collection prevents it from being added to this list
//     * @see #add(Object)
//     */
//    boolean addAll(Collection<? extends E> c);
//
//    /**
//     * Inserts all of the elements in the specified collection into this
//     * list at the specified position (optional operation).  Shifts the
//     * element currently at that position (if any) and any subsequent
//     * elements to the right (increases their indices).  The new elements
//     * will appear in this list in the order that they are returned by the
//     * specified collection's iterator.  The behavior of this operation is
//     * undefined if the specified collection is modified while the
//     * operation is in progress.  (Note that this will occur if the specified
//     * collection is this list, and it's nonempty.)
//     *
//     * @param index index at which to insert the first element from the
//     *              specified collection
//     * @param c     collection containing elements to be added to this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the {@code addAll} operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of the specified
//     *                                       collection prevents it from being added to this list
//     * @throws NullPointerException          if the specified collection contains one
//     *                                       or more null elements and this list does not permit null
//     *                                       elements, or if the specified collection is null
//     * @throws IllegalArgumentException      if some property of an element of the
//     *                                       specified collection prevents it from being added to this list
//     * @throws IndexOutOfBoundsException     if the index is out of range
//     *                                       ({@code index < 0 || index > size()})
//     */
//    boolean addAll(int index, Collection<? extends E> c);
//
//    /**
//     * Removes from this list all of its elements that are contained in the
//     * specified collection (optional operation).
//     *
//     * @param c collection containing elements to be removed from this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the {@code removeAll} operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of this list
//     *                                       is incompatible with the specified collection
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException          if this list contains a null element and the
//     *                                       specified collection does not permit null elements
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
//     *                                       of if the specified collection is null
//     * @see #remove(Object)
//     * @see #contains(Object)
//     */
//    boolean removeAll(Collection<?> c);
//
//    /**
//     * Retains only the elements in this list that are contained in the
//     * specified collection (optional operation).  In other words, removes
//     * from this list all of its elements that are not contained in the
//     * specified collection.
//     *
//     * @param c collection containing elements to be retained in this list
//     * @return {@code true} if this list changed as a result of the call
//     * @throws UnsupportedOperationException if the {@code retainAll} operation
//     *                                       is not supported by this list
//     * @throws ClassCastException            if the class of an element of this list
//     *                                       is incompatible with the specified collection
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>)
//     * @throws NullPointerException          if this list contains a null element and the
//     *                                       specified collection does not permit null elements
//     *                                       (<a href="Collection.html#optional-restrictions">optional</a>),
//     *                                       or if the specified collection is null
//     * @see #remove(Object)
//     * @see #contains(Object)
//     */
//    boolean retainAll(Collection<?> c);
//
//    default void replaceAll(UnaryOperator<E> operator) {
//        Objects.requireNonNull(operator);
//        final ListIterator<E> li = this.listIterator();
//        while (li.hasNext()) {
//            li.set(operator.apply(li.next()));
//        }
//    }
//
//    default void sort(Comparator<? super E> c) {
//        Object[] a = this.toArray();
//        Arrays.sort(a, (Comparator) c);
//        ListIterator<E> i = this.listIterator();
//        for (Object e : a) {
//            i.next();
//            i.set((E) e);
//        }
//    }
//
//    void clear();
//
//    boolean equals(Object o);
//
//    int hashCode();
//
//    E get(int index);
//
//    E set(int index, E element);
//
//    void add(int index, E element);
//
//    E remove(int index);
//
//    int indexOf(Object o);
//
//    int lastIndexOf(Object o);
//
//    ListIterator<E> listIterator();
//
//    ListIterator<E> listIterator(int index);
//
//    List<E> subList(int fromIndex, int toIndex);
//
//    @Override
//    default Spliterator<E> spliterator() {
//        if (this instanceof RandomAccess) {
//            return new AbstractList.RandomAccessSpliterator<>(this);
//        } else {
//            return Spliterators.spliterator(this, Spliterator.ORDERED);
//        }
//    }
//
//    static <E> List<E> of() {
//        return (List<E>) ImmutableCollections.EMPTY_LIST;
//    }
//
//    static <E> java.util.List<E> of(E e1) {
//        return new ImmutableCollections.List12<>(e1);
//    }
//
//    static <E> java.util.List<E> of(E e1, E e2) {
//        return new ImmutableCollections.List12<>(e1, e2);
//    }
//
//    @SafeVarargs
//    @SuppressWarnings("varargs")
//    static <E> List<E> of(E... elements) {
//        switch (elements.length) {
//            case 0:
//                var list = (List<E>) ImmutableCollections.EMPTY_LIST;
//                return;
//            case 1:
//                return new ImmutableCollections.List12<>(elements[0]);
//            case 2:
//                return new ImmutableCollections.List12<>(elements[0], elements[1]);
//            default:
//                return ImmutableCollections.listFromArray(elements);
//        }
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
