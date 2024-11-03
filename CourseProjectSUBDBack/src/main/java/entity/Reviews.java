package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "reviews")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Reviews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReviewID")
    private Integer reviewId;

    @Column(name = "ReviewText", length = 500)
    private String reviewText;

    @Column(name = "Rating", nullable = false)
    private Integer rating;

    @Column(name = "ReviewDate", nullable = false)
    private LocalDate reviewDate;

    @ManyToOne
    @JoinColumn(name = "EmployeeID", referencedColumnName = "EmployeeID", nullable = false)
    private Employees employee;

    @ManyToOne
    @JoinColumn(name = "ParentID", referencedColumnName = "ParentID", nullable = false)
    private Parents parent;
}
