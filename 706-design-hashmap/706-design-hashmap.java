class MyHashMap {

    int[] ls;
    public MyHashMap() {
        ls = new int[1000001];
        Arrays.fill(ls,-1);
    }
    
    public void put(int key, int value) {
        ls[key] = value;
    }
    
    public int get(int key) {
        
        return ls[key];
    }
    
    public void remove(int key) {
        
        ls[key] = -1;
    }
}

// class map{
//     int key;
//     int value;
    
//     map(int k, int v){
//         this.key = k;
//         this.value = v;
//     }
// }

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */