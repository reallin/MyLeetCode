package stairs;

public class Main {
	public static void main(String[] args){
		System.out.print(climbStair(5));
	}
	//µİ¹é
	public static int climbStairs(int n) {
        if(n == 1){
        	return 1;
        }
        if(n == 2){
        	return 2;
        }
        return climbStairs(n-1)+climbStairs(n-2);
    }
	//·Çµİ¹é
	public static int climbStair(int n) {
		int num1 = 1;
		int num2 = 2;
		int sum = 0;
		if(n == 1){
        	return 1;
        }
        if(n == 2){
        	return 2;
        }
		for(int i = 2;i < n;i++){
			sum = num1+num2;
			num1 = num2;
			num2 = sum;
		}
		return sum;
	}
	
}
