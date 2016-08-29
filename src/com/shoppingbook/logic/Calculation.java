package com.shoppingbook.logic;

import java.util.*;

public class Calculation {
  public static double[] discounts={1.0,0.05,0.1,0.2,.25};	
  public static double priceCalculation(int[] bookbasket){
	Map map=new LinkedHashMap();
	List list=new ArrayList();
	int numofBooks=5;
	int count=1;
	double totalprice=0.0;
	for(int i=0;i<numofBooks;i++){
	   int copies=bookbasket[i];
	   for(int j=0;j<copies;j++){
		  String s="set"+j;
		  if(map.get(s)==null){
			 map.put(s, String.valueOf(count));
		  }else{
		     int num=Integer.parseInt((String)map.get(s));
		     map.put(s,String.valueOf(num+1));
		  }
	   }
	}
	Set set=map.entrySet();
	Iterator it=set.iterator();
	while(it.hasNext()){
		Map.Entry entry=(Map.Entry)it.next();
		int n=Integer.parseInt((String)entry.getValue());
		totalprice=totalprice+calculatePrice(n);
	}
	System.out.println(totalprice);
	return totalprice;
  }

private static double calculatePrice(int n) {
	// TODO Auto-generated method stub
	double cost=8.00;
	double difference=0.0;
	cost=cost*n;
	if(n>0){
	  double discount=cost*discounts[n-1];
	  difference=cost-discount;
	  return difference;
	}else{
	 return difference;	
	}
}
}
