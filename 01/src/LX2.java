
public class LX2 { 
  // �������鷽�� 
  public static void main(String[] args) { 
    int arr[] = new int[20]; 
    arr[0] = arr[1] = 1; 
    for (int i = 2; i < arr.length; i++) { 
      arr[i] = arr[i - 1] + arr[i - 2]; 
    } 
    System.out.println("쳲��������е�ǰ20��������ʾ��"); 
    for (int i = 0; i < arr.length; i++) { 
      if (i % 5 == 0) 
        System.out.println(); 
      System.out.print(arr[i] + "\t"); 
    } 
  } 
 
} 
