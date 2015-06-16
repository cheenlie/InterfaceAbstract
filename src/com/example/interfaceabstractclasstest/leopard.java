package com.example.interfaceabstractclasstest;

import com.abstr.animalAbstract;
import com.interf.animalAction;


//继承抽象类要写在继承接口的前面。
public class leopard extends animalAbstract  implements animalAction{

	static int leopardage;
	public static void main(String[] args) {
		
		//非抽象类的实例化
		MainActivity mainActivity=new MainActivity();
		
		//抽象类的实例化时，必须实现抽象类的方法。
		animalAbstract abstract1=new  animalAbstract(){

			@Override
			public void abst_drink() {
				// TODO Auto-generated method stub
			}
		};
		
		leopardage=abstract1.abst_getage(0);
	}
		

	@Override
	public void inte_run() {
		// TODO Auto-generated method stub
		
	}
	
	//重写抽象类中的方法
	public int abst_getage(int age){
		return age+1;
	}

	@Override
	public void inte_sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void abst_drink() {
		// TODO Auto-generated method stub
		
	}

}
