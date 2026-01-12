package com.jad;
import java.util.ArrayList;
import java.util.List;

public class Foo {
    private Bar bar;
    private List<Baz> bazs; 
    private Qux qux;
    private Corge corge;
    private List<Grault> graults;

    public Foo (Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
        this.bazs = new ArrayList<>();
        this.graults = new ArrayList<>();
    }

    public void addBaz (Baz baz) {
        this.bazs.add(baz);
    }

    public void addGrault (Grault grault) {
        this.graults.add(grault);
    }

    public Bar getBar () {
        return this.bar;
    }

    public List<Baz> getBazs () {
        return this.bazs;
    }

    public Qux getQux () {
        return this.qux;
    }

    public Corge getCorge () {
        return this.corge;
    }

    public void setCorge (Corge corge) {
        if (corge != null && corge != this.corge) {
            Corge oldCorge = this.corge;
            oldCorge.setFoo(null);
            this.corge = corge;
        }
    }

    public List<Grault> getGraults () {
        return this.graults;
    }
}
