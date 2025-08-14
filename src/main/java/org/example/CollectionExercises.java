package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionExercises {
    public String[] makeFruitStringArray() {
        // EXAMPLE:
        // Create and return an array of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        String[] fruits = new String[5];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";
        fruits[3] = "date";
        fruits[4] = "elderberry";

        return fruits;
    }

    public String[] makeFruitStringArrayWithSize(int size) {
        // Create and return an array of strings with the given size (from the parameter)
        String[] fruits = new String[size];
        // Use a loop to set every element to "apple"
       for (int i =0; i < size; i++) {
           fruits[i] = "apple";
       }
        // Replace the line below with your implementation
        return fruits;
    }

    public String[] makeTopThreeArray(String[] fruits) {
        // Create and return a new array of strings containing the first three elements of the given array
        // Replace the line below with your implementation
        String[] top3Fruits = new String[3];
        for(int i = 0; i < 3; i++) {
            top3Fruits[i] = fruits[i];
        }
        return top3Fruits;
    }

    public ArrayList<String> makeFruitList() {
        // Create and return an ArrayList of strings with the following values:
        // "apple", "banana", "cherry", "date", "elderberry"
        // Replace the line below with your implementation
        ArrayList<String> moreFruit = new ArrayList<>();
        moreFruit.add("apple");
        moreFruit.add("banana");
        moreFruit.add("cherry");
        moreFruit.add("date");
        moreFruit.add("elderberry");
        return moreFruit;
    }

    public ArrayList<String> makeListOfThreeFruits(String fruit1, String fruit2, String fruit3) {
        // Create and return an ArrayList of strings with the given values
        // Replace the line below with your implementation
        ArrayList<String> top3 = new ArrayList<>();
        top3.add(fruit1);
        top3.add(fruit2);
        top3.add(fruit3);
        return top3;
    }

    public HashMap<String, String> makeFruitMap() {
        // Create and return a HashMap with the following key-value pairs:
        // "apple" -> "red", "banana" -> "yellow", "cherry" -> "red", "date" -> "brown", "elderberry" -> "black"
        // Replace the line below with your implementation
        HashMap<String, String> colorOfFruit = new HashMap<String, String>();
        colorOfFruit.put("apple", "red");
        colorOfFruit.put("banana", "yellow");
        colorOfFruit.put("cherry", "red");
        colorOfFruit.put("date", "brown");
        colorOfFruit.put("elderberry", "black");
        return colorOfFruit;
    }

    public String lookupAppleColor(HashMap<String, String> fruitMap) {
        // Return the value associated with the key "apple" in the given map, using the get method
        // Replace the line below with your implementation
        String appleColor = fruitMap.get("apple");
        return appleColor;
    }

    public HashSet<String> makeFruitSet(String fruit1, String fruit2, String fruit3) {
        // Create and return a HashSet of strings with the given values
        // Replace the line below with your implementation
        HashSet<String> fruitSet = new HashSet<>();
        fruitSet.add(fruit1);
        fruitSet.add(fruit2);
        fruitSet.add(fruit3);
        return fruitSet;
    }
}
