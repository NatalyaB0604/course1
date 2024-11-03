package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "textbooks")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class TextBooks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TextBookID")
    private Integer textbookId;

    @Column(name = "Title", length = 255, nullable = false)
    private String title;

    @Column(name = "Author", length = 255, nullable = false)
    private String author;

    @Column(name = "Publisher", length = 255)
    private String publisher;

    @Column(name = "ISBN", length = 20)
    private String isbn;

    @ManyToOne
    @JoinColumn(name = "ClassID", referencedColumnName = "ClassID", nullable = false)
    private Classes schoolClass;
}
