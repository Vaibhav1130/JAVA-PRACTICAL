import java.util.*;

class Array
{
    public static void main(String args[])
 {
        Scanner s1 = new Scanner(System.in);
        
        // Step 1: Input the size and elements of the array
        System.out.println("Enter size of array:");
        int size = s1.nextInt();
        int a[] = new int[size + 10];  // Extra space for insertion
        
        System.out.println("Enter " + size + " elements of array:");
        for (int i = 0; i < size; i++)
        {
            a[i] = s1.nextInt();
        }
        
        // Display the elements
        System.out.println("Elements array are:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Step 2: Insertion in the array
        System.out.println("Enter the element to insert:");
        int element = s1.nextInt();
        System.out.println("Enter the position to insert at (0 to " + size + "):");
        int position = s1.nextInt();
        
        // Insert the element by shifting elements to the right
        for (int i = size; i > position; i--)
        {
            a[i] = a[i - 1];
        }
        a[position] = element;
        size++;
        
        // Display the array after insertion
        System.out.println("Array after insertion:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Step 3: Deletion from the array
        System.out.println("Enter the position of the element to delete (0 to " + (size - 1) + "):");
        position = s1.nextInt();
        
        // Delete the element by shifting elements to the left
        for (int i = position; i < size - 1; i++)
        {
            a[i] = a[i + 1];
        }
        size--;
        
        // Display the array after deletion
        System.out.println("Array after deletion:");
        for (int i = 0; i < size; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
        // Step 4: Searching for an element in the array
        System.out.println("Enter the element to search for:");
        element = s1.nextInt();
        boolean found = false;
        
        for (int i = 0; i < size; i++)
        {
            if (a[i] == element)
           {
                System.out.println("Element " + element + " found at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found)
        {
            System.out.println("Element " + element + " not found in the array.");
        }
        
       
 }
}