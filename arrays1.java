package placementprograms;

public class arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[];
		// defining an array
		// there are six array elements
		// starting index zero and end index is 6-1=5
		arr = new int[6];
		// initializing an array means giving value to array elements
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 5;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
