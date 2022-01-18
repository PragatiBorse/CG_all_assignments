
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ExchangePosition {
public static final <T> void swap (T[] a, int i, int j) {
T t = a[i];
a[i] = a[j];
a[j] = t;
}

public static final <T> void swap (List<T> l, int i, int j) {
Collections.<T>swap(l, i, j);
}

private static void testData() {
String [] arrayData = {"Hello", "Goodbye" , "Borse","Pragati"};
System.out.println("Original Data in Array:"+Arrays.toString(arrayData));
List<String> list = new ArrayList<String>(Arrays.asList(arrayData));

//Parameters : list , position of 2 elements to swap
swap(list, 2, 3);

System.out.println("Data after Swapping Elements:"+list);
}
public static void main(String...args)
{
testData();
}

}
