public class Main {
    public static void main(String[] args) {
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        System.out.println(cars[1]);
//
        int[] myNum = {10, 20, 30, 40, 20, 10, 30};
//        System.out.println(myNum[0]);
//        myNum[0]=15; //{15, 20, 30, 40}
//        System.out.println(myNum[0]);
//        myNum[5]=20;

            String [] cars = new String[4];  // String [null,null,null,Null,Null]
            cars[0] = "Volvo";
            cars[1] = "BMW";
            cars[2] = "Ford";
            cars[3] = "Mazda";

//        System.out.println(cars.length);

//        String car = cars[cars.length-1];
//        System.out.println(car);
        System.out.println(cars[cars.length-1]);

//        for (int i = 0; i < cars.length; i++) {
//            System.out.println(cars[i]);
//        }

//        for (int i = 0; i < myNum.length; i++) {
//            myNum[i] = myNum[i] * 10;
//        }
//
//        for (int i = 0; i < myNum.length; i++) {
//            System.out.println(myNum[i]);
//        }


//        int x =5;
//        String greeting = "Hello";
////        System.out.println(greeting.length());
////        greeting = greeting.toLowerCase();
//        System.out.println(greeting.toLowerCase());

        String myString = "Hello WoRLd";
        String lowerCaseString = myString.toLowerCase();
        int indexOf =  lowerCaseString.indexOf("world");
        System.out.println(indexOf);
        
//        System.out.println(myString.toLowerCase().indexOf("world"));
}
}
