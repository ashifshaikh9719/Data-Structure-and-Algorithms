import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class MinimizeTheSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 4;
		int k = 3;
		
		Integer[] ar = {20, 7, 5, 4};
		
		Queue<Integer> maxHeap = new PriorityQueue<>((x,y)->y-x);
		
		maxHeap.addAll(Arrays.asList(ar));
		
		while(k>0) {
			int num = maxHeap.remove()/2;
			maxHeap.add(num);
			k--;
		}
		
		int sum = 0;
		
		for(Integer num : maxHeap) {
			sum += num;
		}
		
		System.out.println(sum);
		

	}

}
