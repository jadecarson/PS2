package base;

public class MyInteger {
	private int iValue;
	public MyInteger(int iValue){
		this.iValue=iValue;
	}
	public int getiValue(){
		return this.iValue;
	}
	public void setiValue(int num){
		this.iValue=num;
	}
	public boolean isEven(){
		if(iValue%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isOdd(){
		if(iValue%2!=0){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime(){
		int start=2;
		while(start<=Math.sqrt(iValue)){
			if (iValue%start==0){
				return false;
			}
			else{
				start++;
			}
		}
		return true;
	}
	public static boolean isEven(int num){
		if(num%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(int num){
		if(num%2!=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(int num){
		int start=2;
		while(start<=Math.sqrt(num)){
			if (num%start==0){
				return false;
			}
			else{
				start++;
			}
		}
		return true;
	}
	public static boolean isEven(MyInteger num){
		if(num.getiValue()%2==0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isOdd(MyInteger num){
		if(num.getiValue()%2!=0){
			return true;
		}
		else{
			return false;
		}
	}
	public static boolean isPrime(MyInteger num){
		int start=2;
		while(start<=Math.sqrt(num.getiValue())){
			if (num.getiValue()%start==0){
				return false;
			}
			else{
				start++;
			}
		}
		return true;
	}
	public boolean equals(int num){
		if (num==getiValue()){
			return true;
		}
		return false;
	}
	public boolean equals(MyInteger num){
		if (num.getiValue()==getiValue()){
			return true;
		}
		return false;
	}

}
