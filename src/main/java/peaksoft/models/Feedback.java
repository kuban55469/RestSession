package peaksoft.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author :ЛОКИ Kelsivbekov
 * @created 07.03.2023
 */
@Entity
@Table(name = "feedbacks")
@NoArgsConstructor
@Getter @Setter
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
