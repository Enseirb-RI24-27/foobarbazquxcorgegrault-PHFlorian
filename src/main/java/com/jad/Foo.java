package com.jad;
import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Bar> barzs; 
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo (Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
        this.barzs = new ArrayList<>();
        this.graults = new ArrayList<>();
    }

    public void addBaz (Baz baz) {
        this.barzs.add(bar);
    }

    public void addGrault (Grault grault) {
        this.graults.add(grault);
    }

    public Bar getBar () {
        return this.bar;
    }

    public List<Bar> getBazs () {
        return this.barzs;
    }

    public Qux getQux () {
        return this.qux;
    }

    public Corge getCorge () {
        return this.corge;
    }

    public void setCorge (Corge corge) {
        this.corge = corge;
    }

    public List<Grault> getGraults () {
        return this.graults;
    }
}
