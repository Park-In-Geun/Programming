
public class Sorting { //정렬 클래스입니다.
	
	public static void swap(int[] a, int j, int k){
		// 배열의 원소의 위치를 바꾸기 위한 swap 정적 메서드로 매개변수 배열 a, 정수형 변수 j,k를 받습니다.
		int temp; // 정수형 변수 temp를 선언합니다.
		
		temp = a[j]; //temp에 a배열의 j번째 원소를 넣습니다.
		a[j] = a[k]; //a 배열의 j번째 원소와 a 배열의 k번째 원소를 넣습니다. (j 위치에 k 넣기)
		a[k] = temp; //a 배열의 k번째에 temp 값을 넣습니다. (k 위치에 j 넣기)
	}
	
	public static void selectionSort(int[] a){
		// 선택 정렬을 위한 selectionSort 정적 메서드로 매개변수로 정수형 배열 a 를 받습니다.
		int i, j, k; // 정수형 변수 i,j,k를 선언합니다.
		
		System.out.println("===== Selection Sort ===="); // " " 안의 내용을 출력합니다.
		
		for(i = 0 ; i < a.length - 1 ; i++){ // i 가 0부터 a배열의 길이 - 1 까지 1씩 증가시키는 반복문입니다.
			
			for(j = i+1, k = i ; j< a.length ; j++){ // k에 i값을 너헝주고 j가 i+1 부터 a배열의 길이까지 1씩 증가시키는 반복문입니다.
			
				if(a[j] < a[k]) k = j; //a배열의 j번째 원소가 a배열의 k번째 원소보다 작을 경우를 확인후 만족할 경우 k에 j를 넣습니다.
			}
			
			swap(a,k,i); //swap 메서드에 a , k , i 값을 넣어 k와 i 번째 값의 위치를 바꿉니다.
			
			System.out.printf("Pass %d = >", i+1); // Pass (i+1) 을 출력합니다. 
			System.out.print("\n"); // 줄바꿈입니다.
		
			for(int t = 0; t < a.length ; t++) //정수형 변수 t가 0부터 a배열의 길이까지 1씩 증가하는 반복문입니다.
				System.out.print("| " + a[t] + " |"); // a배열의 t번째 원소를 출력합니다.
			System.out.print("\n"); //줄바꿈입니다.
		}
		System.out.print("=========================\n"); //""안의 내용을 출력하고 줄바꿈 해줍니다.
	}
	
	public static void bubbleSort(int[] a){
		// 버블 정렬을 위한 bubbleSort 정적 메서드로 매개변수로 정수형 배열 a를 받습니다.
		int i,j,k=0; // 정수형 변수 i,j,k를 선언하고 k를 0으로 초기화해줍니다.
		
		System.out.print("====== Bubble Sort ======\n"); //""안의 내용을 출력하고 줄바꿈 해줍니다.
		
		for( i = a.length - 1 ; i >= 0 ; --i){ // i 가 a배열의 길이 -1 부터 0부터 크거나 같을때 까지 1씩 감소시키는 반복문입니다.
			
			for(j = 0 ; j < i ; j++){ // j가 0부터 i 까지 1씩 증가시키는 반복문입니다.
				
				if(a[j] > a[j+1]){ // a배열의 j번째가 a 배열의 j+1번째보다 큰 경우를 확인합니다.
					
					swap(a,j,j+1); // a배열의 j번째값과 j+1번째 값의 위치를 바꿉니다.
					
					System.out.printf("Pass %d = >\n", ++k); // Pass (++k) 를 출력합니다.
					
					for(int t = 0 ; t < a.length ; t++){ // 정수형 변수 t가 0부터 a배열의 길이까지 1씩 증가시키는 반복문입니다.
						System.out.print("| " + a[t] + " |"); // a배열의 t번째 값을 출력합니다.
					}
					
					System.out.print("\n"); //줄바꿈입니다.
				}
			}
		}
		
		System.out.print("=========================\n"); // ""안의 내용 출력후 줄바꿈 해줍니다.
	}
	
	public static void insertionSort(int[] a){ 
		// 삽입 정렬을 위한 insertionSort 정적 메서드로 매개변수 정수형 배열 a를 받습니다.
		int i, j, k; //정수형 변수 i,j,k를 선언합니다.
		boolean move; // boolean형 move를 선언합니다. (원소의 크기 비교를 위해 사용)
		
		System.out.print("===== Insertion Sort ====\n"); // "" 안의 내용을 출력합니다.
		
		for(i = 1 ; i < a.length  ; i++){ // i가 1부터 a배열의 길이까지 1씩 증가시키는 반복문입니다.
			k = a[i]; //k에 a배열의 i번째 값을 넣습니다.
			j = i; //j에 i를 넣습니다.
			
			if(a[j-1] > k) move = true; 
			// a배열의 j-1번째 값이 k보다 클 경우를 확인합니다. 조건 만족시 move에 true 를 넣습니다.
			
			else move = false; // 불만족시 move에 false를 넣습니다.
			
			while(move){ // move가 false 값을 가질 때 까지 반복하는 반복문입니다. 
				a[j] = a[j-1]; // a배열의 j번째에 a배열의 j-1번째 값을 넣습니다.
				j = j-1; //j에 j-1을 넣습니다.
				
				if(j > 0 && a[j-1] > k) move = true; 
				// j 가 0보다 크고 a배열의 j-1번째 값이 k보다 클 경우를 확인하고 조건 만족시 move에 true값을 넣습니다.
				else move = false;
				// 불만족시 move에 false를 넣습니다.
			}
			a[j] = k; //a 배열의 j번째에 k 를 넣습니다.
			System.out.printf("Pass %d = >", i); // Pass (i) 를 출력합니다.
			System.out.print("\n"); //줄바꿈입니다.
			for(int t = 0; t < a.length ; t++) // 정수형 변수 t가 0부터 a배열의 길이까지 1씩 증가시키는 반복문입니다.
				System.out.print("| " + a[t] + " |"); // a배열의 t번째 값을 출력합니다.
			System.out.print("\n"); //줄바꿈입니다.
		}
		System.out.print("=========================="); // "" 안의 내용을 출력합니다.
	}
}
