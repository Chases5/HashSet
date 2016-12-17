public class HashSet{
    Node[] hash = new Node[10];
    private class Node{
        Node next;
        int val;
    }
    public void insert(int input){
        int hashValue = input;
        while(hashValue > 9){
            hashValue = hashValue % 10;
        }
        Node current = hash[hashValue];
        Node newNode = new Node();
        newNode.val = input;
        if(current == null){
            hash[hashValue] = newNode;
            return;
        }
        while(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    boolean contains(int target){
        int hashVal = target;
        while(hashVal > 9){
            hashVal = hashVal % 10;
        }
        if(hash[hashVal] == null){
            return false;
        }
        Node current = hash[hashVal];
        while(current != null){
            if(current.val == target){
                return true;
            }
        }
        return false;
    }

    boolean remove(int target){
        int hashVal = target;
        while(hashVal > 9){
            hashVal = hashVal % 10;
        }
        if(hash[hashVal] == null){
            return false;
        }
        Node current = hash[hashVal];
        if(current.val == target){
            hash[hashVal] = current. next;
            return true;
        }
        while(current.next != null){
            if(current.next.val == target){
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public String toString(){
        String retVal = "";
        for(int i = 0; i < 10; i++){
            retVal += ("[" + i + "]");
            Node current = hash[i];
            while(current != null){
                retVal += current.val;
                current = current.next;
            }
        }
        return retVal;
    }
}
