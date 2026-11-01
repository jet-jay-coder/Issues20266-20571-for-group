/*
RedundantModifier
jdkVersion = (default)22
tokens = (default)METHOD_DEF, VARIABLE_DEF, ANNOTATION_FIELD_DEF, INTERFACE_DEF, \
         CTOR_DEF, CLASS_DEF, ENUM_DEF, RESOURCE, ANNOTATION_DEF, RECORD_DEF, \
         PATTERN_VARIABLE_DEF, LITERAL_CATCH, LAMBDA


*/

// non-compiled with javac: Compilable with Java25
void main() { }

public boolean equals(java.lang.Object other) { return false; }

public Object clone() { return null; }

public void finalize() { }

// violation below 'Redundant 'public' modifier.'
public Object clone(int value) { return null; }

// violation below 'Redundant 'public' modifier.'
public void finalize(int value) { }