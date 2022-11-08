package kodlama.io.devs.entities.concretes;

import lombok.*;


import javax.persistence.*;
import java.util.List;


@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class Languages {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER)
    private List<Technology> technologies;
}
