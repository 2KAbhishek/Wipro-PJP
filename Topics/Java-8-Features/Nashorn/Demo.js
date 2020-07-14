function isPrime(num) {
    var prime = true;
    for (var i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            prime = false;
        }
    }
    return prime;
}
