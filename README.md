# 🚀 Approval System

Approval System, şirket içi onay ve yetki yönetimi için tasarlanmış bir mikroservis tabanlı Spring Boot projesidir. Proje, bağımsız mikroservisler aracılığıyla yetki ve onay süreçlerini yönetir. Gateway yapısı sayesinde tüm servislere tek bir port üzerinden erişim sağlanır.

![Approval System Diyagramı](images/mm.jpg)


## 📁 Proje Yapısı

  Proje, aşağıdaki mikroservislerden oluşmaktadır:
- User Service - "Kullanıcı yönetimi."
- Role Service - "Roller ve yetkileri."
- Permission Service - "Yetki tanımları ve kontrolü."
- Group Service - "Kullanıcı grupları ve ilişkileri."
- Organization Service - "Organizasyon hiyerarşisi yönetimi."
- Gateway Service - "Tek bir port üzerinden erişim sağlayan API Gateway."

![Approval System Diyagramı](images/shema.jpg)


## 🛠 Teknolojiler ve Araçlar

- Spring Boot - "Mikroservis geliştirme."
- Spring Cloud Gateway - "API Gateway."
- PostgreSQL - "Veritabanı yönetimi."
- Maven - "Proje ve bağımlılık yönetimi."
- REST API - "Servisler arası iletişim."

## ⚙️ Kurulum

1. Projeyi klonlayın:
```bash
git clone <repo-link>
```
2. Bağımlılıkları yükleyin:
```bash
mvn clean install
```
3. PostgreSQL veritabanınızı oluşturun:
```bash
CREATE DATABASE approvaldb;  //approvaldb veritanımızın adı ,dilersek değiştirebiliriz ama servislerin içerisindeki ../src/main/resources/application.properties dosyasında da birtakım değişiklikler yapılmalı unutmayın..
```
4. Mikroservisleri başlatın:
```bash
mvn spring-boot:run
```
Her mikroservis kendi portunda çalışır.
5. Gateway servisini başlatın:
```bash
cd gateway
mvn spring-boot:run
```
Gateway varsayılan olarak http://localhost:8080 üzerinden erişilebilir.



## 📝 Kullanım
1. Kullanıcı ve rollerin eklenmesi:
```
POST /user
POST /role
```
2. Yetkilendirme kontrolleri ve organizasyon hiyerarşisi düzenlemeleri yapılabilir.


## 📘 API Dökümantasyonu
Tüm servislerin API uç noktalarını test etmek için Postman kullanılabilir.


## 🤝 Katkıda Bulunma
Bu proje mikroservis mimarisini anlamak için geliştirilmiş basit ve yanlışları olabilecek bir sistem .Katkıda bulunmak isterseniz lütfen bir issue oluşturun veya pull request gönderin.

