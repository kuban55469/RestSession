package peaksoft.models;

import peaksoft.enums.HouseType;
import peaksoft.enums.Region;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * @author :ЛОКИ Kelsivbekov
 * @created 07.03.2023
 */
@Entity
@Table(name = "announcements")
@NoArgsConstructor
@Getter
@Setter
public class Announcement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ElementCollection
    private List<String> image;
    @Enumerated(EnumType.STRING)
    private HouseType houseType;
    @Enumerated(EnumType.STRING)
    private Region region;

    private String title;

    private String description;

    private Integer maxOfGuests;

    private BigDecimal price;

    private String city;

    private String address;

    private Double rating;

    private LocalDate createdAd;


    @OneToMany
    private List<Feedback> feedbacks;


}
