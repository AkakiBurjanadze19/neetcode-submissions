class MyHashSet {
    private Integer[] array;
    private int tableSize = 10_000;
    private static final int DELETED = Integer.MIN_VALUE;

    public MyHashSet() {
        this.array = new Integer[tableSize];
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }

        int index = hash(key);
        while (this.array[index] != null && !this.array[index].equals(DELETED)) {
            index = (index + 1) % tableSize;
        }

        this.array[index] = key;
    }

    public boolean contains(int key) {
        int index = hash(key);

        while (this.array[index] != null) {
            if (this.array[index].equals(key)) {
                return true;
            }
            index = (index + 1) % tableSize;
        }

        return false;
    }

    public void remove(int key) {
        int index = hash(key);

        while (this.array[index] != null) {
            if (this.array[index].equals(key)) {
                this.array[index] = DELETED;
                return;
            }
            index = (index + 1) % tableSize;
        }
    }

    private int hash(int key) {
        return key % tableSize;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */