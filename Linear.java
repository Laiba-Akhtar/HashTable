public class Linear {
    private Entry[] entries;

private int size, used;

private float loadFactor;

private final Entry NIL = new Entry(null,null);

public Linear(int capacity, float loadFactor)

{

entries = new Entry[capacity];

this.loadFactor = loadFactor;

}

public Linear(int capacity)

{

this(capacity, 0.75F);

}

public Linear()

{

this(101);

}

private class Entry

{

Object key, value;

Entry(Object k, Object v){this.key=k; this.value=v;}

}

public Object get(Object key)

{

int h = hash(key);

for(int i = 0; i<entries.length; i++)

{

int j = nextProbe(h,i);

Entry entry = entries[j];

if (entry == null) break;

if (entry == NIL) continue;

if(entry.key.equals(key)){
    System.out.println("Index="+j);
    System.out.println("Collisions="+i);
    return entry.value;
} 
}

return null;

}

public Object put(Object key, Object value)

{

if(used > loadFactor*entries.length) rehash();

int h = hash(key);

for(int i=0; i<entries.length; i++)

{

int j = nextProbe(h,i);

Entry entry = entries[j];

if (entry == null){

entries[j] = new Entry(key, value);

++size; ++used;

return null;

}

if(entry == NIL) continue;

if(entry.key.equals(key))

{

Object oldValue = entry.value;

entries[j].value = value;

return oldValue;

}

}

return null;

}

public Object remove(Object key)

{

int h = hash(key);

for(int i=0; i<entries.length; i++)

{

int j = nextProbe(h,i);

Entry entry = entries[j];

if (entry == null) break;

if(entry == NIL) continue;

if(entry.key.equals(key))

{

Object oldValue = entry.value;

entries[j] = NIL;

--size;

return oldValue;

}

}

return null;

}

public int size()

{

return size;

}

private int hash(Object key)

{

if(key==null) throw new IllegalArgumentException();

return (key.hashCode() & 0x7FFFFFFF) % entries.length;

}

private int nextProbe(int h, int i)

{

return (h+i)%entries.length;

}

private void rehash()

{

Entry[] oldEntries = entries;

entries = new Entry[2*oldEntries.length+1];

for(int k = 0; k < oldEntries.length; k++)

{

Entry entry = oldEntries[k];

if(entry == null || entry == NIL) continue;

int h = hash(entry.key);

for(int i = 0; i<entries.length; i++)

{

int j = nextProbe(h,i);

if(entries[j]==null)

{

entries[j] = entry;

break;

}

}

}

used = size;

}
public static void main(String[] args) {
     Linear  h=new  Linear (10);
    h.put(22, 2);
    h.put(12, 2);
    h.put(32, 9);
    System.out.println("Showing results for 22 ");
     h.get(22);
     System.out.println("Showing results for 12");
     h.get(12);
     System.out.println("Showing results for 12");
     h.get(32);


}}
