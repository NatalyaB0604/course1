package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "clesses")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ClassID")
    private Integer classId;

    @Column(name = "ClassName", length = 100)
    private String className;

    @Column(name = "StartDate")
    private LocalDate startDate;

    @Column(name = "EndDate")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "TeacherID", referencedColumnName = "EmployeeID")
    private Employees teacher;
}
