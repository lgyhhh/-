package com.test.jacoco.test;

import static org.junit.Assert.assertEquals;

/**
 * Created by superZh on 2019/10/1.
 */

import org.junit.Test;
import com.test.jacoco.HelloWorld;

public class HelloWorldTest {
    @Test
    public void testMethod1() {
        HelloWorld hw = new HelloWorld();
        String a = hw.Method1();
        assertEquals("Hello World", a);
    }

    @Test
    public void testMethod2() {
        HelloWorld hw = new HelloWorld();
        int a = hw.Method2(2, 1);
        assertEquals(3, a);
    }
    
    @Test
    public void testMethod3() {
    	/**
    	 * TODO：finish the test function
    	 */
    	HelloWorld hw = new HelloWorld();

    	/*
    	int a = hw.Method3(6, -1, 1);
    	//(a>5&&b<0)||c>0 true
    	int b = hw.Method3(4,-1,-3);
    	//(a>5&&b<0)||c>0 false   a<5 && c<-2 true
    	int c = hw.Method3(-4,-1,-2);
    	//(a>5&&b<0)||c>0 false   a<5 && c<-2 false

    	int d = hw.Method3(4,1,1);
    	int e = hw.Method3(6,1,1);
    	int f = hw.Method3(-4,-1,-1);
    	int g = hw.Method3(6,2,-1);

    	*/
    	int a=hw.Method3(6,-1,-1);
    	int b=hw.Method3(5,0,1);
    	int c=hw.Method3(4,0,-3);
    	int d=hw.Method3(6,0,-1);
    	int e=hw.Method3(4,0,-1);
    	assertEquals(a,0);
    	assertEquals(b,0);
    	assertEquals(c,0);
    	assertEquals(d,0);
    	assertEquals(e,0);

    }
    /**
     * TODO: add the test function of other methods in HelloWorld.java
     */
    @Test
    public void testMethod4() {
        HelloWorld hw=new HelloWorld();
        int a=hw.Method4(0,0,0,0,0);//T
        assertEquals(a,0);
        int b=hw.Method4(5,5,5,5,5);//1.F  2.T:T F
        assertEquals(b,0);
        int c=hw.Method4(5,2,1,1,1);//1.F  2.T:F T
        assertEquals(c,0);
        int d=0;
        try {
            d=hw.Method4(4,0,1,1,0); //1.F 2.F:F F
        }catch (Exception e){
            assertEquals(d,0);
        }
        int f=0;
        try {
            f=hw.Method4(4,0,0,1,0); //1.F 2.F: F F
        }catch (Exception e){
            assertEquals(f,0);
        }

    }

    @Test
    public void testisTriangle() {
        HelloWorld hw=new HelloWorld();
        boolean a=hw.isTriangle(0,0,0);
        assertEquals(a,false);
        boolean b=hw.isTriangle(1,1,2);
        assertEquals(b,false);
        boolean c=hw.isTriangle(2,3,4);
        assertEquals(c,true);

        boolean d=hw.isTriangle(1,0,0);
        assertEquals(d,false);
        boolean e=hw.isTriangle(1,1,0);
        assertEquals(e,false);
        boolean f=hw.isTriangle(1,2,1);
        assertEquals(f,false);
        boolean g=hw.isTriangle(2,1,1);
        assertEquals(g,false);
    }

    @Test
    public void testisBirthday() {
        HelloWorld hw=new HelloWorld();

        boolean a=hw.isBirthday(0,0,0);
        assertEquals(a,false);
        boolean b=hw.isBirthday(2020,1,1);
        assertEquals(b,false);
        boolean c=hw.isBirthday(2019,0,1);
        assertEquals(c,false);
        boolean d=hw.isBirthday(2019,13,1);
        assertEquals(d,false);
        boolean e=hw.isBirthday(2019,12,0);
        assertEquals(e,false);
        boolean f=hw.isBirthday(2019,1,32);
        assertEquals(f,false);
        boolean g=hw.isBirthday(2019,4,31);
        assertEquals(g,false);
        boolean h=hw.isBirthday(2019,6,31);
        assertEquals(h,false);
        boolean i=hw.isBirthday(2019,9,31);
        assertEquals(i,false);
        boolean j=hw.isBirthday(2019,11,31);
        assertEquals(j,false);
        boolean k=hw.isBirthday(2000,2,30);
        assertEquals(k,false);
        boolean k1=hw.isBirthday(2008,2,30);
        assertEquals(k1,false);
        boolean k2=hw.isBirthday(2000,2,29);
        assertEquals(k2,true);
        boolean l=hw.isBirthday(2001,2,29);
        assertEquals(l,false);
        boolean l1=hw.isBirthday(2001,2,28);
        assertEquals(l1,true);
        boolean m=hw.isBirthday(2019,11,29);
        assertEquals(m,false);
        boolean n=hw.isBirthday(2019,10,2);
        assertEquals(n,false);
        boolean o=hw.isBirthday(2019,10,1);
        assertEquals(o,true);
        boolean p=hw.isBirthday(2019,9,1);
        assertEquals(p,true);
        boolean q=hw.isBirthday(2018,1,1);
        assertEquals(q,true);

    }

    @Test
    public void testminiCalculator() {
        HelloWorld hw=new HelloWorld();
        double a=hw.miniCalculator(2,1,'+');
        assertEquals(a,3,0.0);
        double b=hw.miniCalculator(2,1,'-');
        assertEquals(b,1,0.0);
        double c=hw.miniCalculator(2,1,'*');
        assertEquals(c,2,0.0);
        double d=hw.miniCalculator(2,1,'/');
        assertEquals(d,2,0.0);
        double e=hw.miniCalculator(2,0,'/');
        assertEquals(e,0,0.0);
        double f=hw.miniCalculator(2,1,')');
        assertEquals(f,0,0.0);
    }
}
