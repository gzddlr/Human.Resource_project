package com.example.HR.service;

import com.example.HR.model.Employee;
import com.example.HR.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    //
    @Autowired//Spring bu alanı otomatik olarak inject/enjekte eder.
    private EmployeeRepository employeeRepository;

//Crud C harfi
    public Employee hireEmployee(Employee employee) {
        //Yeni bir çalışanı veri tabanına JPA dan gelen 'save ' metodu ile kaydeder.
        return employeeRepository.save(employee);

    }

//CRUD R hafri
    public List<Employee> getAllEmployees() {
        //Tüm çalışanları veritabanından "findAll" metofu ile getirir.
        return employeeRepository.findAll();

    }
    public Optional<Employee>getEmployeeById(Long id){
        //belirtilen kimlikteki çalışanı veritabanına getirir.
        return employeeRepository.findById(id);

    }
    //crud u harfi
    public Employee updateEmployee(Long id,Employee employeeDetails){
        //Belirtilen kimlikte çalışanı güncelleyen metot
        Employee employee= employeeRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("çalışan bulunamadı"));
        //orElse yani if döngüsünün else kısmı gibi düşünebiliriz. Aradığımız çalışan bulunmadığı durumlarda
        //kullanıcıya bölye bir metin gösteriyoruz
        employee.setName(employeeDetails.getName());
        employee.setPosition(employeeDetails.getPosition());
        return employeeRepository.save(employee);


    }
    public void fireEmployee(Long id){
        //belirtilen kimlikteki çalışanı silen metottur.
        Employee employee= employeeRepository.findById(id).orElseThrow(()->new RuntimeException("Employee not found!"));
        //silme işlemini yapan "delete metodunu JPA repository içerisinden çağırarak kullandık.
        employeeRepository.delete(employee);
    }

}



