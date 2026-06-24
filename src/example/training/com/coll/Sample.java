package example.training.com.coll;

import java.util.ArrayList;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) { 
	ArrayList ar=new ArrayList();
	ar.add(10);
	ar.add(2);
	ar.add(3);
	ar.add(4);
	ar.add(20);
	ar.add(50);
	int len=ar.size();
	//System.out.println(len);
	Iterator itr=ar.iterator();
	while(itr.hasNext()) {
		int n=(int) itr.next();
		if(n%10==0) {
			itr.remove();
		}
	}
	len=ar.size();
	System.out.println(len);
}
}
	


