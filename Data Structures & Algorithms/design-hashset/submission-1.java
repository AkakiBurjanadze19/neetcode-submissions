class MyHashSet {
    private Integer[] array;
    private int setSize = 1000000;

    public MyHashSet() {
        this.array = new Integer[setSize];
        for (int i = 0; i < setSize; i++) {
            this.array[i] = null;
        }
    }

    public void add(int key) {
        if (contains(key)) {
            return;
        }

        int index = hash(key);

        int h = 1;
        while (this.array[index] != null) {
            index = (index + h * h) % setSize;
            h++;
        }

        this.array[index] = key;
    }

    public boolean contains(int key) {
        int index = hash(key);
        
        int h = 1;
        while (this.array[index] != null && this.array[index] != key) {
            index = (index + h * h) % setSize;
            h++;
        }

        return this.array[index] != null;
    }

    public void remove(int key) {
        if (!contains(key)) {
            return;
        }

        int index = hash(key);
        this.array[index] = null;
    }

    public int hash(int key) {
        return key % setSize;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */