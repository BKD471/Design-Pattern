public class Main {
    public static void main(String[] args) {
        //String , Primitive, Wrapper
        ////////////////////Wrapper///////////////////
        //Number -->Integer,Float,Double,Byte,Short,Long
        //Boolean,Character
        //////////////////////////////////////////////
        //int,float,long,double,short,long,byte,boolean,char
        //////////////////////////////////////////////

        //STRING TO WRAPPER
        String s="127";String s1="true";
        String s2="hi";

        Integer I=Integer.valueOf(s);// string to wrapper class Integer
        Float F=Float.valueOf(s);// string to wrapper class Float
        Double D=Double.valueOf(s);// String to wrapper class Double
        Byte B=Byte.valueOf(s);//String to wrapper class Byte
        Short S=Short.valueOf(s);//String to wrapper class Short
        Long L=Long.valueOf(s);// String to wrapper class Long
        Character C=Character.valueOf('a');///  String cannot be casted to Character Wrapper type;
        Boolean  BL=Boolean.valueOf(s1);

        System.out.println(I);// string to wrapper class Integer
        System.out.println(F);System.out.println(D);System.out.println(B);System.out.println(S);System.out.println(L);
        System.out.println(C);System.out.println(BL);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //STRING  TO  PRIMITIVE
        String s3="126";String s5="true";String s6="hi";

        int a=Integer.parseInt(s3);float b=Float.parseFloat(s3);double c=Double.parseDouble(s3);
        byte d=Byte.parseByte(s3);short e=Short.parseShort(s3);long f=Long.parseLong(s3);
       // char g=Character.parseChar(s3);  this is not possible we cant parse string to char
        boolean g=Boolean.parseBoolean(s5);

        System.out.println(a);System.out.println(b);System.out.println(c);System.out.println(d);System.out.println(e);
        System.out.println(f);System.out.println(g);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //PRIMITIVE TO WRAPPER
        int in=47;float ff=56.0f;double dd=45.78d;long ll=47;
        byte bb=126;short ss=123;char cc='a';boolean bon=true;

        Integer II=Integer.valueOf(in);// int to wrapper class Integer
        Float FF=Float.valueOf(ff);// float to wrapper class Float
        Double DD=Double.valueOf(dd);// double to wrapper class Double
        Byte BB=Byte.valueOf(bb);//byte to wrapper class Byte
        Short SS=Short.valueOf(ss);//short to wrapper class Short
        Long LL=Long.valueOf(ll);// long to wrapper class Long
        Character CC=Character.valueOf(cc);///  char to wrapper class Character
        Boolean  BBL=Boolean.valueOf(bon);// boolean to wrapper class Boolean

        System.out.println(II);System.out.println(FF);System.out.println(DD);System.out.println(BB);System.out.println(SS);
        System.out.println(LL);System.out.println(CC);System.out.println(BBL);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //PRIMITIVE TO STRING

        String s8=Integer.toString(in);String s9=Float.toString(ff);String s10=Double.toString(dd);
        String s11=Byte.toString(bb);String s12=Short.toString(ss);String s13=Long.toString(ll);
        String s14=Character.toString(cc);String s15=Boolean.toString(bon);

        System.out.println(s8);System.out.println(s9);System.out.println(s10);System.out.println(s11);System.out.println(s12);
        System.out.println(s13);System.out.println(s14);System.out.println(s15);


        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //WRAPPER TO PRIMITIVE


        int i1=I.intValue(); float f1=F.floatValue(); double d1=D.doubleValue();
        byte b1=B.byteValue(); short ss1=S.shortValue(); long l1=L.longValue();
        char c1=C.charValue(); boolean bl1=BL.booleanValue();

        System.out.println(i1);System.out.println(f1);System.out.println(d1);System.out.println(b1);System.out.println(ss1);
        System.out.println(l1);System.out.println(c1);System.out.println(bl1);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //WRAPPER TO STRING

        String ss2=I.toString();String ss3=F.toString();String ss4=D.toString(); String ss5=B.toString();
        String ss6=S.toString(); String ss7=L.toString(); String ss8=C.toString(); String ss10=BL.toString();

        System.out.println(ss2);System.out.println(ss3);System.out.println(ss4);System.out.println(ss5);System.out.println(ss6);
        System.out.println(ss7);System.out.println(ss8);System.out.println(ss10);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }
}