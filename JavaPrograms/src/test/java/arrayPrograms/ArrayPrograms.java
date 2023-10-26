package arrayPrograms;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.s;
import org.testng.annotations.Test;

public class ArrayPrograms {
	@Test
	public void swappingTwoNumbersUsingThird() {
		int a=10;
		int b=12;
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a= "+a);
		System.out.println("after swapping b= "+b);	
	}
	@Test
	public void swappingTwoNumbersWithoutThird() {
		int a=10;
		int b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping a= "+a);
		System.out.println("after swapping b= "+b);
	}
	@Test
	public void Arraysorting() {
		int[] a= {12,4,6,2,8};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));		
	}
	@Test
	public void sortArrayDesc() {
		int [] arr= {12,3,2,11,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	@Test
	public void FirstMinNumber() {
			int [] arr= {12,3,2,11,23};
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]>arr[j]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			System.out.println(arr[0]+" : first min number in array");
		
	}
	@Test
	public void FirstMaxNumber() {
		int [] arr= {12,3,2,11,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(arr[0]+" : first max number in array");
}
	@Test
	public void sumOfFisrtThreeMin() {
		int [] arr= {12,3,2,11,23};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
//		int sum=arr[0]+arr[1]+arr[2];
//		System.out.println(sum);
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);	
	}
	@Test
	public void sumOfFisrtThreeMax() {
		int [] arr= {12,3,2,11,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
//			System.out.print(arr[i]+" ");
		}
		int sum=arr[0]+arr[1]+arr[2];
		System.out.println(sum);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
	}
	@Test
	public void MulOfFisrtThreeMin() {
		int [] arr= {12,3,2,11,23};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
//			System.out.print(arr[i]+" ");
		}
		int mul=arr[0]*arr[1]*arr[2];
		System.out.println(mul);
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}	
	}
	@Test
