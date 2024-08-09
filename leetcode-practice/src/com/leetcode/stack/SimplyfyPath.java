package com.leetcode.stack;

import java.util.Stack;

public class SimplyfyPath {

  //input /home/
  private static String simplyfyPath(String path) {
    Stack<String> pathStack = new Stack<>();
    StringBuilder simplyfyPath = new StringBuilder();
    String[] splitPath = path.split("/");
    for (String s : splitPath) {
      if (s.equals("..")) {
        if (!pathStack.isEmpty()) {
          pathStack.pop();
        }
      } else if (!s.equals(".") && !s.equals("")) {
        pathStack.push(s);
      }
    }

    for (String s : pathStack) {
      simplyfyPath.append("/").append(s);
    }
    return simplyfyPath.toString();
  }

  public static void main(String[] args) {
    String path = "/home/";
    System.out.println(simplifyPath(path));
  }

  public static String simplifyPath(String path) {

    String[] splitPath = path.split("/");
    Stack<String> pathStack = new Stack<>();
    for(String subPath : splitPath){
      if(subPath.equals("..")){
        if(!pathStack.isEmpty()){
          pathStack.pop();
        }
      }else if(!subPath.equals(".") && !subPath.equals("")){
        pathStack.push(subPath);
      }
    }
    StringBuilder buildPath = new StringBuilder();
    for(String endPoint : pathStack){
      buildPath.append("/").append(endPoint);
    }
    return buildPath.toString();
  }

}
