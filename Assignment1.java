public class Assignment1 {
    public static void main(String[] args) {

        // Using Java Data Types to describe myself
        String name = "Yu Nandar Hlaing";  // String data type
        int age = 25;                      // int data type
        double height = 5.1;               // double data type (in feet)
        char gender = 'F';                 // char data type
        boolean isStudent = true;          // boolean data type
        String hobby = "Coding and Music"; // another String
        long phoneNumber = 408888264L;  // long data type
        float weight = 48.5f;              // float data type (in kg)

        //float → 4 bytes (stores up to ~7 decimal digits)
        //double → 8 bytes (stores up to ~15 decimal digits)

        // Printing output
        System.out.println("---- About Myself ----");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + height + " feet");
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Gender: " + gender);
        System.out.println("Student: " + isStudent);
        System.out.println("Hobby: " + hobby);
        System.out.println("Phone Number: +" + phoneNumber);

        
        // ------------------------------
        //  Operators
        // ------------------------------

        int x = 10, y = 5;

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("x + y = " + (x + y));   // Addition
        System.out.println("x - y = " + (x - y));   // Subtraction
        System.out.println("x * y = " + (x * y));   // Multiplication
        System.out.println("x / y = " + (x / y));   // Division
        System.out.println("x % y = " + (x % y));   // Modulus (remainder)

        // Relational (Comparison) Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("x > y  : " + (x > y));   // Greater than
        System.out.println("x < y  : " + (x < y));   // Less than
        System.out.println("x >= y : " + (x >= y));  // Greater than or equal
        System.out.println("x <= y : " + (x <= y));  // Less than or equal
        System.out.println("x == y : " + (x == y));  // Equal to
        System.out.println("x != y : " + (x != y));  // Not equal to

        // Logical Operators
        //boolean value (true / false) တွေကို တွဲသုံးပြီး အဖြေ true ဖြစ်မလား false ဖြစ်မလား ဆုံးဖြတ်ပေးတာ။
        boolean a = true, b = false;
        System.out.println("\n--- Logical Operators ---");
        System.out.println("a && b = " + (a && b));  // AND သတ်မှတ်ထားတဲ့ condition နှစ်ခုလုံး true ဖြစ်မှသာ အဖြေ true ဖြစ်မယ်။
        System.out.println("a || b = " + (a || b));  // OR Condition တစ်ခုခု true ဖြစ်ရုံနဲ့ အဖြေ true ဖြစ်မယ်။
        System.out.println("!a = " + (!a));          // NOT Value ကို ပြောင်းလဲပေးတာ။

        // Assignment Operators
        System.out.println("\n--- Assignment Operators ---");
        int z = 10; //z ဆိုတဲ့ Variable မှာ 10 ကို သတ်မှတ် (assign) လုပ်ထားတာပါ။
        z += 5;  // same as z = z + 5
        System.out.println("z += 5 : " + z);
        z -= 3;  // same as z = z - 3
        System.out.println("z -= 3 : " + z);
        z *= 2;  // same as z = z * 2
        System.out.println("z *= 2 : " + z);
        z /= 4;  // same as z = z / 4
        System.out.println("z /= 4 : " + z);

        // Unary Operators
        // Variable တစ်ခုထဲကို ၁ တိုး (increment) သို့မဟုတ် ၁ လျော့ (decrement) လုပ်ပေးနိုင်တဲ့ operator တွေပါ။
        System.out.println("\n--- Unary Operators ---");
        int num = 5;
        System.out.println("num = " + num);
        System.out.println("++num = " + (++num));  // Pre-increment ++num ဆိုတာ ပထမ 1 တိုးပြီး (6), ပြီးမှ အဖြေကိုပြမယ်။ output6
        System.out.println("num++ = " + (num++));  // Post-increment num++ အရငအဖြေကိုပြမီးမှ နောက်ပိုင်း တိုးမယ်။ output6, num7
        System.out.println("num after post-increment = " + num); //num7
        System.out.println("--num = " + (--num));  // Pre-decrement --num 1 ဆိုတာ လျော့ပြီး (6) , ပြီးမှ အဖြေကိုပြမယ်။ output6
        System.out.println("num-- = " + (num--));  // Post-decrement num-- အရငအဖြေကိုပြမီးမှ နောက်ပိုင်း 1 လျော့ output 6 ,num5
        System.out.println("num after post-decrement = " + num); //num 5

        //Ternary Operators (?:)
        //if...else ကို အတိုချုံးရေးနိုင်တဲ့ Operator
        System.out.println("\n--- Ternary Operators ---");
        int myage = 20;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Age " + myage + " => " + result);

        //Bitwise Operators (&, |, ^, ~)
        //binary level (bits) တွေကို ဆောင်ရွက်ပေးတဲ့ Operators
        System.out.println("\n--- Bitwise Operators ---");
        int c = 5;   // (binary 0101)
        int d = 3;   // (binary 0011)

        System.out.println("c & d = " + (c & d));  // AND (0001) => 1
        System.out.println("c | d = " + (c | d));  // OR  (0111) => 7
        System.out.println("c ^ d = " + (c ^ d));  // XOR (0110) => 6
        System.out.println("~c = " + (~c));        // NOT => -(c+1) = -6

        //Shift Operators (<<, >>, >>>)
        //Bits ကို ဘယ်ဘက် (left) သို့မဟုတ် ညာဘက် (right) တစ်ချို့ရွှေ့ပေးတာ
        System.out.println("\n--- Shift Operators ---");
        int e = 8;  // binary 0000 1000

        System.out.println("e << 1 = " + (e << 1));   // left shift (10000) = 16 ( 8 * (1*2))
        System.out.println("e >> 1 = " + (e >> 1));   // right shift (0100) = 4 (8 / (1*2))
        System.out.println("e >>> 1 = " + (e >>> 1)); // unsigned right shift = 4 0000 0100 ညာဘက်ကို shift လုပ်တယ်၊ Sign bit ကို မထိန်းဘဲ (always add 0 on left) သုံးတယ်။

        //instanceof Operator
        //Object တစ်ခုက Class တစ်ခုနဲ့ အဆက်အသွယ် ရှိ/မရှိ စစ်ပေးတာ

        //class Animal {}
        //class Dog extends Animal {}
        //
        //public class OperatorsExample {
        //    public static void main(String[] args) {
        //        Animal a = new Dog();
        //
        //        // instanceof Operator
        //        System.out.println("a instanceof Dog: " + (a instanceof Dog));      // true
        //        System.out.println("a instanceof Animal: " + (a instanceof Animal));// true
        //        System.out.println("a instanceof String: " + (a instanceof String));// false
        //    }
        //}


    }
}
