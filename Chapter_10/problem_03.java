// 3. What is the order of constructor execution for the following inheritance hierarchy:
// Base > Derived1 > Derived2
// Derived2 obj = new Derived2();
// Which constructor will be executed & in which order?

/* ANSWER: Constructor Execution Order:  Base → Derived1 → Derived2
This is because the constructor of Derived2 will first call the constructor of its parent (Derived1), which in turn calls its parent’s constructor (Base), and only after all parent constructors have executed does the child constructor complete. */