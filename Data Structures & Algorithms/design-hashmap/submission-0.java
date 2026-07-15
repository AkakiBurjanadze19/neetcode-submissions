class Entry {
    public int key;
    public int value;

    public Entry(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class MyHashMap {
    private List<LinkedList<Entry>> table;
    private static final int TABLE_SIZE = 10_000;

    public MyHashMap() {
        this.table = new ArrayList<>(TABLE_SIZE);
        for (int i = 0; i < TABLE_SIZE; i++) {
            this.table.add(new LinkedList<>());
        }
    }
    
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> bucket = this.table.get(index);

        for (Entry entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.add(new Entry(key, value));
    }
    
    public int get(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = this.table.get(index);

        for (Entry entry : bucket) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return -1;
    }
    
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> bucket = this.table.get(index);

        for (int i = 0; i < bucket.size(); i++) {
            Entry entry = bucket.get(i);
            if (entry.key == key) {
                bucket.remove(i);
                return;
            }
        }
    }

    private int hash(int key) {
        return key % TABLE_SIZE;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */