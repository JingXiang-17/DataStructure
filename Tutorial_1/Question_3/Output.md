# Output
```
a. AB
```
## Explanations
```
Object[] o = {new A(), new B()}; is an array creation contains instances of class A and class B. Since class A is inherited from class B, the public String toString () method is polymorphic, causes the toString() method of class A overrides toString method of class B.
```