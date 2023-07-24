package planets;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "planet")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planet {

    @Id
    private String id;
    @Column (name = "name")
    private String name;



}
