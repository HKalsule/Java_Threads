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

#### 🧠 What You Learn:
- How to create threads by extending the `Thread` class.
- Difference between `run()` and `start()`.
- How threads execute in parallel.

---

### 2. 🔧 `ThreadUsingRunnableInterface.java`
**Concept:** Implementing `Runnable` Interface  
**Description:**  
Defines two classes (`MThread1` and `MThread2`) that implement the `Runnable` interface. Thread objects are created by passing these runnable instances to the `Thread` constructor.

#### 🧠 What You Learn:
- How to create threads using the `Runnable` interface.
- Benefits of separating task logic from thread logic.
- Cleaner approach for multiple inheritance scenarios.

---

## ✅ Concepts Covered

- ✅ Java Threads & Concurrency
- ✅ `Thread` Class
- ✅ `Runnable` Interface
- ✅ Overriding `run()` Method
- ✅ Using `start()` to Begin Threads
- ✅ Basic Loop-Based Execution in Threads

---

## 📝 Output Example

```text
Thread1 is running
Thread2 is running
I am Runnable Thread 1
I am Runnable Thread 2
