package liu;

public class LX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intArray[]=new int[30];
		for(int i=0;i<Array.length-1;i++) {
			Array[i]=(int)(1+Math.random()*10+1);
		}
		for(int i=0;i<Array.length-1;i++) {
			for(int j=i+1;j<Array.length;j++) {
				//比较a[i]后面的值与a[i]的大小,不用考虑最后一个数问题
				if(Array[i]>Array[j]) {
				int t;
				t=Array[i];
				Array[i]=Array[j];
				Array[j]=b;
				}
			}
		}
		for(int i=0;i<Array.length-1;i++) {
			System.out.println(Array[i]);
		}
	}

	}


