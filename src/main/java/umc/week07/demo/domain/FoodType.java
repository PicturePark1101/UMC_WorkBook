package umc.week07.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.week07.demo.domain.mapping.InterstFood;
import umc.week07.demo.domain.common.BaseEntity;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class FoodType extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    @OneToMany(mappedBy = "foodId", cascade = CascadeType.ALL)
    private List<InterstFood> interstFoodList = new ArrayList<>();
}
