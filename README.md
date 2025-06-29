# 🧵 Java Multithreading Concepts

This repository contains Java programs demonstrating **Multithreading** using both:

- Extending the `Thread` class
- Implementing the `Runnable` interface

These examples show how to run tasks concurrently in Java using multiple threads.

---

## 📂 Program Descriptions

### 1. 🚀 `ThreadUsingExtendingThreadClass.java`
**Concept:** Extending `Thread` Class  
**Description:**  
Defines two classes (`MyThread1` and `MyThread2`) that extend the `Thread` class and override the `run()` method. Both threads are started using the `start()` method to execute simultaneously.

---

### 2. 🔧 `ThreadUsingRunnableInterface.java`
**Concept:** Implementing `Runnable` Interface  
**Description:**  
Defines two classes (`MThread1` and `MThread2`) that implement the `Runnable` interface. Thread objects are created by passing these runnable instances to the `Thread` constructor.

---

### 3. 📌 `ConstructoraFromThread.java`
**Concept:** Thread Naming and ID  
**Description:**  
Demonstrates how to assign thread names using `Thread(String name)` constructor and how to fetch:
- Thread ID using `getId()`
- Thread Name using `getName()`

---

### 4. 📌 `ThreadPriorities.java`
**Concept:** Thread Priorities  
**Description:**  
Multiple threads are created with different priorities using:
- `Thread.MIN_PRIORITY`
- `Thread.MAX_PRIORITY`  
This shows how thread priorities can influence scheduling (though final behavior depends on OS and JVM).

---

### 5. 📌 `ConstructorFromThread2.java`
**Concept:** Runnable with Thread Constructor  
**Description:**  
Illustrates creating a thread using a `Runnable` object and naming it through `Thread(Runnable r, String name)`. Also logs:
- Thread name
- Thread ID

---

## ✅ Concepts Covered

- ✅ Java Threads & Concurrency
- ✅ `Thread` Class
- ✅ `Runnable` Interface
- ✅ Overriding `run()` Method
- ✅ Using `start()` to Begin Threads
- ✅ Basic Loop-Based Execution in Threads
- ✅ Thread constructor with name
- ✅ Getting thread name and ID
- ✅ `Runnable` interface for multithreading
- ✅ Thread priorities
- ✅ `start()` vs `run()` behavior

---
