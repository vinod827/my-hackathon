package com.learning.myhackathon.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

public class MyLinkedHashSet {

  private static final Log logger = LogFactory.getLog(MyLinkedHashSet.class);

  public static void main(String[] args){
  logger.info("Entering main@MyLinkedHashSet");

    LinkedHashSet<String> myLinkedHashSet = new LinkedHashSet <String>();
    myLinkedHashSet.add("A");
    myLinkedHashSet.add("L");
    myLinkedHashSet.add("K");
    myLinkedHashSet.add("D");
    myLinkedHashSet.add("D");
    myLinkedHashSet.add("G");
    myLinkedHashSet.add("Q");
    myLinkedHashSet.add("P");
    logger.info(myLinkedHashSet);

    Map<String, String> myHashMap = new HashMap <String, String>();
    myHashMap.put("A", "A");
    myHashMap.put("Z", "Z");
    myHashMap.put("K", "K");
    //myHashMap.put("K", "K");
    myHashMap.put("L", "L");
    myHashMap.put("H", "H");
    logger.info(myHashMap);

    SortedSet<String> mySortedSet = new TreeSet <>();
    mySortedSet.add("A");
    mySortedSet.add("Q");
    mySortedSet.add("D");
    mySortedSet.add("C");
    mySortedSet.add("V");
    mySortedSet.add("U");
    mySortedSet.add("D");
    logger.info(mySortedSet);

  logger.info("Exiting main@MyLinkedHashSet");
  }

}
