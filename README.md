# 🌿 First Spring Project – Core & IoC Basics

A simple yet powerful project to understand the **Spring Core Framework** and how **Dependency Injection (DI)** works using `BeanFactory` and `ApplicationContext`.

---

## 📦 Project Structure

```
First_Spring_Project/
├── src/
│   ├── com.sit.client/
│   │   ├── TestUsingCoreContainer.java     # Uses BeanFactory
│   │   └── TestUsingIocContainer.java      # Uses ApplicationContext
│   ├── com.sit.model/
│   │   └── Student.java                    # Spring Bean
│   └── beans.xml                           # XML-based bean configuration
├── Spring_Jar/                             # Spring library JARs
```

---

## ✨ Key Highlights

- 📗 **Spring Core Module** usage
- ⚙️ Demonstrates both `BeanFactory` & `ApplicationContext`
- 🧑‍🎓 `Student` bean created and injected using XML
- 🛠 XML-based configuration (`beans.xml`)

---

## 🧪 How to Run

1. 📥 Clone or download the repository
2. 🔗 Add Spring JARs in the `Spring_Jar` folder to the classpath
3. 🧾 Configure and inspect `beans.xml`
4. ▶️ Run `TestUsingCoreContainer` or `TestUsingIocContainer` to test

---

## 🚀 Output Example

```
Student Details:
ID: 101
Name: Gayatri
Email: gayu@gmail.com
```

---

## 💡 Learning Goals

- Understand **Spring’s IoC container** basics
- Learn about **bean definition & lifecycle**
- Explore difference between **BeanFactory** and **ApplicationContext**

---

## 🛠 Tech Stack

- Java 21 ☕
- Spring Core Framework 🌸
- Eclipse IDE 💻
- XML Configuration 📄

---

## 🙋‍♂️ Author

Made with ❤️ by Rutika Chaugale – diving into Spring Framework fundamentals.

---

## 📌 Tags

`#Spring` `#Java` `#SpringCore` `#DI` `#IoC` `#XMLConfiguration`

