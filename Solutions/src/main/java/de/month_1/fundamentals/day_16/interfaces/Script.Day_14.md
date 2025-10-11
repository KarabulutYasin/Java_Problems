# Script Interfaces

## Table of Contents

- [What are Interfaces?](#what-are-interfaces)
- [Why use Interfaces?](#why-use-interfaces)
- [Defining an Interface](#defining-an-interface)
- [Implementing an Interface](#implementing-an-interface)
- [Default Methods](#default-methods)
- [Examples](#examples)

### What are Interfaces?

<details>
    <summary>Definition</summary>

Interfaces are contracts that define methods without implementing them. Classes that implement an interface must provide the method implementations.

Technically, it’s a "pure abstract class".
</details>
### Why use Interfaces?

<details> 
    <summary>Purpose</summary>

Interfaces allow you to define common behavior for different classes. They support abstraction and make code more flexible and testable. 
</details>

### Defining an Interface

<details> 
    <summary>Syntax</summary>

An interface is defined using the `interface` keyword. All methods are public and abstract by default.

```java
public interface Animal {
    void makeSound();
}
```

</details>

### Implementing an Interface

<details>
    <summary>How to implement</summary>

A class uses the `implements` keyword to provide implementations for the interface methods.

```java
public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}
```

</details>

### Default Methods

<details>
    <summary>Default Methods</summary>

Since Java 8, interfaces can have default methods with an implementation.

```java
public interface Animal {
    default void sleep() {
        System.out.println("Sleeping...");
    }
}
```

</details>

### Examples

<details>
    <summary>Usage Example</summary>

```java
Animal myDog = new Dog();
myDog.makeSound(); // Output: Woof!
myDog.sleep();     // Output: Sleeping...
```

</details>