package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private Integer employeeId;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "LastName", length = 100)
    private String lastName;

    @Column(name = "Login", length = 100)
    private String login;

    @Column(name = "Password", length = 250)
    private String password;

    @Column(name = "PhoneNumber", length = 13)
    private String phoneNumber;

    @Column(name = "Email", length = 100)
    private String email;
}
