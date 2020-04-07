package ge.itvet.equalsmethod;

public class Foo {
    private int variable;
    private String name;

    public Foo(int variable) {
        this.variable = variable;
    }

    public Foo(int variable, String name) {
        this.variable = variable;
        this.name = name;
    }

    public int getVariable() {
        return variable;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "variable=" + variable +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object anotherFoo) {
        boolean isFoo = anotherFoo instanceof Foo;
        if (!isFoo) return false; //
        Foo aFoo = (Foo) anotherFoo;// Cast casting

        boolean bothAreNull = this.name == null && aFoo.name == null;

        return this.variable == aFoo.variable
                && (bothAreNull || (this.name != null && this.name.equals(aFoo.name)));
    }
}
