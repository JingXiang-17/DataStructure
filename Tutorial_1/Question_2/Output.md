# Output:
```
(2) Invoke Employee's overloaded constructor
(3) Performs Employee's tasks 
(4) Performs Faculty's tasks
```
## Explanations:
```
In the main method, a Faculty object is created using the "new" keyword, hence the Faculty() constructor is called. Since there is neither
"super()" nor "this()" keyword calling other constructors, an implicit super(); is inserted to the first line of the constructor, calling
non argument constructor from parent class, public Employee(). Inside the Employee() constructor, this("(2) Invoke Employee's overloaded
constructor"); keyword calls another constructor within its class , passing the String into public Employee (String s) constructor and print
the String. After that, the execution is back to the non-argument constructor of Employee class, prints "(3) Performs Employee's tasks ".
Lastly, the execution is back to the Faculty() constructor, prints "(4) Performs Faculty's tasks".
```
