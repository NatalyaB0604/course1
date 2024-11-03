package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PaymentID")
    private Integer paymentId;

    @Column(name = "PaymentDate", nullable = false)
    private LocalDate paymentDate;

    @Column(name = "Amount", nullable = false)
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "EmployeeID", referencedColumnName = "EmployeeID", nullable = false)
    private Employees employee;

    @ManyToOne
    @JoinColumn(name = "ParentID", referencedColumnName = "ParentID", nullable = false)
    private Parents parent;

}
