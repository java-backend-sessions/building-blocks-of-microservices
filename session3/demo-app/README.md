# Install Spring Boot CLI using Scoop (Windows)

This guide will help you install **Spring Boot CLI** on **Windows** using **Scoop**, a command-line installer for Windows.

---

## 🛠️ Prerequisites

- Windows PowerShell
- Internet connection

---

## 🚀 Step-by-Step Installation

### 1. Open PowerShell (as Administrator)

Search for PowerShell in the Start Menu, right-click, and choose **"Run as Administrator"**.

### 2. Install Scoop (if not already installed)

```powershell
Set-ExecutionPolicy RemoteSigned -Scope CurrentUser
irm get.scoop.sh | iex
```

### 3. Add the Scoop `apps` bucket

This bucket contains the Spring Boot CLI:

```powershell
scoop bucket add apps
```

### 4. Install Spring Boot CLI

```powershell
scoop install springboot
```

---

## ✅ Verify Installation

Run the following command to verify the installation:

```powershell
spring --version
```

You should see output similar to:

```
Spring CLI v3.x.x
```

---

## ⚙️ Example Usage

Create a new Spring Boot project:

```powershell
spring init --dependencies=web,data-jpa `
  --groupId=com.example `
  --artifactId=demo-app `
  --build=maven demo-app
```

Navigate into the project directory:

```powershell
cd demo-app
```

Run the application:

```powershell
./mvnw spring-boot:run
```

---

## 📚 References

- [Spring Boot CLI Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-cli.html)
- [Scoop Installer](https://scoop.sh/)

---

Happy Coding! 🚀