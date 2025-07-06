package others;

import java.math.BigInteger;
public class demo {
    int x=20; //instance variable
    public static void main(){
        System.out.println("this is my main");
    }
    public static strictfp void main(String []args){ //for same fractional calculation on all machines
        System.out.println("hello");
        main();
        byte b = (byte)130;
        char e = 'न';

        System.out.println(e);
        long l =10;
        System.out.println(b);

        //reference type
        BigInteger b1 = new BigInteger("1111111111111");
        BigInteger b2 = new BigInteger("1111111111111");
        System.out.println(b1.add(b2));

        int arr[]= {11,22,33};
        int a[] = new int[4];
        a[0]=1;

        //wrapper type
        Integer q = 130;
        System.out.println((q.byteValue()));
        Character cc = 'd';
        System.out.println((Character.isAlphabetic(cc)));
    }
}
/*
primitive/value based/immutable

reference/mutable
int x =x+10

string,biginteger
string s= 'd; string is class and is refrence varible of the object created i.e d,
object is data + methods/operations

 */