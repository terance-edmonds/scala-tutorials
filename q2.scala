@main def init () = {
   var m, n: Int = 5;
   var f: Float = 12.0f;
   var g: Float = 4.0f;

   var a: Int = 2;
   var b: Int = 3;
   var c: Int = 4;
   var d: Int = 5;
   var k: Float = 4.3f;

   def q_a () = -(-b) * a + c * d -(-1); // Answer: 27
   
   def q_b () = {
      val temp = a;
      a+= 1;
      temp;
   }; // Answer: 2
   
   def q_c () = -2 * ( g - k ) + c; // Answer: 4.6

   def q_d () = {
      val temp = c;
      c+=1;
      temp;
   } // Answer: 4

   def q_e () = {
      c+=1; // c = 6
      a+=1; // a = 4
      c *= a;
      c;
   } // Answer: 24

   println("a) " + q_a());
   println("b) " + q_b());
   println("c) " + q_c());
   println("d) " + q_d());
   println("e) " + q_e());
}