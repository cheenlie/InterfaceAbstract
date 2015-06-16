package com.abstr;


//抽象类中的函数必须有函数体
public abstract class animalAbstract {
	
	//抽象类中的抽象函数，相当于接口了，没有函数体
	public abstract void abst_drink();

	public int abst_getage(int age){
		return age;
	}
}
