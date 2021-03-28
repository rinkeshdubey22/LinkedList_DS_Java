package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyLinkedListTest {


    @Test
    public void givenThreeNumber_whenAddedToLinkedListShouldNeAddedToTheTop() {
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(mySecondNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode) && myLinkedList.tail.equals(myFirstNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenAddedToLinkedListShouldBeAddedToLast() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given3NumbersWhenInsertingSecondInBetweenShouldPassLinkedList() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstElementWhenDeletedShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(mySecondNode) &&
                myLinkedList.tail.equals(myThirdNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastElement_WhenDeleted_ShouldPassLinkedListTest() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insert(myFirstNode, mySecondNode);
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenElementToSearchWhenMatchShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.searchNode(mySecondNode);
        boolean result = myLinkedList.head.getNext().equals(mySecondNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given4NumbersWhenInsertingThirdInBetweenShouldPassLinkedListResult() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.insertBetweenNodes(myFirstNode, myThirdNode, 3);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assertions.assertTrue(result);
    }

    @Test
    public void given4NumbersWhenDeletingThirdInBetweenShouldPassLinkedListResult()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourthNode = new MyNode<>(70);

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.append(myFourthNode);
        myLinkedList.deleteFromSequence(myFirstNode, 3);
        myLinkedList.printMyNodes();

        boolean result = myLinkedList.head.equals(myFirstNode) &&
                myLinkedList.head.getNext().equals(mySecondNode) &&
                myLinkedList.tail.equals(myFourthNode);
        Assertions.assertTrue(result);
    }

}
