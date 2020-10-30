package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.ArrayList;
import java.util.Arrays;


public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }
    @After
    public void after(){
        System.out.println("Test case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> emptyList=new ArrayList<Integer>();
        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing"+listNumbers);
        //Then
        Assert.assertEquals(emptyList,listNumbers);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(15,21,47,76,145,2,3,5));
        ArrayList<Integer> oddList=new ArrayList<Integer>(Arrays.asList(234,22,12));

        //When
        ArrayList<Integer> listNumbers=OddNumbersExterminator.exterminate(list);
        System.out.println("Testing"+listNumbers);
        //Then
        Assert.assertEquals(oddList,listNumbers);
    }
}
