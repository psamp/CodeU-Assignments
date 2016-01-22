#Q: Define strongly-typed.

Everything in Java has a type, and those types are strictly defined. Variables alone can be everything from a double to a boolean. Changing types can cause your entire application to break or refuse to compile, depending on what your methods are expecting or returning.

#Q: Define conversion.

If you want to Java to do change a variable's type automatically, the two types in question have to be compatible and the destination type must be larger than the source type. (Int to Long, not the other way around. Numeric types are compatible, char and boolean are not.) If all these conditions are met, it's called widening conversion.

Else, it's narrowing conversion. If you want to change a variable from an int to the smaller byte, you must use a cast.

#Q: Define casting.

Casting is explicit type conversion. You're making the variable's value narrower (less) so it will fit within the intended target, meaning the original type will be reduced modulo by the target type's range.
