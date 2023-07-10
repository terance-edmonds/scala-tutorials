@main def init () = {
    var k, i, j: Int = 2;
    var m, n: Int = 5;
    var f: Float = 12.0f;
    var g: Float = 4.0f;
    var c: Char = 'X';

    def q_a () = k + 12 * m; // Answer: 62

    def q_b () = m / j; // Answer: 2

    def q_c () = n % j; // Answer: 1

    def q_d () = m / j * j; // Answer: 4

    def q_e () = f + 10 * 5 + g; // Answer: 66.0

    def q_f () = {
        i += 1;
        i * n;
    }; // Answer: 15

    println("a) " + q_a());
    println("b) " + q_b());
    println("c) " + q_c());
    println("d) " + q_d());
    println("e) " + q_e());
    println("f) " + q_f());
}