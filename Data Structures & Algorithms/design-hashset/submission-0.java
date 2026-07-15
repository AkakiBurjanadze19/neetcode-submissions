class MyHashSet {
    private final List<Integer> set;

    public MyHashSet() {
        this.set = new ArrayList<>();
    }

    // Time Complexity: O(n)
    public void add(int key) {
        if (!this.contains(key)) {
            this.set.add(key);
        }
    }

    // Time Complexity: O(n)
    public void remove(int key) {
        for (int i = 0; i < this.set.size(); i++) {
            if (this.set.get(i) == key) {
                this.set.remove(i);
                return;
            }
        }
    }

    // Time Complexity: O(n)
    public boolean contains(int key) {
       for (int el : this.set) {
           if (el == key) {
               return true;
           }
       }

       return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */