package com.tingeso.mueblesstgo.entities;

import lombok.*;
import javax.persistence.*;
import com.tingeso.mueblesstgo.entities.EmployeeEntity;

@Entity
@Table(name = "clock")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClockEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(unique = true, nullable = false)
    private Long id;

    @Getter
    @Setter
    @Column(nullable = false)
    private String date;

    @Getter
    @Setter
    @Column(nullable = false)
    private String check_in_time;

    @Getter
    @Setter
    @ManyToOne
    @JoinColumn(name = "id_employee")
    private EmployeeEntity employee;
}


