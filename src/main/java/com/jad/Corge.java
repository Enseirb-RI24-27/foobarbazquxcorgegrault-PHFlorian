package com.jad;

public class Corge {
    private Foo foo; 

    public Corge (Foo foo) {
        this.foo = foo;
    }

    public Foo getFoo() {
        return this.foo;
    }

    public void setFoo (Foo foo) {
        if (foo != null && foo != this.foo) {
            Foo oldFoo = this.foo;
            oldFoo.setCorge(null);
        }
        this.foo = foo;
    }
}
