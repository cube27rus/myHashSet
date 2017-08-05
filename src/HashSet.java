import java.util.*;

public class HashSet<T> implements Set<T> {

    private static final Boolean EXIST = true;

    private final Map<T, Boolean> elements = new HashMap<>();

    @Override
    public int size() {
        // BEGIN (write your solution here)
            return elements.size();
        // END
    }

    @Override
    public boolean isEmpty() {
        // BEGIN (write your solution here)
            return elements.isEmpty();
        // END
    }

    @Override
    public boolean contains(Object o) {
        // BEGIN (write your solution here)
            return elements.containsKey(o);
        // END
    }

    @Override
    public Iterator<T> iterator() {
        // BEGIN (write your solution here)
        return elements.keySet().iterator();
        // END
    }

    @Override
    public Object[] toArray() {
        // BEGIN (write your solution here)
        Object[] r = new Object[size()];
        Iterator<T> it = iterator();
        for (int i = 0; i < r.length; i++) {
             if (! it.hasNext()) // fewer elements than expected
                    return Arrays.copyOf(r, i);
            r[i] = it.next();

        }

        return null;
        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)
        return elements.keySet().toArray(a);
        // END
    }

    @Override
    public boolean add(T t) {
        // BEGIN (write your solution here)
            return elements.put(t,EXIST)==null;
        // END
    }

    @Override
    public boolean remove(Object o) {
        // BEGIN (write your solution here)
        return elements.remove(o)==EXIST;
        // END
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // BEGIN (write your solution here)
            for(Object element: c){
                if(!elements.containsKey(c)){
                    return false;
                }
            }
            return true;
        // END
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // BEGIN (write your solution here)
        for(T element: c){

            this.add((T) element);
        }
        return true;
        // END
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // BEGIN (write your solution here)
        for(Object element: c){
            this.remove(element);
        }
        return true;
        // END
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // BEGIN (write your solution here)
        for(Object element: c){
            if(!this.contains(element)){
                remove(element);
            }
        }
        return true;
        // END
    }

    @Override
    public void clear() {
        // BEGIN (write your solution here)
        elements.clear();
        // END
    }

}
