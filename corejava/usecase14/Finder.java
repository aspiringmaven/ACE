package corejava.usecase14;

public class Finder {
	
	
	public static void main(String[] args) {
		int array[]={12,4,87,9,98,1,34,-1,0,40,35,21,66,74,9,31,75,40};
		
		for(int val:find(array)){
			System.out.println(val);
		}
	}

	
	public static int[] find(int array[]) {
		// Decending order
		int [] found = { ((array[0]>array[1])?array[0]:array[1]),((array[0]>array[1])?array[1]:array[0]) };
		
		for(int i=2;i<array.length;i++) {
			if(array[i] > found[0]) {
				found[1] = found[0];
				found[0] = array[i];
			} else if(array[i] > found[1]){
				found[1] = array[i];
			}
		}
		
		
		return found;
	}
	
}
