package com.ds.singlelinklist;

public class LinkedList
{
   private  Node head;
   private int count;

    public LinkedList()
    {
        head = new Node(null);
        count = 0;
    }

    public void add(Object data)
    {
        Node tempNode = new Node(data);
        Node currentNode = head;

        while (currentNode.getNext() != null)
        {
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(tempNode);
        count++;
    }

    public void add(Object data, int index)
    {
        Node tempNode = new Node(data);
        Node currentNode = head;

        for (int i = 1; i < index && currentNode.getNext() != null; i++)
        {
            currentNode = currentNode.getNext();
        }

        tempNode.setNext(currentNode.getNext());
        currentNode.setNext(tempNode);
        count++;
    }

    public Object get(int index)
    {
        if (index >= 0 && count >= index)
        {
            Node currentNode = head;
            for (int i = 1; i <= index; i++)
            {
                currentNode = currentNode.getNext();
            }
            return currentNode.getData();
        }
        else

        {
            return null;
        }

    }

    public boolean remove(int index)
    {
        if (index >= 0 && count >= index)
        {
            Node currentNode = head;
            for (int i = 1; i < index; i++)
            {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(currentNode.getNext().getNext());
            count --;
            return true;
        }
        else

        {
            return false;
        }
    }

    public String toString()
    {
        Node currentNode = head.getNext();
        String output = "";
        while (currentNode != null)
        {
            output += "[" + currentNode.getData().toString() + "]";
            currentNode = currentNode.getNext();
        }
        return output;
    }

}
