package hu.elte.alkfejl.issuetracker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "MESSAGE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Message extends BaseEntity {

    @ManyToOne
    private Issues issue;

    @Column(nullable = false)
    private String text;

    @Column(nullable = false)
    private Date timestamp;
}