public void SumOfFirstThreeMax() {
	int [] arr= {10,20,30,5,40};
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	int sum=0;
	for(int i=0;i<3;i++) {
		sum=sum+arr[i];
	}
	System.out.println(sum);
}
	@Test
	public void MulOfFirstThreeMax() {
		int [] arr= {10,20,30,5,40};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int mul=1;
		for(int i=0;i<3;i++) {
			mul=mul*arr[i];
		}
		System.out.println(mul);
	}
	
	@Test
	public void findFastMinNumberInArrayWithoutBubleSort() {
		int [] a= {12,11,22,11,2};
		int fmin=a[0];
		for(int i=0;i<a.length;i++) {
			if( fmin>a[i]) {
				fmin=a[i];
			}
			
		}
		System.out.println(fmin);
	}
	@Test
	public void findFastMaxNumberInArrayWithoutBubleSort() {
		int [] a= {12,11,22,11,2};
		int fmax=a[0];//12
		for(int i=0;i<a.length;i++) {
			if( fmax<a[i]) {//f,f,t
				fmax=a[i];//22
			}
		}
		for(int i=0;i<3;i++) {
	}
		System.out.println(fmax);
	}
	@Test
	public void array() {
		int[] arr= {12,11,22,11,2};
	int size=arr.length;
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[size-1]);
	}
	@Test
	public void findFirstAndSecondNoInArrayWithoutUsingBubleSort() {
		int [] a= {10,21,12,22,11};
		int fmin=a[0],smin=a[0];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
			if( fmin>=a[i]) {
				fmin=a[i];
				smin=a[j];
			}	
		}
		System.out.println(fmin);
		System.out.println(smin);
	}
	@Test
	public void firstSecondMinNumFromArray() {
		int [] a= {5,21,12,22,11};
		int fmin=a[0];//10,
		int smin=a[0];
		int tmin=a[0];
		for(int i=0;i<a.length;i++) {//a[i]=10
			if(a[i]<=fmin) {//f,
				if(a[i]!=fmin) {
					smin=fmin;
				}
				fmin=a[i];
				
				}else if(smin==fmin ||smin>a[i]) {
					smin=a[i];
				}
				
			}
		System.out.println("1st min number= "+ fmin);
		System.out.println("2st min number= "+ smin);
		}
	@Test
	public void combinationOfTwoMinNumbers() {
		int [] a= {3,5,7,6,9,1,8,10};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==11) {
					System.out.println(a[i]+a[j]+"="+a[i]+" + "+a[j]);
					
				}
			}
		}
		
	}
	@Test
	public void addTwoArrays() {
		int [] a= {4,2,6,1,7};
		int [] b= {3,1,7,2};
		int [] c=new int[a.length];
		if(a.length!=b.length) {
			for(int i=0,j=0,k=0;i<a.length;i++,j++,k++) {
				c[k]=a[i]+b[j];
				System.out.print(c[k]);
			}
		}
		else
			System.out.println("length of array should be same");	
	}
	@Test
	public void appendingZerosToLast() {
		int [] arr= {5,0,4,0,0,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	@Test
	public void removeDuplicatesInAnArrayUsingCollection() {
		int [] a= {2,3,1,4,1,3,5,2};
//		Set<Integer> s=new HashSet<Integer>();
//		for(int i=0;i<a.length;i++) {
//			s.add(a[i]);
//		}
//		System.out.println(s);
//	}
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;i<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println(a[i]);
//				}
//			}
//		}
		Map<Object, Object> m=new HashMap<Object, Object>();
		
		for(int i=0;i<a.length;i++) {
			m.put(a[i], a[i]);	
		}
		for(Entry<Object, Object> map:m.entrySet()) {
			System.out.print(map.getKey()+" ");
		}
	}
	@Test
	public void countDuplicatesOccurance() {
		int [] a= {2,3,1,4,1,3,5};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;i<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
	@Test
	public void countRepeatingNum() {
		int [] a= {2,3,1,4,1,3,5,2};
//		LinkedHashSet<Integer> set=new LinkedHashSet<Integer>();
//		for(int i=0;i<a.length;i++) {
//			set.add(a[i]);//it will remove duplicates and print
//		} 
//		for(Integer in:set) {
//			int count=0;
//			for(int i=0;i<a.length;i++) {
//				if(in==a[i]) {
//					count++;
//				}
//			}
//			System.out.println(in+"is repeating = "+count);
//		}	
//	}
		Map<Integer, Integer> mp=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			mp.put(a[i], i);	
		}
		System.out.print(mp);
		for(Entry<Integer, Integer> es:mp.entrySet()) {
			int count=0;
			for(int i=0;i<a.length;i++) {
			if(es.getKey()==a[i]) 
			{
				count++;
				mp.put(es.getKey(), count);
			}
			}
			System.out.println(es.getKey()+" is repeating "+count);
		}
}
	@Test
	public void positionOfEachNumberInAnArrayWithoutDuplicates() {
//		int [] a= {2,3,1,4,1,3,5,2};
//		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
//		for(int i=0;i<a.length;i++) {
//			map.put(a[i], i);
//		}
//		for(Entry<Integer, Integer> es:map.entrySet()) {
//			int key=es.getKey();
//			System.out.print(key);
//			for(int i=0;i<a.length;i++) {
//				if(key==a[i]) {
//					System.out.println(es+" is present in "+ (i+1)+" position");
//					break;	
//				}
//			}
//		}
		int [] a= {2,3,1,4,1,3,5,2};
		LinkedHashMap<Integer, Object> map=new LinkedHashMap<Integer, Object>();
		for(int i=0;i<a.length;i++) {
			map.put(a[i], i);
		}
		for(Entry<Integer, Object> es:map.entrySet()) {
			for(int i=0;i<a.length;i++) {
				if(es.getKey()==a[i]) {
					System.out.println(es.getKey()+" is present in "+ (i+1)+" position");
					break;
				}
			}
			
		}
	}
	@Test
	public void cubeOfEachChar() {
		int arr[]= {20,10,5};
		int a[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			a[i]=i*i*i;
			System.out.println(a[i]);		
		}
	}
	@Test
	public void MissingElementInAnArray() {
		int a[]= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<=10;j++) {
				if(a[i]==j) {
					
				}
				else {
					System.out.println(j+"is missing");
					break;
				}
				i++;
			}
			break;
		}
	}
	@Test
	public void MissiingElement() {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]= {1,2,3,4,6,7,8,9,10};
		
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					count++;
				}	
				}
			if(count<=1) {
				System.out.println(a[i]+"is missing");
		}
	}
}
	@Test
	public void EachCharacterMovingOneIndex() {
		int a[]= {12,3,4,5,6,2};
		int index=a[a.length-1];
		int num=a.length-1;
		for(int i=a.length-2;i>=0;i--) {
			a[num]=a[i];
			num--;
		}
		a[0]=index;
		System.out.println(Arrays.toString(a));	
	}
	@Test
	public void sub()
	{
		String s="abaab";
		for(int i=0;i<s.length();i++) {
			for(int j=i;j<=i+1;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}	
}