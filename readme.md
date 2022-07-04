# Callback using Function/BiFunction

The main method instantiates a class with two useful methods. Then creates a Taco object and passes the methods via a lambda.

The methods are stored as Function<T,R> and BiFunction<T,U,R> as class variables. Whenever we want to use these methods we can call getXFunction(x) from the object. The object uses this.<storedFuncton>.apply(x) to call the Function. 

The BiFunction is more interesting as it needs two arguments. One supplied when called from Main and one that is stored in the Object. getXBiFunction(x,this.y);


