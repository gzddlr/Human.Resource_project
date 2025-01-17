package com.example.HR.repository;

import com.example.HR.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//Bu anotasyon bu sınıfın bir Spring veritabanı deposu olduğunu belirtir.
public interface EmployeeRepository extends JpaRepository <Employee,Long> {
}
//JPA --> crud işlemleri için gerekli metodları sağlar.
//Programlamada oluşturma, okuma, güncelleme ve silme (İngilizce: Create, Read, Update, Delete (CRUD))