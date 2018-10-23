package test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import main.java.*;

public class AssignmentTests {

	private Item[] emptyVec;
	private Item[] unsortedVec;
	
	@Before
	public void setUp() throws Exception {
		emptyVec = null;
		unsortedVec = new Item[5];
		unsortedVec[0] = new Item(3);
		unsortedVec[1] = new Item(2);
		unsortedVec[2] = new Item(1);
		unsortedVec[3] = new Item(5);
		unsortedVec[4] = new Item(4);
	}

	//testing bubble sort
	
	@Test
	public void whenInputIsEmptyForBubbleSort() {
		try 
		{
			SortAlgos.bubbleSort(emptyVec);
			fail("Should have thrown an exception !");
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown as expected !", true);
		}
	}
	
	@Test
	public void whenInputIsUnsortedForBubbleSort() {
		try 
		{
			SortAlgos.bubbleSort(unsortedVec);
			assertTrue("No exceptions thrown !", true);
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown !", false);
		}
	}
	
	//testing insertion sort
	
	@Test
	public void whenInputIsEmptyForInsertionSort() {
		try 
		{
			SortAlgos.insertionSort(emptyVec);
			fail("Should have thrown an exception !");
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown as expected !", true);
		}
	}
	
	@Test
	public void whenInputIsUnsortedForInsertionSort() {
		try 
		{
			SortAlgos.insertionSort(unsortedVec);
			assertTrue("No exceptions thrown !", true);
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown !", false);
		}
	}
	
	//testing selection sort
	
	@Test
	public void whenInputIsEmptyForSelectionSort() {
		try 
		{
			SortAlgos.selectionSort(emptyVec);
			fail("Should have thrown an exception !");
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown as expected !", true);
		}
	}
	
	@Test
	public void whenInputIsUnsortedForSelectionSort() {
		try 
		{
			SortAlgos.selectionSort(unsortedVec);
			assertTrue("No exceptions thrown !", true);
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown !", false);
		}
	}
	
	//testing merge sort
	
	@Test
	public void whenInputIsEmptyForMergeSort() {
		try 
		{
			SortAlgos.mergeSort(emptyVec);
			fail("Should have thrown an exception !");
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown as expected !", true);
		}
	}
	
	@Test
	public void whenInputIsUnsortedForMergeSort() {
		try 
		{
			SortAlgos.mergeSort(unsortedVec);
			assertTrue("No exceptions thrown !", true);
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown !", false);
		}
	}
	
	//testing quick sort

	@Test
	public void whenInputIsEmptyForQuickSort() {
		try 
		{
			SortAlgos.quickSort(emptyVec);
			fail("Should have thrown an exception !");
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown as expected !", true);
		}
	}
	
	@Test
	public void whenInputIsUnsortedForQuickSort() {
		try 
		{
			SortAlgos.quickSort(unsortedVec);
			assertTrue("No exceptions thrown !", true);
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown !", false);
		}
	}

	//testing heap sort
	
	@Test
	public void whenInputIsEmptyForHeapSort() {
		try 
		{
			SortAlgos.heapSort(emptyVec);
			fail("Should have thrown an exception !");
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown as expected !", true);
		}
	}
	
	@Test
	public void whenInputIsUnsortedForHeapSort() {
		try 
		{
			SortAlgos.heapSort(unsortedVec);
			assertTrue("No exceptions thrown !", true);
		} 
		catch (NullPointerException e)
		{ 
			assertTrue("Exception thrown !", false);
		}
	}
}
