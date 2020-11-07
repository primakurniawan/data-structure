package com.company;

public class LinkedListClass {
    Node head;

    //Insert on The last entry
    public void insert(int date)
    {
        Node node=new Node();
        node.date=date;
        node.next=null;
        if(head==null)
        {
            head=node;
        }
        else
        {
            Node n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }

    //Insert at the first index
    public void insertAtStart(int data)
    {
        Node node =new Node();
        node.date=data;
        node.next=null;
        node.next=head;
        head=node;
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
            Node node=new Node();
            node.date=data;
            node.next=null;
            Node n=head;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            node.next=n.next;
            n.next=node;
        }
    }

    //Delete the last index
    public void delete() {
        Node n=head;
        Node n1=null;
        while(n.next!=null)
        {
            n=n.next;
            n1=n.next;
            if (n1.next == null) n.next = null;
        }
    }

    //delete the first index
    public void deleteAtStart() {
        head=head.next;
    }

    //delete the specific index
    public void deleteAt(int index)
    {
        if (index==0)
        {
            head=head.next;
        }
        else
        {
            Node n=head;
            Node n1=null;
            for(int i=0;i<index-1;i++)
            {
                n=n.next;
            }
            n1=n.next;
            n.next=n1.next;
        }
    }

    //show all the linkedList
    public void show()
    {
        Node n=head;
        while(n.next!=null)
        {
            System.out.println(n.date );
            n=n.next;
        }
        System.out.println(n.date);
    }

    //Show the last linkedList
    public void showLast(){
        Node n=head;
        Node n1=null;
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
            Node n=head;
            for(int i=0;i<=index-1;i++)
            {
                n=n.next;
            }
            System.out.println(n.date);
        }
    }
    //Get Size
    public int getSize() {
        Node n=head;
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
