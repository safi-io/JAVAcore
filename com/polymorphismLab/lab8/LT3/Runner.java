package com.polymorphismLab.lab8.LT3;

public class Runner {
    public static void main(String[] args) {
        Convert c1 = new f_to_c(1);
        Convert c2 = new l_to_g(1);
        Convert c3 = new f_to_m(1);
        c1.calculate();
        c2.calculate();
        c3.calculate();
    }
}
