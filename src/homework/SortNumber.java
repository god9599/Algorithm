package homework;

public class SortNumber {

	 static void quicksort(int[] arr, int low, int high) { // low�� ù ��° �ε���, high�� ������ �ε���
		 
	      int piv = high; // ���ذ��� high������
	      
	      while(piv >= low) { // piv(���ذ�)�� low���� �۾����� ������ ����.
	         if(arr[piv] > 0) { // ����� �迭 �ڷ� ������ �۾�
	            swap(arr,piv,high); high--; piv--;
	         }
	         else if(arr[piv] < 0) { // ���� ���� �迭 ������ ������ �۾�
	            swap(arr,piv,low); low++;
	         }
	         else if(arr[piv] == 0) { // �ε��� ���� 0�̸� �� ��ġ�� �״�� ���� ����. 0�� �迭 ����� ��ġ��Ű�� ȿ��
	            piv--;
	         }
	      }
	   }
	 
	 static void swap(int[] arr, int a, int b) {  // quicksort�� ���� swap �Լ�
	      int temp;
	      temp=arr[a];
	      arr[a]=arr[b];
	      arr[b]=temp;
	   }
	 
	public static void main(String[] args) { 
      int[] arr = {-9, 0, 2, 9, -3, 0, 5}; // ����, ���, 0�� �����ִ� �迭 (�־��� �迭�̶�� ����)
      System.out.print("���� �迭 : ");
      for(int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + "  ");
       }
      System.out.println();
      quicksort(arr,0,arr.length-1);
      System.out.print("�迭 ���� ��� : ");
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + "  ");
      }
   }   
  
}