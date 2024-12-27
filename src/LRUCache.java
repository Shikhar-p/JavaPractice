/*
 * LRU Cache Implementation Implement a Least Recently Used (LRU) Cache.
 * The cache should support the following operations:
 * get(key) which returns the value of the key if it exists,
 * otherwise returns -1;
 * and put(key, value) which updates or inserts the value.
 *  When the cache reaches its capacity, it should invalidate the least
 * recently used item.
 *
 *
 * */

import java.util.HashMap;

public class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }

    }
    int capacity;
    HashMap<Integer, Node> map;
    Node head, tail;

    public LRUCache(int capacity){
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.prev.next = node.next;
            node.next.prev = node.prev;
            return node.value;
        }
        return -1;
    }

    public  void  put(int key, int value){

        if (map.containsKey(key)){
            map.get(key);
        }
      Node node1 = new Node(key, value);
        node1.next = head.next;
        node1.prev = head;
        if(map.size() > capacity){
            node1 = tail.prev;
          //  head.next.prev = node1;
            //head.next = node1;
            System.out.println("Capcity Reached :" + capacity);
            map.remove(node1.key);
            System.out.println("Removed key ===");
        }
        map.put(key, node1);


    }

    public static void main(String [] args){
        LRUCache lruCache = new LRUCache(3);
        lruCache.put(1,10);
        lruCache.put(2,20);
        lruCache.put(3,30);
        System.out.println("=====" + lruCache.get(3));
        lruCache.put(4,40);
        System.out.println("=====" + lruCache.get(4));
    }
}
