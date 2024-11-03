package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Entity
@Table(name = "certification")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Certification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CertificationID")
    private Integer certificationId;

    @Column(name = "Category", length = 100)
    private String category;

    @Column(name = "EndDate")
    private Date endDate;

    @Column(name = "AdvancedTrainingCourseName", length = 255)
    private String advancedTrainingCourseName;

    @Column(name = "Document", length = 255)
    private String document;

    // Связь с таблицей Employees
    @ManyToOne
    @JoinColumn(name = "Employees_EmployeeID", referencedColumnName = "EmployeeID")
    private Employees employee;
}
