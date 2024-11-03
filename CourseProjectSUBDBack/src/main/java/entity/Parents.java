package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="parents")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Parents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ParentID")
    private Integer parentId;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "LastName", length = 100)
    private String lastName;

    @Column(name = "Login", length = 100, unique = true)
    private String login;

    @Column(name = "Password", length = 250)
    private String password;

    @Column(name = "PhoneNumber", length = 13)
    private String phoneNumber;

    @Column(name = "Email", length = 100)
    private String email;
}
