  // Your code here
    if(x==1){
        head = head.next;
        return head;
    }
    
    Node temp = head;
    for(int i=1;i<x-1;i++){
        temp = temp.next;
    }
    temp.next = temp.next.next;
    return head;
    }
}
