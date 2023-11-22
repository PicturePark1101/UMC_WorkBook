package umc.week07.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.week07.demo.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Restaurant extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 40)
    private String address;

    @OneToMany(mappedBy = "restaurantId", cascade = CascadeType.ALL)
    private List<Review> ReviewList = new ArrayList<>();

    @OneToMany(mappedBy = "missionAddress", cascade = CascadeType.ALL)
    private List<Mission> missionList = new ArrayList<>();
}
