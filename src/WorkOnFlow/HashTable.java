package WorkOnFlow;

public class HashTable {

    int bolsitoCount = 16;
    Bolsito[] bolsas;

    public HashTable() {
//        bolsas = (Bolsito[]) new Object[bolsitoCount];
        bolsas = new Bolsito[bolsitoCount];
    }

    public int getIndex(int key) {
        return key % bolsas.length;
    }

    public class Entity {
        int key, value;
    }

    public class Bolsito {
        Node head;

        public class Node {
            Entity value;
            Node next;
        }

        public Integer find(int key) {
            Node cur = head;
            do {
                if (cur.value.key == key) return cur.value.value;
                cur = cur.next;
            }
            while (cur.next != null);
            return null;
        }

//        public boolean push(Entity value){
//            head.value = value;
//
//        }
//
//        public boolean pop(Entity value){
//            //
//        }
    }

    public Integer findBig(int key) {
        int index = getIndex(key);
        Bolsito bolsa = bolsas[index];
        return bolsa != null ? bolsa.find(key) : null;
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable();
        System.out.println(ht.bolsas.length);
    }

}
