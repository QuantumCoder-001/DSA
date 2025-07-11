package linkedList;

class Node4{
    Node4 next;
    int value;
    int key;
    public Node4(int key, int value){
        this.value = value;
        this.key = key;
    }
}
class MyHashMap {
    private int size;
    private Node4 buckets[];

    public MyHashMap() {
        size = 1000;
        buckets = new Node4[size];
    }
    int hash(int key){
        return key % size;
    }
    public void put(int key, int value) {
        int index = hash(key);
        if(buckets[index] == null){
            buckets[index] = new Node4(key, value);
            return;
        }
        Node4 current = buckets[index];
        while(current != null){

            if(current.key == key){
                current.value = value;
                return;
            }
            if(current.next == null){
                current.next = new Node4(key,value);
                return;
            }
            current = current.next;
        }
    }
    public int get(int key) {
        int index = hash(key);
        Node4 cur = buckets[index];
        while(cur != null){
            if(cur.key == key){
                return cur.value;
            }
            cur = cur.next;
        }
        return -1;
    }
    public void remove(int key) {
        int index = hash(key);
        Node4 cur = buckets[index];
        if(cur == null){
            return ;
        }
        if(cur.key == key){
            buckets[index] = cur.next;
            return;
        }
        while(cur.next != null){
            if(cur.next.key == key){
                cur.next = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }
}