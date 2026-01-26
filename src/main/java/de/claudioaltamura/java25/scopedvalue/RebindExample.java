package de.claudioaltamura.java25.scopedvalue;

public class RebindExample {

   private static final ScopedValue<Integer> JAVA_VERSION = ScopedValue.newInstance();

    void main() {
        ScopedValue.where(JAVA_VERSION, 24).run(this::update);
    }

    public void update() {
        ScopedValue.where(JAVA_VERSION, JAVA_VERSION.get() + 1).run(() ->
            IO.println("Hello, Java " + JAVA_VERSION.get()) // prints 25
        );
    }
}