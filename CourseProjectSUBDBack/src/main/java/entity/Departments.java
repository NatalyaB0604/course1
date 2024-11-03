package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Departments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DepartmentID")
    private Integer departmentId;

    @Column(name = "DepartmentName", length = 100, nullable = false)
    private String departmentName;

    @Column(name = "Location", length = 100)
    private String location;

    @ManyToOne
    @JoinColumn(name = "ManagerID", referencedColumnName = "EmployeeID")
    private Employees manager;
}
