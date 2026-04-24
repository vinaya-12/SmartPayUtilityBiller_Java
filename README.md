 SmartPay Utility Biller (Java)

 Description

SmartPay is a console-based Java application that calculates utility bills (electricity/water) using progressive slab rates. It validates meter readings, applies tax, and generates a digital receipt.

---

 Features

* Slab-based billing system
* Custom exception handling
* Interface-based design
* Input validation
* Continuous execution loop until user exits

---

 Concepts Used

* OOP (Classes, Interfaces, Abstraction)
* Custom Exceptions
* Exception Handling (try-catch)
* Scanner for input
* Conditional logic

---

 Project Structure

```
SmartPay/
├── Billable.java
├── UtilityBill.java
├── InvalidMeterReadingException.java
└── SmartPayBiller.java
```

---

 How to Run

```bash
javac *.java
java SmartPayBiller
```

---

 Sample Output

```
DIGITAL RECEIPT
Customer Name   : Vinaya
Units Consumed  : 200
Base Amount     : Rs.300.0
Tax (5%)        : Rs.15.0
Final Amount    : Rs.315.0
```

---


 Key Learning

Implemented clean architecture using interfaces and custom exceptions while maintaining separation of concerns.
