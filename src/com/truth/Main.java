package com.truth;

import java.util.Scanner;

class Truth {

    Boolean conjunction(Boolean p, Boolean q)
    {
        return (p && q);
    }

    Boolean disjunction(Boolean p, Boolean q)
    {
        return (p || q);
    }

    Boolean exclusiveor(Boolean p, Boolean q)
    {
        return (p ^ q);
    }

    Boolean conditional(Boolean p, Boolean q)
    {
        return (!p || q);
    }

    Boolean biconditional(Boolean p, Boolean q)
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

        Truth t = new Truth();

        System.out.println("Conjunction of p and q is : "+t.conjunction(p, q));
        System.out.println("Disjunction of p and q is : "+t.disjunction(p, q));
        System.out.println("Exclusive OR of p and q is : "+t.exclusiveor(p, q));
        System.out.println("Conditional of p and q is : "+t.conditional(p, q));
        System.out.println("Biconditional of p and q is : "+t.biconditional(p, q));
    }

}