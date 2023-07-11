package aaa;

public class alloperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				

						// Data types
						
						// primitive
						
						byte t1=127;                 // 128 to 127 (inclusive).
						
						System.out.println("find the byte value: "+t1);
						
						
						short c3=32767;             // 32,768 to 32,767 inclusive
						
						System.out.println("find the short value:"+c3);
						
						
						
						int v1= 2147483647;       // 2,147,483,648 to 2,147,483,647 inclusive
						int v2=476326876;
						int v3=v1+v2;
						System.out.println(v3);
						
						
						long i3=7676676;         // 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (inclusive).
						long i4=666565765;
						long i5=i3+i4;
						System.out.println(i5);
						
					    
						float m5=48117373773.7878788889f;   // 1.4 x 10^-45 to 3.4 x 10^38. 
						float m4=873787382738723.7733f;
						float m7=m4+m5;
						System.out.println(m7);
						
						
						double n3=832322345.4837987329;   // 4.9 x 10^-324 to 1.8 x 10^308.
						double n4=87837871.72898337;
						double n6=n3+n4;
						System.out.println(n6);
						
						
						boolean o3=true;
						boolean o4=false;
						System.out.println("find the boolean true value:"+o3);
						
						char k4='d';
						System.out.println("find the char value:"+k4);
						
						
						// non primitive or derived
						
						
						String x1="Abinaya";
						String x2="karthick";
						System.out.println(x1+x2);
						
						
						
						
						
					// 8 operators are
					// 1) arithmetic operator, mathematical calculation
				  
						// addition +
						
						int a=8;
						int b=6;
						int c=a+b;
						c=a+b;
					System.out.println(c);
					
					// subtraction -
					
					int d=6;
					int e=4;
					int f=d-e;
					f=f-e;
					System.out.println(f);
					
					// multiplication *
					
					int g=9;
					int h=3;
					int i=g*h;
					i=g*h;
					System.out.println(i);
					
					// division /
					
					int j=2;
					int k=7;
					int l=j/k;
					l=j/k;
					System.out.println(l);
					
					// remainder %
					
					int m=4;
					int n=6;
					int o=m%n;
					o=m%n;
					System.out.println(o);
					
					
					// 2)Assignment operator, = assign the values to variables.
					
					int p=7;
					int q=5;
					
					int r12=p=q;                  // equal sign
					System.out.println(r12);
					
					int r=p+=q;                   // addition assignment
					System.out.println(r); 
					
					int r1=p-=q;                  // subtraction assignment
					System.out.println(r1);
					
					int r2=p*=q;                  // multiple assignment
					System.out.println(r2);
					
					int r3=p/=q;                  // divide assignment
					System.out.println(r3);
					
					int r10=p%=q;                 // remainder assignment
					System.out.println(r10);
					
					int r8=p&=q;                  // bitwise AND assignment
					System.out.println(r8);
					
		
					int r9=p|=q;                  // bitwise OR assignment
					System.out.println(r9);
					
					int r4=p^=q;                  // bitwise XOR assignment
					System.out.println(r4);
					
					int r5=p>>=q;                 // left shift assignment
					System.out.println(r5);
					
					int r6=p<<=q;                 // right shift assignment
					System.out.println(r6);
					
					int r7=p>>>=q;	              // unsigned right shift assignment
					System.out.println(r7);	
					
						
					// 3)Bitwise operator, perform bit level on integer data types.
					
					int s=4;                        
					int t=2;                             
					
					System.out.println(s>t&t<s);         // bitwise AND ,  if both condition true ,true
					
					System.out.println(s>t|t>s);     // bitwise OR , if one condition true, true
					
					System.out.println(s^t);         // XOR symbol
					
					System.out.println(~t);          // NOT symbol
					
					System.out.println(s<<t);        // left shift

					System.out.println(s>>t);        // right shift
					
					
					
					// 4)logical operator , logical operations on boolean values
					
					int u=8;
					int v=6;
					System.out.println(u>v && v<u);   // AND symbol if both condition true ,true
					
					System.out.println(u>v || v>u);   // OR symbol if one condition true , true
					
					boolean u1=true;
					System.out.println(!u1);       // NOT symbol ,if condition true , false
					
					
					// 5) relational operators, perform two values boolean values
					
					int w=6;
					int y=8;
					System.out.println(w==y);  // equal to 
					
					System.out.println(w!=y);  // not equal
					
					System.out.println(w<y);   // less than 
					
					System.out.println(w>y);   // greater than 
					
					System.out.println(w<=y);  // less than or equal to
					
					System.out.println(w>=y);  // greater than or equal to
					
					
					
					// 6) shift operator, bit level manipulation of integer data types
					
					int z=9;
					int z1=7;
					
					System.out.println(z<<6);   // lest shift , z*6^2
					
					System.out.println(z>>4);   // right shift , z/4^2
					
					System.out.println(z>>>2);  // unsigned right shift 
					
					
					// 7) ternary operator, using if-else statement also call conditional statement
					
					// <condition> ? <expression1> : <expression2>
					
					int a1=7;
					int b1=8;
					int c1=a1>b1?a1:b1;
					System.out.println(c1); 
					
					int time=12;
					String result=(time>5)?"AM":"PM";    // if-else statement
					String result1=(time<11)?"AM":"PM";
					System.out.println(result); 
					System.out.println(result1); 
					
					// 8) unary operator, on a single operand
					
					// increment 
					
					int a2=6;
					System.out.println(++a2);  // prefix
					System.out.println(a2++);  // post fix
					
					// decrement
					
					int b2=6;
					System.out.println(--b2);  // prefix
					System.out.println(b2--);  // post fix
					
					byte n1=7;
					byte n2=9;
					System.out.println(n1+n2);
					
					
					
					
					
				
				
				
				
				
				
			}

		}

		
		
		
		
		
		
		
		
		
