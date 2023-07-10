@main def init() = {
    /* calculate discount price for a book */
    def calculateDiscountPrice(book_price: Double, discount: Double): Double = book_price * (1 - discount)

    /* calculate total price with discount for n books */
    def calculateTotalBooksPrice(book_price: Double, num_books: Double, discount: Double = 0): Double = num_books * calculateDiscountPrice(book_price, discount);

    /* calculate total shipping price */
    def calculateShippingPrice(num_books: Int, shipping_cost: Double, additional_shipping_cost: Double): Double =  if (num_books <= 50) shipping_cost else (num_books - 50) * additional_shipping_cost + shipping_cost;

    /* calculate total price */
    def calculateTotalPrice(book_price: Double, num_books: Int, discount: Double, shipping_cost: Double, additional_shipping_cost: Double) = calculateTotalBooksPrice(book_price, num_books, discount) + calculateShippingPrice(num_books, shipping_cost, additional_shipping_cost);

    print("Total wholesale cost for " + 60 + " is Rs." + calculateTotalPrice(book_price = 24.95, num_books = 60, discount = 0.4, shipping_cost = 3, additional_shipping_cost = 0.75));
    
}