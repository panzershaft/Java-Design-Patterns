## What is Proxy pattern ?
- Proxy pattern is a structural design pattern which allows you to use a proxy object i.e.
  a simplified, light-weight version of the real object.

- A proxy object can perform same tasks as an original object, but may delegate requests
  to the original object to achieve them.
  
- The proxy class warps the real subject class i.e. the reference to the real class is hidden
  in the proxy class. The client interacts with the proxy object instead of the real-object.
  
- Three most common scenarios of proxy-class use:
    - **virtual proxy**: This is when proxy class is used in place of the real class that is 
      resource intensive to instantiate. This is commonly used in web pages or graphic editors,
      as a high definition image maybe very large to load.
      
    - **protection proxy**: This is when proxy class is used to control access to the real class.
      Example allowing clients to only access certain information because of virtual proxy.
      
    - **remote proxy**: This is when the proxy class is local, and the real class is remote.
      Google Docs uses this, where web-servers have all the objects it needs locally, which
      also exists on a Google server somewhere else.


## Blue-print to implement Facade Method
- **Design the interface**: Create the interface that client software will use to interact with 
  your system, the proxy must follow this interface as well along with the real class.


- **Implement the real class**: The actual real class of the system which has the business logic.


- **Implement the proxy class**: This facade class will wrap the classes that implement
  the interface, will have a reference to the real class.
  

- **The client class**: Client class that uses the proxy class.

  
## Why to use it ?
- Let's say you have a massive object which takes a lot of system resources. You need to instantiate it
  from time to time but not always.
  
- The proxy class with the same interface as the real class, then you can use proxy class instead in cases
  where you need to execute something either before or after the real class is instantiated. 

 