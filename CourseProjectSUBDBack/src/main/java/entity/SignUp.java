package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "signUp")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class SignUp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SignUpID")
    private Integer signUpId;

    @ManyToOne
    @JoinColumn(name = "ParentID", referencedColumnName = "ParentID", nullable = false)
    private Parents parent;

    @ManyToOne
    @JoinColumn(name = "ChildID", referencedColumnName = "ChildID", nullable = false)
    private Children child;

    @ManyToOne
    @JoinColumn(name = "ClassID", referencedColumnName = "ClassID", nullable = false)
    private Classes schoolClass;
}
