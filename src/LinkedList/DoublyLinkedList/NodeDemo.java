package LinkedList.DoublyLinkedList;

import java.util.Scanner;

public class NodeDemo {

    static class Node{
        int data;
        Node next,prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    Node head,tail,temp;

    public void createDoublyList(int n)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter the data for "+i+"th node");
             int data=sc.nextInt();
            Node newnode=new Node(data);

            if(head==null)
            {
               head=tail=newnode;
            }
            tail.next=newnode;
            newnode.prev=tail;
            tail=newnode;
        }
    }

    public void display()
    {
        temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"<---->");
            temp=temp.next;
        }
        System.out.print("null");
    }
}
