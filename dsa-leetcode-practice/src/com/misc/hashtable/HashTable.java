package com.misc.hashtable;

import java.util.ArrayList;

public class HashTable {

  private int size = 6;
  private Node[] dataMap;

  HashTable() {
    dataMap = new Node[size];
  }

  class Node {

    String key;
    int value;
    Node next;

    Node(String key, int value) {
      this.key = key;
      this.value = value;
    }

  }

  public void printTable() {
    for (int i = 0; i < dataMap.length; i++) {
      System.out.println(i + " : ");
      Node temp = dataMap[i];
      while (temp != null) {
        System.out.println("{ " + temp.key + " = " + temp.value + " }");
        temp = temp.next;
      }
    }
  }

  private int hash(String key) {
    char[] keys = key.toCharArray();
    int hash = 0;
    for (int i = 0; i < keys.length; i++) {
      int asciivalue = keys[i];
      hash = (hash + asciivalue * 23) % dataMap.length;
    }
    return hash;
  }

  public void set(String key, int value) {
    int index = hash(key);
    Node newNode = new Node(key, value);
    if (dataMap[index] == null) {
      dataMap[index] = newNode;
    } else {
      Node temp = dataMap[index];
      while (temp.next != null) {
        temp = temp.next;
        if (temp.key == key) {
          temp.value += value;
          return;
        }
      }
      temp.next = newNode;
    }
  }

  public int get(String key) {
    int index = hash(key);
    Node temp = dataMap[index];
    while (temp != null) {
      if (temp.key == key) {
        return temp.value;
      }
      temp = temp.next;
    }
    return 0;
  }

  public ArrayList<String> keys() {
    ArrayList<String> keys = new ArrayList<>();
    for (int i = 0; i < dataMap.length; i++) {
      Node temp = dataMap[i];
      while (temp != null) {
        keys.add(temp.key);
        temp = temp.next;
      }
    }
    return keys;
  }
}
