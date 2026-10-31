/*
RedundantModifier
jdkVersion = (default)22
tokens = (default)METHOD_DEF, VARIABLE_DEF, ANNOTATION_FIELD_DEF, INTERFACE_DEF, \
         CTOR_DEF, CLASS_DEF, ENUM_DEF, RESOURCE, ANNOTATION_DEF, RECORD_DEF, \
         PATTERN_VARIABLE_DEF, LITERAL_CATCH, LAMBDA


*/

// non-compiled with javac: Compilable with Java25
// violation below 'Redundant 'public' modifier.'
public void myMethod() { }

void main() { }

public String toString() { return "x"; }

public int hashCode() { return 1; }

public boolean equals(Object other) { return false; }

// violation below 'Redundant 'public' modifier.'
public boolean equals(String other) { return false; }

// violation below 'Redundant 'public' modifier.'
public boolean equals(Object first, Object second) { return false; }

// violation below 'Redundant 'public' modifier.'
public boolean equals(Object... others) { return false; }

// violation below 'Redundant 'public' modifier.'
public boolean equals() { return false; }

class Helper {
    public void inner() { }
}
