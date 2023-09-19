package org.example;

public class CalculatingSum {
    public int calculating(int a, int b, int n, int m) {
        int c = 2;
        int result = 0;
        if (n <= a) {
            throw new IllegalArgumentException("Помилка a<=n");
        }
        if (m <= b) {
            throw new IllegalArgumentException("Помилка b<=m");
        }
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                if (i == c){
                    throw new IllegalArgumentException("Помилка, /0");
                }
                result = result + (i + j) / (i - c);
            }
        }
        return result;
    }
}