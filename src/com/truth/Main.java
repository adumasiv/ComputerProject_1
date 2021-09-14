package com.truth;

import java.util.Scanner;

class Truth {

    static Boolean conjunction(Boolean p, Boolean q)
    {
        return (p && q);
    }

    static Boolean disjunction(Boolean p, Boolean q)
    {
        return (p || q);
    }

    static Boolean exclusiveor(Boolean p, Boolean q)
    {
        return (p ^ q);
    }

    static Boolean conditional(Boolean p, Boolean q)
    {
        return (!p || q);
    }

    static Boolean biconditional(Boolean p, Boolean q)
    {
        return p == q;
    }

    public static void main(String[] args) {
        Boolean p,q;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter proposition p: ");
        p = sc.nextBoolean();
        System.out.println("Enter proposition q: ");
        q = sc.nextBoolean();

        System.out.println("Conjunction of p and q is : "+conjunction(p, q));
        System.out.println("Disjunction of p and q is : "+disjunction(p, q));
        System.out.println("Exclusive OR of p and q is : "+exclusiveor(p, q));
        System.out.println("Conditional of p and q is : "+conditional(p, q));
        System.out.println("Biconditional of p and q is : "+biconditional(p, q));
    }

}