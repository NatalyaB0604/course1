package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "children")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Children {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ChildID")
    private Integer childId;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "LastName", length = 100)
    private String lastName;

    @Column(name = "BirthDate")
    private Date birthDate;

    // Связь с таблицей Parents
    @ManyToOne
    @JoinColumn(name = "Parents_ParentID", referencedColumnName = "ParentID")
    private Parents parent;
}
