package com.misc.hashtable;

import java.util.HashMap;
import java.util.InvalidPropertiesFormatException;

public class RunHash {

  public static void main(String[] args) {
    HashTable hashTable = new HashTable();
    hashTable.set("id", 1);
    hashTable.set("class", 10);
    hashTable.set("std", 5);
    hashTable.set("di", 67);

    hashTable.printTable();

    System.out.println(hashTable.get("id"));
    System.out.println(hashTable.get("raj"));

    System.out.println(hashTable.keys());



  }
}
