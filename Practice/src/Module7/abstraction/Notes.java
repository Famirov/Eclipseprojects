package Module7.abstraction;

/*Abstraction 
  
  concept that allows us to hide the implementation of a method
  focus on what the method does, not how it does it
 
  implementation: the code, the actions the method do
 
  Abstraction cannot exist without inheritance
 
  How to achieve abstraction in java?
  
  1)abstract class
  2)interface
  
  
  Abstract class:
  
  A class that uses the keyword abstract
  public abstract class hello{
  }
 
  able to defined abstract methods
  not able to create objects of this class
  
  Q: Can you create an object of a abstract class,even if there is no abstract methods created?
  
  A: No, abstract class can never create objects of it 
  
  Q: Can you have non-abstract methods in abstract classes?
  
  A: Yes, you can define any number of abstract or non-abstract methods (such as Instance or static).
  
  
  Abstract method:
  
  A method without any implementation (no code body)
  
  
  public abstract void eat();
  
  
  concrete class (normal class):
  
  first non-abstract class that inherits abstract methods
  
  the concrete classes must implement all abstract methods
  
 */
