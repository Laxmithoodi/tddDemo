public class test {
    int i;
    int j;
    public static void main(String[] args) {
        test t1 = new test();
        t1.i=200;
        t1.j=100;
        add(t1.i,t1.j);
        System.out.print(t1.i);
        System.out.print(t1.j);
    }

    public static void add(int i,int j) {
        i=i+100;
        j=j+100;
        System.out.print(i);
        System.out.print(j);

    }

}




//
//
//        int i;
//        int j;
//        public static void main(String[] args) {
//            test t1 = new test();
//            t1.i=200;
//            t1.j=100;
//            add(t1);
//            System.out.print(t1.i);
//            System.out.print(t1.j);
//        }
//
//        public static void add(test t) {
//            t.i=t.i+100;
//            t.j=t.j+100;
//            System.out.print(t.i);
//            System.out.print(t.j);
//
//        }





//int i;
//
//    public static void main(String[] args) {
//
//        test t1 = new test();
//        t1.i=100;
//
//        test t2 = new test();
//        t2.i =200;
//
//        test t3 = new test();
//        t3.i =300;
//
//        t1 =t3;
//        t3.i= 200 + t1.i; //300
//        System.out.println(t1.i); //100
//        t3 = new test();
//        t2 = t3;
//        System.out.println(t2.i);
//    }
//}
/**
    static int x=0;
    String name;
    boolean b;

    public static void main(String[] args) {


        test t1= new test();
       // x=x+10;

        t1.start();

    }

    public void start() {
        x++;
        System.out.println(x);
    }
}

**/


/**
    static int x=0;
    String name;
    boolean b;

    public static void main(String[] args) {
        test t1= new test();
        x=x+10;
        System.out.println(t1.b);
        t1.start();
        System.out.println(t1.b);
    }

    public void start() {
        x++;
        b=true;
        System.out.println(x);
    }
**/

