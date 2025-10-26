#include <stdio.h>


int gcd(int a, int b) {
    if (b == 0)
        return a;
    return gcd(b, a % b);
}

long long modExp(long long base, long long exp, long long mod) {
    long long result = 1;
    base = base % mod;
    while (exp > 0) {
        if (exp % 2 == 1)
            result = (result * base) % mod;
        base = (base * base) % mod;
        exp = exp / 2;
    }
    return result;
}

int main() {
    int p, q, m;
    printf("Enter two prime numbers (p and q): ");
    scanf("%d %d", &p, &q);

    int n = p * q;
    int phi = (p - 1) * (q - 1);

    printf("Enter message as an integer (m) less than %d: ", n);
    scanf("%d", &m);

    int e;
    for (e = 2; e < phi; e++) {
        if (gcd(e, phi) == 1)
            break;
    }

    int d;
    for (d = 2; d < phi; d++) {
        if ((e * d) % phi == 1)
            break;
    }

    printf("Public Key: (e=%d, n=%d)\n", e, n);
    printf("Private Key: (d=%d, n=%d)\n", d, n);

    long long c = modExp(m, e, n);
    printf("Encrypted message: %lld\n", c);

    long long decrypted_m = modExp(c, d, n);
    printf("Decrypted message: %lld\n", decrypted_m);

    return 0;
}
