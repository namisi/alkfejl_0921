package hu.elte.alkfejl.issuetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ISSUES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Issues extends BaseEntity {

    @ManyToOne
    private User user;

    @Column(nullable = false)
    private Date timestamp;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String location;
}
