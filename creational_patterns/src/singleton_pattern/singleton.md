/*
## What does it do ?

1. Singleton pattern is a creational pattern which mandates use of just one object for a class,
   during the entirety of the software life.
2. This object is then exposed globally for other objects to use.

## Blue-print to implement Singleton

1. Make the default constructor as private, to prevent new objects to be created.
2. Create a static method that calls the private constructor to create object, only if one already does not exist.

## When to use it ?

In use-cases where you have common data which is shared by various aspects of your program,
ex: a single database object shared by different objects.

## Pros

1. Only one instance of a class guaranteed.
2. Global access point of that instance

## Cons

1. Violates the single-responsibility principle
2. Possibility of issues arising in multi-threaded environments, in-cases where multiple threads create several
   singleton objects.
3. Unit-testing can be difficult, in-case you are testing the functions using singleton-objects separately the
   the test will fail as just one object created by the first test will be used, this may cause the next texts
   to fail.

*/