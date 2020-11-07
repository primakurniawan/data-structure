package com.company;

public class DoublyLinkedList {
    DoublyNode head;
    DoublyNode tail;

    //Insert on The last entry
    public void insert(int date)
    {
        DoublyNode doublyNode=new DoublyNode();
        doublyNode.date=date;
        doublyNode.next=null;
        doublyNode.prev=null;
        if(head==null)
        {
            head=doublyNode;
        }
        if (tail==null) {
            tail=doublyNode;
        }
        else
        {
            DoublyNode n=head;

            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=doublyNode;

            n=tail;
            while(n.prev!=null)
            {
                n=n.prev;
            }
            n.prev=doublyNode;

        }
    }

    //Insert at the first index
    public void insertAtStart(int data)
    {
        DoublyNode doublyNode =new DoublyNode();
        doublyNode.date=data;
        doublyNode.next=null;
        doublyNode.prev=null;
        doublyNode.next=head;
        doublyNode.prev=tail;
        head=doublyNode;
        tail=doublyNode;
    }

    //Insert at specific index
    public void insertAt(int index,int data)
    {
        if (index==0)
        {
            insertAtStart(data);
        }
        else
        {
            DoublyNode doublyNode=new DoublyNode();
            doublyNode.date=data;
            doublyNode.next=null;
            doublyNode.prev=null;

            DoublyNode n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            doublyNode.next=n.next;
            n.next=doublyNode;

            n=tail;
            for(int i=0;i<index-1;i++)
            {
                n=n.prev;
            }
            doublyNode.prev=n.prev;
            n.prev=doublyNode;
        }
    }

    //Delete the last index
    public void delete() {
        DoublyNode n=head;
        DoublyNode n1=null;
        while(n.next!=null)
        {
            n=n.next;
            n1=n.next;
            if (n1.next == null) n.next = null;
        }

        n= tail;
        n1=null;
        while(n.prev!=null)
        {
            n=n.prev;
            n1=n.prev;
            if (n1.prev == null) n.prev = null;
        }
    }

    //delete the first index
    public void deleteAtStart() {
        head=head.next;
        tail=tail.prev;
    }

    //delete the specific index
    public void deleteAt(int index)
    {
        if (index==0)
        {
            head=head.next;
            tail=tail.prev;
        }
        else
        {
            DoublyNode n=head;
            DoublyNode n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;

            n=tail;
            n1=null;
            for(int i=0;i<getSize()-index-1;i++)
            {
                n=n.prev;
            }
            n1=n.prev;
            n.prev=n1.prev;

        }
    }

    //show all the linkedList
    public void show()
    {
        DoublyNode n=head;
        while(n.next!=null)
        {
            System.out.println(n.date );
            n=n.next;
        }
        System.out.println(n.date);
//                n=tail;
//                while(n.prev!=null)
//                {
//                    System.out.println(n.date );
//                    n=n.prev;
//                }
//                System.out.println(n.date);
    }

    //Show the last linkedList
    public void showLast(){
        DoublyNode n=head;
        DoublyNode n1=null;
        while(n.next!=null)
        {
            n=n.next;
            if (n.next == null) System.out.println(n.date);
        }
    }

    //Show the first linkedList
    public void showFirst(){
        System.out.println(head.date);
    }

    //Show the specific linkedList
    public void showAt(Integer index) {
        if (index==0)
        {
            System.out.println(head.date);;
        }
        else
        {
            DoublyNode n=head;
            for(int i=0;i<=index-1;i++)
            {
                n=n.next;
            }
            System.out.println(n.date);
        }
    }

    //Get Size
    public int getSize() {
        DoublyNode n=head;
        int total = 0;
        while(n.next!=null)
        {
            total+=1;
            n=n.next;
        }
        total+=1;
        return total;
    }
}
