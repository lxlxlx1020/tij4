package net.mindview.generics;//: generics/MultipleInterfaceVariants.java
// {CompileTimeError} (Won't compile)

interface Payable<T> {}

//class Employee implements Payable<Employee> {}

class Hourly extends Employee
  implements Payable<Hourly> {} ///:~

