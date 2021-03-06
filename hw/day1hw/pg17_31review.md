#Q: Explain how Java is both a language and a platform.

Java is a language with its own conventions, rules, and API. It's also a platform, because you can install it on any machine and run Java code you've written.

#Q: What are some of the advantages of using Java?

It's designed to be "easy" for professional devs and people with programming experience. Java is object-oriented, which makes sure the way you architect your applications and the way your code runs more structured. It was created on its own terms instead of designed to work with other source-code, is platform-agnostic thanks to the JVM, and checks errors at compile, not runtime.

#Q: What do we mean by portability?

The ability to run the same code on multiple/all machines.

#Q: If you compile with a Sun complier, you have to run with the Sun JVM. [T/F]

False.

#Q: Java offers "the best of both worlds" by providing all the capabilities of other languages, plus more.

False.

#Q: What is bytecode?

Bytecode is a series of instructions executed by the JVM. Java compiles to bytecode, not executable code. This allows Java programs to be platform-independent, as code compiles and runs on various JVMs, not the machines JVMs are installed on.

#Q: How does the JRE locate classes at runtime?

The JRE looks through the classpath for classes, a list of .jar files.

#Q: What is the starting point for every Java program?

Every Java application begins executing code by calling main().

#Q: What is your explanation of inheritance?

Humans have a gender and a name. There's a subset of this class called teenager, and a subset of that class called developer. Teenagers have an interest and favorite song. Developers have a favorite language and either like or dislike ice-skating (boolean).

Say there's a class whose gender is female and her name is Princess. She's a developer, whose superclasses are teenager and human. She's interested in stories, and her favorite song is Colors by Halsey, and these keys and values come from her being a teenager. Her favorite language is JavaScript and she likes ice-skating (true), which comes from being a developer.
