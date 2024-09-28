package com.package1;
import java.util.Scanner;
public class Project1  {
		static float bill=0;
		static int count1=0,count2=0,count3=0,count4=0,count5=0,count6=0,count7=0,count8=0,kgsa1=0,kgsa2=0,kgsa3=0,kgsa4=0,kgsa5=0,kgsa6=0,kgsa7=0,kgsa8=0;
		static int count9=0,count10=0,count11=0,count12=0,count13=0,count14=0,count15=0,count16=0,pants1=0,shirts1=0,tshirts1=0,lowers1=0,biscuits1=0,cooldrinks1=0,chocolates1=0,chips1=0;
		static int bill1=0,bill2=0,bill3=0,bill4=0,bill5=0,bill6=0,bill7=0,bill8=0,bill9=0,bill10=0,bill11=0,bill12=0,bill13=0,bill14=0,bill15=0,bill16=0;
		Scanner sc=new Scanner(System.in);
	 public void meth1()
	 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("==========WELCOME TO ORGANIC STORE==========");
		 System.out.println("AVAILABLE PRODUCTS IN THE STORE");
		 System.out.println("1.Fruits");
		 System.out.println("2.Vegetables");
		 System.out.println("3.Dresses");
		 System.out.println("4.Chips");
		 System.out.println(".please enter your choice");
		 new Project1().meth2();
	 }
		 void meth2()
		 {
		  int key=sc.nextInt();
		  
		 switch(key)
		 {
		 case 1:
			 System.out.println("WELCOME TO OUR FRUITS MENU");
			 System.out.println("125---mangoes---1 kg is 50");
			 System.out.println("126---apples---1 kg is 100");
			 System.out.println("127---papaya---1 kg is 60");
			 System.out.println("128---grapes---1 kg is 80");
			 break;
		 case 2:
			 System.out.println("WELCOME TO OUR VEGETABLES MENU");
			 System.out.println("129---potato---1 kg is 50");
			 System.out.println("130---chilli---1 kg is 30");
			 System.out.println("131---carrots---1 kg is 80");
			 System.out.println("132---brinjal---1 kg is 40");	 
			 break;
		 case 3:
			 System.out.println("WELCOME TO DRESSES MENU");
			 System.out.println("133---Pants--- 1 pant is 150");
			 System.out.println("134---shirt---1 shirt is 350");
			 System.out.println("135---tshirt---1 tshirt is 200");
			 System.out.println("136---lowers---1 lower is 200");
			 break;
		 case 4:
			 System.out.println("WELCOME TO SNACKS MENU");
			 System.out.println("137---biscuits--- 1 packet is 20");
			 System.out.println("138---cooldrinks---1 drink is 40");
			 System.out.println("139---chocolates---1 chocolate is 30");
			 System.out.println("140---chips---1 packet is 20");
			 break;
			 default :
				 System.out.println("invalid choice please enter your choice again");
				 new Project1().meth2();			 
				 }
		 if(key==1)
			 new Project1().meth3();
		 else if(key==2)
			 new Project1().meth4();
			 else if(key==3)
			 new Project1().meth5();
		 else if(key==4)
			 new Project1().meth6();
	}
		 void meth3()
		 {
			 int kgs1=0,kgs2=0,kgs3=0,kgs4=0;
			 System.out.println("please choose your product code");
		 int code=sc.nextInt();
			
			 switch(code)
			 {
			 case 125:
				 System.out.println("magoes is good choice how many kages you need");
				   kgs1=sc.nextInt();
				  break;
				 
			 case 126:
				 System.out.println("apples is good choice how many kages you need");
				kgs2 =sc.nextInt();
				break;
			 case 127:
				 System.out.println("papaya is good choice how many kages you need");
				 kgs3 =sc.nextInt();
				 break;
			 case 128:
				 System.out.println("grapes is good choice how many kages you need");
				  kgs4=sc.nextInt();
				break;
				 default:
					 System.out.println("invalid choice please choose corrct code");
					 new Project1().meth3();
					 break;
			 }
			 if(code==125)
			 {
				   new Project1().bill1=bill1+kgs1*50;
				   Project1.count1+=1;
				   kgsa1=kgsa1+kgs1;
				  
			 }
			 else if(code==126)
			 {
				 new Project1().bill2=bill2+kgs2*100;
				 Project1.count2+=1;
				 kgsa2=kgsa2+kgs2;
			 }
			 else if(code==127)
			 {
				 new Project1().bill3=bill3+kgs3*60;
				 Project1.count3+=1;
				 kgsa3=kgsa3+kgs3;
				 }
			 else if(code==128)
			 {
				 new Project1().bill4=bill4+kgs4*80;
				 Project1.count4+=1;
				 kgsa4=kgsa4+kgs4;
			 }
			 new Project1().meth7();
			 }
			 
		 

		 void meth4()
		 {
			 int kgs5=0,kgs6=0,kgs7=0,kgs8=0;
			 System.out.println("please choose your product code");
			 int code1=sc.nextInt();
			 switch(code1)
			 {
		 case 129:
			 System.out.println("potato is good choice how many kages you need");
			 kgs5=sc.nextInt();
			 break;
		 case 130:
			 System.out.println("chilli is good choice how many kages you need");
			  kgs6=sc.nextInt();
			 break;
		 case 131:
			 System.out.println("carrots is good choice how many kages you need");
			 kgs7=sc.nextInt();
			 break;
		 case 132:
			 System.out.println("brinjal is good choice how many kages you need");
			 kgs8=sc.nextInt();
			 break;
			 default:
				 System.out.println("invalid code pls enter correct code");
				 new Project1().meth4();
				 break;
			 }
			 if(code1==129)
			 {
				   new Project1().bill5=bill5+kgs5*50;
			 Project1.count5+=1;
			 kgsa5=kgsa5+kgs5;
			 }
			 else if(code1==130)
			 {
				 new Project1().bill6=bill6+kgs6*30;
				 Project1.count6+=1;
				 kgsa6=kgsa6+kgs6;
			 }
			 else if(code1==131)
			 {
				 new Project1().bill7=bill7+kgs7*80;
			 Project1.count7+=1;
			 kgsa7=kgsa7+kgs7;
			 }
			 else if(code1==132)
			 {
				 new Project1().bill8=bill8+kgs8*40;
			 Project1.count8+=1;
			 kgsa8=kgsa8+kgs8;
			 } 
			 new Project1().meth7();
			 
		 }
		 void meth5()
		 {
			 int pants=0,shirts=0,lowers=0,tshirts=0;
			 System.out.println("please choose your product code");
			 int code2=sc.nextInt();
			 switch(code2)
				{
			 case 133:
				 System.out.println("pants is good choice how many pants you need");
				  pants=sc.nextInt();
				 break;
			 case 134:
				 System.out.println("shirts is good choice how many shirts you need");
				  shirts=sc.nextInt();
				 break;
			 case 135:
				 System.out.println("tshirts is good choice how many tshirts you need");
				  tshirts=sc.nextInt();
				 break;
			 case 136:
				 System.out.println("lowers is good choice how many lowers you need");
				  lowers=sc.nextInt();
				 break;
				 default:
					 System.out.println("invalid choice pls enter correct code");
					 new Project1().meth5();
				}
			 if(code2==133)
			 {
				   new Project1().bill9=bill9+pants*150;
			 Project1.count9+=1;
			 pants1=pants1+pants;
			 }
			 else if(code2==134)
			 {
				 new Project1().bill10=bill10+shirts*350;
				 Project1.count10+=1;
				 shirts1=shirts1+shirts;
			 }
			 else if(code2==135)
			 {
				 new Project1().bill11=bill11+tshirts*200;
				 Project1.count11+=1;
				 tshirts1=tshirts1+tshirts;
			 }
			 else if(code2==136)
			 {
				 new Project1().bill12=bill12+lowers*200;
			 Project1.count12+=1;
			 lowers1=lowers1+lowers;
		 }
			 new Project1().meth7();
			 
			 }
		 void meth6()
		 {
			 int biscuits=0,cooldrinks=0,chocolates=0,chips=0;
			 System.out.println("please choose your product code");
			 int code3=sc.nextInt();
			 switch(code3)
			 {
			 case 137:
				 System.out.println("biscuts is good choice how many packets you need");
				  biscuits=sc.nextInt();
				 break;
			 case 138:
				 System.out.println("cooldrinks is good choice how many drinks you need");
				  cooldrinks=sc.nextInt();
				 break;
			 case 139:
				 System.out.println("chocolates is good choice how many chocolates you need");
				  chocolates=sc.nextInt();
				 break;
			 case 140:
				 System.out.println("chips is good choice how many packets you need");
				  chips=sc.nextInt();
				 break;
			     default:
					 System.out.println("invalid choice pls entr crct code");
					 new Project1().meth6();
	 
		 } 
			 if(code3==137)
			 {
				   new Project1().bill13=bill13+biscuits*20;
			 Project1.count13+=1;
			 biscuits1=biscuits1+biscuits;
			 }
			 else if(code3==138)
			 {
				 new Project1().bill14=bill14+cooldrinks*40;
			 Project1.count14+=1;
			 cooldrinks1=cooldrinks1+cooldrinks;
			 }
			 else if(code3==139)
			 {
				 new Project1().bill15=bill15+chocolates*30;
			 Project1.count15+=1;
			 chocolates1=chocolates1+chocolates;
			 }
			 else if(code3==140)
			 {
				 new Project1().bill16=bill16+chips*20;
			 Project1.count16+=1;
			 chips1=chips1+chips;
			 }
		
			 new Project1().meth7();
		 }
		 void meth7()
		 {
			 System.out.println("if you want to order some more products press 1 if exit press 0");
			 Scanner sc1=new Scanner(System.in);
			 int choice1=sc1.nextInt();
			 if(choice1==1)
				 new Project1().meth1();
			 else if(choice1==0)
			 {
				 Scanner sc=new Scanner(System.in);
				 System.out.println("enter your name:");
				 String name=sc.nextLine();
				 System.out.println("enter your mobile number");
				 String mobile=sc.nextLine();
				 
				 System.out.println("");
				 System.out.println("          "+"ORGANIC SUPERMARKET"+"          ");
				 System.out.println("*********************************************");
				 System.out.println("             "+"CASH RECEIPT"+"              ");
				 System.out.println("*********************************************");
				 System.out.println("DESCRIPTION"+"     "+"quantity"+"    "+"PRICE");
				 System.out.println("-----------"+"     "+"--------"+"    "+"-----");
				 new Project1().meth8();
			     new Project1().meth9();
			     new Project1().meth10();
			     new Project1().meth11();
			     new Project1().meth12();
			     new Project1().meth13();
			     new Project1().meth14();
			     new Project1().meth15();
			     new Project1().meth16();
			     new Project1().meth17();
			     new Project1().meth18();
			     new Project1().meth19();
			     new Project1().meth20();
			     new Project1().meth21();
			     new Project1().meth22();
			     new Project1().meth23();
			     
			 
				 bill=bill1+bill2+bill3+bill4+bill5+bill6+bill7+bill8+bill9+bill10+bill11+bill12+bill13+bill14+bill15+bill16;
				 System.out.println("                          "+"----------");
				 System.out.println("                           "+" "+bill+" ");
				 System.out.println("                          "+"----------");
				 System.out.println("----------------------------------------------");
				 System.out.println("NAME : "+name);
				 System.out.println("MOBILE : "+mobile);
				 if(bill>1000&&bill<2000)
				 {
					 System.out.println("you got a discount of 5%");
					 float discount =5;
					 bill=bill-(discount/100)*bill;
					 System.out.println("you saved an amnt : "+(discount/100)*bill);
					 System.out.println("===========================================");
					 System.out.println("");
					 System.out.println("YOUR FINAL BILL IS :"+" "+bill);
					 System.out.println("");
					 System.out.println("===========================================");
				 }
				 else if(bill>2000&&bill<3500)
				 {

					 System.out.println("you got a discount of 7%");
					 float discount =7;
					 bill=bill-(discount/100)*bill; 
					 System.out.println("you saved an amnt : "+(discount/100)*bill);
					 System.out.println("===========================================");
					 System.out.println("");
					 System.out.println("YOUR FINAL BILL IS :"+" "+bill);
					 System.out.println("");
					 System.out.println("===========================================");
				 }
				 else if(bill>3500)
				 {
					 System.out.println("you got a discount of 10%");
					 float discount =10;
					 bill=bill-(discount/100)*bill;
					 System.out.println("you saved an amnt : "+(discount/100)*bill);
					 System.out.println("");
					 System.out.println("===========================================");
					 System.out.println("YOUR FINAL BILL IS"+" "+bill);
					 System.out.println("");
					 System.out.println("===========================================");
				 }
				 else if(bill<1000)
				 {
					 System.out.println("===========================================");
					 System.out.println("");
				 System.out.println("YOUR FINAL BILL IS "+" "+bill);
				 System.out.println("===========================================");
				 System.out.println("");
		 }}
			 else
			 {
				 System.out.println("please chooce correct choice");
			     new Project1().meth7();
			 
			 }
		 }
		 void meth8()
		 {
			 if(count1>0)
				 System.out.println("Mangoes(kgs)"+"     "+kgsa1+ "          "+bill1);
		 }
		 void meth9()
		 {
			 if(count2>0)
				 System.out.println("apples(kgs)"+"      "+kgsa2+ "          "+bill2);
		 }
		 void meth10()
		 {
			 if(count3>0)
				 System.out.println("papaya(kgs)"+"      "+kgsa3+ "          "+bill3);
		 }
		 void meth11()
		 {
			 if(count4>0)
				 System.out.println("grapes(kgs)"+"      "+kgsa4+ "          "+bill4);
		 }
		 void meth12()
		 {
			 if(count5>0)
				 System.out.println("potato(kgs)"+"      "+kgsa5+"          "+bill5);
		 }
		 void meth13()
		 {
			 if(count6>0)
				 System.out.println("chilli(kgs)"+"      "+kgsa6+"          "+bill6);
		 }
		 void meth14()
		 {
			 if(count7>0)
				 System.out.println("carrots(kgs)"+"     "+kgsa7+"          "+bill7);
		 }
		 void meth15()
		 {
			 if(count8>0)
				 System.out.println("brinjal(kgs)"+"     "+kgsa8+"          "+bill8);
		 }
		 
		 void meth16()
		 {
			 if(count9>0)
				 System.out.println("pants"+"            "+pants1+"          "+bill9);
		 }
		 void meth17()
		 {
			 if(count10>0)
				 System.out.println("shirts"+"           "+shirts1+"          "+bill10);
		 }
		 void meth18()
		 {
			 if(count11>0)
				 System.out.println("tshirts"+"          "+tshirts1+"          "+bill11);
		 }
		 void meth19()
		 {
			 if(count12>0)
				 System.out.println("lowers"+"           "+lowers1+"          "+bill12);
		 }
		 void meth20()
		 {
			 if(count13>0)
				 System.out.println("biscuits"+"         "+biscuits1+"          "+bill13);
		 }
		 void meth21()
		 {
			 if(count14>0)
				 System.out.println("cooldrinks"+"       "+cooldrinks1+"          "+bill14);
		 }
		 void meth22()
		 {
			 if(count15>0)
				 System.out.println("chocolates"+"       "+chocolates1+"          "+bill15);
		 }
		 void meth23()
		 {
			 if(count16>0)
				 System.out.println("chips"+"            "+chips1+"          "+bill16);
		 }
		 public static void main(String[] args) {
			Project1 obj=new Project1();
			obj.meth1();
			System.out.println("");
			System.out.println("THANK YOU VISIT AGAIN");
			
	}
	}

