package homework;

public class SortNumber {

	 static void quicksort(int[] arr, int low, int high) { // low는 첫 번째 인덱스, high는 마지막 인덱스
		 
	      int piv = high; // 기준값을 high값으로
	      
	      while(piv >= low) { // piv(기준값)가 low보다 작아지면 정렬이 끝남.
	         if(arr[piv] > 0) { // 양수를 배열 뒤로 보내는 작업
	            swap(arr,piv,high); high--; piv--;
	         }
	         else if(arr[piv] < 0) { // 음수 값을 배열 앞으로 보내는 작업
	            swap(arr,piv,low); low++;
	         }
	         else if(arr[piv] == 0) { // 인덱스 값이 0이면 그 위치에 그대로 남아 있음. 0을 배열 가운데로 위치시키는 효과
	            piv--;
	         }
	      }
	   }
	 
	 static void swap(int[] arr, int a, int b) {  // quicksort를 위한 swap 함수
	      int temp;
	      temp=arr[a];
	      arr[a]=arr[b];
	      arr[b]=temp;
	   }
	 
	public static void main(String[] args) { 
      int[] arr = {-9, 0, 2, 9, -3, 0, 5}; // 음수, 양수, 0이 섞여있는 배열 (주어진 배열이라고 가정)
      System.out.print("원래 배열 : ");
      for(int i = 0; i < arr.length; i++) {
          System.out.print(arr[i] + "  ");
       }
      System.out.println();
      quicksort(arr,0,arr.length-1);
      System.out.print("배열 정렬 결과 : ");
      for(int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + "  ");
      }
   }   
  
}