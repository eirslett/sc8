# Sc8 - Scala functions in Java 8

Using Scala libraries from Java 8 can be difficult, because Scala's functions are traits, and not
recognised as a FunctionalInterface by the Java compiler. Sc8 is a simple conversion library that
converts Java lambdas to Scala functions.

In your Java file, import F (and/or C):

`import static com.github.eirslett.sc8.Sc8.F;`

## Using the library

 What you have to do, is to wrap your lambda with F(...), for example:

 `result = someList.map(F(s -> s.toUpperCase()));`

 The F function converts the lambda into a Scala function for you.
 If your lambda returns void, use C instead:

 `myFuture.onSuccess(C(s -> System.out.println(s)));`

## Examples
 
 [Look at the tests](https://github.com/eirslett/sc8/blob/master/src/test/java/com/github/eirslett/sc8/Sc8Test.java) for more examples.

### Building
You need Java 8 and Maven to build this project. (Get Java 8 here: https://jdk8.java.net/download.html)

`$ mvn clean package`

If you don't want to install jdk8 globally, you can put it in a folder "jdk1.8.0" inside this project,
and build with the "localjdk" profile:

`$ mvn clean package -Plocaljdk`

## Generating sources
The Java and Scala sources are for the most part auto-generated, by the PHP-script "genfuncs.php".
To generate sources, you will need PHP. Run `$ php genfuncs.php` to generate.
